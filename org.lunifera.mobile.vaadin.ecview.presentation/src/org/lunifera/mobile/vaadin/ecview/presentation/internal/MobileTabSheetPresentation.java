/**
 * Copyright (c) 2011 - 2014, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 * 		Florian Pirchner - Initial implementation
 */
package org.lunifera.mobile.vaadin.ecview.presentation.internal;

import java.util.Iterator;
import java.util.Locale;

import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.IMobileTabEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.IMobileTabSheetEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.presentation.IMobileTabPresentation;
import org.lunifera.mobile.vaadin.ecview.editparts.presentation.IMobileTabSheetPresentation;
import org.lunifera.mobile.vaadin.ecview.model.VMTabSheet;

import com.vaadin.addon.touchkit.ui.TabBarView;
import com.vaadin.addon.touchkit.ui.Toolbar;
import com.vaadin.ui.Component;
import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.CssLayout;

/**
 * This presenter is responsible to render a tab sheet on the given layout.
 */
@SuppressWarnings("restriction")
public class MobileTabSheetPresentation extends
		AbstractTabSheetPresenter<ComponentContainer> implements
		IMobileTabSheetPresentation<ComponentContainer> {

	private CssLayout componentBase;
	private TabBarView tabSheet;
	private ModelAccess modelAccess;

	/**
	 * The constructor.
	 * 
	 * @param editpart
	 *            The editpart of that presentation.
	 */
	public MobileTabSheetPresentation(IElementEditpart editpart) {
		super((IMobileTabSheetEditpart) editpart);
		this.modelAccess = new ModelAccess((VMTabSheet) editpart.getModel());
	}

	@Override
	public void add(IMobileTabEditpart editpart) {
		super.add(editpart);

		addTab(editpart);
	}

	@Override
	public void remove(IMobileTabEditpart editpart) {
		super.remove(editpart);
		
		if(editpart.isRendered()){
			tabSheet.removeComponent((Component) editpart.getWidget());
		}
	}

	@Override
	public void insert(IMobileTabEditpart editpart, int index) {
		super.insert(editpart, index);

		refreshUI();
	}

	@Override
	public void move(IMobileTabEditpart editpart, int index) {
		super.move(editpart, index);

		refreshUI();
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
	}

	/**
	 * Is called to refresh the UI. The element will be removed from the grid
	 * layout and added to it again afterwards.
	 */
	protected void refreshUI() {
		// first element is toolbar
		if (tabSheet.getComponentCount() > 1) {
			Iterator<Component> children = tabSheet.iterator();
			while (children.hasNext()) {
				Component comp = children.next();
				if (comp instanceof Toolbar) {
					continue;
				}
				tabSheet.removeTab(comp);
			}
		}
 
		// iterate all elements and build the tab element
		//
		for (IMobileTabEditpart editPart : getEditpart().getTabs()) {
			addTab(editPart);
		}

	}

	/**
	 * Is called to create the tab component and apply layouting defaults to it.
	 * 
	 * @param presentation
	 */
	protected void addTab(IMobileTabEditpart editpart) {
		editpart.render(tabSheet);
	}

	@Override
	public ComponentContainer doCreateWidget(Object parent) {
		if (componentBase == null) {
			componentBase = new CssLayout();
			componentBase.setSizeFull();
			componentBase.addStyleName(CSS_CLASS_CONTROL_BASE);
			if (modelAccess.isCssIdValid()) {
				componentBase.setId(modelAccess.getCssID());
			} else {
				componentBase.setId(getEditpart().getId());
			}

			associateWidget(componentBase, modelAccess.yLayout);

			tabSheet = new TabBarView();
			componentBase.addComponent(tabSheet);

			associateWidget(tabSheet, modelAccess.yLayout);

			if (modelAccess.isCssClassValid()) {
				tabSheet.addStyleName(modelAccess.getCssClass());
			} else {
				tabSheet.addStyleName(CSS_CLASS_CONTROL);
			}

			renderTabs(false);
		}

		return componentBase;
	}

	@Override
	public ComponentContainer getWidget() {
		return componentBase;
	}

	@Override
	public boolean isRendered() {
		return componentBase != null;
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
			unassociateWidget(tabSheet);

			componentBase = null;
			tabSheet = null;

			// unrender the tabs
			for (IMobileTabEditpart tab : getTabs()) {
				tab.unrender();
			}
		}
	}

	@Override
	public void renderTabs(boolean force) {
		if (force) {
			unrenderTabs();
		}

		refreshUI();
	}

	/**
	 * Will unrender all tabs.
	 */
	protected void unrenderTabs() {
		for (IMobileTabEditpart editpart : getTabs()) {
			if (editpart.isRendered()) {
				editpart.unrender();

			}
		}
	}

	/**
	 * An internal helper class.
	 */
	private static class ModelAccess {
		private final VMTabSheet yLayout;

		public ModelAccess(VMTabSheet yLayout) {
			super();
			this.yLayout = yLayout;
		}

		/**
		 * @return
		 * @see org.eclipse.emf.ecp.ecview.ui.core.model.core.YCssAble#getCssClass()
		 */
		public String getCssClass() {
			return yLayout.getCssClass();
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
			return yLayout.getCssID();
		}

		/**
		 * Returns true, if the css id is not null and not empty.
		 * 
		 * @return
		 */
		public boolean isCssIdValid() {
			return getCssID() != null && !getCssID().equals("");
		}
	}
}
