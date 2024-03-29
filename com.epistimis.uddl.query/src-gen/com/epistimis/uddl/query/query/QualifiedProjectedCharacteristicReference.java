/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.query.query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Projected Characteristic Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.query.query.QualifiedProjectedCharacteristicReference#getSelectedEntityReference <em>Selected Entity Reference</em>}</li>
 *   <li>{@link com.epistimis.uddl.query.query.QualifiedProjectedCharacteristicReference#getCharacteristic <em>Characteristic</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.query.query.QueryPackage#getQualifiedProjectedCharacteristicReference()
 * @model
 * @generated
 */
public interface QualifiedProjectedCharacteristicReference extends ProjectedCharacteristicReference
{
  /**
   * Returns the value of the '<em><b>Selected Entity Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selected Entity Reference</em>' containment reference.
   * @see #setSelectedEntityReference(SelectedEntityReference)
   * @see com.epistimis.uddl.query.query.QueryPackage#getQualifiedProjectedCharacteristicReference_SelectedEntityReference()
   * @model containment="true"
   * @generated
   */
  SelectedEntityReference getSelectedEntityReference();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.query.query.QualifiedProjectedCharacteristicReference#getSelectedEntityReference <em>Selected Entity Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selected Entity Reference</em>' containment reference.
   * @see #getSelectedEntityReference()
   * @generated
   */
  void setSelectedEntityReference(SelectedEntityReference value);

  /**
   * Returns the value of the '<em><b>Characteristic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Characteristic</em>' containment reference.
   * @see #setCharacteristic(CharacteristicReference)
   * @see com.epistimis.uddl.query.query.QueryPackage#getQualifiedProjectedCharacteristicReference_Characteristic()
   * @model containment="true"
   * @generated
   */
  CharacteristicReference getCharacteristic();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.query.query.QualifiedProjectedCharacteristicReference#getCharacteristic <em>Characteristic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Characteristic</em>' containment reference.
   * @see #getCharacteristic()
   * @generated
   */
  void setCharacteristic(CharacteristicReference value);

} // QualifiedProjectedCharacteristicReference
