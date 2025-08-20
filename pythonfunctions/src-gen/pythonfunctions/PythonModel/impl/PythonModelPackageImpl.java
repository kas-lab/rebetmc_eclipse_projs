/**
 */
package pythonfunctions.PythonModel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pythonfunctions.PythonModel.PythonFile;
import pythonfunctions.PythonModel.PythonFunction;
import pythonfunctions.PythonModel.PythonModelFactory;
import pythonfunctions.PythonModel.PythonModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PythonModelPackageImpl extends EPackageImpl implements PythonModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pythonFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pythonFunctionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see pythonfunctions.PythonModel.PythonModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PythonModelPackageImpl() {
		super(eNS_URI, PythonModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PythonModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PythonModelPackage init() {
		if (isInited)
			return (PythonModelPackage) EPackage.Registry.INSTANCE.getEPackage(PythonModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPythonModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PythonModelPackageImpl thePythonModelPackage = registeredPythonModelPackage instanceof PythonModelPackageImpl
				? (PythonModelPackageImpl) registeredPythonModelPackage
				: new PythonModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePythonModelPackage.createPackageContents();

		// Initialize created meta-data
		thePythonModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePythonModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PythonModelPackage.eNS_URI, thePythonModelPackage);
		return thePythonModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPythonFile() {
		return pythonFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPythonFile_Functions() {
		return (EReference) pythonFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPythonFunction() {
		return pythonFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPythonFunction_Name() {
		return (EAttribute) pythonFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPythonFunction_Arguments() {
		return (EAttribute) pythonFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PythonModelFactory getPythonModelFactory() {
		return (PythonModelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		pythonFileEClass = createEClass(PYTHON_FILE);
		createEReference(pythonFileEClass, PYTHON_FILE__FUNCTIONS);

		pythonFunctionEClass = createEClass(PYTHON_FUNCTION);
		createEAttribute(pythonFunctionEClass, PYTHON_FUNCTION__NAME);
		createEAttribute(pythonFunctionEClass, PYTHON_FUNCTION__ARGUMENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(pythonFileEClass, PythonFile.class, "PythonFile", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPythonFile_Functions(), this.getPythonFunction(), null, "functions", null, 0, -1,
				PythonFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pythonFunctionEClass, PythonFunction.class, "PythonFunction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPythonFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, PythonFunction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPythonFunction_Arguments(), ecorePackage.getEString(), "arguments", null, 0, -1,
				PythonFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PythonModelPackageImpl
