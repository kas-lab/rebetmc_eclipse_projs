/**
 */
package pythonfunctions.PythonModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Python Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pythonfunctions.PythonModel.PythonFunction#getName <em>Name</em>}</li>
 *   <li>{@link pythonfunctions.PythonModel.PythonFunction#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see pythonfunctions.PythonModel.PythonModelPackage#getPythonFunction()
 * @model
 * @generated
 */
public interface PythonFunction extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pythonfunctions.PythonModel.PythonModelPackage#getPythonFunction_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pythonfunctions.PythonModel.PythonFunction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' attribute list.
	 * @see pythonfunctions.PythonModel.PythonModelPackage#getPythonFunction_Arguments()
	 * @model
	 * @generated
	 */
	EList<String> getArguments();

} // PythonFunction
