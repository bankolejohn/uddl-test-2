/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.query.query.impl;

import com.epistimis.uddl.query.query.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryFactoryImpl extends EFactoryImpl implements QueryFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static QueryFactory init()
  {
    try
    {
      QueryFactory theQueryFactory = (QueryFactory)EPackage.Registry.INSTANCE.getEFactory(QueryPackage.eNS_URI);
      if (theQueryFactory != null)
      {
        return theQueryFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new QueryFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case QueryPackage.QUERY_SPECIFICATION: return createQuerySpecification();
      case QueryPackage.QUERY_STATEMENT: return createQueryStatement();
      case QueryPackage.PROJECTED_CHARACTERISTIC_LIST: return createProjectedCharacteristicList();
      case QueryPackage.PROJECTED_CHARACTERISTIC_EXPRESSION: return createProjectedCharacteristicExpression();
      case QueryPackage.SELECTED_ENTITY_CHARACTERISTIC_WILDCARD_REFERENCE: return createSelectedEntityCharacteristicWildcardReference();
      case QueryPackage.EXPLICIT_SELECTED_ENTITY_CHARACTERISTIC_REFERENCE: return createExplicitSelectedEntityCharacteristicReference();
      case QueryPackage.SELECTED_ENTITY_EXPRESSION: return createSelectedEntityExpression();
      case QueryPackage.FROM_CLAUSE: return createFromClause();
      case QueryPackage.ENTITY_EXPRESSION: return createEntityExpression();
      case QueryPackage.SELECTED_ENTITY: return createSelectedEntity();
      case QueryPackage.ENTITY_JOIN_EXPRESSION: return createEntityJoinExpression();
      case QueryPackage.JOIN_ENTITY: return createJoinEntity();
      case QueryPackage.ENTITY_JOIN_CRITERIA: return createEntityJoinCriteria();
      case QueryPackage.ENTITY_TYPE_CHARACTERISTIC_EQUIVALENCE_EXPRESSION: return createEntityTypeCharacteristicEquivalenceExpression();
      case QueryPackage.SELECTED_ENTITY_CHARACTERISTIC_REFERENCE: return createSelectedEntityCharacteristicReference();
      case QueryPackage.SELECTED_ENTITY_REFERENCE: return createSelectedEntityReference();
      case QueryPackage.WHERE_CLAUSE: return createWhereClause();
      case QueryPackage.CRITERIA: return createCriteria();
      case QueryPackage.ORDER_BY_CLAUSE: return createOrderByClause();
      case QueryPackage.ORDERING_EXPRESSION: return createOrderingExpression();
      case QueryPackage.PROJECTED_CHARACTERISTIC_REFERENCE: return createProjectedCharacteristicReference();
      case QueryPackage.QUALIFIED_PROJECTED_CHARACTERISTIC_REFERENCE: return createQualifiedProjectedCharacteristicReference();
      case QueryPackage.UNQUALIFIED_PROJECTED_CHARACTERISTIC_REFERENCE_OR_ALIAS: return createUnqualifiedProjectedCharacteristicReferenceOrAlias();
      case QueryPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
      case QueryPackage.BOOLEAN_TERM: return createBooleanTerm();
      case QueryPackage.BOOLEAN_FACTOR: return createBooleanFactor();
      case QueryPackage.BOOLEAN_PREDICATE: return createBooleanPredicate();
      case QueryPackage.SCALAR_COMPARE_PREDICATE: return createScalarComparePredicate();
      case QueryPackage.SET_MEMBERSHIP_PREDICATE: return createSetMembershipPredicate();
      case QueryPackage.LOGICAL_SET: return createLogicalSet();
      case QueryPackage.CHARACTERISTIC_BASIS_SET: return createCharacteristicBasisSet();
      case QueryPackage.SET_COMPARE_PREDICATE: return createSetComparePredicate();
      case QueryPackage.COMPARE_SET: return createCompareSet();
      case QueryPackage.EXISTS_PREDICATE: return createExistsPredicate();
      case QueryPackage.PREDICATE_TERM: return createPredicateTerm();
      case QueryPackage.CHARACTERISTIC_BASIS: return createCharacteristicBasis();
      case QueryPackage.SUBQUERY: return createSubquery();
      case QueryPackage.CHARACTERISTIC_REFERENCE: return createCharacteristicReference();
      case QueryPackage.ENTITY_TYPE_REFERENCE: return createEntityTypeReference();
      case QueryPackage.ENUM_LITERAL_SET: return createEnumLiteralSet();
      case QueryPackage.ENUM_LITERAL_REFERENCE_EXPRESSION: return createEnumLiteralReferenceExpression();
      case QueryPackage.ENUMERATION_TYPE_REFERENCE: return createEnumerationTypeReference();
      case QueryPackage.ENUMERATION_LITERAL_REFERENCE: return createEnumerationLiteralReference();
      case QueryPackage.SELECTED_ENTITY_ALIAS: return createSelectedEntityAlias();
      case QueryPackage.PROJECTED_CHARACTERISTIC_ALIAS: return createProjectedCharacteristicAlias();
      case QueryPackage.QUERY_IDENTIFIER: return createQueryIdentifier();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public QuerySpecification createQuerySpecification()
  {
    QuerySpecificationImpl querySpecification = new QuerySpecificationImpl();
    return querySpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public QueryStatement createQueryStatement()
  {
    QueryStatementImpl queryStatement = new QueryStatementImpl();
    return queryStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProjectedCharacteristicList createProjectedCharacteristicList()
  {
    ProjectedCharacteristicListImpl projectedCharacteristicList = new ProjectedCharacteristicListImpl();
    return projectedCharacteristicList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProjectedCharacteristicExpression createProjectedCharacteristicExpression()
  {
    ProjectedCharacteristicExpressionImpl projectedCharacteristicExpression = new ProjectedCharacteristicExpressionImpl();
    return projectedCharacteristicExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelectedEntityCharacteristicWildcardReference createSelectedEntityCharacteristicWildcardReference()
  {
    SelectedEntityCharacteristicWildcardReferenceImpl selectedEntityCharacteristicWildcardReference = new SelectedEntityCharacteristicWildcardReferenceImpl();
    return selectedEntityCharacteristicWildcardReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExplicitSelectedEntityCharacteristicReference createExplicitSelectedEntityCharacteristicReference()
  {
    ExplicitSelectedEntityCharacteristicReferenceImpl explicitSelectedEntityCharacteristicReference = new ExplicitSelectedEntityCharacteristicReferenceImpl();
    return explicitSelectedEntityCharacteristicReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelectedEntityExpression createSelectedEntityExpression()
  {
    SelectedEntityExpressionImpl selectedEntityExpression = new SelectedEntityExpressionImpl();
    return selectedEntityExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FromClause createFromClause()
  {
    FromClauseImpl fromClause = new FromClauseImpl();
    return fromClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityExpression createEntityExpression()
  {
    EntityExpressionImpl entityExpression = new EntityExpressionImpl();
    return entityExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelectedEntity createSelectedEntity()
  {
    SelectedEntityImpl selectedEntity = new SelectedEntityImpl();
    return selectedEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityJoinExpression createEntityJoinExpression()
  {
    EntityJoinExpressionImpl entityJoinExpression = new EntityJoinExpressionImpl();
    return entityJoinExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JoinEntity createJoinEntity()
  {
    JoinEntityImpl joinEntity = new JoinEntityImpl();
    return joinEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityJoinCriteria createEntityJoinCriteria()
  {
    EntityJoinCriteriaImpl entityJoinCriteria = new EntityJoinCriteriaImpl();
    return entityJoinCriteria;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityTypeCharacteristicEquivalenceExpression createEntityTypeCharacteristicEquivalenceExpression()
  {
    EntityTypeCharacteristicEquivalenceExpressionImpl entityTypeCharacteristicEquivalenceExpression = new EntityTypeCharacteristicEquivalenceExpressionImpl();
    return entityTypeCharacteristicEquivalenceExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelectedEntityCharacteristicReference createSelectedEntityCharacteristicReference()
  {
    SelectedEntityCharacteristicReferenceImpl selectedEntityCharacteristicReference = new SelectedEntityCharacteristicReferenceImpl();
    return selectedEntityCharacteristicReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelectedEntityReference createSelectedEntityReference()
  {
    SelectedEntityReferenceImpl selectedEntityReference = new SelectedEntityReferenceImpl();
    return selectedEntityReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WhereClause createWhereClause()
  {
    WhereClauseImpl whereClause = new WhereClauseImpl();
    return whereClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Criteria createCriteria()
  {
    CriteriaImpl criteria = new CriteriaImpl();
    return criteria;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OrderByClause createOrderByClause()
  {
    OrderByClauseImpl orderByClause = new OrderByClauseImpl();
    return orderByClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OrderingExpression createOrderingExpression()
  {
    OrderingExpressionImpl orderingExpression = new OrderingExpressionImpl();
    return orderingExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProjectedCharacteristicReference createProjectedCharacteristicReference()
  {
    ProjectedCharacteristicReferenceImpl projectedCharacteristicReference = new ProjectedCharacteristicReferenceImpl();
    return projectedCharacteristicReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public QualifiedProjectedCharacteristicReference createQualifiedProjectedCharacteristicReference()
  {
    QualifiedProjectedCharacteristicReferenceImpl qualifiedProjectedCharacteristicReference = new QualifiedProjectedCharacteristicReferenceImpl();
    return qualifiedProjectedCharacteristicReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnqualifiedProjectedCharacteristicReferenceOrAlias createUnqualifiedProjectedCharacteristicReferenceOrAlias()
  {
    UnqualifiedProjectedCharacteristicReferenceOrAliasImpl unqualifiedProjectedCharacteristicReferenceOrAlias = new UnqualifiedProjectedCharacteristicReferenceOrAliasImpl();
    return unqualifiedProjectedCharacteristicReferenceOrAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanExpression createBooleanExpression()
  {
    BooleanExpressionImpl booleanExpression = new BooleanExpressionImpl();
    return booleanExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanTerm createBooleanTerm()
  {
    BooleanTermImpl booleanTerm = new BooleanTermImpl();
    return booleanTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanFactor createBooleanFactor()
  {
    BooleanFactorImpl booleanFactor = new BooleanFactorImpl();
    return booleanFactor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanPredicate createBooleanPredicate()
  {
    BooleanPredicateImpl booleanPredicate = new BooleanPredicateImpl();
    return booleanPredicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ScalarComparePredicate createScalarComparePredicate()
  {
    ScalarComparePredicateImpl scalarComparePredicate = new ScalarComparePredicateImpl();
    return scalarComparePredicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SetMembershipPredicate createSetMembershipPredicate()
  {
    SetMembershipPredicateImpl setMembershipPredicate = new SetMembershipPredicateImpl();
    return setMembershipPredicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LogicalSet createLogicalSet()
  {
    LogicalSetImpl logicalSet = new LogicalSetImpl();
    return logicalSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CharacteristicBasisSet createCharacteristicBasisSet()
  {
    CharacteristicBasisSetImpl characteristicBasisSet = new CharacteristicBasisSetImpl();
    return characteristicBasisSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SetComparePredicate createSetComparePredicate()
  {
    SetComparePredicateImpl setComparePredicate = new SetComparePredicateImpl();
    return setComparePredicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CompareSet createCompareSet()
  {
    CompareSetImpl compareSet = new CompareSetImpl();
    return compareSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExistsPredicate createExistsPredicate()
  {
    ExistsPredicateImpl existsPredicate = new ExistsPredicateImpl();
    return existsPredicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PredicateTerm createPredicateTerm()
  {
    PredicateTermImpl predicateTerm = new PredicateTermImpl();
    return predicateTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CharacteristicBasis createCharacteristicBasis()
  {
    CharacteristicBasisImpl characteristicBasis = new CharacteristicBasisImpl();
    return characteristicBasis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Subquery createSubquery()
  {
    SubqueryImpl subquery = new SubqueryImpl();
    return subquery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CharacteristicReference createCharacteristicReference()
  {
    CharacteristicReferenceImpl characteristicReference = new CharacteristicReferenceImpl();
    return characteristicReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityTypeReference createEntityTypeReference()
  {
    EntityTypeReferenceImpl entityTypeReference = new EntityTypeReferenceImpl();
    return entityTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumLiteralSet createEnumLiteralSet()
  {
    EnumLiteralSetImpl enumLiteralSet = new EnumLiteralSetImpl();
    return enumLiteralSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumLiteralReferenceExpression createEnumLiteralReferenceExpression()
  {
    EnumLiteralReferenceExpressionImpl enumLiteralReferenceExpression = new EnumLiteralReferenceExpressionImpl();
    return enumLiteralReferenceExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumerationTypeReference createEnumerationTypeReference()
  {
    EnumerationTypeReferenceImpl enumerationTypeReference = new EnumerationTypeReferenceImpl();
    return enumerationTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumerationLiteralReference createEnumerationLiteralReference()
  {
    EnumerationLiteralReferenceImpl enumerationLiteralReference = new EnumerationLiteralReferenceImpl();
    return enumerationLiteralReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelectedEntityAlias createSelectedEntityAlias()
  {
    SelectedEntityAliasImpl selectedEntityAlias = new SelectedEntityAliasImpl();
    return selectedEntityAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProjectedCharacteristicAlias createProjectedCharacteristicAlias()
  {
    ProjectedCharacteristicAliasImpl projectedCharacteristicAlias = new ProjectedCharacteristicAliasImpl();
    return projectedCharacteristicAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public QueryIdentifier createQueryIdentifier()
  {
    QueryIdentifierImpl queryIdentifier = new QueryIdentifierImpl();
    return queryIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public QueryPackage getQueryPackage()
  {
    return (QueryPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static QueryPackage getPackage()
  {
    return QueryPackage.eINSTANCE;
  }

} //QueryFactoryImpl
