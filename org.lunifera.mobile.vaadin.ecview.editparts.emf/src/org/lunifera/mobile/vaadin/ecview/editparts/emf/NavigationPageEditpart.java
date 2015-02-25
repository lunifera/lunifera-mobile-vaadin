/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.lunifera.mobile.vaadin.ecview.editparts.emf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.eclipse.core.databinding.Binding;
import org.eclipse.emf.common.notify.Notification;
import org.lunifera.ecview.core.common.editpart.binding.IBindableEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.emf.LayoutEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.INavigationBarButtonEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.INavigationPageEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.presentation.INavigationPagePresentation;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationBarButton;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage;
import org.lunifera.mobile.vaadin.ecview.model.VaadinMobileFactory;
import org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage;
import org.lunifera.runtime.common.metric.TimeLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The implementation of the IMobileNavigationPageEditpart.
 */
@SuppressWarnings("restriction")
public class NavigationPageEditpart extends LayoutEditpart<VMNavigationPage>
		implements INavigationPageEditpart {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(NavigationPageEditpart.class);

	private Binding binding;

	private List<INavigationBarButtonEditpart> uiBarButtonEditparts;

	@Override
	protected VMNavigationPage createModel() {
		return (VMNavigationPage) VaadinMobileFactory.eINSTANCE
				.createVMNavigationPage();
	}

	@Override
	public Object render(Object parentWidget) {
		INavigationPagePresentation<?> presentation = (INavigationPagePresentation<?>) getPresentation();
		return presentation.createWidget(parentWidget);
	}

	@Override
	public void setInputDataBindingEndpoint(
			IBindableEndpointEditpart bindingEndpoint) {
		INavigationPagePresentation<?> presentation = (INavigationPagePresentation<?>) getPresentation();
		presentation.setInputDataBindingEndpoint(bindingEndpoint);
	}

	@Override
	public void navigateTo(INavigationPageEditpart targetPage,
			IBindableEndpointEditpart bindingEndpoint) {
		checkDisposed();

		TimeLogger log = TimeLogger.start(getClass());
		// navigate to the target
		INavigationPagePresentation<?> presentation = (INavigationPagePresentation<?>) getPresentation();
		presentation.navigateTo(targetPage, bindingEndpoint);
		log.stop("Navigation took ");
	}

	@Override
	public void navigateBack() {
		checkDisposed();

		if (isPresentationPresent()) {
			// navigate back
			INavigationPagePresentation<?> presentation = (INavigationPagePresentation<?>) getPresentation();
			presentation.navigateBack();
		}
	}

	@Override
	public void notifyBackNavigation() {
		getModel().setOnNavigateBack(new Date().getTime());
	}

	public List<INavigationBarButtonEditpart> getBarButtons() {
		if (uiBarButtonEditparts == null) {
			internalLoadBarButtons();
		}
		return Collections.unmodifiableList(uiBarButtonEditparts);
	}

	public void addBarButton(INavigationBarButtonEditpart element) {
		try {
			checkDisposed();

			// add the element by using the model
			//
			VMNavigationPage yLayout = getModel();
			VMNavigationBarButton yBarButton = (VMNavigationBarButton) element
					.getModel();
			yLayout.getBarActions().add(yBarButton);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	public void removeBarButton(INavigationBarButtonEditpart element) {
		try {
			checkDisposed();

			// remove the element by using the model
			//
			VMNavigationPage yLayout = getModel();
			VMNavigationBarButton yBarButton = (VMNavigationBarButton) element
					.getModel();
			yLayout.getBarActions().remove(yBarButton);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	protected void handleModelAdd(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case VaadinMobilePackage.VM_NAVIGATION_PAGE__BAR_ACTIONS:
			VMNavigationBarButton yBarButton = (VMNavigationBarButton) notification
					.getNewValue();

			INavigationBarButtonEditpart editPart = (INavigationBarButtonEditpart) getEditpart(yBarButton);
			internalAddBarButton(editPart);

			// handle the presentation
			//
			if (isPresentationPresent()) {
				INavigationPagePresentation<?> presenter = (INavigationPagePresentation<?>) getPresentation();
				int index = notification.getPosition();
				if (index < 0 || index >= getBarButtons().size() - 1) {
					presenter.addBarAction(editPart);
				} else {
					presenter.insertBarAction(editPart, index);
				}
			}
			break;
		default:
			super.handleModelAdd(featureId, notification);
		}
	}

	@Override
	protected void handleModelMove(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case VaadinMobilePackage.VM_NAVIGATION_PAGE__BAR_ACTIONS:
			VMNavigationBarButton yBarButton = (VMNavigationBarButton) notification
					.getNewValue();

			INavigationBarButtonEditpart editPart = (INavigationBarButtonEditpart) getEditpart(yBarButton);
			internalMoveBarButton(editPart, notification.getPosition());

			// handle the presentation
			//
			if (isPresentationPresent()) {
				INavigationPagePresentation<?> presenter = (INavigationPagePresentation<?>) getPresentation();
				presenter.moveBarAction(editPart, notification.getPosition());
			}
			break;
		default:
			super.handleModelMove(featureId, notification);
		}
	}

	@Override
	protected void handleModelSet(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case VaadinMobilePackage.VM_NAVIGATION_PAGE__NAVIGATE_BACK:
			navigateBack();
			break;
		default:
			super.handleModelMove(featureId, notification);
		}
	}

	/**
	 * Returns true, if the presenter is present.
	 * 
	 * @return
	 */
	protected boolean isPresentationPresent() {
		return internalGetPresentation() != null;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void handleModelRemove(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case VaadinMobilePackage.VM_NAVIGATION_PAGE__BAR_ACTIONS:
			VMNavigationBarButton yBarButton = (VMNavigationBarButton) notification
					.getOldValue();

			INavigationBarButtonEditpart editPart = (INavigationBarButtonEditpart) getEditpart(yBarButton);
			internalRemoveBarButton(editPart);

			// handle the presentation
			//
			if (isPresentationPresent()) {
				INavigationPagePresentation<?> presenter = (INavigationPagePresentation<?>) getPresentation();
				presenter.removeBarAction(editPart);
			}
			editPart.unrender();
			break;
		default:
			super.handleModelRemove(featureId, notification);
		}
	}

	/**
	 * Is called to change the internal state and add the given editpart to the
	 * list of elements.
	 * 
	 * @param editpart
	 *            The editpart to be added
	 */
	protected void internalAddBarButton(INavigationBarButtonEditpart editpart) {
		checkDisposed();

		if (uiBarButtonEditparts == null) {
			internalLoadBarButtons();
		}
		if (!uiBarButtonEditparts.contains(editpart)) {
			uiBarButtonEditparts.add(editpart);
		}
	}

	/**
	 * Is called to change the internal state and to move the given editpart in
	 * the list of elements.
	 * 
	 * @param editpart
	 *            The editpart to be inserted
	 * @param index
	 *            The index to move the element.
	 */
	protected void internalMoveBarButton(INavigationBarButtonEditpart editpart,
			int index) {
		checkDisposed();

		if (uiBarButtonEditparts == null) {
			internalLoadBarButtons();
		} else if (!uiBarButtonEditparts.contains(editpart)) {
			throw new RuntimeException(String.format(
					"Editpart %s is not contained in elements",
					editpart.getId()));
		} else {
			uiBarButtonEditparts.remove(editpart);
			uiBarButtonEditparts.add(index, editpart);
		}
	}

	/**
	 * Is called to change the internal state and remove the given editpart from
	 * the list of elements.
	 * 
	 * @param editpart
	 *            The editpart to be removed
	 */
	protected void internalRemoveBarButton(INavigationBarButtonEditpart editpart) {
		checkDisposed();

		if (uiBarButtonEditparts != null && editpart != null) {
			uiBarButtonEditparts.remove(editpart);
		}
	}

	/**
	 * Is called to load and initialize all elements.
	 */
	protected void internalLoadBarButtons() {
		checkDisposed();

		if (uiBarButtonEditparts == null) {
			uiBarButtonEditparts = new ArrayList<INavigationBarButtonEditpart>();
			for (VMNavigationBarButton yBarButton : getModel().getBarActions()) {
				INavigationBarButtonEditpart editPart = getEditpart(yBarButton);
				internalAddBarButton(editPart);
			}
		}
	}

	@Override
	protected void internalDispose() {
		try {
			if (binding != null) {
				binding.dispose();
				binding = null;
			}
		} finally {
			super.internalDispose();
		}
	}
}
