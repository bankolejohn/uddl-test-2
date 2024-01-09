/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.query.query.impl;

import com.epistimis.uddl.query.query.EntityExpression;
import com.epistimis.uddl.query.query.EntityJoinExpression;
import com.epistimis.uddl.query.query.QueryPackage;
import com.epistimis.uddl.query.query.SelectedEntity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.query.query.impl.EntityExpressionImpl#getSelectedEntity <em>Selected Entity</em>}</li>
 *   <li>{@link com.epistimis.uddl.query.query.impl.EntityExpressionImpl#getEje <em>Eje</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityExpressionImpl extends MinimalEObjectImpl.Container implements EntityExpression
{
  /**
   * The cached value of the '{@link #getSelectedEntity() <em>Selected Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectedEntity()
   * @generated
   * @ordered
   */
  protected SelectedEntity selectedEntity;

  /**
   * The cached value of the '{@link #getEje() <em>Eje</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEje()
   * @generated
   * @ordered
   */
  protected EList<EntityJoinExpression> eje;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityExpressionImpl()
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
    return QueryPackage.Literals.ENTITY_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelectedEntity getSelectedEntity()
  {
    return selectedEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelectedEntity(SelectedEntity newSelectedEntity, NotificationChain msgs)
  {
    SelectedEntity oldSelectedEntity = selectedEntity;
    selectedEntity = newSelectedEntity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.ENTITY_EXPRESSION__SELECTED_ENTITY, oldSelectedEntity, newSelectedEntity);
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
  public void setSelectedEntity(SelectedEntity newSelectedEntity)
  {
    if (newSelectedEntity != selectedEntity)
    {
      NotificationChain msgs = null;
      if (selectedEntity != null)
        msgs = ((InternalEObject)selectedEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ENTITY_EXPRESSION__SELECTED_ENTITY, null, msgs);
      if (newSelectedEntity != null)
        msgs = ((InternalEObject)newSelectedEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ENTITY_EXPRESSION__SELECTED_ENTITY, null, msgs);
      msgs = basicSetSelectedEntity(newSelectedEntity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ENTITY_EXPRESSION__SELECTED_ENTITY, newSelectedEntity, newSelectedEntity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EntityJoinExpression> getEje()
  {
    if (eje == null)
    {
      eje = new EObjectContainmentEList<EntityJoinExpression>(EntityJoinExpression.class, this, QueryPackage.ENTITY_EXPRESSION__EJE);
    }
    return eje;
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
      case QueryPackage.ENTITY_EXPRESSION__SELECTED_ENTITY:
        return basicSetSelectedEntity(null, msgs);
      case QueryPackage.ENTITY_EXPRESSION__EJE:
        return ((InternalEList<?>)getEje()).basicRemove(otherEnd, msgs);
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
      case QueryPackage.ENTITY_EXPRESSION__SELECTED_ENTITY:
        return getSelectedEntity();
      case QueryPackage.ENTITY_EXPRESSION__EJE:
        return getEje();
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
      case QueryPackage.ENTITY_EXPRESSION__SELECTED_ENTITY:
        setSelectedEntity((SelectedEntity)newValue);
        return;
      case QueryPackage.ENTITY_EXPRESSION__EJE:
        getEje().clear();
        getEje().addAll((Collection<? extends EntityJoinExpression>)newValue);
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
      case QueryPackage.ENTITY_EXPRESSION__SELECTED_ENTITY:
        setSelectedEntity((SelectedEntity)null);
        return;
      case QueryPackage.ENTITY_EXPRESSION__EJE:
        getEje().clear();
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
      case QueryPackage.ENTITY_EXPRESSION__SELECTED_ENTITY:
        return selectedEntity != null;
      case QueryPackage.ENTITY_EXPRESSION__EJE:
        return eje != null && !eje.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EntityExpressionImpl