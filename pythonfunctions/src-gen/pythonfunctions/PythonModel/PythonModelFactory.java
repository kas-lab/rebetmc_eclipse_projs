/**
 */
package pythonfunctions.PythonModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pythonfunctions.PythonModel.PythonModelPackage
 * @generated
 */
public interface PythonModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PythonModelFactory eINSTANCE = pythonfunctions.PythonModel.impl.PythonModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Python File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Python File</em>'.
	 * @generated
	 */
	PythonFile createPythonFile();

	/**
	 * Returns a new object of class '<em>Python Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Python Function</em>'.
	 * @generated
	 */
	PythonFunction createPythonFunction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PythonModelPackage getPythonModelPackage();

} //PythonModelFactory
