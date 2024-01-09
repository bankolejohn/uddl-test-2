/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.query.query.impl;

import com.epistimis.uddl.query.query.EntityTypeReference;
import com.epistimis.uddl.query.query.QueryPackage;
import com.epistimis.uddl.query.query.SelectedEntity;
import com.epistimis.uddl.query.query.SelectedEntityAlias;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selected Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.query.query.impl.SelectedEntityImpl#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link com.epistimis.uddl.query.query.impl.SelectedEntityImpl#getSelectedEntityAlias <em>Selected Entity Alias</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectedEntityImpl extends JoinEntityImpl implements SelectedEntity
{
  /**
   * The cached value of the '{@link #getEntityType() <em>Entity Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityType()
   * @generated
   * @ordered
   */
  protected EntityTypeReference entityType;

  /**
   * The cached value of the '{@link #getSelectedEntityAlias() <em>Selected Entity Alias</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectedEntityAlias()
   * @generated
   * @ordered
   */
  protected SelectedEntityAlias selectedEntityAlias;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectedEntityImpl()
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
    return QueryPackage.Literals.SELECTED_ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityTypeReference getEntityType()
  {
    return entityType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntityType(EntityTypeReference newEntityType, NotificationChain msgs)
  {
    EntityTypeReference oldEntityType = entityType;
    entityType = newEntityType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.SELECTED_ENTITY__ENTITY_TYPE, oldEntityType, newEntityType);
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
  public void setEntityType(EntityTypeReference newEntityType)
  {
    if (newEntityType != entityType)
    {
      NotificationChain msgs = null;
      if (entityType != null)
        msgs = ((InternalEObject)entityType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SELECTED_ENTITY__ENTITY_TYPE, null, msgs);
      if (newEntityType != null)
        msgs = ((InternalEObject)newEntityType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SELECTED_ENTITY__ENTITY_TYPE, null, msgs);
      msgs = basicSetEntityType(newEntityType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SELECTED_ENTITY__ENTITY_TYPE, newEntityType, newEntityType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelectedEntityAlias getSelectedEntityAlias()
  {
    return selectedEntityAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelectedEntityAlias(SelectedEntityAlias newSelectedEntityAlias, NotificationChain msgs)
  {
    SelectedEntityAlias oldSelectedEntityAlias = selectedEntityAlias;
    selectedEntityAlias = newSelectedEntityAlias;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.SELECTED_ENTITY__SELECTED_ENTITY_ALIAS, oldSelectedEntityAlias, newSelectedEntityAlias);
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
  public void setSelectedEntityAlias(SelectedEntityAlias newSelectedEntityAlias)
  {
    if (newSelectedEntityAlias != selectedEntityAlias)
    {
      NotificationChain msgs = null;
      if (selectedEntityAlias != null)
        msgs = ((InternalEObject)selectedEntityAlias).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SELECTED_ENTITY__SELECTED_ENTITY_ALIAS, null, msgs);
      if (newSelectedEntityAlias != null)
        msgs = ((InternalEObject)newSelectedEntityAlias).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SELECTED_ENTITY__SELECTED_ENTITY_ALIAS, null, msgs);
      msgs = basicSetSelectedEntityAlias(newSelectedEntityAlias, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SELECTED_ENTITY__SELECTED_ENTITY_ALIAS, newSelectedEntityAlias, newSelectedEntityAlias));
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
      case QueryPackage.SELECTED_ENTITY__ENTITY_TYPE:
        return basicSetEntityType(null, msgs);
      case QueryPackage.SELECTED_ENTITY__SELECTED_ENTITY_ALIAS:
        return basicSetSelectedEntityAlias(null, msgs);
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
      case QueryPackage.SELECTED_ENTITY__ENTITY_TYPE:
        return getEntityType();
      case QueryPackage.SELECTED_ENTITY__SELECTED_ENTITY_ALIAS:
        return getSelectedEntityAlias();
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
      case QueryPackage.SELECTED_ENTITY__ENTITY_TYPE:
        setEntityType((EntityTypeReference)newValue);
        return;
      case QueryPackage.SELECTED_ENTITY__SELECTED_ENTITY_ALIAS:
        setSelectedEntityAlias((SelectedEntityAlias)newValue);
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
      case QueryPackage.SELECTED_ENTITY__ENTITY_TYPE:
        setEntityType((EntityTypeReference)null);
        return;
      case QueryPackage.SELECTED_ENTITY__SELECTED_ENTITY_ALIAS:
        setSelectedEntityAlias((SelectedEntityAlias)null);
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
      case QueryPackage.SELECTED_ENTITY__ENTITY_TYPE:
        return entityType != null;
      case QueryPackage.SELECTED_ENTITY__SELECTED_ENTITY_ALIAS:
        return selectedEntityAlias != null;
    }
    return super.eIsSet(featureID);
  }

} //SelectedEntityImpl
