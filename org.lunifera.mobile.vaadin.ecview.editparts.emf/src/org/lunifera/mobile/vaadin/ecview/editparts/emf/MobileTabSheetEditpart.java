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
package org.lunifera.mobile.vaadin.ecview.editparts.emf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.lunifera.ecview.core.common.editpart.emf.EmbeddableEditpart;
import org.lunifera.ecview.core.common.editpart.emf.LayoutEditpart;
import org.lunifera.ecview.core.common.editpart.validation.IValidatorEditpart;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage;
import org.lunifera.mobile.vaadin.ecview.editparts.IMobileTabEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.IMobileTabSheetEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.presentation.IMobileTabSheetPresentation;
import org.lunifera.mobile.vaadin.ecview.model.VMTab;
import org.lunifera.mobile.vaadin.ecview.model.VMTabSheet;
import org.lunifera.mobile.vaadin.ecview.model.VaadinMobileFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MobileTabSheetEditpart extends EmbeddableEditpart<VMTabSheet>
		implements IMobileTabSheetEditpart {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(LayoutEditpart.class);
	private List<IMobileTabEditpart> tabEditparts;

	/**
	 * Default constructor.
	 */
	public MobileTabSheetEditpart() {

	}

	@Override
	protected VMTabSheet createModel() {
		return VaadinMobileFactory.eINSTANCE.createVMTabSheet();
	}

	@Override
	public List<IMobileTabEditpart> getTabs() {
		if (tabEditparts == null) {
			internalLoadTabs();
		}
		return Collections.unmodifiableList(tabEditparts);
	}

	@Override
	protected void internalDispose() {
		try {
			// lazy loading: edit parts also have to be disposed if they have
			// not been loaded yet,
			// but exist in the model.
			if (tabEditparts != null || getModel().getTabs().size() > 0) {
				List<IMobileTabEditpart> tempElements = getTabs();
				synchronized (tabEditparts) {
					for (IMobileTabEditpart editpart : tempElements
							.toArray(new IMobileTabEditpart[tempElements.size()])) {
						editpart.dispose();
					}
				}
				tabEditparts = null;
			}
		} finally {
			super.internalDispose();
		}
	}

	@Override
	public void addTab(IMobileTabEditpart element) {
		try {
			checkDisposed();

			// add the element by using the model
			//
			VMTabSheet yLayout = getModel();
			VMTab yTab = (VMTab) element.getModel();
			yLayout.getTabs().add(yTab);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	@Override
	public void removeTab(IMobileTabEditpart element) {
		try {
			checkDisposed();

			// remove the element by using the model
			//
			VMTabSheet yLayout = getModel();
			VMTab yTab = (VMTab) element.getModel();
			yLayout.getTabs().remove(yTab);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	protected void handleModelAdd(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case ExtensionModelPackage.YTAB_SHEET__TABS:
			VMTab yTab = (VMTab) notification.getNewValue();

			IMobileTabEditpart editPart = (IMobileTabEditpart) getEditpart(yTab);
			internalAddElement(editPart);

			// handle the presentation
			//
			if (isPresentationPresent()) {
				IMobileTabSheetPresentation<?> presenter = getPresentation();
				int index = notification.getPosition();
				if (index < 0 || index >= getTabs().size() - 1) {
					presenter.add(editPart);
				} else {
					presenter.insert(editPart, index);
				}
			}
			break;
		default:
			break;
		}
	}

	@Override
	protected void handleModelMove(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case ExtensionModelPackage.YTAB_SHEET__TABS:
			VMTab yTab = (VMTab) notification.getNewValue();

			IMobileTabEditpart editPart = (IMobileTabEditpart) getEditpart(yTab);
			internalMoveTab(editPart, notification.getPosition());

			// handle the presentation
			//
			if (isPresentationPresent()) {
				IMobileTabSheetPresentation<?> presenter = getPresentation();
				presenter.move(editPart, notification.getPosition());
			}
			break;
		default:
			break;
		}
	}

	/**
	 * Returns true, if the presenter is present.
	 * 
	 * @return
	 */
	private boolean isPresentationPresent() {
		return internalGetPresentation() != null;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void handleModelRemove(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case ExtensionModelPackage.YTAB_SHEET__TABS:
			VMTab yTab = (VMTab) notification.getOldValue();

			IMobileTabEditpart editPart = (IMobileTabEditpart) getEditpart(yTab);
			internalRemoveTab(editPart);

			// handle the presentation
			//
			if (isPresentationPresent()) {
				IMobileTabSheetPresentation<?> presenter = getPresentation();
				presenter.remove(editPart);
			}
			break;
		default:
			break;
		}
	}

	/**
	 * Is called to change the internal state and add the given editpart to the
	 * list of tabs.
	 * 
	 * @param editpart
	 *            The editpart to be added
	 */
	protected void internalAddElement(IMobileTabEditpart editpart) {
		checkDisposed();

		if (tabEditparts == null) {
			internalLoadTabs();
		}
		if (!tabEditparts.contains(editpart)) {
			tabEditparts.add(editpart);
		}
	}

	/**
	 * Is called to change the internal state and to move the given editpart in
	 * the list of tabs.
	 * 
	 * @param editpart
	 *            The editpart to be inserted
	 * @param index
	 *            The index to move the element.
	 */
	protected void internalMoveTab(IMobileTabEditpart editpart, int index) {
		checkDisposed();

		if (tabEditparts == null) {
			internalLoadTabs();
		} else if (!tabEditparts.contains(editpart)) {
			throw new RuntimeException(String.format(
					"Editpart %s is not contained in tabs", editpart.getId()));
		} else {
			tabEditparts.remove(editpart);
			tabEditparts.add(index, editpart);
		}
	}

	/**
	 * Is called to change the internal state and remove the given editpart from
	 * the list of tabs.
	 * 
	 * @param editpart
	 *            The editpart to be removed
	 */
	protected void internalRemoveTab(IMobileTabEditpart editpart) {
		checkDisposed();

		if (tabEditparts != null && editpart != null) {
			tabEditparts.remove(editpart);
		}
	}

	/**
	 * Is called to load and initialize all tabs.
	 */
	protected void internalLoadTabs() {
		checkDisposed();

		if (tabEditparts == null) {
			tabEditparts = new ArrayList<IMobileTabEditpart>();
			for (VMTab yTab : getModel().getTabs()) {
				IMobileTabEditpart editPart = getEditpart(yTab);
				internalAddElement(editPart);
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public IMobileTabSheetPresentation<?> getPresentation() {
		return super.getPresentation();
	}

	@Override
	public List<IValidatorEditpart> getDatatypeValidators() {
		return Collections.emptyList();
	}

	@Override
	public void renderTab(IMobileTabEditpart mobileTabEditpart) {
		getPresentation().add(mobileTabEditpart);
	}

	@Override
	public void disposeTab(IMobileTabEditpart mobileTabEditpart) {
		getPresentation().remove(mobileTabEditpart);
		mobileTabEditpart.dispose();
	}

	@Override
	public void unrenderTab(IMobileTabEditpart mobileTabEditpart) {
		getPresentation().remove(mobileTabEditpart);
	}
}
