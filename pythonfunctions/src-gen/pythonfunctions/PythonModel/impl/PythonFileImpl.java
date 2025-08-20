/**
 */
package pythonfunctions.PythonModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pythonfunctions.PythonModel.PythonFile;
import pythonfunctions.PythonModel.PythonFunction;
import pythonfunctions.PythonModel.PythonModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Python File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pythonfunctions.PythonModel.impl.PythonFileImpl#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PythonFileImpl extends MinimalEObjectImpl.Container implements PythonFile {
	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<PythonFunction> functions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PythonFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PythonModelPackage.Literals.PYTHON_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PythonFunction> getFunctions() {
		if (functions == null) {
			functions = new EObjectResolvingEList<PythonFunction>(PythonFunction.class, this,
					PythonModelPackage.PYTHON_FILE__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PythonModelPackage.PYTHON_FILE__FUNCTIONS:
			return getFunctions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PythonModelPackage.PYTHON_FILE__FUNCTIONS:
			getFunctions().clear();
			getFunctions().addAll((Collection<? extends PythonFunction>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PythonModelPackage.PYTHON_FILE__FUNCTIONS:
			getFunctions().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PythonModelPackage.PYTHON_FILE__FUNCTIONS:
			return functions != null && !functions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PythonFileImpl
