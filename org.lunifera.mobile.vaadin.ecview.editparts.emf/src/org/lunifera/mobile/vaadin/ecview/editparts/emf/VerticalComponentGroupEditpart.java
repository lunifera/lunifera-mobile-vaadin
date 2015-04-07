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

import org.lunifera.ecview.core.common.editpart.emf.LayoutEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.IVerticalComponentGroupEditpart;
import org.lunifera.mobile.vaadin.ecview.model.VMVerticalComponentGroup;
import org.lunifera.mobile.vaadin.ecview.model.VaadinMobileFactory;

/**
 * The implementation of the IVerticalComponentGroupEditpart.
 */
@SuppressWarnings("unchecked")
public class VerticalComponentGroupEditpart extends
		LayoutEditpart<VMVerticalComponentGroup> implements
		IVerticalComponentGroupEditpart {

	@Override
	protected VMVerticalComponentGroup createModel() {
		return (VMVerticalComponentGroup) VaadinMobileFactory.eINSTANCE
				.createVMVerticalComponentGroup();
	}
}


