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

import org.eclipse.emf.ecp.ecview.common.context.II18nService;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IButtonEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.INavigationButtonEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.INavigationPageEditpart;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationButton;
import org.lunifera.runtime.web.ecview.presentation.vaadin.internal.AbstractVaadinWidgetPresenter;

import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.ui.Component;
import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.CssLayout;

/**
 * This presenter is responsible to render a text field on the given layout.
 */
@SuppressWarnings("restriction")
public class NavigationButtonPresentation extends
		AbstractVaadinWidgetPresenter<Component> {

	private final ModelAccess modelAccess;
	private CssLayout componentBase;
	private NavigationButton button;

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
		if (componentBase == null) {
			componentBase = new CssLayout();
			componentBase.addStyleName(CSS_CLASS_CONTROL_BASE);
			if (modelAccess.isCssIdValid()) {
				componentBase.setId(modelAccess.getCssID());
			} else {
				componentBase.setId(getEditpart().getId());
			}

			associateWidget(componentBase, modelAccess.vmNavigationButton);
			button = new NavigationButton() {
				public void click() {
					// lazy loading of target view
					if (isEnabled() && !isReadOnly()) {
						Component targetView = loadTargetPage();
						if (targetView != null) {
							getNavigationManager().navigateTo(targetView);
						}
						fireClick();
					}
				}
			};
			button.addStyleName(CSS_CLASS_CONTROL);
			button.setImmediate(true);

			associateWidget(button, modelAccess.vmNavigationButton);

			// creates the binding for the field
			createBindings(modelAccess.vmNavigationButton, button);

			componentBase.addComponent(button);

			if (modelAccess.isCssClassValid()) {
				button.addStyleName(modelAccess.getCssClass());
			}

			applyCaptions();

		}
		return componentBase;
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
		II18nService service = getI18nService();
		if (service != null && modelAccess.isLabelI18nKeyValid()) {
			button.setCaption(service.getValue(modelAccess.getLabelI18nKey(),
					getLocale()));
		} else {
			if (modelAccess.isLabelValid()) {
				button.setCaption(modelAccess.getLabel());
			}
		}
	}

	/**
	 * Creates the bindings for the given values.
	 * 
	 * @param vmNavigationButton
	 * @param button
	 */
	protected void createBindings(final VMNavigationButton vmNavigationButton,
			NavigationButton button) {
		super.createBindings(vmNavigationButton, button, componentBase);
	}

	@Override
	public Component getWidget() {
		return componentBase;
	}

	@Override
	public boolean isRendered() {
		return componentBase != null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void doUnrender() {
		if (componentBase != null) {

			// unbind all active bindings
			unbind();

			ComponentContainer parent = ((ComponentContainer) componentBase
					.getParent());
			if (parent != null) {
				parent.removeComponent(componentBase);
			}

			// remove assocations
			unassociateWidget(componentBase);
			unassociateWidget(button);

			componentBase = null;
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
		private final VMNavigationButton vmNavigationButton;

		public ModelAccess(VMNavigationButton vmNavigationButton) {
			super();
			this.vmNavigationButton = vmNavigationButton;
		}

		/**
		 * @return
		 * @see org.eclipse.emf.ecp.ecview.ui.core.model.core.YCssAble#getCssClass()
		 */
		public String getCssClass() {
			return vmNavigationButton.getCssClass();
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
		 * @see org.eclipse.emf.ecp.ecview.ui.core.model.core.YCssAble#getCssID()
		 */
		public String getCssID() {
			return vmNavigationButton.getCssID();
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
		 * Returns true, if the label is valid.
		 * 
		 * @return
		 */
		public boolean isLabelValid() {
			return vmNavigationButton.getDatadescription() != null
					&& vmNavigationButton.getDatadescription().getLabel() != null;
		}

		/**
		 * Returns the label.
		 * 
		 * @return
		 */
		public String getLabel() {
			return vmNavigationButton.getDatadescription().getLabel();
		}

		/**
		 * Returns true, if the label is valid.
		 * 
		 * @return
		 */
		public boolean isLabelI18nKeyValid() {
			return vmNavigationButton.getDatadescription() != null
					&& vmNavigationButton.getDatadescription()
							.getLabelI18nKey() != null;
		}

		/**
		 * Returns the label.
		 * 
		 * @return
		 */
		public String getLabelI18nKey() {
			return vmNavigationButton.getDatadescription().getLabelI18nKey();
		}
	}
}
