/**
 */
package org.lunifera.mobile.vaadin.ecview.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YEditable;
import org.lunifera.ecview.core.common.model.core.impl.YActionImpl;
import org.lunifera.ecview.core.common.model.datatypes.DatatypesFactory;
import org.lunifera.ecview.core.common.model.datatypes.YDatadescription;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationBarButton;
import org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>VM Navigation Bar Button</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationBarButtonImpl#isInitialEditable <em>Initial Editable</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationBarButtonImpl#isEditable <em>Editable</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationBarButtonImpl#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationBarButtonImpl#getLastClickTime <em>Last Click Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VMNavigationBarButtonImpl extends YActionImpl implements
		VMNavigationBarButton {
	/**
	 * The default value of the '{@link #isInitialEditable() <em>Initial Editable</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isInitialEditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIAL_EDITABLE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isInitialEditable() <em>Initial Editable</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isInitialEditable()
	 * @generated
	 * @ordered
	 */
	protected boolean initialEditable = INITIAL_EDITABLE_EDEFAULT;
	/**
	 * The default value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EDITABLE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
	protected boolean editable = EDITABLE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getDatadescription() <em>Datadescription</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDatadescription()
	 * @generated
	 * @ordered
	 */
	protected YDatadescription datadescription;

	/**
	 * The default value of the '{@link #getLastClickTime() <em>Last Click Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getLastClickTime()
	 * @generated
	 * @ordered
	 */
	protected static final long LAST_CLICK_TIME_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getLastClickTime() <em>Last Click Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getLastClickTime()
	 * @generated
	 * @ordered
	 */
	protected long lastClickTime = LAST_CLICK_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected VMNavigationBarButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VaadinMobilePackage.Literals.VM_NAVIGATION_BAR_BUTTON;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitialEditable() {
		return initialEditable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialEditable(boolean newInitialEditable) {
		boolean oldInitialEditable = initialEditable;
		initialEditable = newInitialEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VaadinMobilePackage.VM_NAVIGATION_BAR_BUTTON__INITIAL_EDITABLE, oldInitialEditable, initialEditable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEditable() {
		return editable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditable(boolean newEditable) {
		boolean oldEditable = editable;
		editable = newEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VaadinMobilePackage.VM_NAVIGATION_BAR_BUTTON__EDITABLE, oldEditable, editable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YDatadescription getDatadescription() {
		if (datadescription != null && datadescription.eIsProxy()) {
			InternalEObject oldDatadescription = (InternalEObject)datadescription;
			datadescription = (YDatadescription)eResolveProxy(oldDatadescription);
			if (datadescription != oldDatadescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VaadinMobilePackage.VM_NAVIGATION_BAR_BUTTON__DATADESCRIPTION, oldDatadescription, datadescription));
			}
		}
		return datadescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YDatadescription basicGetDatadescription() {
		return datadescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatadescription(YDatadescription newDatadescription) {
		YDatadescription oldDatadescription = datadescription;
		datadescription = newDatadescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VaadinMobilePackage.VM_NAVIGATION_BAR_BUTTON__DATADESCRIPTION, oldDatadescription, datadescription));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public long getLastClickTime() {
		return lastClickTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastClickTime(long newLastClickTime) {
		long oldLastClickTime = lastClickTime;
		lastClickTime = newLastClickTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VaadinMobilePackage.VM_NAVIGATION_BAR_BUTTON__LAST_CLICK_TIME, oldLastClickTime, lastClickTime));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VaadinMobilePackage.VM_NAVIGATION_BAR_BUTTON__INITIAL_EDITABLE:
				return isInitialEditable();
			case VaadinMobilePackage.VM_NAVIGATION_BAR_BUTTON__EDITABLE:
				return isEditable();
			case VaadinMobilePackage.VM_NAVIGATION_BAR_BUTTON__DATADESCRIPTION:
				if (resolve) return getDatadescription();
				return basicGetDatadescription();
			case VaadinMobilePackage.VM_NAVIGATION_BAR_BUTTON__LAST_CLICK_TIME:
				return getLastClickTime();
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
			case VaadinMobilePackage.VM_NAVIGATION_BAR_BUTTON__INITIAL_EDITABLE:
				setInitialEditable((Boolean)newValue);
				return;
			case VaadinMobilePackage.VM_NAVIGATION_BAR_BUTTON__EDITABLE:
				setEditable((Boolean)newValue);
				return;
			case VaadinMobilePackage.VM_NAVIGATION_BAR_BUTTON__DATADESCRIPTION:
				setDatadescription((YDatadescription)newValue);
				return;
			case VaadinMobilePackage.VM_NAVIGATION_BAR_BUTTON__LAST_CLICK_TIME:
				setLastClickTime((Long)newValue);
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
			case VaadinMobilePackage.VM_NAVIGATION_BAR_BUTTON__INITIAL_EDITABLE:
				setInitialEditable(INITIAL_EDITABLE_EDEFAULT);
				return;
			case VaadinMobilePackage.VM_NAVIGATION_BAR_BUTTON__EDITABLE:
				setEditable(EDITABLE_EDEFAULT);
				return;
			case VaadinMobilePackage.VM_NAVIGATION_BAR_BUTTON__DATADESCRIPTION:
				setDatadescription((YDatadescription)null);
				return;
			case VaadinMobilePackage.VM_NAVIGATION_BAR_BUTTON__LAST_CLICK_TIME:
				setLastClickTime(LAST_CLICK_TIME_EDEFAULT);
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
			case VaadinMobilePackage.VM_NAVIGATION_BAR_BUTTON__INITIAL_EDITABLE:
				return initialEditable != INITIAL_EDITABLE_EDEFAULT;
			case VaadinMobilePackage.VM_NAVIGATION_BAR_BUTTON__EDITABLE:
				return editable != EDITABLE_EDEFAULT;
			case VaadinMobilePackage.VM_NAVIGATION_BAR_BUTTON__DATADESCRIPTION:
				return datadescription != null;
			case VaadinMobilePackage.VM_NAVIGATION_BAR_BUTTON__LAST_CLICK_TIME:
				return lastClickTime != LAST_CLICK_TIME_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == YEditable.class) {
			switch (derivedFeatureID) {
				case VaadinMobilePackage.VM_NAVIGATION_BAR_BUTTON__INITIAL_EDITABLE: return CoreModelPackage.YEDITABLE__INITIAL_EDITABLE;
				case VaadinMobilePackage.VM_NAVIGATION_BAR_BUTTON__EDITABLE: return CoreModelPackage.YEDITABLE__EDITABLE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == YEditable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YEDITABLE__INITIAL_EDITABLE: return VaadinMobilePackage.VM_NAVIGATION_BAR_BUTTON__INITIAL_EDITABLE;
				case CoreModelPackage.YEDITABLE__EDITABLE: return VaadinMobilePackage.VM_NAVIGATION_BAR_BUTTON__EDITABLE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (initialEditable: ");
		result.append(initialEditable);
		result.append(", editable: ");
		result.append(editable);
		result.append(", lastClickTime: ");
		result.append(lastClickTime);
		result.append(')');
		return result.toString();
	}

	/**
	 * Sets the label by creating a new datadescription.
	 * 
	 * @param label
	 */
	public void setLabel(String label) {
		YDatadescription ds = getDatadescription();
		if (ds == null) {
			setDatadescription(createDatadescription(label));
			getOrphanDatadescriptions().add(getDatadescription());
		} else {
			ds.setLabel(label);
		}
	}

	/**
	 * Sets the label i18nKey by creating a new datadescription.
	 * 
	 * @param label
	 */
	public void setLabelI18nKey(String i18nKey) {
		YDatadescription ds = getDatadescription();
		if (ds == null) {
			setDatadescription(createDatadescriptionForI18n(i18nKey));
			getOrphanDatadescriptions().add(getDatadescription());
		} else {
			ds.setLabelI18nKey(i18nKey);
		}
	}

	protected YDatadescription createDatadescription(String label) {
		YDatadescription dsc = DatatypesFactory.eINSTANCE
				.createYDatadescription();
		dsc.setLabel(label);
		return dsc;
	}

	protected YDatadescription createDatadescriptionForI18n(String i18nKey) {
		YDatadescription dsc = DatatypesFactory.eINSTANCE
				.createYDatadescription();
		dsc.setLabelI18nKey(i18nKey);
		return dsc;
	}

} // VMNavigationBarButtonImpl
