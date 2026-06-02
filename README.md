# RebetMC - Tactical Retreat - Eclipse Projects

Important Files:
It is quite a hassle to navigate through java projects, here are some hyperlinks to help you:

For reference:
The Xtext Grammar defines what a user is able to type in to define an DSL entry.
A generator transforms the Java objects of a DSL entry into anything else you may like e.g. text.
A scope provider determines how the references in the DSL are handled. For example, if I refer to parameter in a the Tactics model which is a concept from an Architecture model, then I can put logic there to constrain those parameters to only those that belong a specific component.
A validator determines if a DSL entry passes, beyond its grammar. This is like determining what is a logic error vs. a syntax error. The grammar determines the latter, the validator the prior.


## Adaptation Tactics Model:

[XText Grammar Definition](eu.coresense.adaptation/src/eu/coresense/adaptation/Tactics.xtext)

[TQL Generator](eu.coresense.adaptation/src/eu/coresense/adaptation/generator/TQLGenerator.xtend)

[Scope Provider](eu.coresense.adaptation/src/eu/coresense/adaptation/scoping/TacticsScopeProvider.java)

[Validator](eu.coresense.adaptation/src/eu/coresense/adaptation/validation/TacticsValidator.java)

## Context Model:

[XText Grammar Definition](eu.coresense.context/src/eu/coresense/context/ContextModel.xtext)

[Scope Provider](eu.coresense.context/src/eu/coresense/adaptation/scoping/ContextModelScopeProviderr.xtend)

[Validator](eu.coresense.context/src/eu/coresense/adaptation/validation/ContextModelValidator.java)

## Requirements Model:

[XText Grammar Definition](eu.coresense.requirements/src/eu/coresense/requirements/RequirementsModel.xtext)

## Resolution Model:

[XText Grammar Definition](eu.coresense.resolution/src/eu/coresense/resolution/ResolutionModel.xtext)

[Scope Provider](eu.coresense.resolution/src/eu/coresense/resolution/scoping/ResolutionModelScopeProviderr.xtend)

[Validator](eu.coresense.resolution/src/eu/coresense/resolution/validation/ResolutionModelValidator.java)

## Variability Model

[XText Grammar Definition](eu.coresense.variability/src/eu/coresense/variability/FeatureModel.xtext)

[Validator](eu.coresense.variability/src/eu/coresense/variability/validation/FeatureModelValidator.java)

## Build

Create a [personal access token](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens#creating-a-personal-access-token-classic) in GitHub with `read:packages` authorization. GitHub Packages requires authentication for Maven package downloads, even for public packages.

Add/update the Maven settings in `~/.m2/settings.xml` with credentials for the GitHub Packages repositories used by this build:

```xml
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
                      http://maven.apache.org/xsd/settings-1.0.0.xsd">

  <servers>
    <server>
      <id>kas-lab-rostooling</id>
      <username>YOUR_GH_USERNAME</username>
      <password>YOUR_PAT_TOKEN</password>
    </server>
    <server>
      <id>kas-lab-splc2020</id>
      <username>YOUR_GH_USERNAME</username>
      <password>YOUR_PAT_TOKEN</password>
    </server>
  </servers>
</settings>
```

### Maven

Build the repository with Maven 3.9+ and Java 21:

```bash
mvn -B clean verify -f eu.coresense.parent/pom.xml
```

If you tried to build before updating the Maven settings and Maven cached authentication errors, add `-U` once:

```bash
mvn -U -B clean verify -f eu.coresense.parent/pom.xml -DskipTests
```

The build creates a local Eclipse p2 update site at:

```text
eu.coresense.repository/target/repository/
```

The resulting .jars get saved in `eu.coresense.repository/target/repository/plugins`

### Syncing JARs to adapt_x

After a successful build, run `update_jars.py` to copy the updated JARs into the adapt_x runtime directory:

```bash
python update_jars.py
```

This replaces the `eu.coresense.*`, `RosToolingSupport`, `de.fraunhofer.ipa.*`, `org.eclipse.*`, and `fms.metamodel` JARs in the adapt_x `jars/rem` directory with the freshly built versions. Static JARs (ROS message types, rcljava, rebet_java, third-party utilities) are never touched.

Use `--dry-run` to preview changes without applying them:

```bash
python update_jars.py --dry-run
```

The default target directory is `/home/gus/ros_workspaces/suave_rebetmc_ws/src/adapt_x/adapt_x/jars/rem`. Override it with `--jars-dir <path>`.

### Eclipse build

#### Prerequisites

The target platform uses Maven locations to fetch dependencies from GitHub Packages. Eclipse requires the **Maven PDE Integration** feature to resolve them. Install it once per Eclipse installation:

1. Open `Help` -> `Install New Software...`
2. In the "Work with" field enter `https://download.eclipse.org/releases/2026-03`
3. Search for `Maven PDE Integration` and select it
4. Click `Next` and finish the installation, then restart Eclipse

**Note:** You might need to increase the Eclipse/java heap to at least 4GB

#### Steps

In Eclipse:

1. Open `Import` -> `General` -> `Existing projects into Workspace`
2. Select the `rebetmc_eclipse_projs` folder and import all its subprojects
3. Open `eu.coresense.releng.target/rebetmc-2026-03.target`
4. On the top-right corner, click on "Set as Active Target Platform" and wait for Eclipse to fetch all dependencies
5. In the navigation bar click `Project` -> `Build all`

## Using it in another project

## Install it with Eclipse IDE

Install the generated update site in Eclipse:

1. Open `Help` -> `Install New Software...`.
2. Click `Add...`, then `Local...`.
3. Select `eu.coresense.repository/target/repository/`.
4. Select `CoreSense Plugins` and finish the installation.