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

import org.lunifera.ecview.core.common.context.IViewContext;
import org.lunifera.ecview.core.common.editpart.IElementEditpart;
import org.lunifera.ecview.core.common.presentation.IPresentationFactory;
import org.lunifera.ecview.core.common.presentation.IWidgetPresentation;
import org.lunifera.mobile.vaadin.ecview.editparts.IHorizontalButtonGroupEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.IMobileTabEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.IMobileTabSheetEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.INavigationButtonEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.INavigationPageEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.ISwitchEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.IVerticalComponentGroupEditpart;
import org.lunifera.runtime.web.ecview.presentation.vaadin.VaadinRenderer;

/**
 * The presenter factory.
 */
public class PresenterFactory implements IPresentationFactory {

	public PresenterFactory() {

	}

	@Override
	public boolean isFor(IViewContext uiContext, IElementEditpart editpart) {
		String presentationURI = uiContext.getPresentationURI();
		return presentationURI != null
				&& presentationURI.equals(VaadinRenderer.UI_KIT_URI);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IWidgetPresentation<?>> A createPresentation(
			IViewContext uiContext, IElementEditpart editpart)
			throws IllegalArgumentException {
		if (editpart instanceof IHorizontalButtonGroupEditpart) {
			return (A) new HorizontalButtonGroupPresentation(editpart);
		} else if (editpart instanceof ISwitchEditpart) {
			return (A) new SwitchPresentation(editpart);
		} else if (editpart instanceof IVerticalComponentGroupEditpart) {
			return (A) new VerticalComponentGroupPresentation(editpart);
		} else if (editpart instanceof IMobileTabEditpart) {
			return (A) new MobileTabPresentation(editpart);
		} else if (editpart instanceof IMobileTabSheetEditpart) {
			return (A) new MobileTabSheetPresentation(editpart);
		} else if (editpart instanceof INavigationPageEditpart) {
			return (A) new NavigationPagePresentation(editpart);
		} else if (editpart instanceof INavigationButtonEditpart) {
			return (A) new NavigationButtonPresentation(editpart);
		}

		throw new IllegalArgumentException(String.format(
				"No presenter available for editpart %s[%s]", editpart
						.getClass().getName(), editpart.getId()));
	}
}
