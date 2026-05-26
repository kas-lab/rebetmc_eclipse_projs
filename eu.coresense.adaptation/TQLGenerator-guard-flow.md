# TQLGenerator Guard Flow

This note explains the current guard-related flow in
`src/eu/coresense/adaptation/generator/TQLGenerator.xtend`.

There are three related paths:

1. User guard CNF is compiled into TQL antecedent expressions.
2. User guard CNF is evaluated against generated states during state pruning.
3. Derived state predicates are compiled through a separate internal `Expr` path.

The important distinction is that user guards use the new grammar nodes:

```text
GuardCNF -> GuardDisjunct -> GuardAtom
```

Derived state predicates use internal helper classes:

```text
Expr -> And / DerivedVar / DerivedVarFeature
```

## High-Level Flow

```mermaid
flowchart TD
    model[TacticsModel] --> compile[compile model with doStates]

    compile --> imports[Load imported context, variability, and resolution models]
    imports --> keys[Collect context keys and feature keys]

    compile --> record[Register guard comparisons and feature selections from rules]
    record --> split[Build context thresholds and feature selections]
    split --> states[Create candidate states from thresholds and feature valuations]

    states --> stateExpr[Build derived state Expr with expressionFromState]
    stateExpr --> stateAntecedent[createAntecedent Expr]
    stateAntecedent --> stateTql[State antecedent TQL]

    compile --> rules[compileRule for each adaptation rule]
    rules --> isCondition{Atomic ConditionAction?}

    isCondition -- no --> plainRule[Emit rule body that has no guard handling]
    isCondition -- yes --> hasGuard{guardCondition present?}

    hasGuard -- no --> unguarded[Emit tactic_rule without antecedent]
    hasGuard -- yes --> guardAntecedent[createAntecedent GuardCNF]
    guardAntecedent --> guardedRule[Emit tactic_rule with antecedent when not doingStates]
```

`ConditionAction.guardCondition` can be `null`. That means the rule is
unguarded. In that case the generator does not create a guard antecedent and
does not attach an `antecedent:` role to the emitted `tactic_rule`.

## User Guard CNF to TQL

This is the path used for guards written in the tactics DSL.

```mermaid
flowchart TD
    cnf[GuardCNF] --> clauses[guardClauses cnf]
    clauses --> clauseLoop[compileDisjunct for each GuardDisjunct]

    clauseLoop --> terms[guardTerms disjunct]
    terms --> atomLoop[compileAtom for each GuardAtom]

    atomLoop --> atomKind{Atom type}
    atomKind -- ContextComparison --> comparison[compileContextComparison]
    atomKind -- FeatureSelection --> feature[compileFeatureSelection]

    comparison --> lhs[compileContextOperand left as lhs]
    comparison --> rhs[compileContextOperand right as rhs]
    lhs --> operandKind1{Operand type}
    rhs --> operandKind2{Operand type}

    operandKind1 -- ContextVariableOperand --> measured1[Use t_measured_name, no declaration]
    operandKind2 -- ContextVariableOperand --> measured2[Use t_measured_name, no declaration]
    operandKind1 -- LiteralOperand --> literal1[Call literalValue and emit Value declaration]
    operandKind2 -- LiteralOperand --> literal2[Call literalValue and emit Value declaration]

    measured1 --> comparisonTql[Emit comparison expression]
    measured2 --> comparisonTql
    literal1 --> comparisonTql
    literal2 --> comparisonTql

    comparisonTql --> comparisonReturn[Return comparison expression name and declarations]

    feature --> prop[Emit propositional_expression for selected feature]
    prop --> negated{selection.not present?}
    negated -- no --> featureReturn[Return base expression name]
    negated -- yes --> notExpr[Emit not_expression wrapping base expression]
    notExpr --> notReturn[Return not expression name]

    comparisonReturn --> termCount{One term in disjunct?}
    featureReturn --> termCount
    notReturn --> termCount

    termCount -- yes --> returnTerm[Return the single atom expression]
    termCount -- no --> orExpression[Emit or_expression over atom expressions]

    returnTerm --> clauseCount{One clause in CNF?}
    orExpression --> clauseCount

    clauseCount -- yes --> returnClause[Return the single clause expression]
    clauseCount -- no --> andExpression[Emit and_expression over clause expressions]
```

The generated TQL follows CNF structure:

```text
GuardCNF:
  all clauses must hold

GuardDisjunct:
  at least one atom in the clause must hold
```

So multiple terms inside one disjunct become an `or_expression`, and multiple
CNF clauses become an `and_expression`.

## Atom Compilation

`compileAtom(GuardAtom atom)` is just a dispatcher:

```mermaid
flowchart LR
    atom[GuardAtom] --> type{Runtime type}
    type -- ContextComparison --> cc[compileContextComparison]
    type -- FeatureSelection --> fs[compileFeatureSelection]
    type -- Anything else --> error[IllegalArgumentException]
```

### Context Comparison

Example DSL guard:

```text
c_thruster_1 == "OK"
```

The comparison path is:

```mermaid
flowchart TD
    comparison[ContextComparison] --> name[Name from _namer.uniqueName comparison]
    comparison --> left[Compile left operand]
    comparison --> right[Compile right operand]
    comparison --> op[Map MathOperator to TQL expression type]

    left --> tql[Emit declarations, then comparison relation]
    right --> tql
    op --> tql
```

Rough TQL shape:

```tql
$<expr>_rhs isa ValueString, has string_value "OK";
$<expr> (lhs_value: $t_measured_c_thruster_1, rhs_value: $<expr>_rhs) isa equal, has expression_name "<expr>";
```

Supported operand combinations for TQL emission:

```text
ContextVar op Literal
Literal op ContextVar
ContextVar op ContextVar
Literal op Literal
```

### Feature Selection

Positive feature selection:

```text
selected(suave_resolution.RECOVER_MOTION)
```

TQL shape:

```tql
$<base_name> (atom: $<feature_name>) isa propositional_expression, has expression_name "<base_name>";
```

Negated feature selection:

```text
!selected(suave_resolution.RECOVER_MOTION)
```

TQL shape:

```tql
$<base_name> (atom: $<feature_name>) isa propositional_expression, has expression_name "<base_name>";
$<base_name>_not (expression: $<base_name>) isa not_expression, has expression_name "<base_name>_not";
```

For negated selections, the returned expression name is the wrapper
`<base_name>_not`, because that is the expression the enclosing OR or AND must
reference.

## Guard Satisfaction Against States

This path does not emit TQL. It decides whether a generated state can satisfy a
rule guard.

```mermaid
flowchart TD
    rule[AdaptationRule] --> check[checkAgainstBounds]
    check --> atomic{AtomicRule?}
    atomic -- no --> falseResult[Return false]
    atomic -- yes --> bodyKind{ruleBody is ConditionAction?}

    bodyKind -- no --> trueResult[Return true]
    bodyKind -- yes --> guard[guardSatisfied guardCondition]

    guard --> nullGuard{guardCondition is null?}
    nullGuard -- yes --> alwaysTrue[Return true]
    nullGuard -- no --> forall[All CNF clauses must be satisfied]

    forall --> exists[Each clause is satisfied if any atom is satisfied]
    exists --> atom[atomSatisfied]

    atom --> atomType{Atom type}
    atomType -- FeatureSelection --> featureSat[featureSelectionSatisfied]
    atomType -- ContextComparison --> contextSat[contextComparisonSatisfied]
    atomType -- Other --> error[IllegalArgumentException]

    featureSat --> featureState[Compare selected or not selected against state featurePrecondition]

    contextSat --> operandShape{Operand shape}
    operandShape -- ContextVar op Literal --> interval1[Check state interval for variable]
    operandShape -- Literal op ContextVar --> interval2[Flip operator, then check interval]
    operandShape -- Literal op Literal --> literalCompare[Compare literals directly]
    operandShape -- ContextVar op ContextVar --> unsupported[Unsupported for state bounds]
```

The expression:

```xtend
guardClauses(cnf).forall[clause |
    guardTerms(clause).exists[atom |
        atomSatisfied(atom, contextKeys, featureKeys, state)
    ]
]
```

means:

```text
For every CNF clause:
  at least one atom in that clause must be true in this state.
```

That is the standard CNF rule:

```text
(a OR b) AND (c OR d)
```

## Derived State Antecedents

This is separate from user guard CNF. It is used when the generator creates TQL
for the internally generated states.

```mermaid
flowchart TD
    state[State] --> expr[expressionFromState]
    expr --> contextBounds[Context bounds become DerivedVar expressions]
    expr --> selectedFeatures[Selected features become DerivedVarFeature expressions]

    contextBounds --> andTree[Build internal And tree]
    selectedFeatures --> andTree

    andTree --> createExprAntecedent[createAntecedent Expr]
    createExprAntecedent --> flatten[Flatten And expressions]
    flatten --> compileLeaves[compileDerivedStateExpression for each leaf]
    compileLeaves --> derivedVar[DerivedVar uses inequality ContextVar LiteralWrapper MathOperator]
    compileLeaves --> derivedFeature[DerivedVarFeature uses propositional_expression helper]
    derivedVar --> stateAnd[Emit and_expression for state predicate]
    derivedFeature --> stateAnd
```

This path intentionally rejects `Or` expressions:

```text
OR expressions are not supported in derived state antecedents
```

That is unrelated to user guard CNF. User guard OR is handled by
`compileDisjunct(GuardDisjunct)` and emits `or_expression`.

## Quick Mental Model

Use this mapping when reading the code:

```text
compileRule
  Decides whether a rule has a guard antecedent.

createAntecedent(GuardCNF)
  Compiles user guard CNF into TQL.

compileDisjunct(GuardDisjunct)
  Compiles one OR clause.

compileAtom(GuardAtom)
  Compiles one leaf guard expression.

guardSatisfied
  Evaluates the same user guard CNF against a generated state.

createAntecedent(Expr)
  Compiles internally derived state predicates, not user guards.
```
