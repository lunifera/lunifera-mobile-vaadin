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

import org.lunifera.ecview.core.common.editpart.emf.ActionEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.INavigationBarButtonEditpart;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationBarButton;
import org.lunifera.mobile.vaadin.ecview.model.VaadinMobileFactory;

/**
 * The implementation of the IMobileNavigationPageEditpart.
 */
public class NavigationBarButtonEditpart extends
		ActionEditpart<VMNavigationBarButton> implements
		INavigationBarButtonEditpart {

	protected VMNavigationBarButton createModel() {
		return (VMNavigationBarButton) VaadinMobileFactory.eINSTANCE
				.createVMNavigationBarButton();
	}

}
