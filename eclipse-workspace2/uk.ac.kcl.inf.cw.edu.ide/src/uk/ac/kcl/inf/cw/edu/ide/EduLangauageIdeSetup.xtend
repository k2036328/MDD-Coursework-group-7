/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.cw.edu.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import uk.ac.kcl.inf.cw.edu.EduLangauageRuntimeModule
import uk.ac.kcl.inf.cw.edu.EduLangauageStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class EduLangauageIdeSetup extends EduLangauageStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new EduLangauageRuntimeModule, new EduLangauageIdeModule))
	}
	
}
