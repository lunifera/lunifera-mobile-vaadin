/**
 */
package org.lunifera.mobile.vaadin.ecview.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.lunifera.ecview.core.common.model.binding.BindingFactory;
import org.lunifera.ecview.core.common.model.binding.YECViewModelValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.YLayout;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationCommand;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationHandler;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage;
import org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>VM Navigation Command</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationCommandImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationCommandImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationCommandImpl#getNavigationHandler <em>Navigation Handler</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationCommandImpl#getTargetPage <em>Target Page</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationCommandImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VMNavigationCommandImpl extends MinimalEObjectImpl.Container
		implements VMNavigationCommand {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNavigationHandler() <em>Navigation Handler</em>}' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getNavigationHandler()
	 * @generated
	 * @ordered
	 */
	protected VMNavigationHandler navigationHandler;

	/**
	 * The cached value of the '{@link #getTargetPage() <em>Target Page</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTargetPage()
	 * @generated
	 * @ordered
	 */
	protected VMNavigationPage targetPage;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected VMNavigationCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VaadinMobilePackage.Literals.VM_NAVIGATION_COMMAND;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VaadinMobilePackage.VM_NAVIGATION_COMMAND__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VaadinMobilePackage.VM_NAVIGATION_COMMAND__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public VMNavigationPage getTargetPage() {
		return targetPage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetPage(VMNavigationPage newTargetPage,
			NotificationChain msgs) {
		VMNavigationPage oldTargetPage = targetPage;
		targetPage = newTargetPage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VaadinMobilePackage.VM_NAVIGATION_COMMAND__TARGET_PAGE, oldTargetPage, newTargetPage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPage(VMNavigationPage newTargetPage) {
		if (newTargetPage != targetPage) {
			NotificationChain msgs = null;
			if (targetPage != null)
				msgs = ((InternalEObject)targetPage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VaadinMobilePackage.VM_NAVIGATION_COMMAND__TARGET_PAGE, null, msgs);
			if (newTargetPage != null)
				msgs = ((InternalEObject)newTargetPage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VaadinMobilePackage.VM_NAVIGATION_COMMAND__TARGET_PAGE, null, msgs);
			msgs = basicSetTargetPage(newTargetPage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VaadinMobilePackage.VM_NAVIGATION_COMMAND__TARGET_PAGE, newTargetPage, newTargetPage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VaadinMobilePackage.VM_NAVIGATION_COMMAND__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public VMNavigationHandler getNavigationHandler() {
		if (navigationHandler != null && navigationHandler.eIsProxy()) {
			InternalEObject oldNavigationHandler = (InternalEObject)navigationHandler;
			navigationHandler = (VMNavigationHandler)eResolveProxy(oldNavigationHandler);
			if (navigationHandler != oldNavigationHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VaadinMobilePackage.VM_NAVIGATION_COMMAND__NAVIGATION_HANDLER, oldNavigationHandler, navigationHandler));
			}
		}
		return navigationHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMNavigationHandler basicGetNavigationHandler() {
		return navigationHandler;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigationHandler(VMNavigationHandler newNavigationHandler) {
		VMNavigationHandler oldNavigationHandler = navigationHandler;
		navigationHandler = newNavigationHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VaadinMobilePackage.VM_NAVIGATION_COMMAND__NAVIGATION_HANDLER, oldNavigationHandler, navigationHandler));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YECViewModelValueBindingEndpoint createNavigationValueEndpointGen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public YECViewModelValueBindingEndpoint createNavigationValueEndpoint() {
		YECViewModelValueBindingEndpoint endpoint = BindingFactory.eINSTANCE
				.createYECViewModelValueBindingEndpoint();
		endpoint.setElement(this);
		endpoint.getFeatures()
				.add((EStructuralFeature) VaadinMobilePackage.Literals.VM_NAVIGATION_COMMAND__VALUE);
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YView getViewGen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public YView getView() {
		return findViewGeneric(eContainer());
	}

	protected YView findViewGeneric(EObject container) {
		if (container == null) {
			return null;
		}
		if (container instanceof YView) {
			return (YView) container;
		} else if (container instanceof YLayout) {
			return ((YLayout) container).getView();
		} else {
			EObject parent = container.eContainer();
			return findViewGeneric(parent);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VaadinMobilePackage.VM_NAVIGATION_COMMAND__TARGET_PAGE:
				return basicSetTargetPage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VaadinMobilePackage.VM_NAVIGATION_COMMAND__ID:
				return getId();
			case VaadinMobilePackage.VM_NAVIGATION_COMMAND__NAME:
				return getName();
			case VaadinMobilePackage.VM_NAVIGATION_COMMAND__NAVIGATION_HANDLER:
				if (resolve) return getNavigationHandler();
				return basicGetNavigationHandler();
			case VaadinMobilePackage.VM_NAVIGATION_COMMAND__TARGET_PAGE:
				return getTargetPage();
			case VaadinMobilePackage.VM_NAVIGATION_COMMAND__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VaadinMobilePackage.VM_NAVIGATION_COMMAND__ID:
				setId((String)newValue);
				return;
			case VaadinMobilePackage.VM_NAVIGATION_COMMAND__NAME:
				setName((String)newValue);
				return;
			case VaadinMobilePackage.VM_NAVIGATION_COMMAND__NAVIGATION_HANDLER:
				setNavigationHandler((VMNavigationHandler)newValue);
				return;
			case VaadinMobilePackage.VM_NAVIGATION_COMMAND__TARGET_PAGE:
				setTargetPage((VMNavigationPage)newValue);
				return;
			case VaadinMobilePackage.VM_NAVIGATION_COMMAND__VALUE:
				setValue(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VaadinMobilePackage.VM_NAVIGATION_COMMAND__ID:
				setId(ID_EDEFAULT);
				return;
			case VaadinMobilePackage.VM_NAVIGATION_COMMAND__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VaadinMobilePackage.VM_NAVIGATION_COMMAND__NAVIGATION_HANDLER:
				setNavigationHandler((VMNavigationHandler)null);
				return;
			case VaadinMobilePackage.VM_NAVIGATION_COMMAND__TARGET_PAGE:
				setTargetPage((VMNavigationPage)null);
				return;
			case VaadinMobilePackage.VM_NAVIGATION_COMMAND__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VaadinMobilePackage.VM_NAVIGATION_COMMAND__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case VaadinMobilePackage.VM_NAVIGATION_COMMAND__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VaadinMobilePackage.VM_NAVIGATION_COMMAND__NAVIGATION_HANDLER:
				return navigationHandler != null;
			case VaadinMobilePackage.VM_NAVIGATION_COMMAND__TARGET_PAGE:
				return targetPage != null;
			case VaadinMobilePackage.VM_NAVIGATION_COMMAND__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} // VMNavigationCommandImpl
