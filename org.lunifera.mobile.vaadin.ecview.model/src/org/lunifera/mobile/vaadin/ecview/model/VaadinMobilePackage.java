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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.lunifera.mobile.vaadin.ecview.model.VaadinMobileFactory
 * @model kind="package"
 * @generated
 */
public interface VaadinMobilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://lunifera.org/ecview/v1/vaadin/mobile";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VaadinMobilePackage eINSTANCE = org.lunifera.mobile.vaadin.ecview.model.impl.VaadinMobilePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMHorizontalButtonGroupImpl <em>VM Horizontal Button Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VMHorizontalButtonGroupImpl
	 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VaadinMobilePackageImpl#getVMHorizontalButtonGroup()
	 * @generated
	 */
	int VM_HORIZONTAL_BUTTON_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_HORIZONTAL_BUTTON_GROUP__ID = CoreModelPackage.YLAYOUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_HORIZONTAL_BUTTON_GROUP__NAME = CoreModelPackage.YLAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_HORIZONTAL_BUTTON_GROUP__CSS_CLASS = CoreModelPackage.YLAYOUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_HORIZONTAL_BUTTON_GROUP__CSS_ID = CoreModelPackage.YLAYOUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_HORIZONTAL_BUTTON_GROUP__INITIAL_VISIBLE = CoreModelPackage.YLAYOUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_HORIZONTAL_BUTTON_GROUP__VISIBLE = CoreModelPackage.YLAYOUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_HORIZONTAL_BUTTON_GROUP__ORPHAN_DATATYPES = CoreModelPackage.YLAYOUT__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_HORIZONTAL_BUTTON_GROUP__ORPHAN_DATADESCRIPTIONS = CoreModelPackage.YLAYOUT__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_HORIZONTAL_BUTTON_GROUP__ELEMENTS = CoreModelPackage.YLAYOUT__ELEMENTS;

	/**
	 * The number of structural features of the '<em>VM Horizontal Button Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_HORIZONTAL_BUTTON_GROUP_FEATURE_COUNT = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMSwitchImpl <em>VM Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VMSwitchImpl
	 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VaadinMobilePackageImpl#getVMSwitch()
	 * @generated
	 */
	int VM_SWITCH = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_SWITCH__ID = CoreModelPackage.YFIELD__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_SWITCH__NAME = CoreModelPackage.YFIELD__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_SWITCH__CSS_CLASS = CoreModelPackage.YFIELD__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_SWITCH__CSS_ID = CoreModelPackage.YFIELD__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_SWITCH__INITIAL_VISIBLE = CoreModelPackage.YFIELD__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_SWITCH__VISIBLE = CoreModelPackage.YFIELD__VISIBLE;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_SWITCH__ORPHAN_DATATYPES = CoreModelPackage.YFIELD__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_SWITCH__ORPHAN_DATADESCRIPTIONS = CoreModelPackage.YFIELD__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_SWITCH__INITIAL_EDITABLE = CoreModelPackage.YFIELD__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_SWITCH__EDITABLE = CoreModelPackage.YFIELD__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_SWITCH__INITIAL_ENABLED = CoreModelPackage.YFIELD__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_SWITCH__ENABLED = CoreModelPackage.YFIELD__ENABLED;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_SWITCH__VALIDATORS = CoreModelPackage.YFIELD__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_SWITCH__INTERNAL_VALIDATORS = CoreModelPackage.YFIELD__INTERNAL_VALIDATORS;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_SWITCH__DATADESCRIPTION = CoreModelPackage.YFIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_SWITCH__VALUE = CoreModelPackage.YFIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VM Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_SWITCH_FEATURE_COUNT = CoreModelPackage.YFIELD_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMVerticalComponentGroupImpl <em>VM Vertical Component Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VMVerticalComponentGroupImpl
	 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VaadinMobilePackageImpl#getVMVerticalComponentGroup()
	 * @generated
	 */
	int VM_VERTICAL_COMPONENT_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_VERTICAL_COMPONENT_GROUP__ID = CoreModelPackage.YLAYOUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_VERTICAL_COMPONENT_GROUP__NAME = CoreModelPackage.YLAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_VERTICAL_COMPONENT_GROUP__CSS_CLASS = CoreModelPackage.YLAYOUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_VERTICAL_COMPONENT_GROUP__CSS_ID = CoreModelPackage.YLAYOUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_VERTICAL_COMPONENT_GROUP__INITIAL_VISIBLE = CoreModelPackage.YLAYOUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_VERTICAL_COMPONENT_GROUP__VISIBLE = CoreModelPackage.YLAYOUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_VERTICAL_COMPONENT_GROUP__ORPHAN_DATATYPES = CoreModelPackage.YLAYOUT__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_VERTICAL_COMPONENT_GROUP__ORPHAN_DATADESCRIPTIONS = CoreModelPackage.YLAYOUT__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_VERTICAL_COMPONENT_GROUP__ELEMENTS = CoreModelPackage.YLAYOUT__ELEMENTS;

	/**
	 * The number of structural features of the '<em>VM Vertical Component Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_VERTICAL_COMPONENT_GROUP_FEATURE_COUNT = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMTabSheetImpl <em>VM Tab Sheet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VMTabSheetImpl
	 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VaadinMobilePackageImpl#getVMTabSheet()
	 * @generated
	 */
	int VM_TAB_SHEET = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_TAB_SHEET__ID = CoreModelPackage.YEMBEDDABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_TAB_SHEET__NAME = CoreModelPackage.YEMBEDDABLE__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_TAB_SHEET__CSS_CLASS = CoreModelPackage.YEMBEDDABLE__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_TAB_SHEET__CSS_ID = CoreModelPackage.YEMBEDDABLE__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_TAB_SHEET__INITIAL_VISIBLE = CoreModelPackage.YEMBEDDABLE__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_TAB_SHEET__VISIBLE = CoreModelPackage.YEMBEDDABLE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_TAB_SHEET__ORPHAN_DATATYPES = CoreModelPackage.YEMBEDDABLE__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_TAB_SHEET__ORPHAN_DATADESCRIPTIONS = CoreModelPackage.YEMBEDDABLE__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Tabs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_TAB_SHEET__TABS = CoreModelPackage.YEMBEDDABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VM Tab Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_TAB_SHEET_FEATURE_COUNT = CoreModelPackage.YEMBEDDABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMTabImpl <em>VM Tab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VMTabImpl
	 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VaadinMobilePackageImpl#getVMTab()
	 * @generated
	 */
	int VM_TAB = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_TAB__ID = CoreModelPackage.YELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_TAB__NAME = CoreModelPackage.YELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_TAB__CSS_CLASS = CoreModelPackage.YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_TAB__CSS_ID = CoreModelPackage.YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_TAB__PARENT = CoreModelPackage.YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Embeddable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_TAB__EMBEDDABLE = CoreModelPackage.YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_TAB__DATADESCRIPTION = CoreModelPackage.YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>VM Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_TAB_FEATURE_COUNT = CoreModelPackage.YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationPageImpl <em>VM Navigation Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationPageImpl
	 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VaadinMobilePackageImpl#getVMNavigationPage()
	 * @generated
	 */
	int VM_NAVIGATION_PAGE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_PAGE__ID = CoreModelPackage.YLAYOUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_PAGE__NAME = CoreModelPackage.YLAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_PAGE__CSS_CLASS = CoreModelPackage.YLAYOUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_PAGE__CSS_ID = CoreModelPackage.YLAYOUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_PAGE__INITIAL_VISIBLE = CoreModelPackage.YLAYOUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_PAGE__VISIBLE = CoreModelPackage.YLAYOUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_PAGE__ORPHAN_DATATYPES = CoreModelPackage.YLAYOUT__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_PAGE__ORPHAN_DATADESCRIPTIONS = CoreModelPackage.YLAYOUT__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_PAGE__ELEMENTS = CoreModelPackage.YLAYOUT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_PAGE__TYPE = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Emf Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_PAGE__EMF_NS_URI = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_PAGE__TYPE_QUALIFIED_NAME = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_PAGE__VALUE = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>VM Navigation Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_PAGE_FEATURE_COUNT = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationButtonImpl <em>VM Navigation Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationButtonImpl
	 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VaadinMobilePackageImpl#getVMNavigationButton()
	 * @generated
	 */
	int VM_NAVIGATION_BUTTON = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_BUTTON__ID = CoreModelPackage.YACTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_BUTTON__NAME = CoreModelPackage.YACTION__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_BUTTON__CSS_CLASS = CoreModelPackage.YACTION__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_BUTTON__CSS_ID = CoreModelPackage.YACTION__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_BUTTON__INITIAL_VISIBLE = CoreModelPackage.YACTION__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_BUTTON__VISIBLE = CoreModelPackage.YACTION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_BUTTON__ORPHAN_DATATYPES = CoreModelPackage.YACTION__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_BUTTON__ORPHAN_DATADESCRIPTIONS = CoreModelPackage.YACTION__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_BUTTON__INITIAL_ENABLED = CoreModelPackage.YACTION__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_BUTTON__ENABLED = CoreModelPackage.YACTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_BUTTON__PAGE = CoreModelPackage.YACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_BUTTON__DATADESCRIPTION = CoreModelPackage.YACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VM Navigation Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_BUTTON_FEATURE_COUNT = CoreModelPackage.YACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationCommandImpl <em>VM Navigation Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationCommandImpl
	 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VaadinMobilePackageImpl#getVMNavigationCommand()
	 * @generated
	 */
	int VM_NAVIGATION_COMMAND = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_COMMAND__ID = CoreModelPackage.YCOMMAND__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_COMMAND__NAME = CoreModelPackage.YCOMMAND__NAME;

	/**
	 * The feature id for the '<em><b>Navigation Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_COMMAND__NAVIGATION_HANDLER = CoreModelPackage.YCOMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_COMMAND__TARGET_PAGE = CoreModelPackage.YCOMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_COMMAND__VALUE = CoreModelPackage.YCOMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VM Navigation Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_COMMAND_FEATURE_COUNT = CoreModelPackage.YCOMMAND_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationHandler <em>VM Navigation Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMNavigationHandler
	 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VaadinMobilePackageImpl#getVMNavigationHandler()
	 * @generated
	 */
	int VM_NAVIGATION_HANDLER = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_HANDLER__ID = CoreModelPackage.YELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_HANDLER__NAME = CoreModelPackage.YELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>VM Navigation Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_NAVIGATION_HANDLER_FEATURE_COUNT = CoreModelPackage.YELEMENT_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.lunifera.mobile.vaadin.ecview.model.VMHorizontalButtonGroup <em>VM Horizontal Button Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM Horizontal Button Group</em>'.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMHorizontalButtonGroup
	 * @generated
	 */
	EClass getVMHorizontalButtonGroup();

	/**
	 * Returns the meta object for class '{@link org.lunifera.mobile.vaadin.ecview.model.VMSwitch <em>VM Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM Switch</em>'.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMSwitch
	 * @generated
	 */
	EClass getVMSwitch();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.mobile.vaadin.ecview.model.VMSwitch#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMSwitch#getDatadescription()
	 * @see #getVMSwitch()
	 * @generated
	 */
	EReference getVMSwitch_Datadescription();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.mobile.vaadin.ecview.model.VMSwitch#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMSwitch#isValue()
	 * @see #getVMSwitch()
	 * @generated
	 */
	EAttribute getVMSwitch_Value();

	/**
	 * Returns the meta object for class '{@link org.lunifera.mobile.vaadin.ecview.model.VMVerticalComponentGroup <em>VM Vertical Component Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM Vertical Component Group</em>'.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMVerticalComponentGroup
	 * @generated
	 */
	EClass getVMVerticalComponentGroup();

	/**
	 * Returns the meta object for class '{@link org.lunifera.mobile.vaadin.ecview.model.VMTabSheet <em>VM Tab Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM Tab Sheet</em>'.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMTabSheet
	 * @generated
	 */
	EClass getVMTabSheet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.mobile.vaadin.ecview.model.VMTabSheet#getTabs <em>Tabs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tabs</em>'.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMTabSheet#getTabs()
	 * @see #getVMTabSheet()
	 * @generated
	 */
	EReference getVMTabSheet_Tabs();

	/**
	 * Returns the meta object for class '{@link org.lunifera.mobile.vaadin.ecview.model.VMTab <em>VM Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM Tab</em>'.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMTab
	 * @generated
	 */
	EClass getVMTab();

	/**
	 * Returns the meta object for the container reference '{@link org.lunifera.mobile.vaadin.ecview.model.VMTab#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMTab#getParent()
	 * @see #getVMTab()
	 * @generated
	 */
	EReference getVMTab_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.mobile.vaadin.ecview.model.VMTab#getEmbeddable <em>Embeddable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Embeddable</em>'.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMTab#getEmbeddable()
	 * @see #getVMTab()
	 * @generated
	 */
	EReference getVMTab_Embeddable();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.mobile.vaadin.ecview.model.VMTab#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMTab#getDatadescription()
	 * @see #getVMTab()
	 * @generated
	 */
	EReference getVMTab_Datadescription();

	/**
	 * Returns the meta object for class '{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage <em>VM Navigation Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM Navigation Page</em>'.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage
	 * @generated
	 */
	EClass getVMNavigationPage();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage#getType()
	 * @see #getVMNavigationPage()
	 * @generated
	 */
	EAttribute getVMNavigationPage_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage#getEmfNsURI <em>Emf Ns URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emf Ns URI</em>'.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage#getEmfNsURI()
	 * @see #getVMNavigationPage()
	 * @generated
	 */
	EAttribute getVMNavigationPage_EmfNsURI();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage#getTypeQualifiedName <em>Type Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Qualified Name</em>'.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage#getTypeQualifiedName()
	 * @see #getVMNavigationPage()
	 * @generated
	 */
	EAttribute getVMNavigationPage_TypeQualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage#getValue()
	 * @see #getVMNavigationPage()
	 * @generated
	 */
	EAttribute getVMNavigationPage_Value();

	/**
	 * Returns the meta object for class '{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationButton <em>VM Navigation Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM Navigation Button</em>'.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMNavigationButton
	 * @generated
	 */
	EClass getVMNavigationButton();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationButton#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Page</em>'.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMNavigationButton#getPage()
	 * @see #getVMNavigationButton()
	 * @generated
	 */
	EReference getVMNavigationButton_Page();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationButton#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMNavigationButton#getDatadescription()
	 * @see #getVMNavigationButton()
	 * @generated
	 */
	EReference getVMNavigationButton_Datadescription();

	/**
	 * Returns the meta object for class '{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationCommand <em>VM Navigation Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM Navigation Command</em>'.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMNavigationCommand
	 * @generated
	 */
	EClass getVMNavigationCommand();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationCommand#getTargetPage <em>Target Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Page</em>'.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMNavigationCommand#getTargetPage()
	 * @see #getVMNavigationCommand()
	 * @generated
	 */
	EReference getVMNavigationCommand_TargetPage();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationCommand#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMNavigationCommand#getValue()
	 * @see #getVMNavigationCommand()
	 * @generated
	 */
	EAttribute getVMNavigationCommand_Value();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationCommand#getNavigationHandler <em>Navigation Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Navigation Handler</em>'.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMNavigationCommand#getNavigationHandler()
	 * @see #getVMNavigationCommand()
	 * @generated
	 */
	EReference getVMNavigationCommand_NavigationHandler();

	/**
	 * Returns the meta object for class '{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationHandler <em>VM Navigation Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM Navigation Handler</em>'.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMNavigationHandler
	 * @generated
	 */
	EClass getVMNavigationHandler();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VaadinMobileFactory getVaadinMobileFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMHorizontalButtonGroupImpl <em>VM Horizontal Button Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VMHorizontalButtonGroupImpl
		 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VaadinMobilePackageImpl#getVMHorizontalButtonGroup()
		 * @generated
		 */
		EClass VM_HORIZONTAL_BUTTON_GROUP = eINSTANCE.getVMHorizontalButtonGroup();
		/**
		 * The meta object literal for the '{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMSwitchImpl <em>VM Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VMSwitchImpl
		 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VaadinMobilePackageImpl#getVMSwitch()
		 * @generated
		 */
		EClass VM_SWITCH = eINSTANCE.getVMSwitch();
		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_SWITCH__DATADESCRIPTION = eINSTANCE.getVMSwitch_Datadescription();
		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM_SWITCH__VALUE = eINSTANCE.getVMSwitch_Value();
		/**
		 * The meta object literal for the '{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMVerticalComponentGroupImpl <em>VM Vertical Component Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VMVerticalComponentGroupImpl
		 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VaadinMobilePackageImpl#getVMVerticalComponentGroup()
		 * @generated
		 */
		EClass VM_VERTICAL_COMPONENT_GROUP = eINSTANCE.getVMVerticalComponentGroup();
		/**
		 * The meta object literal for the '{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMTabSheetImpl <em>VM Tab Sheet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VMTabSheetImpl
		 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VaadinMobilePackageImpl#getVMTabSheet()
		 * @generated
		 */
		EClass VM_TAB_SHEET = eINSTANCE.getVMTabSheet();
		/**
		 * The meta object literal for the '<em><b>Tabs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_TAB_SHEET__TABS = eINSTANCE.getVMTabSheet_Tabs();
		/**
		 * The meta object literal for the '{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMTabImpl <em>VM Tab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VMTabImpl
		 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VaadinMobilePackageImpl#getVMTab()
		 * @generated
		 */
		EClass VM_TAB = eINSTANCE.getVMTab();
		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_TAB__PARENT = eINSTANCE.getVMTab_Parent();
		/**
		 * The meta object literal for the '<em><b>Embeddable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_TAB__EMBEDDABLE = eINSTANCE.getVMTab_Embeddable();
		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_TAB__DATADESCRIPTION = eINSTANCE.getVMTab_Datadescription();
		/**
		 * The meta object literal for the '{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationPageImpl <em>VM Navigation Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationPageImpl
		 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VaadinMobilePackageImpl#getVMNavigationPage()
		 * @generated
		 */
		EClass VM_NAVIGATION_PAGE = eINSTANCE.getVMNavigationPage();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM_NAVIGATION_PAGE__TYPE = eINSTANCE.getVMNavigationPage_Type();
		/**
		 * The meta object literal for the '<em><b>Emf Ns URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM_NAVIGATION_PAGE__EMF_NS_URI = eINSTANCE.getVMNavigationPage_EmfNsURI();
		/**
		 * The meta object literal for the '<em><b>Type Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM_NAVIGATION_PAGE__TYPE_QUALIFIED_NAME = eINSTANCE.getVMNavigationPage_TypeQualifiedName();
		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM_NAVIGATION_PAGE__VALUE = eINSTANCE.getVMNavigationPage_Value();
		/**
		 * The meta object literal for the '{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationButtonImpl <em>VM Navigation Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationButtonImpl
		 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VaadinMobilePackageImpl#getVMNavigationButton()
		 * @generated
		 */
		EClass VM_NAVIGATION_BUTTON = eINSTANCE.getVMNavigationButton();
		/**
		 * The meta object literal for the '<em><b>Page</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_NAVIGATION_BUTTON__PAGE = eINSTANCE.getVMNavigationButton_Page();
		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_NAVIGATION_BUTTON__DATADESCRIPTION = eINSTANCE.getVMNavigationButton_Datadescription();
		/**
		 * The meta object literal for the '{@link org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationCommandImpl <em>VM Navigation Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VMNavigationCommandImpl
		 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VaadinMobilePackageImpl#getVMNavigationCommand()
		 * @generated
		 */
		EClass VM_NAVIGATION_COMMAND = eINSTANCE.getVMNavigationCommand();
		/**
		 * The meta object literal for the '<em><b>Target Page</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_NAVIGATION_COMMAND__TARGET_PAGE = eINSTANCE.getVMNavigationCommand_TargetPage();
		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM_NAVIGATION_COMMAND__VALUE = eINSTANCE.getVMNavigationCommand_Value();
		/**
		 * The meta object literal for the '<em><b>Navigation Handler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_NAVIGATION_COMMAND__NAVIGATION_HANDLER = eINSTANCE.getVMNavigationCommand_NavigationHandler();
		/**
		 * The meta object literal for the '{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationHandler <em>VM Navigation Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.mobile.vaadin.ecview.model.VMNavigationHandler
		 * @see org.lunifera.mobile.vaadin.ecview.model.impl.VaadinMobilePackageImpl#getVMNavigationHandler()
		 * @generated
		 */
		EClass VM_NAVIGATION_HANDLER = eINSTANCE.getVMNavigationHandler();

	}

} //VaadinMobilePackage
