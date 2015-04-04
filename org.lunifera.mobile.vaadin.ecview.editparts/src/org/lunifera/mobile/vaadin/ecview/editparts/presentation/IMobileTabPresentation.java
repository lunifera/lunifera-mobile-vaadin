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
package org.lunifera.mobile.vaadin.ecview.editparts.presentation;

import org.lunifera.ecview.core.common.presentation.IWidgetPresentation;

/**
 * TabSheetPresentations are an abstraction above a tab an are responsible to
 * create the UI-Kit specific elements and to handle them. One important thing
 * to notice is, that the life cycle of presentations is handled by their edit
 * parts. And so an presentations must never dispose its tab presentations!
 * 
 * @param <C>
 */
public interface IMobileTabPresentation<C> extends IWidgetPresentation<C> {

}
