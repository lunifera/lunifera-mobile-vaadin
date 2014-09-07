/**
 */
package org.lunifera.mobile.vaadin.ecview.model;

import org.eclipse.emf.common.util.EList;

import org.lunifera.ecview.core.common.model.core.YEmbeddable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VM Tab Sheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.VMTabSheet#getTabs <em>Tabs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage#getVMTabSheet()
 * @model
 * @generated
 */
public interface VMTabSheet extends YEmbeddable {
	/**
	 * Returns the value of the '<em><b>Tabs</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.mobile.vaadin.ecview.model.VMTab}.
	 * It is bidirectional and its opposite is '{@link org.lunifera.mobile.vaadin.ecview.model.VMTab#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tabs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabs</em>' containment reference list.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage#getVMTabSheet_Tabs()
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMTab#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<VMTab> getTabs();

} // VMTabSheet
