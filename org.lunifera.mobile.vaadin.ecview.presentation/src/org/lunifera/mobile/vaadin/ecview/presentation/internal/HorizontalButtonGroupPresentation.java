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

import java.util.Locale;

import org.lunifera.ecview.core.common.editpart.IElementEditpart;
import org.lunifera.ecview.core.common.editpart.IEmbeddableEditpart;
import org.lunifera.ecview.core.common.editpart.ILayoutEditpart;
import org.lunifera.mobile.vaadin.ecview.model.VMHorizontalButtonGroup;
import org.lunifera.runtime.web.ecview.presentation.vaadin.internal.AbstractLayoutPresenter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vaadin.addon.touchkit.ui.HorizontalButtonGroup;
import com.vaadin.ui.Component;
import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.CssLayout;

/**
 * This presenter is responsible to render a text field on the given layout.
 */
@SuppressWarnings("restriction")
public class HorizontalButtonGroupPresentation extends
		AbstractLayoutPresenter<ComponentContainer> {

	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory
			.getLogger(HorizontalButtonGroupPresentation.class);

	private CssLayout componentBase;
	private HorizontalButtonGroup horizontalLayout;
	private ModelAccess modelAccess;

	/**
	 * The constructor.
	 * 
	 * @param editpart
	 *            The editpart of that editpart.
	 */
	public HorizontalButtonGroupPresentation(IElementEditpart editpart) {
		super((ILayoutEditpart) editpart);
		this.modelAccess = new ModelAccess(
				(VMHorizontalButtonGroup) editpart.getModel());
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
	 * Is called to refresh the UI. The element will be removed from the layout
	 * and added to it again afterwards.
	 */
	protected void refreshUI() {
		horizontalLayout.removeAllComponents();

		// iterate all elements and build the child element
		//
		for (IEmbeddableEditpart child : getChildren()) {
			addChild(child);
		}

	}

	/**
	 * Is called to create the child component and apply layouting defaults to
	 * it.
	 * 
	 * @param editpart
	 * @param yStyle
	 * @return
	 */
	protected void addChild(IEmbeddableEditpart editpart) {

		Component child = (Component) editpart.render(horizontalLayout);

		horizontalLayout.addComponent(child);
	}

	@Override
	public ComponentContainer doCreateWidget(Object parent) {
		if (componentBase == null) {
			componentBase = new CssLayout();
			componentBase.addStyleName(CSS_CLASS_CONTROL_BASE);
			componentBase.setImmediate(true);

			if (modelAccess.isCssIdValid()) {
				componentBase.setId(modelAccess.getCssID());
			} else {
				componentBase.setId(getEditpart().getId());
			}

			associateWidget(componentBase, modelAccess.yLayout);

			horizontalLayout = new HorizontalButtonGroup();
			componentBase.addComponent(horizontalLayout);

			associateWidget(horizontalLayout, modelAccess.yLayout);

			if (modelAccess.isCssClassValid()) {
				horizontalLayout.addStyleName(modelAccess.getCssClass());
			} else {
				horizontalLayout.addStyleName(CSS_CLASS_CONTROL);
			}

			// creates the binding for the field
			createBindings(modelAccess.yLayout, horizontalLayout, componentBase);

			// initialize all children
			initializeChildren();

			// and now render children
			renderChildren(false);
		}

		return componentBase;
	}

	/**
	 * Adds the children to the superclass and prevents rendering.
	 */
	private void initializeChildren() {
		setRenderLock(true);
		try {
			for (IEmbeddableEditpart editPart : getEditpart().getElements()) {
				super.add(editPart);
			}
		} finally {
			setRenderLock(false);
		}
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

			// remove assocations
			unassociateWidget(componentBase);
			unassociateWidget(horizontalLayout);

			horizontalLayout.removeAllComponents();
			componentBase = null;
			horizontalLayout = null;
		}
	}

	@Override
	protected void internalAdd(IEmbeddableEditpart editpart) {
		addChild(editpart);
	}

	@Override
	protected void internalRemove(IEmbeddableEditpart child) {
		if (horizontalLayout != null && child.isRendered()) {
			// will happen during disposal since children already disposed.
			horizontalLayout.removeComponent((Component) child.getWidget());
		}

		child.unrender();
	}

	@Override
	protected void internalInsert(IEmbeddableEditpart editpart, int index) {
		refreshUI();
	}

	@Override
	protected void internalMove(IEmbeddableEditpart editpart, int oldIndex,
			int newIndex) {
		refreshUI();
	}

	@Override
	public void renderChildren(boolean force) {
		if (force) {
			unrenderChildren();
		}

		refreshUI();
	}

	/**
	 * Will unrender all children.
	 */
	protected void unrenderChildren() {
		for (IEmbeddableEditpart editpart : getChildren()) {
			if (editpart.isRendered()) {
				editpart.unrender();
			}
		}
	}

	/**
	 * An internal helper class.
	 */
	private static class ModelAccess {
		private final VMHorizontalButtonGroup yLayout;

		public ModelAccess(VMHorizontalButtonGroup yLayout) {
			super();
			this.yLayout = yLayout;
		}

		/**
		 * @return
		 * @see org.lunifera.ecview.core.ui.core.model.core.YCssAble#getCssClass()
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
		 * @see org.lunifera.ecview.core.ui.core.model.core.YCssAble#getCssID()
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
