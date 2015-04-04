/**
 * Copyright (c) 2011 - 2015, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *         Florian Pirchner - Initial implementation
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
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationButton;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationCommand;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationHandler;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage;
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

		vmNavigationButtonEClass = createEClass(VM_NAVIGATION_BUTTON);
		createEReference(vmNavigationButtonEClass, VM_NAVIGATION_BUTTON__PAGE);
		createEReference(vmNavigationButtonEClass, VM_NAVIGATION_BUTTON__DATADESCRIPTION);

		vmNavigationCommandEClass = createEClass(VM_NAVIGATION_COMMAND);
		createEReference(vmNavigationCommandEClass, VM_NAVIGATION_COMMAND__NAVIGATION_HANDLER);
		createEReference(vmNavigationCommandEClass, VM_NAVIGATION_COMMAND__TARGET_PAGE);
		createEAttribute(vmNavigationCommandEClass, VM_NAVIGATION_COMMAND__VALUE);

		vmNavigationHandlerEClass = createEClass(VM_NAVIGATION_HANDLER);
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

		// Create resource
		createResource(eNS_URI);
	}

} //VaadinMobilePackageImpl
