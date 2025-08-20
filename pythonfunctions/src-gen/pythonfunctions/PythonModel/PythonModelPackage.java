/**
 */
package pythonfunctions.PythonModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see pythonfunctions.PythonModel.PythonModelFactory
 * @model kind="package"
 * @generated
 */
public interface PythonModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PythonModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "eu.coresense.context.PythonModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pymodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PythonModelPackage eINSTANCE = pythonfunctions.PythonModel.impl.PythonModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link pythonfunctions.PythonModel.impl.PythonFileImpl <em>Python File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonfunctions.PythonModel.impl.PythonFileImpl
	 * @see pythonfunctions.PythonModel.impl.PythonModelPackageImpl#getPythonFile()
	 * @generated
	 */
	int PYTHON_FILE = 0;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYTHON_FILE__FUNCTIONS = 0;

	/**
	 * The number of structural features of the '<em>Python File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYTHON_FILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Python File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYTHON_FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pythonfunctions.PythonModel.impl.PythonFunctionImpl <em>Python Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonfunctions.PythonModel.impl.PythonFunctionImpl
	 * @see pythonfunctions.PythonModel.impl.PythonModelPackageImpl#getPythonFunction()
	 * @generated
	 */
	int PYTHON_FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYTHON_FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYTHON_FUNCTION__ARGUMENTS = 1;

	/**
	 * The number of structural features of the '<em>Python Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYTHON_FUNCTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Python Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYTHON_FUNCTION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link pythonfunctions.PythonModel.PythonFile <em>Python File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Python File</em>'.
	 * @see pythonfunctions.PythonModel.PythonFile
	 * @generated
	 */
	EClass getPythonFile();

	/**
	 * Returns the meta object for the reference list '{@link pythonfunctions.PythonModel.PythonFile#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Functions</em>'.
	 * @see pythonfunctions.PythonModel.PythonFile#getFunctions()
	 * @see #getPythonFile()
	 * @generated
	 */
	EReference getPythonFile_Functions();

	/**
	 * Returns the meta object for class '{@link pythonfunctions.PythonModel.PythonFunction <em>Python Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Python Function</em>'.
	 * @see pythonfunctions.PythonModel.PythonFunction
	 * @generated
	 */
	EClass getPythonFunction();

	/**
	 * Returns the meta object for the attribute '{@link pythonfunctions.PythonModel.PythonFunction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pythonfunctions.PythonModel.PythonFunction#getName()
	 * @see #getPythonFunction()
	 * @generated
	 */
	EAttribute getPythonFunction_Name();

	/**
	 * Returns the meta object for the attribute list '{@link pythonfunctions.PythonModel.PythonFunction#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Arguments</em>'.
	 * @see pythonfunctions.PythonModel.PythonFunction#getArguments()
	 * @see #getPythonFunction()
	 * @generated
	 */
	EAttribute getPythonFunction_Arguments();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PythonModelFactory getPythonModelFactory();

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
		 * The meta object literal for the '{@link pythonfunctions.PythonModel.impl.PythonFileImpl <em>Python File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonfunctions.PythonModel.impl.PythonFileImpl
		 * @see pythonfunctions.PythonModel.impl.PythonModelPackageImpl#getPythonFile()
		 * @generated
		 */
		EClass PYTHON_FILE = eINSTANCE.getPythonFile();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PYTHON_FILE__FUNCTIONS = eINSTANCE.getPythonFile_Functions();

		/**
		 * The meta object literal for the '{@link pythonfunctions.PythonModel.impl.PythonFunctionImpl <em>Python Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonfunctions.PythonModel.impl.PythonFunctionImpl
		 * @see pythonfunctions.PythonModel.impl.PythonModelPackageImpl#getPythonFunction()
		 * @generated
		 */
		EClass PYTHON_FUNCTION = eINSTANCE.getPythonFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PYTHON_FUNCTION__NAME = eINSTANCE.getPythonFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PYTHON_FUNCTION__ARGUMENTS = eINSTANCE.getPythonFunction_Arguments();

	}

} //PythonModelPackage
