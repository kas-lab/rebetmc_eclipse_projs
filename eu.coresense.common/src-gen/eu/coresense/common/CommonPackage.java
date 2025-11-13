/**
 */
package eu.coresense.common;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.coresense.common.CommonFactory
 * @model kind="package"
 * @generated
 */
public interface CommonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://coresense.eu/common";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "common";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonPackage eINSTANCE = eu.coresense.common.impl.CommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.coresense.common.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.coresense.common.impl.LiteralImpl
	 * @see eu.coresense.common.impl.CommonPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 0;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.coresense.common.impl.IntLiteralImpl <em>Int Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.coresense.common.impl.IntLiteralImpl
	 * @see eu.coresense.common.impl.CommonPackageImpl#getIntLiteral()
	 * @generated
	 */
	int INT_LITERAL = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.coresense.common.impl.DecimalLiteralImpl <em>Decimal Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.coresense.common.impl.DecimalLiteralImpl
	 * @see eu.coresense.common.impl.CommonPackageImpl#getDecimalLiteral()
	 * @generated
	 */
	int DECIMAL_LITERAL = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decimal Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Decimal Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.coresense.common.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.coresense.common.impl.StringLiteralImpl
	 * @see eu.coresense.common.impl.CommonPackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.coresense.common.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.coresense.common.impl.BooleanLiteralImpl
	 * @see eu.coresense.common.impl.CommonPackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link eu.coresense.common.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see eu.coresense.common.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link eu.coresense.common.IntLiteral <em>Int Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Literal</em>'.
	 * @see eu.coresense.common.IntLiteral
	 * @generated
	 */
	EClass getIntLiteral();

	/**
	 * Returns the meta object for the attribute '{@link eu.coresense.common.IntLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.coresense.common.IntLiteral#getValue()
	 * @see #getIntLiteral()
	 * @generated
	 */
	EAttribute getIntLiteral_Value();

	/**
	 * Returns the meta object for class '{@link eu.coresense.common.DecimalLiteral <em>Decimal Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Literal</em>'.
	 * @see eu.coresense.common.DecimalLiteral
	 * @generated
	 */
	EClass getDecimalLiteral();

	/**
	 * Returns the meta object for the attribute '{@link eu.coresense.common.DecimalLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.coresense.common.DecimalLiteral#getValue()
	 * @see #getDecimalLiteral()
	 * @generated
	 */
	EAttribute getDecimalLiteral_Value();

	/**
	 * Returns the meta object for class '{@link eu.coresense.common.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see eu.coresense.common.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link eu.coresense.common.StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.coresense.common.StringLiteral#getValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link eu.coresense.common.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see eu.coresense.common.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link eu.coresense.common.BooleanLiteral#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.coresense.common.BooleanLiteral#isValue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonFactory getCommonFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eu.coresense.common.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.coresense.common.impl.LiteralImpl
		 * @see eu.coresense.common.impl.CommonPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link eu.coresense.common.impl.IntLiteralImpl <em>Int Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.coresense.common.impl.IntLiteralImpl
		 * @see eu.coresense.common.impl.CommonPackageImpl#getIntLiteral()
		 * @generated
		 */
		EClass INT_LITERAL = eINSTANCE.getIntLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_LITERAL__VALUE = eINSTANCE.getIntLiteral_Value();

		/**
		 * The meta object literal for the '{@link eu.coresense.common.impl.DecimalLiteralImpl <em>Decimal Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.coresense.common.impl.DecimalLiteralImpl
		 * @see eu.coresense.common.impl.CommonPackageImpl#getDecimalLiteral()
		 * @generated
		 */
		EClass DECIMAL_LITERAL = eINSTANCE.getDecimalLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_LITERAL__VALUE = eINSTANCE.getDecimalLiteral_Value();

		/**
		 * The meta object literal for the '{@link eu.coresense.common.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.coresense.common.impl.StringLiteralImpl
		 * @see eu.coresense.common.impl.CommonPackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

		/**
		 * The meta object literal for the '{@link eu.coresense.common.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.coresense.common.impl.BooleanLiteralImpl
		 * @see eu.coresense.common.impl.CommonPackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

	}

} //CommonPackage
