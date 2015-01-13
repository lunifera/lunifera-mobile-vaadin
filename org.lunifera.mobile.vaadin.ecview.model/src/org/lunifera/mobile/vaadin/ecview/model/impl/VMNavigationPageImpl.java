/**
 */
package org.lunifera.mobile.vaadin.ecview.model.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.lunifera.ecview.core.common.model.binding.YECViewModelValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.impl.YLayoutImpl;

import org.lunifera.mobile.vaadin.ecview.model.VMNavigationBarButton;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage;
import org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VM Navigation Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationPageImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationPageImpl#getEmfNsURI <em>Emf Ns URI</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationPageImpl#getTypeQualifiedName <em>Type Qualified Name</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationPageImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationPageImpl#getBarActions <em>Bar Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VMNavigationPageImpl extends YLayoutImpl implements VMNavigationPage {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Class<?> type;
	/**
	 * The default value of the '{@link #getEmfNsURI() <em>Emf Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmfNsURI()
	 * @generated
	 * @ordered
	 */
	protected static final String EMF_NS_URI_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEmfNsURI() <em>Emf Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmfNsURI()
	 * @generated
	 * @ordered
	 */
	protected String emfNsURI = EMF_NS_URI_EDEFAULT;
	/**
	 * The default value of the '{@link #getTypeQualifiedName() <em>Type Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_QUALIFIED_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTypeQualifiedName() <em>Type Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected String typeQualifiedName = TYPE_QUALIFIED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Object value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBarActions() <em>Bar Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarActions()
	 * @generated
	 * @ordered
	 */
	protected EList<VMNavigationBarButton> barActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VMNavigationPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VaadinMobilePackage.Literals.VM_NAVIGATION_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Class<?> newType) {
		Class<?> oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VaadinMobilePackage.VM_NAVIGATION_PAGE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmfNsURI() {
		return emfNsURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmfNsURI(String newEmfNsURI) {
		String oldEmfNsURI = emfNsURI;
		emfNsURI = newEmfNsURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VaadinMobilePackage.VM_NAVIGATION_PAGE__EMF_NS_URI, oldEmfNsURI, emfNsURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeQualifiedName() {
		return typeQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeQualifiedName(String newTypeQualifiedName) {
		String oldTypeQualifiedName = typeQualifiedName;
		typeQualifiedName = newTypeQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VaadinMobilePackage.VM_NAVIGATION_PAGE__TYPE_QUALIFIED_NAME, oldTypeQualifiedName, typeQualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Object newValue) {
		Object oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VaadinMobilePackage.VM_NAVIGATION_PAGE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VMNavigationBarButton> getBarActions() {
		if (barActions == null) {
			barActions = new EObjectContainmentEList<VMNavigationBarButton>(VMNavigationBarButton.class, this, VaadinMobilePackage.VM_NAVIGATION_PAGE__BAR_ACTIONS);
		}
		return barActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YECViewModelValueBindingEndpoint createValueEndpoint() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VaadinMobilePackage.VM_NAVIGATION_PAGE__BAR_ACTIONS:
				return ((InternalEList<?>)getBarActions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VaadinMobilePackage.VM_NAVIGATION_PAGE__TYPE:
				return getType();
			case VaadinMobilePackage.VM_NAVIGATION_PAGE__EMF_NS_URI:
				return getEmfNsURI();
			case VaadinMobilePackage.VM_NAVIGATION_PAGE__TYPE_QUALIFIED_NAME:
				return getTypeQualifiedName();
			case VaadinMobilePackage.VM_NAVIGATION_PAGE__VALUE:
				return getValue();
			case VaadinMobilePackage.VM_NAVIGATION_PAGE__BAR_ACTIONS:
				return getBarActions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VaadinMobilePackage.VM_NAVIGATION_PAGE__TYPE:
				setType((Class<?>)newValue);
				return;
			case VaadinMobilePackage.VM_NAVIGATION_PAGE__EMF_NS_URI:
				setEmfNsURI((String)newValue);
				return;
			case VaadinMobilePackage.VM_NAVIGATION_PAGE__TYPE_QUALIFIED_NAME:
				setTypeQualifiedName((String)newValue);
				return;
			case VaadinMobilePackage.VM_NAVIGATION_PAGE__VALUE:
				setValue(newValue);
				return;
			case VaadinMobilePackage.VM_NAVIGATION_PAGE__BAR_ACTIONS:
				getBarActions().clear();
				getBarActions().addAll((Collection<? extends VMNavigationBarButton>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VaadinMobilePackage.VM_NAVIGATION_PAGE__TYPE:
				setType((Class<?>)null);
				return;
			case VaadinMobilePackage.VM_NAVIGATION_PAGE__EMF_NS_URI:
				setEmfNsURI(EMF_NS_URI_EDEFAULT);
				return;
			case VaadinMobilePackage.VM_NAVIGATION_PAGE__TYPE_QUALIFIED_NAME:
				setTypeQualifiedName(TYPE_QUALIFIED_NAME_EDEFAULT);
				return;
			case VaadinMobilePackage.VM_NAVIGATION_PAGE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case VaadinMobilePackage.VM_NAVIGATION_PAGE__BAR_ACTIONS:
				getBarActions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VaadinMobilePackage.VM_NAVIGATION_PAGE__TYPE:
				return type != null;
			case VaadinMobilePackage.VM_NAVIGATION_PAGE__EMF_NS_URI:
				return EMF_NS_URI_EDEFAULT == null ? emfNsURI != null : !EMF_NS_URI_EDEFAULT.equals(emfNsURI);
			case VaadinMobilePackage.VM_NAVIGATION_PAGE__TYPE_QUALIFIED_NAME:
				return TYPE_QUALIFIED_NAME_EDEFAULT == null ? typeQualifiedName != null : !TYPE_QUALIFIED_NAME_EDEFAULT.equals(typeQualifiedName);
			case VaadinMobilePackage.VM_NAVIGATION_PAGE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case VaadinMobilePackage.VM_NAVIGATION_PAGE__BAR_ACTIONS:
				return barActions != null && !barActions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", emfNsURI: ");
		result.append(emfNsURI);
		result.append(", typeQualifiedName: ");
		result.append(typeQualifiedName);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //VMNavigationPageImpl
