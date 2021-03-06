/**
 * Copyright (c) 2013 COMPEX Systemhaus GmbH Heidelberg. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Jose C. Dominguez - initial API and implementation
 */
package org.lunifera.mobile.vaadin.ecview.presentation.internal;

import java.util.Locale;

import org.lunifera.ecview.core.common.editpart.IElementEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.INavigationBarButtonEditpart;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationBarButton;
import org.lunifera.mobile.vaadin.ecview.model.VaadinMobilePackage;
import org.lunifera.runtime.web.ecview.presentation.vaadin.internal.AbstractVaadinWidgetPresenter;
import org.lunifera.runtime.web.ecview.presentation.vaadin.internal.util.Util;

import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.ComponentContainer;

/**
 * This presenter is responsible to render a text field on the given layout.
 */
@SuppressWarnings("restriction")
public class NavigationBarButtonPresentation extends
		AbstractVaadinWidgetPresenter<Component> {

	private final ModelAccess modelAccess;
	private Button button;

	/**
	 * Constructor.
	 * 
	 * @param editpart
	 *            The editpart of that presenter
	 */
	public NavigationBarButtonPresentation(IElementEditpart editpart) {
		super((INavigationBarButtonEditpart) editpart);
		this.modelAccess = new ModelAccess(
				(VMNavigationBarButton) editpart.getModel());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Component doCreateWidget(Object parent) {
		if (button == null) {

			button = new Button();
			button.addStyleName(CSS_CLASS_CONTROL);
			button.setImmediate(true);
			setupComponent(button, getCastedModel());

			associateWidget(button, modelAccess.yField);

			if (modelAccess.isCssIdValid()) {
				button.setId(modelAccess.getCssID());
			} else {
				button.setId(getEditpart().getId());
			}

			// creates the binding for the field
			createBindings(modelAccess.yField, button);

			if (modelAccess.isCssClassValid()) {
				button.addStyleName(modelAccess.getCssClass());
			}

			applyCaptions();

		}
		return button;
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
	 * @param yField
	 * @param button
	 */
	protected void createBindings(final VMNavigationBarButton yField,
			Button button) {
		registerBinding(createBindingsButtonClick(
				castEObject(getModel()),
				VaadinMobilePackage.Literals.VM_NAVIGATION_BAR_BUTTON__LAST_CLICK_TIME,
				button));

		super.createBindings(yField, button, null);

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
		private final VMNavigationBarButton yField;

		public ModelAccess(VMNavigationBarButton yField) {
			super();
			this.yField = yField;
		}

		/**
		 * @return
		 * @see org.lunifera.ecview.core.ui.core.model.core.YCssAble#getCssClass()
		 */
		public String getCssClass() {
			return yField.getCssClass();
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
			return yField.getCssID();
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
			return yField.getDatadescription() != null ? yField
					.getDatadescription().getLabel() : null;
		}

		/**
		 * Returns the label.
		 * 
		 * @return
		 */
		public String getLabelI18nKey() {
			return yField.getDatadescription() != null ? yField
					.getDatadescription().getLabelI18nKey() : null;
		}
	}
}
