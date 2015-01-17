package org.lunifera.mobile.vaadin.ecview.editparts;

import org.lunifera.ecview.core.common.editpart.binding.IBindableEndpointEditpart;

public interface INavigationHandler {

	/**
	 * Calls to this method will navigate from the current navigation page to
	 * the target page using a navigation manager.
	 * 
	 * @param targetPage
	 * @param bindable
	 *            this object contains information about the input data of the
	 *            target navigation page.
	 */
	void navigateTo(INavigationPageEditpart targetPage,
			IBindableEndpointEditpart bindable);

	/**
	 * Tells the navigation page to navigate back.
	 */
	void navigateBack();

	/**
	 * Notifies listeners about the back navigation event.
	 */
	void notifyBackNavigation();

}