/**
 * generated by Xtext 2.10.0
 */
package org.mondo.collaboration.policy;

import org.mondo.collaboration.policy.RulesStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class RulesStandaloneSetup extends RulesStandaloneSetupGenerated {
  public static void doSetup() {
    RulesStandaloneSetup _rulesStandaloneSetup = new RulesStandaloneSetup();
    _rulesStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
