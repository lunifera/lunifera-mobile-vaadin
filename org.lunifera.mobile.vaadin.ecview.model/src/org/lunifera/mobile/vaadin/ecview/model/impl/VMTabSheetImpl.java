/**
 */
package org.lunifera.mobile.vaadin.ecview.model.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.lunifera.ecview.core.common.model.core.impl.YEmbeddableImpl;
import org.lunifera.mobile.vaadin.ecview.model.VMTab;
import org.lunifera.mobile.vaadin.ecview.model.VMTabSheet;
import org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VM Tab Sheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMTabSheetImpl#getTabs <em>Tabs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VMTabSheetImpl extends YEmbeddableImpl implements VMTabSheet {
	/**
	 * The cached value of the '{@link #getTabs() <em>Tabs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabs()
	 * @generated
	 * @ordered
	 */
	protected EList<VMTab> tabs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VMTabSheetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VaadinMobilePackage.Literals.VM_TAB_SHEET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VMTab> getTabs() {
		if (tabs == null) {
			tabs = new EObjectContainmentWithInverseEList<VMTab>(VMTab.class, this, VaadinMobilePackage.VM_TAB_SHEET__TABS, VaadinMobilePackage.VM_TAB__PARENT);
		}
		return tabs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VaadinMobilePackage.VM_TAB_SHEET__TABS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTabs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VaadinMobilePackage.VM_TAB_SHEET__TABS:
				return ((InternalEList<?>)getTabs()).basicRemove(otherEnd, msgs);
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
			case VaadinMobilePackage.VM_TAB_SHEET__TABS:
				return getTabs();
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
			case VaadinMobilePackage.VM_TAB_SHEET__TABS:
				getTabs().clear();
				getTabs().addAll((Collection<? extends VMTab>)newValue);
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
			case VaadinMobilePackage.VM_TAB_SHEET__TABS:
				getTabs().clear();
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
			case VaadinMobilePackage.VM_TAB_SHEET__TABS:
				return tabs != null && !tabs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void setLabel(String label) {
		
	}

	@Override
	public void setLabelI18nKey(String i18nKey) {
		
	}
	

} //VMTabSheetImpl
