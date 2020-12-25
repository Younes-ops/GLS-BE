/**
 * generated by Xtext 2.17.1
 */
package fr.enseeiht.gAME.impl;

import fr.enseeiht.gAME.Condition;
import fr.enseeiht.gAME.Connaissance;
import fr.enseeiht.gAME.GAMEPackage;
import fr.enseeiht.gAME.Visibilite;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connaissance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.enseeiht.gAME.impl.ConnaissanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.enseeiht.gAME.impl.ConnaissanceImpl#getVisibilite <em>Visibilite</em>}</li>
 *   <li>{@link fr.enseeiht.gAME.impl.ConnaissanceImpl#getConditionsVisibilite <em>Conditions Visibilite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnaissanceImpl extends MinimalEObjectImpl.Container implements Connaissance
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
   * The default value of the '{@link #getVisibilite() <em>Visibilite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibilite()
   * @generated
   * @ordered
   */
  protected static final Visibilite VISIBILITE_EDEFAULT = Visibilite.VISIBLE;

  /**
   * The cached value of the '{@link #getVisibilite() <em>Visibilite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibilite()
   * @generated
   * @ordered
   */
  protected Visibilite visibilite = VISIBILITE_EDEFAULT;

  /**
   * The cached value of the '{@link #getConditionsVisibilite() <em>Conditions Visibilite</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionsVisibilite()
   * @generated
   * @ordered
   */
  protected Condition conditionsVisibilite;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConnaissanceImpl()
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
    return GAMEPackage.Literals.CONNAISSANCE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GAMEPackage.CONNAISSANCE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Visibilite getVisibilite()
  {
    return visibilite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVisibilite(Visibilite newVisibilite)
  {
    Visibilite oldVisibilite = visibilite;
    visibilite = newVisibilite == null ? VISIBILITE_EDEFAULT : newVisibilite;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GAMEPackage.CONNAISSANCE__VISIBILITE, oldVisibilite, visibilite));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Condition getConditionsVisibilite()
  {
    return conditionsVisibilite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConditionsVisibilite(Condition newConditionsVisibilite, NotificationChain msgs)
  {
    Condition oldConditionsVisibilite = conditionsVisibilite;
    conditionsVisibilite = newConditionsVisibilite;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GAMEPackage.CONNAISSANCE__CONDITIONS_VISIBILITE, oldConditionsVisibilite, newConditionsVisibilite);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConditionsVisibilite(Condition newConditionsVisibilite)
  {
    if (newConditionsVisibilite != conditionsVisibilite)
    {
      NotificationChain msgs = null;
      if (conditionsVisibilite != null)
        msgs = ((InternalEObject)conditionsVisibilite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GAMEPackage.CONNAISSANCE__CONDITIONS_VISIBILITE, null, msgs);
      if (newConditionsVisibilite != null)
        msgs = ((InternalEObject)newConditionsVisibilite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GAMEPackage.CONNAISSANCE__CONDITIONS_VISIBILITE, null, msgs);
      msgs = basicSetConditionsVisibilite(newConditionsVisibilite, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GAMEPackage.CONNAISSANCE__CONDITIONS_VISIBILITE, newConditionsVisibilite, newConditionsVisibilite));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GAMEPackage.CONNAISSANCE__CONDITIONS_VISIBILITE:
        return basicSetConditionsVisibilite(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case GAMEPackage.CONNAISSANCE__NAME:
        return getName();
      case GAMEPackage.CONNAISSANCE__VISIBILITE:
        return getVisibilite();
      case GAMEPackage.CONNAISSANCE__CONDITIONS_VISIBILITE:
        return getConditionsVisibilite();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GAMEPackage.CONNAISSANCE__NAME:
        setName((String)newValue);
        return;
      case GAMEPackage.CONNAISSANCE__VISIBILITE:
        setVisibilite((Visibilite)newValue);
        return;
      case GAMEPackage.CONNAISSANCE__CONDITIONS_VISIBILITE:
        setConditionsVisibilite((Condition)newValue);
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
      case GAMEPackage.CONNAISSANCE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GAMEPackage.CONNAISSANCE__VISIBILITE:
        setVisibilite(VISIBILITE_EDEFAULT);
        return;
      case GAMEPackage.CONNAISSANCE__CONDITIONS_VISIBILITE:
        setConditionsVisibilite((Condition)null);
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
      case GAMEPackage.CONNAISSANCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GAMEPackage.CONNAISSANCE__VISIBILITE:
        return visibilite != VISIBILITE_EDEFAULT;
      case GAMEPackage.CONNAISSANCE__CONDITIONS_VISIBILITE:
        return conditionsVisibilite != null;
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
    result.append(", visibilite: ");
    result.append(visibilite);
    result.append(')');
    return result.toString();
  }

} //ConnaissanceImpl
