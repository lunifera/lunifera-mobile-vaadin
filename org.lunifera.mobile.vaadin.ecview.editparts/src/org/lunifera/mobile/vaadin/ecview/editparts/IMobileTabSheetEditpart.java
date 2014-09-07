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
package org.lunifera.mobile.vaadin.ecview.editparts;

import java.util.List;

import org.lunifera.ecview.core.common.editpart.IEmbeddableEditpart;

/**
 * The abstraction for a tab sheet.
 */
public interface IMobileTabSheetEditpart extends IEmbeddableEditpart {

	/**
	 * Returns an unmodifiable list with all tabs contained in the tabsheet.
	 * 
	 * @return elements The children editparts contained in this tabsheet
	 */
	List<IMobileTabEditpart> getTabs();

	/**
	 * Adds a tab to the tabsheet. Adding the same tab twice has no effect.
	 * 
	 * @param tab
	 *            The editpart to be added.
	 */
	void addTab(IMobileTabEditpart tab);

	/**
	 * Removes a tab from the tabsheet.
	 * 
	 * @param element
	 *            The editpart to be removed.
	 */
	void removeTab(IMobileTabEditpart tab);

	/**
	 * Renders the given tab.
	 * 
	 * @param mobileTabEditpart
	 */
	void renderTab(IMobileTabEditpart mobileTabEditpart);

	/**
	 * Disposes the given tab.
	 * 
	 * @param mobileTabEditpart
	 */
	void disposeTab(IMobileTabEditpart mobileTabEditpart);

	/**
	 * Unrenders the given tab.
	 * 
	 * @param mobileTabEditpart
	 */
	void unrenderTab(IMobileTabEditpart mobileTabEditpart);

}
