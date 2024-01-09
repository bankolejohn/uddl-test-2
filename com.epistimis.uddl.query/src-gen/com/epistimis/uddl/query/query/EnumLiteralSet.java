/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.query.query;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Literal Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.query.query.EnumLiteralSet#getType <em>Type</em>}</li>
 *   <li>{@link com.epistimis.uddl.query.query.EnumLiteralSet#getLiteral <em>Literal</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.query.query.QueryPackage#getEnumLiteralSet()
 * @model
 * @generated
 */
public interface EnumLiteralSet extends LogicalSet
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(EnumerationTypeReference)
   * @see com.epistimis.uddl.query.query.QueryPackage#getEnumLiteralSet_Type()
   * @model containment="true"
   * @generated
   */
  EnumerationTypeReference getType();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.query.query.EnumLiteralSet#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(EnumerationTypeReference value);

  /**
   * Returns the value of the '<em><b>Literal</b></em>' containment reference list.
   * The list contents are of type {@link com.epistimis.uddl.query.query.EnumerationLiteralReference}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' containment reference list.
   * @see com.epistimis.uddl.query.query.QueryPackage#getEnumLiteralSet_Literal()
   * @model containment="true"
   * @generated
   */
  EList<EnumerationLiteralReference> getLiteral();

} // EnumLiteralSet
