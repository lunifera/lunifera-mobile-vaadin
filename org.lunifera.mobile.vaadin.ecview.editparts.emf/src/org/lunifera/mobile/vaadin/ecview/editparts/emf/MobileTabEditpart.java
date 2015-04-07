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

import org.lunifera.ecview.core.common.editpart.IViewEditpart;
import org.lunifera.ecview.core.common.editpart.emf.ElementEditpart;
import org.lunifera.ecview.core.common.editpart.emf.EmbeddableEditpart;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.core.common.presentation.DelegatingPresenterFactory;
import org.lunifera.ecview.core.common.presentation.IWidgetPresentation;
import org.lunifera.mobile.vaadin.ecview.editparts.IMobileTabEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.IMobileTabSheetEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.presentation.IMobileTabPresentation;
import org.lunifera.mobile.vaadin.ecview.model.VMTab;
import org.lunifera.mobile.vaadin.ecview.model.VMTabSheet;
import org.lunifera.mobile.vaadin.ecview.model.VaadinMobileFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MobileTabEditpart extends ElementEditpart<VMTab> implements IMobileTabEditpart {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(EmbeddableEditpart.class);
	private IMobileTabPresentation<?> presentation;

	/**
	 * The default constructor.
	 */
	protected MobileTabEditpart() {
	}

	@Override
	protected VMTab createModel() {
		return (VMTab) VaadinMobileFactory.eINSTANCE.createVMTab();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IMobileTabSheetEditpart getParent() {
		VMTabSheet yParent = getModel().getParent();
		return yParent != null ? (IMobileTabSheetEditpart) getEditpart(yParent)
				: null;
	}

	@Override
	public IViewEditpart getView() {
		YView yView = getModel().getView();
		return yView != null ? (IViewEditpart) getEditpart(yView) : null;
	}

	/**
	 * Returns the instance of the presentation, but does not load it.
	 * 
	 * @param <A>
	 *            An instance of {@link IWidgetPresentation}
	 * @return presentation
	 */
	@SuppressWarnings("unchecked")
	protected <A extends IWidgetPresentation<?>> A internalGetPresentation() {
		return (A) presentation;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IMobileTabPresentation<?>> A getPresentation() {
		if (presentation == null) {
			presentation = createPresenter();
		}
		return (A) presentation;
	}

	/**
	 * Is called to created the presenter for this edit part.
	 */
	protected <A extends IWidgetPresentation<?>> A createPresenter() {
		IViewEditpart viewEditPart = getView();
		if (viewEditPart == null) {
			LOGGER.info("View is null");
			return null;
		}
		return DelegatingPresenterFactory.getInstance().createPresentation(
				viewEditPart.getContext(), this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void internalDispose() {
		try {
			// if directly attached to a view, then remove it
			IMobileTabSheetEditpart parent = getParent();
			if (parent != null) {
				parent.removeTab(this);
			}

			// dispose the presenter
			//
			if (presentation != null) {
				presentation.dispose();
				presentation = null;
			}

		} finally {
			super.internalDispose();
		}
	}
	
	@Override
	public void requestRender() {
		if (getParent() != null) {
			getParent().renderTab(this);
		} else {
			unrender();
		}
	}

	@Override
	public Object render(Object parentWidget) {
		return getPresentation().createWidget(parentWidget);
	}

	@Override
	public void requestUnrender() {
		if (getParent() != null) {
			getParent().unrenderTab(this);
		} else {
			unrender();
		}
	}

	@Override
	public void unrender() {
		getPresentation().unrender();
	}

	@Override
	public boolean isRendered() {
		return internalGetPresentation() != null
				&& internalGetPresentation().isRendered();
	}

	@Override
	public Object getWidget() {
		return getPresentation().getWidget();
	}

	@Override
	public void requestDispose() {
		if (getParent() != null) {
			getParent().disposeTab(this);
		} else {
			dispose();
		}
	}

}
