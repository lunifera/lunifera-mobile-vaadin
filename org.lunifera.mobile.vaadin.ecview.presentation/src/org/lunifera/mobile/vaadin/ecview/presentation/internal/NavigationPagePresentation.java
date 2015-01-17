/**
 * Copyright (c) 2011 - 2014, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 * 		Florian Pirchner - Initial implementation
 */
package org.lunifera.mobile.vaadin.ecview.presentation.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.ecore.EObject;
import org.lunifera.ecview.core.common.binding.IECViewBindingManager;
import org.lunifera.ecview.core.common.editpart.IElementEditpart;
import org.lunifera.ecview.core.common.editpart.IEmbeddableEditpart;
import org.lunifera.ecview.core.common.editpart.ILayoutEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IBindableEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IBindableValueEndpointEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.INavigationBarButtonEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.INavigationPageEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.presentation.INavigationPagePresentation;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage;
import org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage;
import org.lunifera.runtime.common.metric.TimeLogger;
import org.lunifera.runtime.web.ecview.presentation.vaadin.internal.AbstractLayoutPresenter;
import org.lunifera.runtime.web.vaadin.databinding.VaadinObservables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vaadin.addon.touchkit.ui.NavigationManager;
import com.vaadin.addon.touchkit.ui.NavigationManager.NavigationEvent;
import com.vaadin.addon.touchkit.ui.NavigationManager.NavigationListener;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.server.ClientConnector;
import com.vaadin.server.ClientConnector.AttachEvent;
import com.vaadin.ui.AbstractComponent;
import com.vaadin.ui.Component;
import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;

/**
 * This presenter is responsible to render a text field on the given layout.
 */
@SuppressWarnings({ "restriction", "serial" })
public class NavigationPagePresentation extends
		AbstractLayoutPresenter<ComponentContainer> implements
		INavigationPagePresentation<ComponentContainer>, NavigationListener {

	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory
			.getLogger(NavigationPagePresentation.class);

	private List<INavigationBarButtonEditpart> barActions;

	private NavigationView navigationView;
	private VerticalLayout content;
	private ModelAccess modelAccess;

	// the input data if navigation page is triggered by table selection,...
	private IBindableEndpointEditpart inputDataBindingEndpoint;

	private HorizontalLayout rightBarComponent;

	/**
	 * The constructor.
	 * 
	 * @param editpart
	 *            The editpart of that editpart.
	 */
	public NavigationPagePresentation(IElementEditpart editpart) {
		super((ILayoutEditpart) editpart);
		this.modelAccess = new ModelAccess(
				(VMNavigationPage) editpart.getModel());
	}

	@Override
	protected void doUpdateLocale(Locale locale) {
		// no need to set the locale to the ui elements. Is handled by vaadin
		// internally.

		// update the captions
		applyCaptions();
	}

	/**
	 * Applies the labels to the widgets.
	 */
	protected void applyCaptions() {
		navigationView.setCaption(modelAccess.yLayout.getName());
	}

	/**
	 * Is called to refresh the UI. The element will be removed from the layout
	 * and added to it again afterwards.
	 */
	protected void refreshUI() {

		for (INavigationBarButtonEditpart editpart : getBarActions()) {
			addBarActionComponent(editpart);
		}

		// iterate all elements and build the child element
		//
		for (IEmbeddableEditpart child : getChildren()) {
			addChildComponent(child);
		}
	}

	/**
	 * Is called to create the child component and apply layouting defaults to
	 * it.
	 * 
	 * @param editpart
	 * @param yStyle
	 * @return
	 */
	protected void addChildComponent(IEmbeddableEditpart editpart) {
		Component child = (Component) editpart.render(content);
		child.setWidth("100%");
		content.addComponent(child);
	}

	protected void addBarActionComponent(INavigationBarButtonEditpart editpart) {
		if (rightBarComponent == null) {
			rightBarComponent = new HorizontalLayout();
			navigationView.getNavigationBar().setRightComponent(
					rightBarComponent);
		}

		Component child = (Component) editpart.render(content);
		rightBarComponent.addComponent(child);
	}

	@Override
	public ComponentContainer doCreateWidget(Object parent) {
		if (navigationView == null) {
			navigationView = new NavigationView();
			navigationView.getLeftComponent().setCaption("Back");

			associateWidget(navigationView, modelAccess.yLayout);

			if (modelAccess.isCssIdValid()) {
				navigationView.setId(modelAccess.getCssID());
			} else {
				navigationView.setId(getEditpart().getId());
			}

			if (modelAccess.isCssClassValid()) {
				navigationView.addStyleName(modelAccess.getCssClass());
			} else {
				navigationView.addStyleName(CSS_CLASS_CONTROL);
			}

			content = new VerticalLayout();
			navigationView.setContent(content);
			associateWidget(content, modelAccess.yLayout);

			applyCaptions();

			// creates the binding for the field
			createBindings(modelAccess.yLayout, navigationView, null);

			// initialize all children
			initializeChildren();

			// and now render children
			renderChildren(false);
		}

		return navigationView;
	}

	protected void createBindings(VMNavigationPage yPage,
			AbstractComponent widget, AbstractComponent container) {

		// if input data is available, then bind values against that input
		if (inputDataBindingEndpoint != null) {
			IECViewBindingManager bindingManager = getViewContext().getService(
					IECViewBindingManager.class.getName());
			IBindableValueEndpointEditpart modelValueEditpart = (IBindableValueEndpointEditpart) inputDataBindingEndpoint;
			IObservableValue modelObservable = modelValueEditpart
					.getObservable();

			IObservableValue targetObservable = EMFObservables.observeValue(
					(EObject) getModel(),
					VaadinMobilePackage.Literals.VM_NAVIGATION_PAGE__VALUE);
			Binding currentActiveNextNavPageBinding = bindingManager.bindValue(
					targetObservable, modelObservable, new UpdateValueStrategy(
							UpdateValueStrategy.POLICY_NEVER),
					new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE));
			registerBinding(currentActiveNextNavPageBinding);

			navigationView
					.addAttachListener(new ClientConnector.AttachListener() {
						@Override
						public void attach(AttachEvent event) {
							navigationView.getNavigationManager()
									.addNavigationListener(
											NavigationPagePresentation.this);
						}
					});

		}

		super.createBindings(yPage, widget, container);
	}

	protected INavigationPageEditpart getEditpart() {
		return (INavigationPageEditpart) super.getEditpart();
	}

	/**
	 * Adds the children to the superclass and prevents rendering.
	 */
	private void initializeChildren() {
		setRenderLock(true);
		try {
			for (IEmbeddableEditpart editPart : getEditpart().getElements()) {
				super.add(editPart);
			}

			for (INavigationBarButtonEditpart editPart : getEditpart()
					.getBarButtons()) {
				addBarAction(editPart);
			}

		} finally {
			setRenderLock(false);
		}
	}

	@Override
	public ComponentContainer getWidget() {
		return navigationView;
	}

	@Override
	public void navigateTo(INavigationPageEditpart targetPageEditpart,
			IBindableEndpointEditpart bindingEndpoint) {
		if (isRendered()) {
			// navigate and forget -> All required logic is handled by target
			// navigation page

			VaadinObservables.activateRealm(navigationView.getUI());
			// set the input data to the child nav page
			targetPageEditpart.setInputDataBindingEndpoint(bindingEndpoint);

			TimeLogger log = TimeLogger.start(getClass());
			Component currentActiveNextNavPage = (Component) targetPageEditpart
					.render(null);
			log.stop("Rendering of target navigation page took");

			log = TimeLogger.start(getClass());
			navigationView.getNavigationManager().navigateTo(
					currentActiveNextNavPage);
			log.stop("Raw navigationManager call took");
		}
	}

	@Override
	public void setInputDataBindingEndpoint(
			IBindableEndpointEditpart bindingEndpoint) {
		this.inputDataBindingEndpoint = bindingEndpoint;
	}

	@Override
	public void navigate(NavigationEvent event) {
		if (event.getDirection() == NavigationEvent.Direction.BACK) {
			NavigationManager mgr = (NavigationManager) event.getSource();
			if (mgr.getNextComponent() == navigationView) {
				navigationView.getNavigationManager().removeListener(this);
				getEditpart().requestUnrender();

				// notify listeners about the back navigation
				getEditpart().notifyBackNavigation();
			}
		}
	}

	@Override
	public void navigateBack() {
		navigationView.getNavigationManager().navigateBack();
	}

	@Override
	public boolean isRendered() {
		return navigationView != null;
	}

	@Override
	protected void internalDispose() {
		try {
			unrender();
		} finally {
			if (barActions != null) {
				barActions.clear();
				barActions = null;
			}
			super.internalDispose();
		}
	}

	@Override
	public void doUnrender() {
		if (navigationView != null) {

			// unbind all active bindings
			unbind();

			// unrender the children
			unrenderChildren();

			// remove assocations
			unassociateWidget(navigationView);
			unassociateWidget(content);

			navigationView = null;
			content = null;
			rightBarComponent = null;
		}
	}

	@Override
	protected void internalAdd(IEmbeddableEditpart editpart) {
		addChildComponent(editpart);
	}

	@Override
	protected void internalRemove(IEmbeddableEditpart child) {
		if (navigationView != null && child.isRendered()) {
			// just remove the content. A navigation view only contains 1
			// element
			navigationView.removeComponent(navigationView.getContent());
		}

		child.unrender();
	}

	@Override
	protected void internalInsert(IEmbeddableEditpart editpart, int index) {
		refreshUI();
	}

	@Override
	protected void internalMove(IEmbeddableEditpart editpart, int oldIndex,
			int newIndex) {
		refreshUI();
	}

	@Override
	public void renderChildren(boolean force) {
		if (force) {
			unrenderChildren();
		}

		refreshUI();
	}

	/**
	 * Will unrender all children.
	 */
	protected void unrenderChildren() {

		for (INavigationBarButtonEditpart editpart : getBarActions()) {
			if (editpart.isRendered()) {
				editpart.unrender();
			}
		}

		for (IEmbeddableEditpart editpart : getChildren()) {
			if (editpart.isRendered()) {
				editpart.unrender();
			}
		}
	}

	public List<INavigationBarButtonEditpart> getBarActions() {
		return barActions != null ? Collections.unmodifiableList(barActions)
				: Collections.<INavigationBarButtonEditpart> emptyList();
	}

	/**
	 * Ensures, that the children collection exists.
	 */
	protected void ensureBarActions() {
		if (barActions == null) {
			barActions = new ArrayList<INavigationBarButtonEditpart>();
		}
	}

	@Override
	public void addBarAction(INavigationBarButtonEditpart editPart) {
		ensureBarActions();

		if (!barActions.contains(editPart)) {
			barActions.add(editPart);

			if (!isRenderLock()) {
				refreshUI();
			}
		}
	}

	@Override
	public void insertBarAction(INavigationBarButtonEditpart editPart, int index) {
		ensureBarActions();

		int currentIndex = barActions.indexOf(editPart);
		if (currentIndex > -1 && currentIndex != index) {
			throw new RuntimeException(
					String.format(
							"Insert at index %d not possible since presentation already contained at index %d",
							index, currentIndex));
		}

		barActions.add(index, editPart);
		if (!isRenderLock()) {
			refreshUI();
		}
	}

	@Override
	public void moveBarAction(INavigationBarButtonEditpart editPart, int index) {
		if (barActions == null) {
			throw new RuntimeException(
					"Move not possible. No children present.");
		}

		if (!barActions.contains(editPart)) {
			throw new RuntimeException(
					String.format(
							"Move to index %d not possible since presentation not added yet!",
							index));
		}

		// int currentIndex = barActions.indexOf(editPart);
		barActions.remove(editPart);
		barActions.add(index, editPart);

		if (!isRenderLock()) {
			refreshUI();
		}
	}

	@Override
	public void removeBarAction(INavigationBarButtonEditpart editPart) {
		if (barActions == null) {
			return;
		}

		if (barActions.remove(editPart) && !isRenderLock()) {
			refreshUI();
		}
	}

	/**
	 * An internal helper class.
	 */
	private static class ModelAccess {
		private final VMNavigationPage yLayout;

		public ModelAccess(VMNavigationPage yLayout) {
			super();
			this.yLayout = yLayout;
		}

		/**
		 * @return
		 * @see org.lunifera.ecview.core.ui.core.model.core.YCssAble#getCssClass()
		 */
		public String getCssClass() {
			return yLayout.getCssClass();
		}

		/**
		 * Returns true, if the css class is not null and not empty.
		 * 
		 * @return
		 */
		public boolean isCssClassValid() {
			return getCssClass() != null && !getCssClass().equals("");
		}

		/**
		 * @return
		 * @see org.lunifera.ecview.core.ui.core.model.core.YCssAble#getCssID()
		 */
		public String getCssID() {
			return yLayout.getCssID();
		}

		/**
		 * Returns true, if the css id is not null and not empty.
		 * 
		 * @return
		 */
		public boolean isCssIdValid() {
			return getCssID() != null && !getCssID().equals("");
		}

	}
}
