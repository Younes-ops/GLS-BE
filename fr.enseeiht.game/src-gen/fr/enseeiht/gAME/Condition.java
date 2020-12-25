/**
 * generated by Xtext 2.17.1
 */
package fr.enseeiht.gAME;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.enseeiht.gAME.Condition#getName <em>Name</em>}</li>
 *   <li>{@link fr.enseeiht.gAME.Condition#getObjets <em>Objets</em>}</li>
 *   <li>{@link fr.enseeiht.gAME.Condition#getConnaissances <em>Connaissances</em>}</li>
 * </ul>
 *
 * @see fr.enseeiht.gAME.GAMEPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.enseeiht.gAME.GAMEPackage#getCondition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.enseeiht.gAME.Condition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Objets</b></em>' reference list.
   * The list contents are of type {@link fr.enseeiht.gAME.Objet}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objets</em>' reference list.
   * @see fr.enseeiht.gAME.GAMEPackage#getCondition_Objets()
   * @model
   * @generated
   */
  EList<Objet> getObjets();

  /**
   * Returns the value of the '<em><b>Connaissances</b></em>' reference list.
   * The list contents are of type {@link fr.enseeiht.gAME.Connaissance}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connaissances</em>' reference list.
   * @see fr.enseeiht.gAME.GAMEPackage#getCondition_Connaissances()
   * @model
   * @generated
   */
  EList<Connaissance> getConnaissances();

} // Condition
