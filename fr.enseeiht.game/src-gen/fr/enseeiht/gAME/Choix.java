/**
 * generated by Xtext 2.17.1
 */
package fr.enseeiht.gAME;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.enseeiht.gAME.Choix#getName <em>Name</em>}</li>
 *   <li>{@link fr.enseeiht.gAME.Choix#getActions <em>Actions</em>}</li>
 *   <li>{@link fr.enseeiht.gAME.Choix#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @see fr.enseeiht.gAME.GAMEPackage#getChoix()
 * @model
 * @generated
 */
public interface Choix extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.enseeiht.gAME.GAMEPackage#getChoix_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.enseeiht.gAME.Choix#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link fr.enseeiht.gAME.Action}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see fr.enseeiht.gAME.GAMEPackage#getChoix_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActions();

  /**
   * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
   * The list contents are of type {@link fr.enseeiht.gAME.Condition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions</em>' containment reference list.
   * @see fr.enseeiht.gAME.GAMEPackage#getChoix_Conditions()
   * @model containment="true"
   * @generated
   */
  EList<Condition> getConditions();

} // Choix
