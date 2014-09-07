package org.lunifera.mobile.vaadin.ecview.editparts.presentation;

import org.lunifera.ecview.core.common.editpart.binding.IBindableEndpointEditpart;
import org.lunifera.ecview.core.common.presentation.ILayoutPresentation;
import org.lunifera.mobile.vaadin.ecview.editparts.INavigationPageEditpart;

public interface INavigationPagePresentation<C> extends ILayoutPresentation<C> {

	/**
	 * Calls to this method will navigate from the current navigation page to
	 * the target page using a navigation manager.
	 * 
	 * <p>
	 * This method is called on the navigation page, that should trigger the
	 * navigation to the child page.
	 * 
	 * @param targetPage
	 * @param bindingEndpoint
	 *            - Sets the input binding endpoint. Fields of the navigation
	 *            page needs to be bound against the object at the end of the
	 *            binding endpoint. For instance, if a table row triggers
	 *            binding, it will pass a binding endpoint targeting the
	 *            selected table row.
	 */
	void navigateTo(INavigationPageEditpart targetPage,
			IBindableEndpointEditpart bindingEndpoint);

	/**
	 * Sets the input binding endpoint. Fields of the navigation page needs to
	 * be bound against the object at the end of the binding endpoint. For
	 * instance, if a table row triggers binding, it will pass a binding
	 * endpoint targeting the selected table row. Needs to be called before rendering the child.
	 * 
	 * <p>
	 * This method is called on the child navigation page, that was triggered by
	 * selecting a table row,...
	 * 
	 * @param bindingEndpoint
	 */
	void setInputDataBindingEndpoint(
			IBindableEndpointEditpart bindingEndpoint);

}
