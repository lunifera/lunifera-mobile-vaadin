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

import org.lunifera.ecview.core.common.editpart.IActionEditpart;

/**
 * The abstraction for a mobile navigation button.
 */
public interface INavigationButtonEditpart extends IActionEditpart {

	/**
	 * Returns the page the button should navigate to.
	 * 
	 * @return
	 */
	INavigationPageEditpart getPage();

}
