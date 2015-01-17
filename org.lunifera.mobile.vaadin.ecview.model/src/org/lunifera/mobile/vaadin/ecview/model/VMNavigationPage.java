/**
 */
package org.lunifera.mobile.vaadin.ecview.model;

import org.eclipse.emf.common.util.EList;
import org.lunifera.ecview.core.common.model.binding.YECViewModelValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.YLayout;
import org.lunifera.ecview.core.common.model.datatypes.YDatadescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VM Navigation Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage#getType <em>Type</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage#getEmfNsURI <em>Emf Ns URI</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage#getTypeQualifiedName <em>Type Qualified Name</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage#getValue <em>Value</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage#getBarActions <em>Bar Actions</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage#getNavigateBack <em>Navigate Back</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage#getOnNavigateBack <em>On Navigate Back</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage#getDatadescription <em>Datadescription</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage#getVMNavigationPage()
 * @model
 * @generated
 */
public interface VMNavigationPage extends YLayout, VMNavigationHandler {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Class)
	 * @see org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage#getVMNavigationPage_Type()
	 * @model
	 * @generated
	 */
	Class<?> getType();

	/**
	 * Sets the value of the '{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Class<?> value);

	/**
	 * Returns the value of the '<em><b>Emf Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emf Ns URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emf Ns URI</em>' attribute.
	 * @see #setEmfNsURI(String)
	 * @see org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage#getVMNavigationPage_EmfNsURI()
	 * @model
	 * @generated
	 */
	String getEmfNsURI();

	/**
	 * Sets the value of the '{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage#getEmfNsURI <em>Emf Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emf Ns URI</em>' attribute.
	 * @see #getEmfNsURI()
	 * @generated
	 */
	void setEmfNsURI(String value);

	/**
	 * Returns the value of the '<em><b>Type Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Qualified Name</em>' attribute.
	 * @see #setTypeQualifiedName(String)
	 * @see org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage#getVMNavigationPage_TypeQualifiedName()
	 * @model
	 * @generated
	 */
	String getTypeQualifiedName();

	/**
	 * Sets the value of the '{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage#getTypeQualifiedName <em>Type Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Qualified Name</em>' attribute.
	 * @see #getTypeQualifiedName()
	 * @generated
	 */
	void setTypeQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage#getVMNavigationPage_Value()
	 * @model
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

	/**
	 * Returns the value of the '<em><b>Bar Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationBarButton}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bar Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bar Actions</em>' containment reference list.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage#getVMNavigationPage_BarActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<VMNavigationBarButton> getBarActions();

	/**
	 * Returns the value of the '<em><b>Navigate Back</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigate Back</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigate Back</em>' attribute.
	 * @see #setNavigateBack(Object)
	 * @see org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage#getVMNavigationPage_NavigateBack()
	 * @model
	 * @generated
	 */
	Object getNavigateBack();

	/**
	 * Sets the value of the '{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage#getNavigateBack <em>Navigate Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigate Back</em>' attribute.
	 * @see #getNavigateBack()
	 * @generated
	 */
	void setNavigateBack(Object value);

	/**
	 * Returns the value of the '<em><b>On Navigate Back</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Navigate Back</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Navigate Back</em>' attribute.
	 * @see #setOnNavigateBack(long)
	 * @see org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage#getVMNavigationPage_OnNavigateBack()
	 * @model
	 * @generated
	 */
	long getOnNavigateBack();

	/**
	 * Sets the value of the '{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage#getOnNavigateBack <em>On Navigate Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Navigate Back</em>' attribute.
	 * @see #getOnNavigateBack()
	 * @generated
	 */
	void setOnNavigateBack(long value);

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
	 * @see org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage#getVMNavigationPage_Datadescription()
	 * @model
	 * @generated
	 */
	YDatadescription getDatadescription();

	/**
	 * Sets the value of the '{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage#getDatadescription <em>Datadescription</em>}' reference.
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
	 * @model
	 * @generated
	 */
	YECViewModelValueBindingEndpoint createValueEndpoint();
} // VMNavigationPage
