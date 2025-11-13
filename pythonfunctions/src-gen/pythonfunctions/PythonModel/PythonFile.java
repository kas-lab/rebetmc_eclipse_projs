/**
 */
package pythonfunctions.PythonModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Python File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pythonfunctions.PythonModel.PythonFile#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @see pythonfunctions.PythonModel.PythonModelPackage#getPythonFile()
 * @model
 * @generated
 */
public interface PythonFile extends EObject {
	/**
	 * Returns the value of the '<em><b>Functions</b></em>' reference list.
	 * The list contents are of type {@link pythonfunctions.PythonModel.PythonFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' reference list.
	 * @see pythonfunctions.PythonModel.PythonModelPackage#getPythonFile_Functions()
	 * @model
	 * @generated
	 */
	EList<PythonFunction> getFunctions();

} // PythonFile
