/**
 */
package eu.coresense.common;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.coresense.common.BooleanLiteral#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see eu.coresense.common.CommonPackage#getBooleanLiteral()
 * @model
 * @generated
 */
public interface BooleanLiteral extends Literal {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see eu.coresense.common.CommonPackage#getBooleanLiteral_Value()
	 * @model
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link eu.coresense.common.BooleanLiteral#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // BooleanLiteral
