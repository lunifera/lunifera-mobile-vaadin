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

import org.eclipse.core.databinding.Binding;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IBindableEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.LayoutEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.INavigationPageEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.presentation.INavigationPagePresentation;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage;
import org.lunifera.mobile.vaadin.ecview.model.VaadinMobileFactory;

/**
 * The implementation of the IMobileNavigationPageEditpart.
 */
@SuppressWarnings("restriction")
public class NavigationPageEditpart extends LayoutEditpart<VMNavigationPage>
		implements INavigationPageEditpart {

	private Binding binding;

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

		// navigate to the target
		INavigationPagePresentation<?> presentation = (INavigationPagePresentation<?>) getPresentation();
		presentation.navigateTo(targetPage, bindingEndpoint);
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
