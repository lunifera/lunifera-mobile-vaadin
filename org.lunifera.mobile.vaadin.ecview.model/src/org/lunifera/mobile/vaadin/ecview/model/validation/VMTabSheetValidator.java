/**
 *
 * $Id$
 */
package org.lunifera.mobile.vaadin.ecview.model.validation;

import org.eclipse.emf.common.util.EList;

import org.lunifera.mobile.vaadin.ecview.model.VMTab;

/**
 * A sample validator interface for {@link org.lunifera.mobile.vaadin.ecview.model.VMTabSheet}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface VMTabSheetValidator {
	boolean validate();

	boolean validateTabs(EList<VMTab> value);
}
