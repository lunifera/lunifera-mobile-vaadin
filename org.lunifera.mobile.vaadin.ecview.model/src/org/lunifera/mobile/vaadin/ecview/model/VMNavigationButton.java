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
package org.lunifera.mobile.vaadin.ecview.model;

import org.lunifera.ecview.core.common.model.core.YAction;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.core.common.model.datatypes.YDatadescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VM Navigation Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationButton#getPage <em>Page</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationButton#getDatadescription <em>Datadescription</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage#getVMNavigationButton()
 * @model
 * @generated
 */
public interface VMNavigationButton extends YAction {
	/**
	 * Returns the value of the '<em><b>Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' containment reference.
	 * @see #setPage(VMNavigationPage)
	 * @see org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage#getVMNavigationButton_Page()
	 * @model containment="true"
	 * @generated
	 */
	VMNavigationPage getPage();

	/**
	 * Sets the value of the '{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationButton#getPage <em>Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page</em>' containment reference.
	 * @see #getPage()
	 * @generated
	 */
	void setPage(VMNavigationPage value);

	/**
	 * Returns the value of the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datadescription</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datadescription</em>' reference.
	 * @see #setDatadescription(YDatadescription)
	 * @see org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage#getVMNavigationButton_Datadescription()
	 * @model
	 * @generated
	 */
	YDatadescription getDatadescription();

	/**
	 * Sets the value of the '{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationButton#getDatadescription <em>Datadescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datadescription</em>' reference.
	 * @see #getDatadescription()
	 * @generated
	 */
	void setDatadescription(YDatadescription value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	YView getView();

} // VMNavigationButton
