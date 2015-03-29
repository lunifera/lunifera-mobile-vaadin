/**
 */
package org.lunifera.mobile.vaadin.ecview.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.lunifera.ecview.core.common.model.core.YAction;
import org.lunifera.ecview.core.common.model.core.YCommand;
import org.lunifera.ecview.core.common.model.core.YCssAble;
import org.lunifera.ecview.core.common.model.core.YEditable;
import org.lunifera.ecview.core.common.model.core.YElement;
import org.lunifera.ecview.core.common.model.core.YEmbeddable;
import org.lunifera.ecview.core.common.model.core.YEnable;
import org.lunifera.ecview.core.common.model.core.YField;
import org.lunifera.ecview.core.common.model.core.YFocusable;
import org.lunifera.ecview.core.common.model.core.YLayout;
import org.lunifera.ecview.core.common.model.core.YMarginable;
import org.lunifera.ecview.core.common.model.core.YSpacingable;
import org.lunifera.ecview.core.common.model.core.YVisibleable;
import org.lunifera.mobile.vaadin.ecview.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage
 * @generated
 */
public class VaadinMobileSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VaadinMobilePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VaadinMobileSwitch() {
		if (modelPackage == null) {
			modelPackage = VaadinMobilePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case VaadinMobilePackage.VM_HORIZONTAL_BUTTON_GROUP: {
				VMHorizontalButtonGroup vmHorizontalButtonGroup = (VMHorizontalButtonGroup)theEObject;
				T result = caseVMHorizontalButtonGroup(vmHorizontalButtonGroup);
				if (result == null) result = caseYLayout(vmHorizontalButtonGroup);
				if (result == null) result = caseYEmbeddable(vmHorizontalButtonGroup);
				if (result == null) result = caseYEditable(vmHorizontalButtonGroup);
				if (result == null) result = caseYEnable(vmHorizontalButtonGroup);
				if (result == null) result = caseYElement(vmHorizontalButtonGroup);
				if (result == null) result = caseYCssAble(vmHorizontalButtonGroup);
				if (result == null) result = caseYVisibleable(vmHorizontalButtonGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VaadinMobilePackage.VM_SWITCH: {
				VMSwitch vmSwitch = (VMSwitch)theEObject;
				T result = caseVMSwitch(vmSwitch);
				if (result == null) result = caseYField(vmSwitch);
				if (result == null) result = caseYEmbeddable(vmSwitch);
				if (result == null) result = caseYEditable(vmSwitch);
				if (result == null) result = caseYEnable(vmSwitch);
				if (result == null) result = caseYFocusable(vmSwitch);
				if (result == null) result = caseYElement(vmSwitch);
				if (result == null) result = caseYCssAble(vmSwitch);
				if (result == null) result = caseYVisibleable(vmSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VaadinMobilePackage.VM_VERTICAL_COMPONENT_GROUP: {
				VMVerticalComponentGroup vmVerticalComponentGroup = (VMVerticalComponentGroup)theEObject;
				T result = caseVMVerticalComponentGroup(vmVerticalComponentGroup);
				if (result == null) result = caseYLayout(vmVerticalComponentGroup);
				if (result == null) result = caseYEmbeddable(vmVerticalComponentGroup);
				if (result == null) result = caseYEditable(vmVerticalComponentGroup);
				if (result == null) result = caseYEnable(vmVerticalComponentGroup);
				if (result == null) result = caseYElement(vmVerticalComponentGroup);
				if (result == null) result = caseYCssAble(vmVerticalComponentGroup);
				if (result == null) result = caseYVisibleable(vmVerticalComponentGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VaadinMobilePackage.VM_TAB_SHEET: {
				VMTabSheet vmTabSheet = (VMTabSheet)theEObject;
				T result = caseVMTabSheet(vmTabSheet);
				if (result == null) result = caseYEmbeddable(vmTabSheet);
				if (result == null) result = caseYElement(vmTabSheet);
				if (result == null) result = caseYCssAble(vmTabSheet);
				if (result == null) result = caseYVisibleable(vmTabSheet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VaadinMobilePackage.VM_TAB: {
				VMTab vmTab = (VMTab)theEObject;
				T result = caseVMTab(vmTab);
				if (result == null) result = caseYCssAble(vmTab);
				if (result == null) result = caseVMNavigationHandler(vmTab);
				if (result == null) result = caseYElement(vmTab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VaadinMobilePackage.VM_NAVIGATION_PAGE: {
				VMNavigationPage vmNavigationPage = (VMNavigationPage)theEObject;
				T result = caseVMNavigationPage(vmNavigationPage);
				if (result == null) result = caseYLayout(vmNavigationPage);
				if (result == null) result = caseVMNavigationHandler(vmNavigationPage);
				if (result == null) result = caseYEmbeddable(vmNavigationPage);
				if (result == null) result = caseYEditable(vmNavigationPage);
				if (result == null) result = caseYEnable(vmNavigationPage);
				if (result == null) result = caseYElement(vmNavigationPage);
				if (result == null) result = caseYCssAble(vmNavigationPage);
				if (result == null) result = caseYVisibleable(vmNavigationPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VaadinMobilePackage.VM_NAVIGATION_PAGE_CELL_STYLE: {
				VMNavigationPageCellStyle vmNavigationPageCellStyle = (VMNavigationPageCellStyle)theEObject;
				T result = caseVMNavigationPageCellStyle(vmNavigationPageCellStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VaadinMobilePackage.VM_NAVIGATION_BUTTON: {
				VMNavigationButton vmNavigationButton = (VMNavigationButton)theEObject;
				T result = caseVMNavigationButton(vmNavigationButton);
				if (result == null) result = caseYAction(vmNavigationButton);
				if (result == null) result = caseYEmbeddable(vmNavigationButton);
				if (result == null) result = caseYEnable(vmNavigationButton);
				if (result == null) result = caseYElement(vmNavigationButton);
				if (result == null) result = caseYCssAble(vmNavigationButton);
				if (result == null) result = caseYVisibleable(vmNavigationButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VaadinMobilePackage.VM_NAVIGATION_COMMAND: {
				VMNavigationCommand vmNavigationCommand = (VMNavigationCommand)theEObject;
				T result = caseVMNavigationCommand(vmNavigationCommand);
				if (result == null) result = caseYCommand(vmNavigationCommand);
				if (result == null) result = caseYElement(vmNavigationCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VaadinMobilePackage.VM_NAVIGATION_HANDLER: {
				VMNavigationHandler vmNavigationHandler = (VMNavigationHandler)theEObject;
				T result = caseVMNavigationHandler(vmNavigationHandler);
				if (result == null) result = caseYElement(vmNavigationHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VaadinMobilePackage.VM_SEARCH_PANEL: {
				VMSearchPanel vmSearchPanel = (VMSearchPanel)theEObject;
				T result = caseVMSearchPanel(vmSearchPanel);
				if (result == null) result = caseYLayout(vmSearchPanel);
				if (result == null) result = caseYSpacingable(vmSearchPanel);
				if (result == null) result = caseYMarginable(vmSearchPanel);
				if (result == null) result = caseYEmbeddable(vmSearchPanel);
				if (result == null) result = caseYEditable(vmSearchPanel);
				if (result == null) result = caseYEnable(vmSearchPanel);
				if (result == null) result = caseYElement(vmSearchPanel);
				if (result == null) result = caseYCssAble(vmSearchPanel);
				if (result == null) result = caseYVisibleable(vmSearchPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VaadinMobilePackage.VM_NAVIGATION_ROOT: {
				VMNavigationRoot vmNavigationRoot = (VMNavigationRoot)theEObject;
				T result = caseVMNavigationRoot(vmNavigationRoot);
				if (result == null) result = caseYLayout(vmNavigationRoot);
				if (result == null) result = caseVMNavigationHandler(vmNavigationRoot);
				if (result == null) result = caseYEmbeddable(vmNavigationRoot);
				if (result == null) result = caseYEditable(vmNavigationRoot);
				if (result == null) result = caseYEnable(vmNavigationRoot);
				if (result == null) result = caseYElement(vmNavigationRoot);
				if (result == null) result = caseYCssAble(vmNavigationRoot);
				if (result == null) result = caseYVisibleable(vmNavigationRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VaadinMobilePackage.VM_NAVIGATION_BAR_BUTTON: {
				VMNavigationBarButton vmNavigationBarButton = (VMNavigationBarButton)theEObject;
				T result = caseVMNavigationBarButton(vmNavigationBarButton);
				if (result == null) result = caseYAction(vmNavigationBarButton);
				if (result == null) result = caseYEditable(vmNavigationBarButton);
				if (result == null) result = caseYEmbeddable(vmNavigationBarButton);
				if (result == null) result = caseYEnable(vmNavigationBarButton);
				if (result == null) result = caseYElement(vmNavigationBarButton);
				if (result == null) result = caseYCssAble(vmNavigationBarButton);
				if (result == null) result = caseYVisibleable(vmNavigationBarButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VM Horizontal Button Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VM Horizontal Button Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVMHorizontalButtonGroup(VMHorizontalButtonGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VM Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VM Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVMSwitch(VMSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VM Vertical Component Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VM Vertical Component Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVMVerticalComponentGroup(VMVerticalComponentGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VM Tab Sheet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VM Tab Sheet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVMTabSheet(VMTabSheet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VM Tab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VM Tab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVMTab(VMTab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VM Navigation Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VM Navigation Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVMNavigationPage(VMNavigationPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VM Navigation Page Cell Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VM Navigation Page Cell Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVMNavigationPageCellStyle(VMNavigationPageCellStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VM Navigation Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VM Navigation Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVMNavigationButton(VMNavigationButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VM Navigation Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VM Navigation Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVMNavigationCommand(VMNavigationCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VM Navigation Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VM Navigation Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVMNavigationHandler(VMNavigationHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VM Search Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VM Search Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVMSearchPanel(VMSearchPanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VM Navigation Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VM Navigation Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVMNavigationRoot(VMNavigationRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VM Navigation Bar Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VM Navigation Bar Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVMNavigationBarButton(VMNavigationBarButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YElement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYElement(YElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YCss Able</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YCss Able</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYCssAble(YCssAble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YVisibleable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YVisibleable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYVisibleable(YVisibleable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEmbeddable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEmbeddable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEmbeddable(YEmbeddable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YLayout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YLayout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYLayout(YLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YFocusable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YFocusable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYFocusable(YFocusable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEditable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEditable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEditable(YEditable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEnable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEnable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEnable(YEnable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YField</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YField</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYField(YField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YAction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YAction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYAction(YAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YCommand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YCommand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYCommand(YCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YSpacingable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YSpacingable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYSpacingable(YSpacingable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YMarginable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YMarginable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYMarginable(YMarginable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //VaadinMobileSwitch
