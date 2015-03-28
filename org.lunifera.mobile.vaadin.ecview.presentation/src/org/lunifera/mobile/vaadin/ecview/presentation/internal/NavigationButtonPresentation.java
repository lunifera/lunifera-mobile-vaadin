/**
 * Copyright (c) 2013 COMPEX Systemhaus GmbH Heidelberg. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Jose C. Dominguez - initial API and implementation
 */
package org.lunifera.mobile.vaadin.ecview.presentation.internal;

import java.util.Date;
import java.util.Locale;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.lunifera.ecview.core.common.editpart.IElementEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.INavigationButtonEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.INavigationPageEditpart;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationButton;
import org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage;
import org.lunifera.runtime.web.ecview.presentation.vaadin.common.AbstractVaadinWidgetPresenter;
import org.lunifera.runtime.web.ecview.presentation.vaadin.internal.util.Util;

import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.ui.Component;
import com.vaadin.ui.ComponentContainer;

/**
 * This presenter is responsible to render a text field on the given layout.
 */
@SuppressWarnings("restriction")
public class NavigationButtonPresentation extends
		AbstractVaadinWidgetPresenter<Component> {

	private final ModelAccess modelAccess;
	private NavigationButton button;
	private IObservableValue clickObservable;

	/**
	 * Constructor.
	 * 
	 * @param editpart
	 *            The editpart of that presenter
	 */
	public NavigationButtonPresentation(IElementEditpart editpart) {
		super((INavigationButtonEditpart) editpart);
		this.modelAccess = new ModelAccess(
				(VMNavigationButton) editpart.getModel());
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("serial")
	@Override
	public Component doCreateWidget(Object parent) {
		if (button == null) {
			button = new NavigationButton() {
				public void click() {
					// lazy loading of target view
					if (isEnabled() && !isReadOnly()) {
						Component targetView = loadTargetPage();
						if (targetView != null) {
							setTargetView(targetView);
							getNavigationManager().navigateTo(targetView);
						}
						fireClick();

						// fire click event to databinding
						clickObservable.setValue(new Date().getTime());
					}
				}
			};
			if (modelAccess.isCssIdValid()) {
				button.setId(modelAccess.getCssID());
			} else {
				button.setId(getEditpart().getId());
			}

			button.addStyleName(CSS_CLASS_CONTROL);
			button.setImmediate(true);

			associateWidget(button, modelAccess.vmField);

			// creates the binding for the field
			createBindings(modelAccess.vmField, button);

			if (modelAccess.isCssClassValid()) {
				button.addStyleName(modelAccess.getCssClass());
			}

			applyCaptions();

		}
		return button;
	}

	/**
	 * Returns the target page the navigation button should navigate to.
	 * 
	 * @return
	 */
	protected Component loadTargetPage() {
		INavigationButtonEditpart editpart = (INavigationButtonEditpart) getEditpart();
		INavigationPageEditpart pageEditpart = editpart.getPage();
		if (pageEditpart != null) {
			if (!pageEditpart.isRendered()) {
				// Render the page without passing a parent
				// new parent will be handled by navigation manager
				pageEditpart.render(null);
			}
			return (Component) pageEditpart.getWidget();
		}
		return null;
	}

	@Override
	protected void doUpdateLocale(Locale locale) {
		// no need to set the locale to the ui elements. Is handled by vaadin
		// internally.

		// update the captions
		applyCaptions();
	}

	/**
	 * Applies the labels to the widgets.
	 */
	protected void applyCaptions() {
		Util.applyCaptions(getI18nService(), modelAccess.getLabel(),
				modelAccess.getLabelI18nKey(), getLocale(), button);
	}

	/**
	 * Creates the bindings for the given values.
	 * 
	 * @param vmField
	 * @param button
	 */
	protected void createBindings(final VMNavigationButton vmField,
			NavigationButton button) {

		clickObservable = EMFObservables
				.observeValue(
						vmField,
						VaadinMobilePackage.Literals.VM_NAVIGATION_BUTTON__LAST_CLICK_TIME);

		super.createBindings(vmField, button, null);
	}

	@Override
	public Component getWidget() {
		return button;
	}

	@Override
	public boolean isRendered() {
		return button != null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void doUnrender() {
		if (button != null) {

			// unbind all active bindings
			unbind();
			clickObservable.dispose();
			clickObservable = null;

			ComponentContainer parent = ((ComponentContainer) button
					.getParent());
			if (parent != null) {
				parent.removeComponent(button);
			}

			// remove assocations
			unassociateWidget(button);

			button = null;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void internalDispose() {
		try {
			unrender();
		} finally {
			super.internalDispose();
		}
	}

	/**
	 * A helper class.
	 */
	private static class ModelAccess {
		private final VMNavigationButton vmField;

		public ModelAccess(VMNavigationButton vmField) {
			super();
			this.vmField = vmField;
		}

		/**
		 * @return
		 * @see org.lunifera.ecview.core.ui.core.model.core.YCssAble#getCssClass()
		 */
		public String getCssClass() {
			return vmField.getCssClass();
		}

		/**
		 * Returns true, if the css class is not null and not empty.
		 * 
		 * @return
		 */
		public boolean isCssClassValid() {
			return getCssClass() != null && !getCssClass().equals("");
		}

		/**
		 * @return
		 * @see org.lunifera.ecview.core.ui.core.model.core.YCssAble#getCssID()
		 */
		public String getCssID() {
			return vmField.getCssID();
		}

		/**
		 * Returns true, if the css id is not null and not empty.
		 * 
		 * @return
		 */
		public boolean isCssIdValid() {
			return getCssID() != null && !getCssID().equals("");
		}

		/**
		 * Returns the label.
		 * 
		 * @return
		 */
		public String getLabel() {
			return vmField.getDatadescription() != null ? vmField
					.getDatadescription().getLabel() : null;
		}

		/**
		 * Returns the label.
		 * 
		 * @return
		 */
		public String getLabelI18nKey() {
			return vmField.getDatadescription() != null ? vmField
					.getDatadescription().getLabelI18nKey() : null;
		}
	}
}
