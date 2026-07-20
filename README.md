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

## MAVEN

Build skiping tests

```bash
mvn -B clean verify -f eu.coresense.parent/pom.xml -DskipTests
```

## Tests with maven

```sh
mvn -q -B verify \
    -f eu.coresense.parent/pom.xml \
    -Dtest=ResolutionModelScopeTest
```

`-q` makes Maven quiet so that test results are easier to inspect.

### Combined adaptation TQL generator tests

`CombinedTQLGeneratorTest` loads the SUAVE models, verifies that rules from all
action groups are present, checks that shared declarations occur only once,
and confirms that the original per-action generation API still works.

Set `CORESENSE_SUAVE_MODELS` to the directory containing the `interfaces`,
`ros`, `system`, and `tactical_retreat` model directories. If it is not set,
JUnit skips these tests.

```sh
export CORESENSE_SUAVE_MODELS=$HOME/ros_workspaces/suave_rebetmc_ws/src/suave_rebetmc/models

mvn -q -B verify \
    -f eu.coresense.parent/pom.xml \
    -Dtest=CombinedTQLGeneratorTest
```

The results are also written under:

```text
eu.coresense.adaptation.tests/target/surefire-reports/
```

### Optional TypeDB integration test

The TypeDB integration test is in the `adapt_x` repository. It loads an
already-generated combined TQL file into a uniquely named temporary database
and deletes that database after the test.

Required environment variable:

- `CORESENSE_GENERATED_TQL` is the absolute path to the generated TQL file.

Optional environment variable:

- `TYPEDB_ADDRESS` selects the TypeDB server and defaults to `localhost:1729`.

From the ROS workspace, run:

```sh
cd /home/gus/ros_workspaces/suave_rebetmc_ws
source /opt/ros/humble/setup.bash
source install/setup.bash

export CORESENSE_GENERATED_TQL=/absolute/path/to/suave_rebetmc.tql
export TYPEDB_ADDRESS=localhost:1729

PYTHONPATH=src/adapt_x/adapt_x \
python3 -m pytest -q \
    src/adapt_x/adapt_x/test/test_combined_tql_typedb.py
```

When TypeDB and its compatible Python driver are available only in the
`suave_rebetmc` container, copy the generated file into the container and run
the same pytest command there:

```sh
docker cp /absolute/path/to/suave_rebetmc.tql \
    suave_rebetmc:/tmp/suave_rebetmc.tql

docker exec suave_rebetmc bash -lc '
    cd /home/ubuntu-user/suave_ws &&
    CORESENSE_GENERATED_TQL=/tmp/suave_rebetmc.tql \
    TYPEDB_ADDRESS=localhost:1729 \
    PYTHONPATH=src/adapt_x/adapt_x \
    python3 -m pytest -q \
        src/adapt_x/adapt_x/test/test_combined_tql_typedb.py
'
```

## Running only the test in Eclipse

  This is the fastest option:

  1. Open ResolutionModelScopeTest.java.
  2. Right-click the editor or class in Package Explorer.
  3. Select Run As → JUnit Plug-in Test.
