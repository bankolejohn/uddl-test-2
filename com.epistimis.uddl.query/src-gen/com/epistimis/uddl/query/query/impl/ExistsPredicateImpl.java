/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.query.query.impl;

import com.epistimis.uddl.query.query.ExistsPredicate;
import com.epistimis.uddl.query.query.QueryPackage;
import com.epistimis.uddl.query.query.Subquery;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exists Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.query.query.impl.ExistsPredicateImpl#getSub <em>Sub</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExistsPredicateImpl extends BooleanPredicateImpl implements ExistsPredicate
{
  /**
   * The cached value of the '{@link #getSub() <em>Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSub()
   * @generated
   * @ordered
   */
  protected Subquery sub;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExistsPredicateImpl()
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
    return QueryPackage.Literals.EXISTS_PREDICATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Subquery getSub()
  {
    return sub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSub(Subquery newSub, NotificationChain msgs)
  {
    Subquery oldSub = sub;
    sub = newSub;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.EXISTS_PREDICATE__SUB, oldSub, newSub);
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
  public void setSub(Subquery newSub)
  {
    if (newSub != sub)
    {
      NotificationChain msgs = null;
      if (sub != null)
        msgs = ((InternalEObject)sub).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.EXISTS_PREDICATE__SUB, null, msgs);
      if (newSub != null)
        msgs = ((InternalEObject)newSub).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.EXISTS_PREDICATE__SUB, null, msgs);
      msgs = basicSetSub(newSub, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.EXISTS_PREDICATE__SUB, newSub, newSub));
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
      case QueryPackage.EXISTS_PREDICATE__SUB:
        return basicSetSub(null, msgs);
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
      case QueryPackage.EXISTS_PREDICATE__SUB:
        return getSub();
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
      case QueryPackage.EXISTS_PREDICATE__SUB:
        setSub((Subquery)newValue);
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
      case QueryPackage.EXISTS_PREDICATE__SUB:
        setSub((Subquery)null);
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
      case QueryPackage.EXISTS_PREDICATE__SUB:
        return sub != null;
    }
    return super.eIsSet(featureID);
  }

} //ExistsPredicateImpl
