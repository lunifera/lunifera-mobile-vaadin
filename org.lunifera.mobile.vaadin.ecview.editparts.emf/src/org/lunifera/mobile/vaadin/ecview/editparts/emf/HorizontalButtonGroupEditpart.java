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
package org.lunifera.mobile.vaadin.ecview.editparts.emf;

import org.lunifera.ecview.core.common.editpart.emf.LayoutEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.IHorizontalButtonGroupEditpart;
import org.lunifera.mobile.vaadin.ecview.model.VMHorizontalButtonGroup;
import org.lunifera.mobile.vaadin.ecview.model.VaadinMobileFactory;

/**
 * The implementation of the IHorizontalButtonGroupEditpart.
 */
@SuppressWarnings("restriction")
public class HorizontalButtonGroupEditpart extends
		LayoutEditpart<VMHorizontalButtonGroup> implements
		IHorizontalButtonGroupEditpart {

	@Override
	protected VMHorizontalButtonGroup createModel() {
		return (VMHorizontalButtonGroup) VaadinMobileFactory.eINSTANCE
				.createVMHorizontalButtonGroup();
	}

}
