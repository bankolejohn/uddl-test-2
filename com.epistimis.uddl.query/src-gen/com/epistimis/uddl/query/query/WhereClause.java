/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.query.query;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Where Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.query.query.WhereClause#getCriteria <em>Criteria</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.query.query.QueryPackage#getWhereClause()
 * @model
 * @generated
 */
public interface WhereClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Criteria</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Criteria</em>' containment reference.
   * @see #setCriteria(Criteria)
   * @see com.epistimis.uddl.query.query.QueryPackage#getWhereClause_Criteria()
   * @model containment="true"
   * @generated
   */
  Criteria getCriteria();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.query.query.WhereClause#getCriteria <em>Criteria</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Criteria</em>' containment reference.
   * @see #getCriteria()
   * @generated
   */
  void setCriteria(Criteria value);

} // WhereClause