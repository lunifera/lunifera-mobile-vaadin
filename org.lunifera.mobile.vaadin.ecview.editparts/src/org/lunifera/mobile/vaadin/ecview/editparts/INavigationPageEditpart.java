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
package org.lunifera.mobile.vaadin.ecview.editparts;

import java.util.List;

import org.lunifera.ecview.core.common.editpart.ILayoutEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IBindableEndpointEditpart;

/**
 * The abstraction for a mobile navigation page.
 */
public interface INavigationPageEditpart extends ILayoutEditpart,
		INavigationHandler {

	/**
	 * Sets the input binding endpoint. Fields of the navigation page needs to
	 * be bound against the object at the end of the binding endpoint. For
	 * instance, if a table row triggers binding, it will pass a binding
	 * endpoint targeting the selected table row. Needs to be called before
	 * rendering the child.
	 * 
	 * <p>
	 * This method is called on the child navigation page, that was triggered by
	 * selecting a table row,...
	 * 
	 * @param bindingEndpoint
	 */
	void setInputDataBindingEndpoint(IBindableEndpointEditpart bindingEndpoint);

	/**
	 * Returns a list of all attached navigation bar buttons.
	 * 
	 * @return navigationBarButtons
	 */
	List<INavigationBarButtonEditpart> getBarButtons();
}
