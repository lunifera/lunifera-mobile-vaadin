/**
 */
package org.lunifera.mobile.vaadin.ecview.model;

import org.lunifera.ecview.core.common.model.core.YField;
import org.lunifera.ecview.core.common.model.datatypes.YDatadescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VM Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.VMSwitch#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.VMSwitch#isValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage#getVMSwitch()
 * @model
 * @generated
 */
public interface VMSwitch extends YField {

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
	 * @see org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage#getVMSwitch_Datadescription()
	 * @model
	 * @generated
	 */
	YDatadescription getDatadescription();

	/**
	 * Sets the value of the '{@link org.lunifera.mobile.vaadin.ecview.model.VMSwitch#getDatadescription <em>Datadescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datadescription</em>' reference.
	 * @see #getDatadescription()
	 * @generated
	 */
	void setDatadescription(YDatadescription value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage#getVMSwitch_Value()
	 * @model
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link org.lunifera.mobile.vaadin.ecview.model.VMSwitch#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);
} // VMSwitch
