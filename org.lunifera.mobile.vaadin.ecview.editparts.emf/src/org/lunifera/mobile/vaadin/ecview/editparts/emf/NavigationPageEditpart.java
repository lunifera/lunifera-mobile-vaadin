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

import org.eclipse.emf.ecp.ecview.common.editpart.emf.LayoutEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.INavigationPageEditpart;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage;
import org.lunifera.mobile.vaadin.ecview.model.VaadinMobileFactory;

/**
 * The implementation of the IMobileNavigationPageEditpart.
 */
@SuppressWarnings("restriction")
public class NavigationPageEditpart extends LayoutEditpart<VMNavigationPage>
		implements INavigationPageEditpart {

	@Override
	protected VMNavigationPage createModel() {
		return (VMNavigationPage) VaadinMobileFactory.eINSTANCE
				.createVMNavigationPage();
	}

}
