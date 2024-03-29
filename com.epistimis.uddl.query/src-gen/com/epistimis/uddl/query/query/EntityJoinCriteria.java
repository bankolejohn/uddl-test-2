/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.query.query;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Join Criteria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.query.query.EntityJoinCriteria#getEtcee <em>Etcee</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.query.query.QueryPackage#getEntityJoinCriteria()
 * @model
 * @generated
 */
public interface EntityJoinCriteria extends EObject
{
  /**
   * Returns the value of the '<em><b>Etcee</b></em>' containment reference list.
   * The list contents are of type {@link com.epistimis.uddl.query.query.EntityTypeCharacteristicEquivalenceExpression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Etcee</em>' containment reference list.
   * @see com.epistimis.uddl.query.query.QueryPackage#getEntityJoinCriteria_Etcee()
   * @model containment="true"
   * @generated
   */
  EList<EntityTypeCharacteristicEquivalenceExpression> getEtcee();

} // EntityJoinCriteria
