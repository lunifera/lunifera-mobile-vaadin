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
package org.lunifera.mobile.vaadin.ecview.presentation.internal;

import java.util.Locale;

import org.lunifera.ecview.core.common.context.II18nService;
import org.lunifera.ecview.core.common.editpart.IElementEditpart;
import org.lunifera.ecview.core.common.editpart.IEmbeddableEditpart;
import org.lunifera.ecview.core.common.editpart.emf.ElementEditpart;
import org.lunifera.ecview.core.common.presentation.IWidgetPresentation;
import org.lunifera.mobile.vaadin.ecview.editparts.IMobileTabEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.presentation.IMobileTabPresentation;
import org.lunifera.mobile.vaadin.ecview.model.VMTab;

import com.vaadin.addon.touchkit.ui.TabBarView;
import com.vaadin.ui.Component;
import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.TabSheet.Tab;

/**
 * This presenter is responsible to render a tab sheet on the given layout.
 */
public class MobileTabPresentation extends AbstractTabPresenter<Component>
		implements IMobileTabPresentation<Component> {

	private CssLayout tabContent;
	private Tab tab;
	private ModelAccess modelAccess;
	private SwipingNavigationManager navManager;

	/**
	 * The constructor.
	 * 
	 * @param editpart
	 *            The editpart of that presentation.
	 */
	public MobileTabPresentation(IElementEditpart editpart) {
		super((IMobileTabEditpart) editpart);
		this.modelAccess = new ModelAccess((VMTab) editpart.getModel());
	}

	@Override
	public Component createWidget(Object parent) {
		TabBarView tabSheet = (TabBarView) parent;

		VMTab yTab = (VMTab) getModel();
		IEmbeddableEditpart childEditpart = ElementEditpart.getEditpart(yTab
				.getEmbeddable());

		if (childEditpart == null) {
			CssLayout childLayout = new CssLayout();
			tab = tabSheet.addTab(childLayout, "content missing");
			return childLayout;
		} else {
			navManager = new SwipingNavigationManager();
			Component childContent = (Component) childEditpart
					.render(navManager);
			navManager.addComponent(childContent);
			navManager.setCurrentComponent(childContent);
			tab = tabSheet.addTab(navManager);
			if (modelAccess.isLabelValid()) {
				tab.setCaption(modelAccess.getLabel());
			}
		}

		applyCaptions();

		return null;
	}

	@Override
	protected void doUpdateLocale(Locale locale) {
		// update the captions
		applyCaptions();
	}

	/**
	 * Applies the labels to the widgets.
	 */
	protected void applyCaptions() {
		II18nService service = getI18nService();
		if (service != null && modelAccess.isLabelI18nKeyValid()) {
			tab.setCaption(service.getValue(modelAccess.getLabelI18nKey(),
					getLocale()));
		} else {
			if (modelAccess.isLabelValid()) {
				tab.setCaption(modelAccess.getLabel());
			}
		}
	}

	@Override
	public ComponentContainer getWidget() {
		return tabContent;
	}

	@Override
	public boolean isRendered() {
		return tabContent != null;
	}

	@Override
	protected void internalDispose() {
		try {
			unrender();
		} finally {
			super.internalDispose();
		}
	}

	@Override
	public void unrender() {
		if (tab != null) {

			// unbind all active bindings
			unbind();

			VMTab yTab = (VMTab) getModel();
			IEmbeddableEditpart editpart = ElementEditpart.getEditpart(yTab
					.getEmbeddable());

			IWidgetPresentation<Component> childPresentation = editpart
					.getPresentation();
			childPresentation.unrender();
		}
	}

	/**
	 * An internal helper class.
	 */
	private static class ModelAccess {
		private final VMTab yTab;

		public ModelAccess(VMTab yTab) {
			super();
			this.yTab = yTab;
		}

		/**
		 * @return
		 * @see org.lunifera.ecview.core.ui.core.model.core.YCssAble#getCssClass()
		 */
		public String getCssClass() {
			return yTab.getCssClass();
		}

		/**
		 * Returns true, if the css class is not null and not empty.
		 * 
		 * @return
		 */
		@SuppressWarnings("unused")
		public boolean isCssClassValid() {
			return getCssClass() != null && !getCssClass().equals("");
		}

		/**
		 * @return
		 * @see org.lunifera.ecview.core.ui.core.model.core.YCssAble#getCssID()
		 */
		public String getCssID() {
			return yTab.getCssID();
		}

		/**
		 * Returns true, if the css id is not null and not empty.
		 * 
		 * @return
		 */
		@SuppressWarnings("unused")
		public boolean isCssIdValid() {
			return getCssID() != null && !getCssID().equals("");
		}

		/**
		 * Returns true, if the label is valid.
		 * 
		 * @return
		 */
		public boolean isLabelValid() {
			return yTab.getDatadescription() != null
					&& yTab.getDatadescription().getLabel() != null;
		}

		/**
		 * Returns the label.
		 * 
		 * @return
		 */
		public String getLabel() {
			return yTab.getDatadescription().getLabel();
		}

		/**
		 * Returns true, if the label is valid.
		 * 
		 * @return
		 */
		public boolean isLabelI18nKeyValid() {
			return yTab.getDatadescription() != null
					&& yTab.getDatadescription().getLabelI18nKey() != null;
		}

		/**
		 * Returns the label.
		 * 
		 * @return
		 */
		public String getLabelI18nKey() {
			return yTab.getDatadescription().getLabelI18nKey();
		}
	}
}
