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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.lunifera.ecview.core.common.context.IViewContext;
import org.lunifera.ecview.core.common.presentation.ILayoutPresentation;
import org.lunifera.mobile.vaadin.ecview.editparts.IMobileTabEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.IMobileTabSheetEditpart;
import org.lunifera.mobile.vaadin.ecview.editparts.presentation.IMobileTabSheetPresentation;
import org.lunifera.mobile.vaadin.ecview.model.VMTabSheet;
import org.lunifera.runtime.web.ecview.presentation.vaadin.internal.AbstractVaadinWidgetPresenter;

import com.vaadin.ui.ComponentContainer;

/**
 * An abstract base class implementing {@link ILayoutPresentation}.
 */
@SuppressWarnings("restriction")
public abstract class AbstractTabSheetPresenter<A extends ComponentContainer>
		extends AbstractVaadinWidgetPresenter<A> implements
		IMobileTabSheetPresentation<A> {

	private List<IMobileTabEditpart> tabs;

	public AbstractTabSheetPresenter(IMobileTabSheetEditpart editpart) {
		super(editpart);
	}

	/**
	 * Returns the editpart the presenter will render for.
	 * 
	 * @return the editpart
	 */
	protected IMobileTabSheetEditpart getEditpart() {
		return (IMobileTabSheetEditpart) super.getEditpart();
	}

	@Override
	public VMTabSheet getModel() {
		return (VMTabSheet) getEditpart().getModel();
	}

	/**
	 * Returns the view context.
	 * 
	 * @return viewContext
	 */
	public IViewContext getViewContext() {
		return getEditpart().getView().getContext();
	}

	@Override
	public List<IMobileTabEditpart> getTabs() {
		return tabs != null ? Collections.unmodifiableList(tabs) : Collections
				.<IMobileTabEditpart> emptyList();
	}

	@Override
	public boolean contains(IMobileTabEditpart editpart) {
		return tabs != null && tabs.contains(editpart);
	}

	@Override
	public void add(IMobileTabEditpart editpart) {
		ensureChildren();

		if (!tabs.contains(editpart)) {
			tabs.add(editpart);

			internalAdd(editpart);
		}
	}

	/**
	 * This method is called after the presentation was successfully added to
	 * the children collection.<br>
	 * Subclasses should handle the add of the UI element in that method.
	 * 
	 * @param presentation
	 *            The presentation to be added
	 */
	protected void internalAdd(IMobileTabEditpart editpart) {

	}

	@Override
	public void remove(IMobileTabEditpart editpart) {
		if (tabs == null) {
			return;
		}

		if (tabs.remove(editpart)) {
			internalRemove(editpart);
		}
	}

	/**
	 * This method is called after the presentation was successfully removed
	 * from the children collection.<br>
	 * Subclasses should handle the unrendering of the UI element in that
	 * method.
	 * 
	 * @param presentation
	 *            The presentation to be removed
	 */
	protected void internalRemove(IMobileTabEditpart editpart) {

	}

	@Override
	public void insert(IMobileTabEditpart editpart, int index) {
		ensureChildren();

		int currentIndex = tabs.indexOf(editpart);
		if (currentIndex > -1 && currentIndex != index) {
			throw new RuntimeException(
					String.format(
							"Insert at index %d not possible since presentation already contained at index %d",
							index, currentIndex));
		}

		tabs.add(index, editpart);
		internalInsert(editpart, index);
	}

	/**
	 * This method is called after the presentation was successfully inserted to
	 * the children collection.<br>
	 * Subclasses should handle the insert of the UI element in that method.
	 * 
	 * @param presentation
	 *            The presentation to be inserted
	 * @param index
	 *            The index where the presentation should be inserted
	 */
	protected void internalInsert(IMobileTabEditpart editpart, int index) {

	}

	@Override
	public void move(IMobileTabEditpart editpart, int index) {
		if (tabs == null) {
			throw new RuntimeException(
					"Move not possible. No children present.");
		}

		if (!tabs.contains(editpart)) {
			throw new RuntimeException(
					String.format(
							"Move to index %d not possible since presentation not added yet!",
							index));
		}

		int currentIndex = tabs.indexOf(editpart);
		tabs.remove(editpart);
		tabs.add(index, editpart);

		internalMove(editpart, currentIndex, index);
	}

	/**
	 * This method is called after the presentation was successfully moved
	 * inside the children collection.<br>
	 * Subclasses should handle the move of the UI element in that method.
	 * 
	 * @param presentation
	 *            The presentation to be moved.
	 * @param oldIndex
	 *            The old index where the control was located.
	 * @param newIndex
	 *            The new index where the control should be located after the
	 *            move operation.
	 */
	protected void internalMove(IMobileTabEditpart editpart, int oldIndex,
			int newIndex) {

	}

	/**
	 * Ensures, that the children collection exists.
	 */
	protected void ensureChildren() {
		if (tabs == null) {
			tabs = new ArrayList<IMobileTabEditpart>();
		}
	}

	@Override
	protected void internalDispose() {
		try {
			if (tabs != null) {
				tabs.clear();
				tabs = null;
			}
		} finally {

		}
	}
}
