/**
 * generated by Xtext 2.17.1
 */
package fr.enseeiht.gAME.impl;

import fr.enseeiht.gAME.Condition;
import fr.enseeiht.gAME.Connaissance;
import fr.enseeiht.gAME.GAMEPackage;
import fr.enseeiht.gAME.Objet;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.enseeiht.gAME.impl.ConditionImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.enseeiht.gAME.impl.ConditionImpl#getObjets <em>Objets</em>}</li>
 *   <li>{@link fr.enseeiht.gAME.impl.ConditionImpl#getConnaissances <em>Connaissances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getObjets() <em>Objets</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjets()
   * @generated
   * @ordered
   */
  protected EList<Objet> objets;

  /**
   * The cached value of the '{@link #getConnaissances() <em>Connaissances</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnaissances()
   * @generated
   * @ordered
   */
  protected EList<Connaissance> connaissances;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GAMEPackage.Literals.CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GAMEPackage.CONDITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Objet> getObjets()
  {
    if (objets == null)
    {
      objets = new EObjectResolvingEList<Objet>(Objet.class, this, GAMEPackage.CONDITION__OBJETS);
    }
    return objets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Connaissance> getConnaissances()
  {
    if (connaissances == null)
    {
      connaissances = new EObjectResolvingEList<Connaissance>(Connaissance.class, this, GAMEPackage.CONDITION__CONNAISSANCES);
    }
    return connaissances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GAMEPackage.CONDITION__NAME:
        return getName();
      case GAMEPackage.CONDITION__OBJETS:
        return getObjets();
      case GAMEPackage.CONDITION__CONNAISSANCES:
        return getConnaissances();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GAMEPackage.CONDITION__NAME:
        setName((String)newValue);
        return;
      case GAMEPackage.CONDITION__OBJETS:
        getObjets().clear();
        getObjets().addAll((Collection<? extends Objet>)newValue);
        return;
      case GAMEPackage.CONDITION__CONNAISSANCES:
        getConnaissances().clear();
        getConnaissances().addAll((Collection<? extends Connaissance>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GAMEPackage.CONDITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GAMEPackage.CONDITION__OBJETS:
        getObjets().clear();
        return;
      case GAMEPackage.CONDITION__CONNAISSANCES:
        getConnaissances().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GAMEPackage.CONDITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GAMEPackage.CONDITION__OBJETS:
        return objets != null && !objets.isEmpty();
      case GAMEPackage.CONDITION__CONNAISSANCES:
        return connaissances != null && !connaissances.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ConditionImpl
