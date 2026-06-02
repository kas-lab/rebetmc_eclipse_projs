#!/usr/bin/env python3
"""
update_jars.py - Sync updated JARs from the Tycho build into the adapt_x jars/rem directory.

Run after: mvn -B clean verify -f eu.coresense.parent/pom.xml -DskipTests

Only JARs matching DYNAMIC_PREFIXES are replaced. Static JARs (ROS message types,
rcljava, rebet_java, third-party utilities) are never touched.
"""

import argparse
import re
import shutil
import subprocess
import sys
from pathlib import Path

SCRIPT_DIR = Path(__file__).resolve().parent
BUILD_PLUGINS = SCRIPT_DIR / "eu.coresense.repository" / "target" / "repository" / "plugins"
DEFAULT_JARS_DIR = Path(
    "/home/gus/ros_workspaces/suave_rebetmc_ws/src/adapt_x/adapt_x/jars/rem"
)
M2_REPO = Path.home() / ".m2" / "repository"

# Bundle ID prefixes that should be replaced from the Tycho build output.
# Covers: eu.coresense DSL plugins, RosToolingSupport, RosTooling, Eclipse/Xtext/EMF, fms.metamodel.
# Everything else in jars/rem is left untouched.
DYNAMIC_PREFIXES = (
    "eu.coresense.adaptation_",
    "eu.coresense.common_",
    "eu.coresense.context_",
    "eu.coresense.requirements_",
    "eu.coresense.resolution_",
    "eu.coresense.variability_",
    "RosToolingSupport_",
    "de.fraunhofer.ipa.",
    "org.eclipse.",
    "fms.metamodel",
)


def is_dynamic(name: str) -> bool:
    return any(name.startswith(p) for p in DYNAMIC_PREFIXES)


def find_in_m2(bid: str) -> Path | None:
    """
    Search ~/.m2/repository for a JAR with the given bundle ID.
    Used as a fallback for Maven-origin bundles that pomDependencies=consider resolves
    at build time but does not include in the assembled P2 repository output.
    """
    result = subprocess.run(
        ["find", str(M2_REPO), "-name", f"{bid}-*.jar",
         "!", "-name", "*-sources.jar", "!", "-name", "*-javadoc.jar",
         "!", "-name", "*-tests.jar"],
        capture_output=True, text=True, timeout=15,
    )
    matches = [Path(p) for p in result.stdout.strip().splitlines() if p]
    if not matches:
        return None
    # Prefer the path whose version segment sorts highest (approximates latest version)
    return max(matches, key=lambda p: str(p))


def bundle_id(jar_name: str) -> str:
    """
    Extract the bundle symbolic name from a JAR filename by stripping the version suffix.
      eu.coresense.adaptation_0.1.0.SNAPSHOT.jar  ->  eu.coresense.adaptation
      org.eclipse.xtext-2.42.0.jar                ->  org.eclipse.xtext
      de.fraunhofer.ipa.ros_3.1.0.rc1.jar         ->  de.fraunhofer.ipa.ros
    """
    stem = Path(jar_name).stem
    m = re.match(r"^(.*?)[-_](\d.*)$", stem)
    return m.group(1) if m else stem


def main() -> None:
    parser = argparse.ArgumentParser(
        description="Sync Tycho-built JARs into the adapt_x jars/rem directory."
    )
    parser.add_argument(
        "--jars-dir",
        type=Path,
        default=DEFAULT_JARS_DIR,
        metavar="DIR",
        help=f"Target directory (default: {DEFAULT_JARS_DIR})",
    )
    parser.add_argument(
        "--dry-run",
        action="store_true",
        help="Print planned changes without modifying anything",
    )
    args = parser.parse_args()

    if not BUILD_PLUGINS.exists():
        sys.exit(
            f"ERROR: build output not found:\n  {BUILD_PLUGINS}\n\n"
            "Run: mvn -B clean verify -f eu.coresense.parent/pom.xml -DskipTests"
        )
    if not args.jars_dir.exists():
        sys.exit(f"ERROR: jars directory not found: {args.jars_dir}")

    # Index existing JARs in jars/rem: bundle_id -> [Path, ...]
    existing: dict[str, list[Path]] = {}
    for p in args.jars_dir.glob("*.jar"):
        existing.setdefault(bundle_id(p.name), []).append(p)

    # Collect dynamic JARs from the Tycho build output
    source_jars: list[Path] = sorted(
        (j for j in BUILD_PLUGINS.glob("*.jar") if is_dynamic(j.name)),
        key=lambda j: j.name,
    )
    if not source_jars:
        print(
            "WARNING: no dynamic JARs found in build output.\n"
            "Ensure includeAllDependencies=true is set in eu.coresense.repository/pom.xml\n"
            "and that the project was built successfully."
        )
        return

    # Fallback: for dynamic bundles already in jars/rem but absent from the build output
    # (pomDependencies=consider gap — Maven-origin bundles Tycho resolves but doesn't publish),
    # look them up in the Maven local repository.
    found_bids = {bundle_id(j.name) for j in source_jars}
    for bid, paths in existing.items():
        if bid in found_bids or not any(is_dynamic(p.name) for p in paths):
            continue
        m2_jar = find_in_m2(bid)
        if m2_jar:
            source_jars.append(m2_jar)
        else:
            print(f"WARNING: {bid} not found in build output or Maven cache — left unchanged")
    source_jars.sort(key=lambda j: j.name)

    removed: list[str] = []
    added: list[str] = []
    skipped: list[str] = []

    for src in source_jars:
        bid = bundle_id(src.name)
        dest = args.jars_dir / src.name
        old_versions = [p for p in existing.get(bid, []) if p.name != src.name]

        for old in old_versions:
            removed.append(old.name)
            if not args.dry_run:
                old.unlink()

        if dest.exists() and not old_versions:
            skipped.append(src.name)
            continue

        added.append(src.name)
        if not args.dry_run:
            shutil.copy2(src, dest)

    prefix = "[dry-run] " if args.dry_run else ""

    if not removed and not added:
        print(f"{prefix}All dynamic JARs already up to date ({len(skipped)} unchanged).")
        return

    if removed:
        print(f"\n{prefix}Removed ({len(removed)}):")
        for name in removed:
            print(f"  - {name}")
    if added:
        print(f"\n{prefix}Added / updated ({len(added)}):")
        for name in added:
            print(f"  + {name}")
    if skipped:
        print(f"\n{prefix}Unchanged: {len(skipped)} JAR(s)")
    if not args.dry_run:
        print(f"\nDone. {args.jars_dir}")


if __name__ == "__main__":
    main()
