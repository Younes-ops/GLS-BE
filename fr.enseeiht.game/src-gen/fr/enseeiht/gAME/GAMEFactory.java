/**
 * generated by Xtext 2.17.1
 */
package fr.enseeiht.gAME;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.enseeiht.gAME.GAMEPackage
 * @generated
 */
public interface GAMEFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GAMEFactory eINSTANCE = fr.enseeiht.gAME.impl.GAMEFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Jeu</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Jeu</em>'.
   * @generated
   */
  Jeu createJeu();

  /**
   * Returns a new object of class '<em>Chemin</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chemin</em>'.
   * @generated
   */
  Chemin createChemin();

  /**
   * Returns a new object of class '<em>Personne</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Personne</em>'.
   * @generated
   */
  Personne createPersonne();

  /**
   * Returns a new object of class '<em>Interaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interaction</em>'.
   * @generated
   */
  Interaction createInteraction();

  /**
   * Returns a new object of class '<em>Choix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Choix</em>'.
   * @generated
   */
  Choix createChoix();

  /**
   * Returns a new object of class '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action</em>'.
   * @generated
   */
  Action createAction();

  /**
   * Returns a new object of class '<em>Echange</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Echange</em>'.
   * @generated
   */
  Echange createEchange();

  /**
   * Returns a new object of class '<em>Objet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Objet</em>'.
   * @generated
   */
  Objet createObjet();

  /**
   * Returns a new object of class '<em>Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Description</em>'.
   * @generated
   */
  Description createDescription();

  /**
   * Returns a new object of class '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition</em>'.
   * @generated
   */
  Condition createCondition();

  /**
   * Returns a new object of class '<em>Connaissance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connaissance</em>'.
   * @generated
   */
  Connaissance createConnaissance();

  /**
   * Returns a new object of class '<em>Explorateur</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Explorateur</em>'.
   * @generated
   */
  Explorateur createExplorateur();

  /**
   * Returns a new object of class '<em>Lieu</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lieu</em>'.
   * @generated
   */
  Lieu createLieu();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GAMEPackage getGAMEPackage();

} //GAMEFactory
