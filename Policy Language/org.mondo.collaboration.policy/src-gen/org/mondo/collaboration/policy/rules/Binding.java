/**
 * generated by Xtext 2.11.0
 */
package org.mondo.collaboration.policy.rules;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.viatra.query.patternlanguage.patternLanguage.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mondo.collaboration.policy.rules.Binding#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.mondo.collaboration.policy.rules.Binding#getBind <em>Bind</em>}</li>
 * </ul>
 *
 * @see org.mondo.collaboration.policy.rules.RulesPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(Variable)
   * @see org.mondo.collaboration.policy.rules.RulesPackage#getBinding_Variable()
   * @model
   * @generated
   */
  Variable getVariable();

  /**
   * Sets the value of the '{@link org.mondo.collaboration.policy.rules.Binding#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variable value);

  /**
   * Returns the value of the '<em><b>Bind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bind</em>' attribute.
   * @see #setBind(String)
   * @see org.mondo.collaboration.policy.rules.RulesPackage#getBinding_Bind()
   * @model
   * @generated
   */
  String getBind();

  /**
   * Sets the value of the '{@link org.mondo.collaboration.policy.rules.Binding#getBind <em>Bind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bind</em>' attribute.
   * @see #getBind()
   * @generated
   */
  void setBind(String value);

} // Binding
