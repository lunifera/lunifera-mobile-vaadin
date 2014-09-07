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

/**
 * The implementation of the IHorizontalButtonGroupEditpart.
 */
@SuppressWarnings("restriction")
public class NavigationCommandEditpart extends
		CommandEditpart<VMNavigationCommand> implements
		INavigationCommandEditpart {

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

		navHandler.navigateTo(targetEditpart, bindableEndpoint);
	}
}
