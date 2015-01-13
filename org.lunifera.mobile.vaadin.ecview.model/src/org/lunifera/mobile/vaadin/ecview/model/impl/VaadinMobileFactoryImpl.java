/**
 */
package org.lunifera.mobile.vaadin.ecview.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.lunifera.mobile.vaadin.ecview.model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VaadinMobileFactoryImpl extends EFactoryImpl implements VaadinMobileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VaadinMobileFactory init() {
		try {
			VaadinMobileFactory theVaadinMobileFactory = (VaadinMobileFactory)EPackage.Registry.INSTANCE.getEFactory(VaadinMobilePackage.eNS_URI);
			if (theVaadinMobileFactory != null) {
				return theVaadinMobileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VaadinMobileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VaadinMobileFactoryImpl() {
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
			case VaadinMobilePackage.VM_HORIZONTAL_BUTTON_GROUP: return createVMHorizontalButtonGroup();
			case VaadinMobilePackage.VM_SWITCH: return createVMSwitch();
			case VaadinMobilePackage.VM_VERTICAL_COMPONENT_GROUP: return createVMVerticalComponentGroup();
			case VaadinMobilePackage.VM_TAB_SHEET: return createVMTabSheet();
			case VaadinMobilePackage.VM_TAB: return createVMTab();
			case VaadinMobilePackage.VM_NAVIGATION_PAGE: return createVMNavigationPage();
			case VaadinMobilePackage.VM_NAVIGATION_BUTTON: return createVMNavigationButton();
			case VaadinMobilePackage.VM_NAVIGATION_COMMAND: return createVMNavigationCommand();
			case VaadinMobilePackage.VM_SEARCH_PANEL: return createVMSearchPanel();
			case VaadinMobilePackage.VM_NAVIGATION_ROOT: return createVMNavigationRoot();
			case VaadinMobilePackage.VM_NAVIGATION_BAR_BUTTON: return createVMNavigationBarButton();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMHorizontalButtonGroup createVMHorizontalButtonGroup() {
		VMHorizontalButtonGroupImpl vmHorizontalButtonGroup = new VMHorizontalButtonGroupImpl();
		return vmHorizontalButtonGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMSwitch createVMSwitch() {
		VMSwitchImpl vmSwitch = new VMSwitchImpl();
		return vmSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMVerticalComponentGroup createVMVerticalComponentGroup() {
		VMVerticalComponentGroupImpl vmVerticalComponentGroup = new VMVerticalComponentGroupImpl();
		return vmVerticalComponentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMTabSheet createVMTabSheet() {
		VMTabSheetImpl vmTabSheet = new VMTabSheetImpl();
		return vmTabSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMTab createVMTab() {
		VMTabImpl vmTab = new VMTabImpl();
		return vmTab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMNavigationPage createVMNavigationPage() {
		VMNavigationPageImpl vmNavigationPage = new VMNavigationPageImpl();
		return vmNavigationPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMNavigationButton createVMNavigationButton() {
		VMNavigationButtonImpl vmNavigationButton = new VMNavigationButtonImpl();
		return vmNavigationButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMNavigationCommand createVMNavigationCommand() {
		VMNavigationCommandImpl vmNavigationCommand = new VMNavigationCommandImpl();
		return vmNavigationCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMSearchPanel createVMSearchPanel() {
		VMSearchPanelImpl vmSearchPanel = new VMSearchPanelImpl();
		return vmSearchPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMNavigationRoot createVMNavigationRoot() {
		VMNavigationRootImpl vmNavigationRoot = new VMNavigationRootImpl();
		return vmNavigationRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMNavigationBarButton createVMNavigationBarButton() {
		VMNavigationBarButtonImpl vmNavigationBarButton = new VMNavigationBarButtonImpl();
		return vmNavigationBarButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VaadinMobilePackage getVaadinMobilePackage() {
		return (VaadinMobilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VaadinMobilePackage getPackage() {
		return VaadinMobilePackage.eINSTANCE;
	}

} //VaadinMobileFactoryImpl
