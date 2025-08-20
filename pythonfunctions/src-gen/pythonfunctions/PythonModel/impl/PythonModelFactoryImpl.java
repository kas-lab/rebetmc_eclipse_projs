/**
 */
package pythonfunctions.PythonModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pythonfunctions.PythonModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PythonModelFactoryImpl extends EFactoryImpl implements PythonModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PythonModelFactory init() {
		try {
			PythonModelFactory thePythonModelFactory = (PythonModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(PythonModelPackage.eNS_URI);
			if (thePythonModelFactory != null) {
				return thePythonModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PythonModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PythonModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PythonModelPackage.PYTHON_FILE:
			return createPythonFile();
		case PythonModelPackage.PYTHON_FUNCTION:
			return createPythonFunction();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PythonFile createPythonFile() {
		PythonFileImpl pythonFile = new PythonFileImpl();
		return pythonFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PythonFunction createPythonFunction() {
		PythonFunctionImpl pythonFunction = new PythonFunctionImpl();
		return pythonFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PythonModelPackage getPythonModelPackage() {
		return (PythonModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PythonModelPackage getPackage() {
		return PythonModelPackage.eINSTANCE;
	}

} //PythonModelFactoryImpl
