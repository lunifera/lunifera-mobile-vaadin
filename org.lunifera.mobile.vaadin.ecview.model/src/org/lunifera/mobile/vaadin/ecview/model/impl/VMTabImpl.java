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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YCssAble;
import org.lunifera.ecview.core.common.model.core.YEmbeddable;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.core.common.model.core.impl.YStringToStringMapImpl;
import org.lunifera.ecview.core.common.model.datatypes.DatatypesFactory;
import org.lunifera.ecview.core.common.model.datatypes.YDatadescription;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationHandler;
import org.lunifera.mobile.vaadin.ecview.model.VMTab;
import org.lunifera.mobile.vaadin.ecview.model.VMTabSheet;
import org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>VM Tab</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMTabImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMTabImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMTabImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMTabImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMTabImpl#getCssClass <em>Css Class</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMTabImpl#getCssID <em>Css ID</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMTabImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMTabImpl#getEmbeddable <em>Embeddable</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMTabImpl#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMTabImpl#getOrphanDatadescriptions <em>Orphan Datadescriptions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VMTabImpl extends MinimalEObjectImpl.Container implements VMTab {
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
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tags;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' map.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> properties;

	/**
	 * The default value of the '{@link #getCssClass() <em>Css Class</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCssClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CSS_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCssClass() <em>Css Class</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCssClass()
	 * @generated
	 * @ordered
	 */
	protected String cssClass = CSS_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCssID() <em>Css ID</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCssID()
	 * @generated
	 * @ordered
	 */
	protected static final String CSS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCssID() <em>Css ID</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCssID()
	 * @generated
	 * @ordered
	 */
	protected String cssID = CSS_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmbeddable() <em>Embeddable</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEmbeddable()
	 * @generated
	 * @ordered
	 */
	protected YEmbeddable embeddable;

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
	 * The cached value of the '{@link #getOrphanDatadescriptions()
	 * <em>Orphan Datadescriptions</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOrphanDatadescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<YDatadescription> orphanDatadescriptions;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected VMTabImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VaadinMobilePackage.Literals.VM_TAB;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VaadinMobilePackage.VM_TAB__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VaadinMobilePackage.VM_TAB__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, VaadinMobilePackage.VM_TAB__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getProperties() {
		if (properties == null) {
			properties = new EcoreEMap<String,String>(CoreModelPackage.Literals.YSTRING_TO_STRING_MAP, YStringToStringMapImpl.class, this, VaadinMobilePackage.VM_TAB__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getCssClass() {
		return cssClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCssClass(String newCssClass) {
		String oldCssClass = cssClass;
		cssClass = newCssClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VaadinMobilePackage.VM_TAB__CSS_CLASS, oldCssClass, cssClass));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getCssID() {
		return cssID;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCssID(String newCssID) {
		String oldCssID = cssID;
		cssID = newCssID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VaadinMobilePackage.VM_TAB__CSS_ID, oldCssID, cssID));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public VMTabSheet getParent() {
		if (eContainerFeatureID() != VaadinMobilePackage.VM_TAB__PARENT) return null;
		return (VMTabSheet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(VMTabSheet newParent,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, VaadinMobilePackage.VM_TAB__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(VMTabSheet newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != VaadinMobilePackage.VM_TAB__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, VaadinMobilePackage.VM_TAB_SHEET__TABS, VMTabSheet.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VaadinMobilePackage.VM_TAB__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddable getEmbeddable() {
		return embeddable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmbeddable(YEmbeddable newEmbeddable,
			NotificationChain msgs) {
		YEmbeddable oldEmbeddable = embeddable;
		embeddable = newEmbeddable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VaadinMobilePackage.VM_TAB__EMBEDDABLE, oldEmbeddable, newEmbeddable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbeddable(YEmbeddable newEmbeddable) {
		if (newEmbeddable != embeddable) {
			NotificationChain msgs = null;
			if (embeddable != null)
				msgs = ((InternalEObject)embeddable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VaadinMobilePackage.VM_TAB__EMBEDDABLE, null, msgs);
			if (newEmbeddable != null)
				msgs = ((InternalEObject)newEmbeddable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VaadinMobilePackage.VM_TAB__EMBEDDABLE, null, msgs);
			msgs = basicSetEmbeddable(newEmbeddable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VaadinMobilePackage.VM_TAB__EMBEDDABLE, newEmbeddable, newEmbeddable));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VaadinMobilePackage.VM_TAB__DATADESCRIPTION, oldDatadescription, datadescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VaadinMobilePackage.VM_TAB__DATADESCRIPTION, oldDatadescription, datadescription));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YDatadescription> getOrphanDatadescriptions() {
		if (orphanDatadescriptions == null) {
			orphanDatadescriptions = new EObjectContainmentEList<YDatadescription>(YDatadescription.class, this, VaadinMobilePackage.VM_TAB__ORPHAN_DATADESCRIPTIONS);
		}
		return orphanDatadescriptions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public YView getView() {
		VMTabSheet parent = (VMTabSheet) eContainer();
		if (parent != null) {
			return parent.getView();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VaadinMobilePackage.VM_TAB__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((VMTabSheet)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VaadinMobilePackage.VM_TAB__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case VaadinMobilePackage.VM_TAB__PARENT:
				return basicSetParent(null, msgs);
			case VaadinMobilePackage.VM_TAB__EMBEDDABLE:
				return basicSetEmbeddable(null, msgs);
			case VaadinMobilePackage.VM_TAB__ORPHAN_DATADESCRIPTIONS:
				return ((InternalEList<?>)getOrphanDatadescriptions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case VaadinMobilePackage.VM_TAB__PARENT:
				return eInternalContainer().eInverseRemove(this, VaadinMobilePackage.VM_TAB_SHEET__TABS, VMTabSheet.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VaadinMobilePackage.VM_TAB__ID:
				return getId();
			case VaadinMobilePackage.VM_TAB__NAME:
				return getName();
			case VaadinMobilePackage.VM_TAB__TAGS:
				return getTags();
			case VaadinMobilePackage.VM_TAB__PROPERTIES:
				if (coreType) return getProperties();
				else return getProperties().map();
			case VaadinMobilePackage.VM_TAB__CSS_CLASS:
				return getCssClass();
			case VaadinMobilePackage.VM_TAB__CSS_ID:
				return getCssID();
			case VaadinMobilePackage.VM_TAB__PARENT:
				return getParent();
			case VaadinMobilePackage.VM_TAB__EMBEDDABLE:
				return getEmbeddable();
			case VaadinMobilePackage.VM_TAB__DATADESCRIPTION:
				if (resolve) return getDatadescription();
				return basicGetDatadescription();
			case VaadinMobilePackage.VM_TAB__ORPHAN_DATADESCRIPTIONS:
				return getOrphanDatadescriptions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VaadinMobilePackage.VM_TAB__ID:
				setId((String)newValue);
				return;
			case VaadinMobilePackage.VM_TAB__NAME:
				setName((String)newValue);
				return;
			case VaadinMobilePackage.VM_TAB__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case VaadinMobilePackage.VM_TAB__PROPERTIES:
				((EStructuralFeature.Setting)getProperties()).set(newValue);
				return;
			case VaadinMobilePackage.VM_TAB__CSS_CLASS:
				setCssClass((String)newValue);
				return;
			case VaadinMobilePackage.VM_TAB__CSS_ID:
				setCssID((String)newValue);
				return;
			case VaadinMobilePackage.VM_TAB__PARENT:
				setParent((VMTabSheet)newValue);
				return;
			case VaadinMobilePackage.VM_TAB__EMBEDDABLE:
				setEmbeddable((YEmbeddable)newValue);
				return;
			case VaadinMobilePackage.VM_TAB__DATADESCRIPTION:
				setDatadescription((YDatadescription)newValue);
				return;
			case VaadinMobilePackage.VM_TAB__ORPHAN_DATADESCRIPTIONS:
				getOrphanDatadescriptions().clear();
				getOrphanDatadescriptions().addAll((Collection<? extends YDatadescription>)newValue);
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
			case VaadinMobilePackage.VM_TAB__ID:
				setId(ID_EDEFAULT);
				return;
			case VaadinMobilePackage.VM_TAB__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VaadinMobilePackage.VM_TAB__TAGS:
				getTags().clear();
				return;
			case VaadinMobilePackage.VM_TAB__PROPERTIES:
				getProperties().clear();
				return;
			case VaadinMobilePackage.VM_TAB__CSS_CLASS:
				setCssClass(CSS_CLASS_EDEFAULT);
				return;
			case VaadinMobilePackage.VM_TAB__CSS_ID:
				setCssID(CSS_ID_EDEFAULT);
				return;
			case VaadinMobilePackage.VM_TAB__PARENT:
				setParent((VMTabSheet)null);
				return;
			case VaadinMobilePackage.VM_TAB__EMBEDDABLE:
				setEmbeddable((YEmbeddable)null);
				return;
			case VaadinMobilePackage.VM_TAB__DATADESCRIPTION:
				setDatadescription((YDatadescription)null);
				return;
			case VaadinMobilePackage.VM_TAB__ORPHAN_DATADESCRIPTIONS:
				getOrphanDatadescriptions().clear();
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
			case VaadinMobilePackage.VM_TAB__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case VaadinMobilePackage.VM_TAB__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VaadinMobilePackage.VM_TAB__TAGS:
				return tags != null && !tags.isEmpty();
			case VaadinMobilePackage.VM_TAB__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case VaadinMobilePackage.VM_TAB__CSS_CLASS:
				return CSS_CLASS_EDEFAULT == null ? cssClass != null : !CSS_CLASS_EDEFAULT.equals(cssClass);
			case VaadinMobilePackage.VM_TAB__CSS_ID:
				return CSS_ID_EDEFAULT == null ? cssID != null : !CSS_ID_EDEFAULT.equals(cssID);
			case VaadinMobilePackage.VM_TAB__PARENT:
				return getParent() != null;
			case VaadinMobilePackage.VM_TAB__EMBEDDABLE:
				return embeddable != null;
			case VaadinMobilePackage.VM_TAB__DATADESCRIPTION:
				return datadescription != null;
			case VaadinMobilePackage.VM_TAB__ORPHAN_DATADESCRIPTIONS:
				return orphanDatadescriptions != null && !orphanDatadescriptions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == YCssAble.class) {
			switch (derivedFeatureID) {
				case VaadinMobilePackage.VM_TAB__CSS_CLASS: return CoreModelPackage.YCSS_ABLE__CSS_CLASS;
				case VaadinMobilePackage.VM_TAB__CSS_ID: return CoreModelPackage.YCSS_ABLE__CSS_ID;
				default: return -1;
			}
		}
		if (baseClass == VMNavigationHandler.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == YCssAble.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YCSS_ABLE__CSS_CLASS: return VaadinMobilePackage.VM_TAB__CSS_CLASS;
				case CoreModelPackage.YCSS_ABLE__CSS_ID: return VaadinMobilePackage.VM_TAB__CSS_ID;
				default: return -1;
			}
		}
		if (baseClass == VMNavigationHandler.class) {
			switch (baseFeatureID) {
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", tags: ");
		result.append(tags);
		result.append(", cssClass: ");
		result.append(cssClass);
		result.append(", cssID: ");
		result.append(cssID);
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

} // VMTabImpl
