/**
 */
package org.lunifera.mobile.vaadin.ecview.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.lunifera.ecview.core.common.model.core.YAction;
import org.lunifera.ecview.core.common.model.core.YCommand;
import org.lunifera.ecview.core.common.model.core.YCssAble;
import org.lunifera.ecview.core.common.model.core.YEditable;
import org.lunifera.ecview.core.common.model.core.YElement;
import org.lunifera.ecview.core.common.model.core.YEmbeddable;
import org.lunifera.ecview.core.common.model.core.YEnable;
import org.lunifera.ecview.core.common.model.core.YField;
import org.lunifera.ecview.core.common.model.core.YLayout;
import org.lunifera.ecview.core.common.model.core.YVisibilityProcessable;
import org.lunifera.ecview.core.common.model.core.YVisibleable;

import org.lunifera.mobile.vaadin.ecview.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage
 * @generated
 */
public class VaadinMobileAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VaadinMobilePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VaadinMobileAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VaadinMobilePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VaadinMobileSwitch<Adapter> modelSwitch =
		new VaadinMobileSwitch<Adapter>() {
			@Override
			public Adapter caseVMHorizontalButtonGroup(VMHorizontalButtonGroup object) {
				return createVMHorizontalButtonGroupAdapter();
			}
			@Override
			public Adapter caseVMSwitch(VMSwitch object) {
				return createVMSwitchAdapter();
			}
			@Override
			public Adapter caseVMVerticalComponentGroup(VMVerticalComponentGroup object) {
				return createVMVerticalComponentGroupAdapter();
			}
			@Override
			public Adapter caseVMTabSheet(VMTabSheet object) {
				return createVMTabSheetAdapter();
			}
			@Override
			public Adapter caseVMTab(VMTab object) {
				return createVMTabAdapter();
			}
			@Override
			public Adapter caseVMNavigationPage(VMNavigationPage object) {
				return createVMNavigationPageAdapter();
			}
			@Override
			public Adapter caseVMNavigationButton(VMNavigationButton object) {
				return createVMNavigationButtonAdapter();
			}
			@Override
			public Adapter caseVMNavigationCommand(VMNavigationCommand object) {
				return createVMNavigationCommandAdapter();
			}
			@Override
			public Adapter caseVMNavigationHandler(VMNavigationHandler object) {
				return createVMNavigationHandlerAdapter();
			}
			@Override
			public Adapter caseYElement(YElement object) {
				return createYElementAdapter();
			}
			@Override
			public Adapter caseYCssAble(YCssAble object) {
				return createYCssAbleAdapter();
			}
			@Override
			public Adapter caseYVisibleable(YVisibleable object) {
				return createYVisibleableAdapter();
			}
			@Override
			public Adapter caseYVisibilityProcessable(YVisibilityProcessable object) {
				return createYVisibilityProcessableAdapter();
			}
			@Override
			public Adapter caseYEmbeddable(YEmbeddable object) {
				return createYEmbeddableAdapter();
			}
			@Override
			public Adapter caseYLayout(YLayout object) {
				return createYLayoutAdapter();
			}
			@Override
			public Adapter caseYEditable(YEditable object) {
				return createYEditableAdapter();
			}
			@Override
			public Adapter caseYEnable(YEnable object) {
				return createYEnableAdapter();
			}
			@Override
			public Adapter caseYField(YField object) {
				return createYFieldAdapter();
			}
			@Override
			public Adapter caseYAction(YAction object) {
				return createYActionAdapter();
			}
			@Override
			public Adapter caseYCommand(YCommand object) {
				return createYCommandAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.mobile.vaadin.ecview.model.VMHorizontalButtonGroup <em>VM Horizontal Button Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMHorizontalButtonGroup
	 * @generated
	 */
	public Adapter createVMHorizontalButtonGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.mobile.vaadin.ecview.model.VMSwitch <em>VM Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMSwitch
	 * @generated
	 */
	public Adapter createVMSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.mobile.vaadin.ecview.model.VMVerticalComponentGroup <em>VM Vertical Component Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMVerticalComponentGroup
	 * @generated
	 */
	public Adapter createVMVerticalComponentGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.mobile.vaadin.ecview.model.VMTabSheet <em>VM Tab Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMTabSheet
	 * @generated
	 */
	public Adapter createVMTabSheetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.mobile.vaadin.ecview.model.VMTab <em>VM Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMTab
	 * @generated
	 */
	public Adapter createVMTabAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage <em>VM Navigation Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage
	 * @generated
	 */
	public Adapter createVMNavigationPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationButton <em>VM Navigation Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMNavigationButton
	 * @generated
	 */
	public Adapter createVMNavigationButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationCommand <em>VM Navigation Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMNavigationCommand
	 * @generated
	 */
	public Adapter createVMNavigationCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.mobile.vaadin.ecview.model.VMNavigationHandler <em>VM Navigation Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.mobile.vaadin.ecview.model.VMNavigationHandler
	 * @generated
	 */
	public Adapter createVMNavigationHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YElement <em>YElement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YElement
	 * @generated
	 */
	public Adapter createYElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YCssAble <em>YCss Able</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YCssAble
	 * @generated
	 */
	public Adapter createYCssAbleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YVisibleable <em>YVisibleable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YVisibleable
	 * @generated
	 */
	public Adapter createYVisibleableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YVisibilityProcessable <em>YVisibility Processable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YVisibilityProcessable
	 * @generated
	 */
	public Adapter createYVisibilityProcessableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YEmbeddable <em>YEmbeddable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YEmbeddable
	 * @generated
	 */
	public Adapter createYEmbeddableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YLayout <em>YLayout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YLayout
	 * @generated
	 */
	public Adapter createYLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YEditable <em>YEditable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YEditable
	 * @generated
	 */
	public Adapter createYEditableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YEnable <em>YEnable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YEnable
	 * @generated
	 */
	public Adapter createYEnableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YField <em>YField</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YField
	 * @generated
	 */
	public Adapter createYFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YAction <em>YAction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YAction
	 * @generated
	 */
	public Adapter createYActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YCommand <em>YCommand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YCommand
	 * @generated
	 */
	public Adapter createYCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //VaadinMobileAdapterFactory
