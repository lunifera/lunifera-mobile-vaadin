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

import org.eclipse.emf.common.notify.Notification;
import org.lunifera.ecview.core.common.editpart.emf.LayoutEditpart;
import org.lunifera.ecview.core.common.filter.IFilterProvidingPresentation;
import org.lunifera.mobile.vaadin.ecview.editparts.IMobileSearchPanelEditpart;
import org.lunifera.mobile.vaadin.ecview.model.VMSearchPanel;
import org.lunifera.mobile.vaadin.ecview.model.VaadinMobileFactory;
import org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage;

/**
 * The implementation of the ISearchPanelEditpart.
 */
@SuppressWarnings("restriction")
public class MobileSearchPanelEditpart extends LayoutEditpart<VMSearchPanel>
		implements IMobileSearchPanelEditpart {

	@Override
	protected VMSearchPanel createModel() {
		return (VMSearchPanel) VaadinMobileFactory.eINSTANCE
				.createVMSearchPanel();
	}

	@Override
	public void initialize(VMSearchPanel model) {
		super.initialize(model);
	}

	@Override
	protected void handleModelSet(int featureId, Notification notification) {
		switch (featureId) {
		case VaadinMobilePackage.VM_SEARCH_PANEL__APPLY_FILTER:
			applyFilter();
			break;
		default:
			super.handleModelSet(featureId, notification);
		}
	}

	/**
	 * Accesses the presentation to return the filter and puts the new filter in
	 * the model. So other parties can react for the changed filter.
	 */
	private void applyFilter() {
		IFilterProvidingPresentation presentation = (IFilterProvidingPresentation) getPresentation();
		Object filter = presentation.getFilter();
		getModel().setFilter(filter);
	}

}
