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

import org.eclipse.emf.ecore.EObject;
import org.lunifera.ecview.core.common.editpart.IElementEditpart;
import org.lunifera.ecview.core.common.editpart.emf.ElementEditpart;
import org.lunifera.ecview.core.common.editpart.emf.common.AbstractEditpartManager;
import org.lunifera.ecview.core.common.model.core.YElement;
import org.lunifera.mobile.vaadin.ecview.editparts.IHorizontalButtonGroupEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.IMobileSearchPanelEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.IMobileTabEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.IMobileTabSheetEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.INavigationBarButtonEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.INavigationButtonEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.INavigationCommandEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.INavigationPageEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.INavigationRootEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.ISwitchEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.IVerticalComponentGroupEditpart;
import org.lunifera.mobile.vaadin.ecview.model.VMHorizontalButtonGroup;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationBarButton;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationButton;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationCommand;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationRoot;
import org.lunifera.mobile.vaadin.ecview.model.VMSearchPanel;
import org.lunifera.mobile.vaadin.ecview.model.VMSwitch;
import org.lunifera.mobile.vaadin.ecview.model.VMTab;
import org.lunifera.mobile.vaadin.ecview.model.VMTabSheet;
import org.lunifera.mobile.vaadin.ecview.model.VMVerticalComponentGroup;
import org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage;
import org.osgi.service.component.ComponentContext;

/**
 * An implementation of IEditPartManager for eObjects with
 * nsURI=http://eclipse.org/emf/emfclient/uimodel.
 */
public class EditpartManager extends AbstractEditpartManager {

	protected void activate(ComponentContext context) {

	}

	protected void deactivate(ComponentContext context) {

	}

	@Override
	public boolean isFor(Object element) {
		if (element instanceof EObject) {
			String uriString = ((EObject) element).eClass().getEPackage()
					.getNsURI();
			return uriString.equals(VaadinMobilePackage.eNS_URI);
		} else if (element instanceof String) {
			return element.equals(VaadinMobilePackage.eNS_URI);
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IElementEditpart> A createEditpart(Object selector,
			Class<A> editPartClazz) {
		ElementEditpart<YElement> result = null;
		if (editPartClazz
				.isAssignableFrom(IHorizontalButtonGroupEditpart.class)) {
			result = createNewInstance(HorizontalButtonGroupEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ISwitchEditpart.class)) {
			result = createNewInstance(SwitchEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IVerticalComponentGroupEditpart.class)) {
			result = createNewInstance(VerticalComponentGroupEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IMobileTabSheetEditpart.class)) {
			result = createNewInstance(MobileTabSheetEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IMobileTabEditpart.class)) {
			result = createNewInstance(MobileTabEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(INavigationPageEditpart.class)) {
			result = createNewInstance(NavigationPageEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(INavigationButtonEditpart.class)) {
			result = createNewInstance(NavigationButtonEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(INavigationCommandEditpart.class)) {
			result = createNewInstance(NavigationCommandEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IMobileSearchPanelEditpart.class)) {
			result = createNewInstance(MobileSearchPanelEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(INavigationRootEditpart.class)) {
			result = createNewInstance(NavigationRootEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(INavigationBarButtonEditpart.class)) {
			result = createNewInstance(NavigationBarButtonEditpart.class);
		}

		if (result != null) {
			result.initialize();
		}

		return (A) result;
	}

	/**
	 * Creates a new instance of the edit part.
	 * 
	 * @param <A>
	 *            an instance of {@link IElementEditpart}
	 * @param yElement
	 *            the model element
	 * @return editpart
	 */
	@SuppressWarnings("unchecked")
	protected <A extends IElementEditpart> A createEditpart(Object yElement) {
		// asserts that no editpart was created already for the given element
		assertOneEditpartForModelelement(yElement);

		ElementEditpart<YElement> result = null;
		if (yElement instanceof VMHorizontalButtonGroup) {
			result = createNewInstance(HorizontalButtonGroupEditpart.class);
		} else if (yElement instanceof VMSwitch) {
			result = createNewInstance(SwitchEditpart.class);
		} else if (yElement instanceof VMVerticalComponentGroup) {
			result = createNewInstance(VerticalComponentGroupEditpart.class);
		} else if (yElement instanceof VMTabSheet) {
			result = createNewInstance(MobileTabSheetEditpart.class);
		} else if (yElement instanceof VMTab) {
			result = createNewInstance(MobileTabEditpart.class);
		} else if (yElement instanceof VMNavigationPage) {
			result = createNewInstance(NavigationPageEditpart.class);
		} else if (yElement instanceof VMNavigationButton) {
			result = createNewInstance(NavigationButtonEditpart.class);
		} else if (yElement instanceof VMNavigationCommand) {
			result = createNewInstance(NavigationCommandEditpart.class);
		} else if (yElement instanceof VMSearchPanel) {
			result = createNewInstance(MobileSearchPanelEditpart.class);
		} else if (yElement instanceof VMNavigationRoot) {
			result = createNewInstance(NavigationRootEditpart.class);
		} else if (yElement instanceof VMNavigationBarButton) {
			result = createNewInstance(NavigationBarButtonEditpart.class);
		}

		if (result != null) {
			result.initialize((YElement) yElement);
		}

		return (A) result;
	}

	/**
	 * Returns a new instance of the type.
	 * 
	 * @param type
	 *            The type of the editpart for which an instance should be
	 *            created.
	 * @return editPart
	 * @throws InstantiationException
	 *             e
	 * @throws IllegalAccessException
	 *             e
	 */
	protected IElementEditpart newInstance(
			Class<? extends IElementEditpart> type)
			throws InstantiationException, IllegalAccessException {
		return type.newInstance();
	}
}
