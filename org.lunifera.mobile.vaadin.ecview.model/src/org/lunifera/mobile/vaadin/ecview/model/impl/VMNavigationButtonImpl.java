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
package org.lunifera.mobile.vaadin.ecview.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.lunifera.ecview.core.common.model.core.impl.YActionImpl;
import org.lunifera.ecview.core.common.model.datatypes.DatatypesFactory;
import org.lunifera.ecview.core.common.model.datatypes.YDatadescription;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationButton;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage;
import org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VM Navigation Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationButtonImpl#getPage <em>Page</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationButtonImpl#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationButtonImpl#getLastClickTime <em>Last Click Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VMNavigationButtonImpl extends YActionImpl implements VMNavigationButton {
	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected VMNavigationPage page;

	/**
	 * The cached value of the '{@link #getDatadescription() <em>Datadescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatadescription()
	 * @generated
	 * @ordered
	 */
	protected YDatadescription datadescription;

	/**
	 * The default value of the '{@link #getLastClickTime() <em>Last Click Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastClickTime()
	 * @generated
	 * @ordered
	 */
	protected static final long LAST_CLICK_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLastClickTime() <em>Last Click Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastClickTime()
	 * @generated
	 * @ordered
	 */
	protected long lastClickTime = LAST_CLICK_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VMNavigationButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VaadinMobilePackage.Literals.VM_NAVIGATION_BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMNavigationPage getPage() {
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPage(VMNavigationPage newPage, NotificationChain msgs) {
		VMNavigationPage oldPage = page;
		page = newPage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VaadinMobilePackage.VM_NAVIGATION_BUTTON__PAGE, oldPage, newPage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPage(VMNavigationPage newPage) {
		if (newPage != page) {
			NotificationChain msgs = null;
			if (page != null)
				msgs = ((InternalEObject)page).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VaadinMobilePackage.VM_NAVIGATION_BUTTON__PAGE, null, msgs);
			if (newPage != null)
				msgs = ((InternalEObject)newPage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VaadinMobilePackage.VM_NAVIGATION_BUTTON__PAGE, null, msgs);
			msgs = basicSetPage(newPage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VaadinMobilePackage.VM_NAVIGATION_BUTTON__PAGE, newPage, newPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YDatadescription getDatadescription() {
		if (datadescription != null && datadescription.eIsProxy()) {
			InternalEObject oldDatadescription = (InternalEObject)datadescription;
			datadescription = (YDatadescription)eResolveProxy(oldDatadescription);
			if (datadescription != oldDatadescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VaadinMobilePackage.VM_NAVIGATION_BUTTON__DATADESCRIPTION, oldDatadescription, datadescription));
			}
		}
		return datadescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YDatadescription basicGetDatadescription() {
		return datadescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatadescription(YDatadescription newDatadescription) {
		YDatadescription oldDatadescription = datadescription;
		datadescription = newDatadescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VaadinMobilePackage.VM_NAVIGATION_BUTTON__DATADESCRIPTION, oldDatadescription, datadescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLastClickTime() {
		return lastClickTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastClickTime(long newLastClickTime) {
		long oldLastClickTime = lastClickTime;
		lastClickTime = newLastClickTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VaadinMobilePackage.VM_NAVIGATION_BUTTON__LAST_CLICK_TIME, oldLastClickTime, lastClickTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VaadinMobilePackage.VM_NAVIGATION_BUTTON__PAGE:
				return basicSetPage(null, msgs);
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
			case VaadinMobilePackage.VM_NAVIGATION_BUTTON__PAGE:
				return getPage();
			case VaadinMobilePackage.VM_NAVIGATION_BUTTON__DATADESCRIPTION:
				if (resolve) return getDatadescription();
				return basicGetDatadescription();
			case VaadinMobilePackage.VM_NAVIGATION_BUTTON__LAST_CLICK_TIME:
				return getLastClickTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VaadinMobilePackage.VM_NAVIGATION_BUTTON__PAGE:
				setPage((VMNavigationPage)newValue);
				return;
			case VaadinMobilePackage.VM_NAVIGATION_BUTTON__DATADESCRIPTION:
				setDatadescription((YDatadescription)newValue);
				return;
			case VaadinMobilePackage.VM_NAVIGATION_BUTTON__LAST_CLICK_TIME:
				setLastClickTime((Long)newValue);
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
			case VaadinMobilePackage.VM_NAVIGATION_BUTTON__PAGE:
				setPage((VMNavigationPage)null);
				return;
			case VaadinMobilePackage.VM_NAVIGATION_BUTTON__DATADESCRIPTION:
				setDatadescription((YDatadescription)null);
				return;
			case VaadinMobilePackage.VM_NAVIGATION_BUTTON__LAST_CLICK_TIME:
				setLastClickTime(LAST_CLICK_TIME_EDEFAULT);
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
			case VaadinMobilePackage.VM_NAVIGATION_BUTTON__PAGE:
				return page != null;
			case VaadinMobilePackage.VM_NAVIGATION_BUTTON__DATADESCRIPTION:
				return datadescription != null;
			case VaadinMobilePackage.VM_NAVIGATION_BUTTON__LAST_CLICK_TIME:
				return lastClickTime != LAST_CLICK_TIME_EDEFAULT;
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
		result.append(" (lastClickTime: ");
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

} //VMNavigationButtonImpl
