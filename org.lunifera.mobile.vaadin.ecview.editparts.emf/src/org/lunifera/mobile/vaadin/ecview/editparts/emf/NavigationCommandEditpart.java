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

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.lunifera.ecview.core.common.binding.IECViewBindingManager;
import org.lunifera.ecview.core.common.editpart.binding.IBindableEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IBindableValueEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.emf.CommandEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.INavigationCommandEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.INavigationHandler;
import org.lunifera.mobile.vaadin.ecview.editparts.INavigationPageEditpart;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationCommand;
import org.lunifera.mobile.vaadin.ecview.model.VaadinMobileFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The implementation of the IHorizontalButtonGroupEditpart.
 */
@SuppressWarnings("restriction")
public class NavigationCommandEditpart extends
		CommandEditpart<VMNavigationCommand> implements
		INavigationCommandEditpart {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(NavigationCommandEditpart.class);

	private Binding binding;
	private boolean activated;

	@Override
	protected VMNavigationCommand createModel() {
		return (VMNavigationCommand) VaadinMobileFactory.eINSTANCE
				.createVMNavigationCommand();
	}

	@Override
	public void activate() {
		// bind the values
		IECViewBindingManager bindingManager = getView().getContext()
				.getService(IECViewBindingManager.class.getName());
		IBindableValueEndpointEditpart modelValueEditpart = (IBindableValueEndpointEditpart) getEditpart(getModel()
				.createNavigationValueEndpoint());
		IObservableValue modelObservable = modelValueEditpart.getObservable();
		IObservableValue targetObservable = PojoObservables.observeValue(this,
				"value");
		binding = bindingManager.bindValue(targetObservable, modelObservable,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER),
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE));
		activated = true;
	}

	/**
	 * Setting a value will trigger the command execution.
	 * 
	 * @param value
	 */
	public void setValue(Object value) {
		// execute the command
		if (activated && value != null) {
			execute();
		}
	}

	/**
	 * {@inheritDoc}
	 */
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

	@Override
	public void execute() {
		checkDisposed();

		VMNavigationCommand model = getModel();
		INavigationPageEditpart targetEditpart = getEditpart(model
				.getTargetPage());
		INavigationHandler navHandler = getEditpart(model
				.getNavigationHandler());
		IBindableEndpointEditpart bindableEndpoint = getEditpart(model
				.createNavigationValueEndpoint());

		try {
			navHandler.navigateTo(targetEditpart, bindableEndpoint);
		} catch (Exception e) {
			LOGGER.error("{}", e);
		}
	}
}
