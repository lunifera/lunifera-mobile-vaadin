/**
 */
package org.lunifera.mobile.vaadin.ecview.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage
 * @generated
 */
public interface VaadinMobileFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VaadinMobileFactory eINSTANCE = org.lunifera.mobile.vaadin.ecview.model.impl.VaadinMobileFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>VM Horizontal Button Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VM Horizontal Button Group</em>'.
	 * @generated
	 */
	VMHorizontalButtonGroup createVMHorizontalButtonGroup();

	/**
	 * Returns a new object of class '<em>VM Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VM Switch</em>'.
	 * @generated
	 */
	VMSwitch createVMSwitch();

	/**
	 * Returns a new object of class '<em>VM Vertical Component Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VM Vertical Component Group</em>'.
	 * @generated
	 */
	VMVerticalComponentGroup createVMVerticalComponentGroup();

	/**
	 * Returns a new object of class '<em>VM Tab Sheet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VM Tab Sheet</em>'.
	 * @generated
	 */
	VMTabSheet createVMTabSheet();

	/**
	 * Returns a new object of class '<em>VM Tab</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VM Tab</em>'.
	 * @generated
	 */
	VMTab createVMTab();

	/**
	 * Returns a new object of class '<em>VM Navigation Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VM Navigation Page</em>'.
	 * @generated
	 */
	VMNavigationPage createVMNavigationPage();

	/**
	 * Returns a new object of class '<em>VM Navigation Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VM Navigation Button</em>'.
	 * @generated
	 */
	VMNavigationButton createVMNavigationButton();

	/**
	 * Returns a new object of class '<em>VM Navigation Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VM Navigation Command</em>'.
	 * @generated
	 */
	VMNavigationCommand createVMNavigationCommand();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VaadinMobilePackage getVaadinMobilePackage();

} //VaadinMobileFactory
