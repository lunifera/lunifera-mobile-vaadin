/**
 */
package org.lunifera.mobile.vaadin.ecview.model.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.lunifera.ecview.core.common.model.binding.BindingPackage;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.datatypes.DatatypesPackage;
import org.lunifera.ecview.core.common.model.validation.ValidationPackage;
import org.lunifera.ecview.core.common.model.visibility.VisibilityPackage;
import org.lunifera.mobile.vaadin.ecview.model.VMHorizontalButtonGroup;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationBarButton;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationButton;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationCommand;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationHandler;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationRoot;
import org.lunifera.mobile.vaadin.ecview.model.VMSearchPanel;
import org.lunifera.mobile.vaadin.ecview.model.VMSwitch;
import org.lunifera.mobile.vaadin.ecview.model.VMTab;
import org.lunifera.mobile.vaadin.ecview.model.VMTabSheet;
import org.lunifera.mobile.vaadin.ecview.model.VMVerticalComponentGroup;
import org.lunifera.mobile.vaadin.ecview.model.VaadinMobileFactory;
import org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VaadinMobilePackageImpl extends EPackageImpl implements VaadinMobilePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmHorizontalButtonGroupEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmSwitchEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmVerticalComponentGroupEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmTabSheetEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmTabEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmNavigationPageEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmNavigationButtonEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmNavigationCommandEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmNavigationHandlerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmSearchPanelEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmNavigationRootEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmNavigationBarButtonEClass = null;
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
	 * @see org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VaadinMobilePackageImpl() {
		super(eNS_URI, VaadinMobileFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VaadinMobilePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VaadinMobilePackage init() {
		if (isInited) return (VaadinMobilePackage)EPackage.Registry.INSTANCE.getEPackage(VaadinMobilePackage.eNS_URI);

		// Obtain or create and register package
		VaadinMobilePackageImpl theVaadinMobilePackage = (VaadinMobilePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VaadinMobilePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VaadinMobilePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BindingPackage.eINSTANCE.eClass();
		CoreModelPackage.eINSTANCE.eClass();
		ValidationPackage.eINSTANCE.eClass();
		DatatypesPackage.eINSTANCE.eClass();
		VisibilityPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theVaadinMobilePackage.createPackageContents();

		// Initialize created meta-data
		theVaadinMobilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVaadinMobilePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VaadinMobilePackage.eNS_URI, theVaadinMobilePackage);
		return theVaadinMobilePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVMHorizontalButtonGroup() {
		return vmHorizontalButtonGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVMSwitch() {
		return vmSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVMSwitch_Datadescription() {
		return (EReference)vmSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVMSwitch_Value() {
		return (EAttribute)vmSwitchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVMVerticalComponentGroup() {
		return vmVerticalComponentGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVMTabSheet() {
		return vmTabSheetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVMTabSheet_Tabs() {
		return (EReference)vmTabSheetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVMTab() {
		return vmTabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVMTab_Parent() {
		return (EReference)vmTabEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVMTab_Embeddable() {
		return (EReference)vmTabEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVMTab_Datadescription() {
		return (EReference)vmTabEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVMNavigationPage() {
		return vmNavigationPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVMNavigationPage_Type() {
		return (EAttribute)vmNavigationPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVMNavigationPage_EmfNsURI() {
		return (EAttribute)vmNavigationPageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVMNavigationPage_TypeQualifiedName() {
		return (EAttribute)vmNavigationPageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVMNavigationPage_Value() {
		return (EAttribute)vmNavigationPageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVMNavigationPage_BarActions() {
		return (EReference)vmNavigationPageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVMNavigationPage_NavigateBack() {
		return (EAttribute)vmNavigationPageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVMNavigationPage_OnNavigateBack() {
		return (EAttribute)vmNavigationPageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVMNavigationButton() {
		return vmNavigationButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVMNavigationButton_Page() {
		return (EReference)vmNavigationButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVMNavigationButton_Datadescription() {
		return (EReference)vmNavigationButtonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVMNavigationCommand() {
		return vmNavigationCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVMNavigationCommand_TargetPage() {
		return (EReference)vmNavigationCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVMNavigationCommand_Value() {
		return (EAttribute)vmNavigationCommandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVMNavigationCommand_NavigationHandler() {
		return (EReference)vmNavigationCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVMNavigationHandler() {
		return vmNavigationHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVMSearchPanel() {
		return vmSearchPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVMSearchPanel_Type() {
		return (EAttribute)vmSearchPanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVMSearchPanel_EmfNsURI() {
		return (EAttribute)vmSearchPanelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVMSearchPanel_TypeQualifiedName() {
		return (EAttribute)vmSearchPanelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVMSearchPanel_ApplyFilter() {
		return (EAttribute)vmSearchPanelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVMSearchPanel_Filter() {
		return (EAttribute)vmSearchPanelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVMNavigationRoot() {
		return vmNavigationRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVMNavigationBarButton() {
		return vmNavigationBarButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVMNavigationBarButton_Datadescription() {
		return (EReference)vmNavigationBarButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVMNavigationBarButton_LastClickTime() {
		return (EAttribute)vmNavigationBarButtonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VaadinMobileFactory getVaadinMobileFactory() {
		return (VaadinMobileFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		vmHorizontalButtonGroupEClass = createEClass(VM_HORIZONTAL_BUTTON_GROUP);

		vmSwitchEClass = createEClass(VM_SWITCH);
		createEReference(vmSwitchEClass, VM_SWITCH__DATADESCRIPTION);
		createEAttribute(vmSwitchEClass, VM_SWITCH__VALUE);

		vmVerticalComponentGroupEClass = createEClass(VM_VERTICAL_COMPONENT_GROUP);

		vmTabSheetEClass = createEClass(VM_TAB_SHEET);
		createEReference(vmTabSheetEClass, VM_TAB_SHEET__TABS);

		vmTabEClass = createEClass(VM_TAB);
		createEReference(vmTabEClass, VM_TAB__PARENT);
		createEReference(vmTabEClass, VM_TAB__EMBEDDABLE);
		createEReference(vmTabEClass, VM_TAB__DATADESCRIPTION);

		vmNavigationPageEClass = createEClass(VM_NAVIGATION_PAGE);
		createEAttribute(vmNavigationPageEClass, VM_NAVIGATION_PAGE__TYPE);
		createEAttribute(vmNavigationPageEClass, VM_NAVIGATION_PAGE__EMF_NS_URI);
		createEAttribute(vmNavigationPageEClass, VM_NAVIGATION_PAGE__TYPE_QUALIFIED_NAME);
		createEAttribute(vmNavigationPageEClass, VM_NAVIGATION_PAGE__VALUE);
		createEReference(vmNavigationPageEClass, VM_NAVIGATION_PAGE__BAR_ACTIONS);
		createEAttribute(vmNavigationPageEClass, VM_NAVIGATION_PAGE__NAVIGATE_BACK);
		createEAttribute(vmNavigationPageEClass, VM_NAVIGATION_PAGE__ON_NAVIGATE_BACK);

		vmNavigationButtonEClass = createEClass(VM_NAVIGATION_BUTTON);
		createEReference(vmNavigationButtonEClass, VM_NAVIGATION_BUTTON__PAGE);
		createEReference(vmNavigationButtonEClass, VM_NAVIGATION_BUTTON__DATADESCRIPTION);

		vmNavigationCommandEClass = createEClass(VM_NAVIGATION_COMMAND);
		createEReference(vmNavigationCommandEClass, VM_NAVIGATION_COMMAND__NAVIGATION_HANDLER);
		createEReference(vmNavigationCommandEClass, VM_NAVIGATION_COMMAND__TARGET_PAGE);
		createEAttribute(vmNavigationCommandEClass, VM_NAVIGATION_COMMAND__VALUE);

		vmNavigationHandlerEClass = createEClass(VM_NAVIGATION_HANDLER);

		vmSearchPanelEClass = createEClass(VM_SEARCH_PANEL);
		createEAttribute(vmSearchPanelEClass, VM_SEARCH_PANEL__TYPE);
		createEAttribute(vmSearchPanelEClass, VM_SEARCH_PANEL__EMF_NS_URI);
		createEAttribute(vmSearchPanelEClass, VM_SEARCH_PANEL__TYPE_QUALIFIED_NAME);
		createEAttribute(vmSearchPanelEClass, VM_SEARCH_PANEL__APPLY_FILTER);
		createEAttribute(vmSearchPanelEClass, VM_SEARCH_PANEL__FILTER);

		vmNavigationRootEClass = createEClass(VM_NAVIGATION_ROOT);

		vmNavigationBarButtonEClass = createEClass(VM_NAVIGATION_BAR_BUTTON);
		createEReference(vmNavigationBarButtonEClass, VM_NAVIGATION_BAR_BUTTON__DATADESCRIPTION);
		createEAttribute(vmNavigationBarButtonEClass, VM_NAVIGATION_BAR_BUTTON__LAST_CLICK_TIME);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CoreModelPackage theCoreModelPackage = (CoreModelPackage)EPackage.Registry.INSTANCE.getEPackage(CoreModelPackage.eNS_URI);
		DatatypesPackage theDatatypesPackage = (DatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);
		BindingPackage theBindingPackage = (BindingPackage)EPackage.Registry.INSTANCE.getEPackage(BindingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vmHorizontalButtonGroupEClass.getESuperTypes().add(theCoreModelPackage.getYLayout());
		vmSwitchEClass.getESuperTypes().add(theCoreModelPackage.getYField());
		vmVerticalComponentGroupEClass.getESuperTypes().add(theCoreModelPackage.getYLayout());
		vmTabSheetEClass.getESuperTypes().add(theCoreModelPackage.getYEmbeddable());
		vmTabEClass.getESuperTypes().add(theCoreModelPackage.getYElement());
		vmTabEClass.getESuperTypes().add(theCoreModelPackage.getYCssAble());
		vmTabEClass.getESuperTypes().add(this.getVMNavigationHandler());
		vmNavigationPageEClass.getESuperTypes().add(theCoreModelPackage.getYLayout());
		vmNavigationPageEClass.getESuperTypes().add(this.getVMNavigationHandler());
		vmNavigationButtonEClass.getESuperTypes().add(theCoreModelPackage.getYAction());
		vmNavigationCommandEClass.getESuperTypes().add(theCoreModelPackage.getYCommand());
		vmNavigationHandlerEClass.getESuperTypes().add(theCoreModelPackage.getYElement());
		vmSearchPanelEClass.getESuperTypes().add(theCoreModelPackage.getYLayout());
		vmSearchPanelEClass.getESuperTypes().add(theCoreModelPackage.getYSpacingable());
		vmSearchPanelEClass.getESuperTypes().add(theCoreModelPackage.getYMarginable());
		vmNavigationRootEClass.getESuperTypes().add(theCoreModelPackage.getYLayout());
		vmNavigationRootEClass.getESuperTypes().add(this.getVMNavigationHandler());
		vmNavigationBarButtonEClass.getESuperTypes().add(theCoreModelPackage.getYAction());
		vmNavigationBarButtonEClass.getESuperTypes().add(theCoreModelPackage.getYVisibleable());
		vmNavigationBarButtonEClass.getESuperTypes().add(theCoreModelPackage.getYEditable());
		vmNavigationBarButtonEClass.getESuperTypes().add(theCoreModelPackage.getYEnable());

		// Initialize classes and features; add operations and parameters
		initEClass(vmHorizontalButtonGroupEClass, VMHorizontalButtonGroup.class, "VMHorizontalButtonGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vmSwitchEClass, VMSwitch.class, "VMSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVMSwitch_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, VMSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVMSwitch_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, VMSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vmVerticalComponentGroupEClass, VMVerticalComponentGroup.class, "VMVerticalComponentGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vmTabSheetEClass, VMTabSheet.class, "VMTabSheet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVMTabSheet_Tabs(), this.getVMTab(), this.getVMTab_Parent(), "tabs", null, 0, -1, VMTabSheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vmTabEClass, VMTab.class, "VMTab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVMTab_Parent(), this.getVMTabSheet(), this.getVMTabSheet_Tabs(), "parent", null, 1, 1, VMTab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVMTab_Embeddable(), theCoreModelPackage.getYEmbeddable(), null, "embeddable", null, 1, 1, VMTab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVMTab_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, VMTab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(vmTabEClass, theCoreModelPackage.getYView(), "getView", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vmNavigationPageEClass, VMNavigationPage.class, "VMNavigationPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getVMNavigationPage_Type(), g1, "type", null, 0, 1, VMNavigationPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVMNavigationPage_EmfNsURI(), ecorePackage.getEString(), "emfNsURI", null, 0, 1, VMNavigationPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVMNavigationPage_TypeQualifiedName(), ecorePackage.getEString(), "typeQualifiedName", null, 0, 1, VMNavigationPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVMNavigationPage_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, VMNavigationPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVMNavigationPage_BarActions(), this.getVMNavigationBarButton(), null, "barActions", null, 0, -1, VMNavigationPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVMNavigationPage_NavigateBack(), ecorePackage.getEJavaObject(), "navigateBack", null, 0, 1, VMNavigationPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVMNavigationPage_OnNavigateBack(), ecorePackage.getELong(), "onNavigateBack", null, 0, 1, VMNavigationPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(vmNavigationPageEClass, theBindingPackage.getYECViewModelValueBindingEndpoint(), "createValueEndpoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vmNavigationButtonEClass, VMNavigationButton.class, "VMNavigationButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVMNavigationButton_Page(), this.getVMNavigationPage(), null, "page", null, 0, 1, VMNavigationButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVMNavigationButton_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, VMNavigationButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(vmNavigationButtonEClass, theCoreModelPackage.getYView(), "getView", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vmNavigationCommandEClass, VMNavigationCommand.class, "VMNavigationCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVMNavigationCommand_NavigationHandler(), this.getVMNavigationHandler(), null, "navigationHandler", null, 0, 1, VMNavigationCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVMNavigationCommand_TargetPage(), this.getVMNavigationPage(), null, "targetPage", null, 0, 1, VMNavigationCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVMNavigationCommand_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, VMNavigationCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(vmNavigationCommandEClass, theBindingPackage.getYECViewModelValueBindingEndpoint(), "createNavigationValueEndpoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vmNavigationHandlerEClass, VMNavigationHandler.class, "VMNavigationHandler", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vmSearchPanelEClass, VMSearchPanel.class, "VMSearchPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getVMSearchPanel_Type(), g1, "type", null, 0, 1, VMSearchPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVMSearchPanel_EmfNsURI(), ecorePackage.getEString(), "emfNsURI", null, 0, 1, VMSearchPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVMSearchPanel_TypeQualifiedName(), ecorePackage.getEString(), "typeQualifiedName", null, 0, 1, VMSearchPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVMSearchPanel_ApplyFilter(), ecorePackage.getEJavaObject(), "applyFilter", null, 0, 1, VMSearchPanel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVMSearchPanel_Filter(), ecorePackage.getEJavaObject(), "filter", null, 0, 1, VMSearchPanel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vmNavigationRootEClass, VMNavigationRoot.class, "VMNavigationRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vmNavigationBarButtonEClass, VMNavigationBarButton.class, "VMNavigationBarButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVMNavigationBarButton_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, VMNavigationBarButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVMNavigationBarButton_LastClickTime(), ecorePackage.getELong(), "lastClickTime", null, 0, 1, VMNavigationBarButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(vmNavigationBarButtonEClass, theCoreModelPackage.getYView(), "getView", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //VaadinMobilePackageImpl
