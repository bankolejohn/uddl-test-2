/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.query.query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selected Entity Characteristic Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.query.query.SelectedEntityCharacteristicReference#getSelectedEntity <em>Selected Entity</em>}</li>
 *   <li>{@link com.epistimis.uddl.query.query.SelectedEntityCharacteristicReference#getCharacteristic <em>Characteristic</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.query.query.QueryPackage#getSelectedEntityCharacteristicReference()
 * @model
 * @generated
 */
public interface SelectedEntityCharacteristicReference extends CharacteristicBasis
{
  /**
   * Returns the value of the '<em><b>Selected Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selected Entity</em>' containment reference.
   * @see #setSelectedEntity(SelectedEntityReference)
   * @see com.epistimis.uddl.query.query.QueryPackage#getSelectedEntityCharacteristicReference_SelectedEntity()
   * @model containment="true"
   * @generated
   */
  SelectedEntityReference getSelectedEntity();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.query.query.SelectedEntityCharacteristicReference#getSelectedEntity <em>Selected Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selected Entity</em>' containment reference.
   * @see #getSelectedEntity()
   * @generated
   */
  void setSelectedEntity(SelectedEntityReference value);

  /**
   * Returns the value of the '<em><b>Characteristic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Characteristic</em>' containment reference.
   * @see #setCharacteristic(CharacteristicReference)
   * @see com.epistimis.uddl.query.query.QueryPackage#getSelectedEntityCharacteristicReference_Characteristic()
   * @model containment="true"
   * @generated
   */
  CharacteristicReference getCharacteristic();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.query.query.SelectedEntityCharacteristicReference#getCharacteristic <em>Characteristic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Characteristic</em>' containment reference.
   * @see #getCharacteristic()
   * @generated
   */
  void setCharacteristic(CharacteristicReference value);

} // SelectedEntityCharacteristicReference
