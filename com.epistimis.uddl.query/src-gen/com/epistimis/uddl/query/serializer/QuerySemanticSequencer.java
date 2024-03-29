/*
 * generated by Xtext 2.33.0
 */
/*
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.query.serializer;

import com.epistimis.uddl.query.query.BooleanExpression;
import com.epistimis.uddl.query.query.BooleanFactor;
import com.epistimis.uddl.query.query.BooleanTerm;
import com.epistimis.uddl.query.query.CharacteristicBasisSet;
import com.epistimis.uddl.query.query.EntityExpression;
import com.epistimis.uddl.query.query.EntityJoinCriteria;
import com.epistimis.uddl.query.query.EntityJoinExpression;
import com.epistimis.uddl.query.query.EntityTypeCharacteristicEquivalenceExpression;
import com.epistimis.uddl.query.query.EnumLiteralReferenceExpression;
import com.epistimis.uddl.query.query.EnumLiteralSet;
import com.epistimis.uddl.query.query.ExistsPredicate;
import com.epistimis.uddl.query.query.ExplicitSelectedEntityCharacteristicReference;
import com.epistimis.uddl.query.query.FromClause;
import com.epistimis.uddl.query.query.OrderByClause;
import com.epistimis.uddl.query.query.OrderingExpression;
import com.epistimis.uddl.query.query.ProjectedCharacteristicList;
import com.epistimis.uddl.query.query.QualifiedProjectedCharacteristicReference;
import com.epistimis.uddl.query.query.QueryIdentifier;
import com.epistimis.uddl.query.query.QueryPackage;
import com.epistimis.uddl.query.query.QueryStatement;
import com.epistimis.uddl.query.query.ScalarComparePredicate;
import com.epistimis.uddl.query.query.SelectedEntity;
import com.epistimis.uddl.query.query.SelectedEntityCharacteristicReference;
import com.epistimis.uddl.query.query.SelectedEntityCharacteristicWildcardReference;
import com.epistimis.uddl.query.query.SelectedEntityExpression;
import com.epistimis.uddl.query.query.SetComparePredicate;
import com.epistimis.uddl.query.query.SetMembershipPredicate;
import com.epistimis.uddl.query.query.Subquery;
import com.epistimis.uddl.query.query.WhereClause;
import com.epistimis.uddl.query.services.QueryGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class QuerySemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private QueryGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == QueryPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case QueryPackage.BOOLEAN_EXPRESSION:
				sequence_BooleanExpression(context, (BooleanExpression) semanticObject); 
				return; 
			case QueryPackage.BOOLEAN_FACTOR:
				sequence_BooleanFactor(context, (BooleanFactor) semanticObject); 
				return; 
			case QueryPackage.BOOLEAN_TERM:
				sequence_BooleanTerm(context, (BooleanTerm) semanticObject); 
				return; 
			case QueryPackage.CHARACTERISTIC_BASIS_SET:
				sequence_CharacteristicBasisSet(context, (CharacteristicBasisSet) semanticObject); 
				return; 
			case QueryPackage.ENTITY_EXPRESSION:
				sequence_EntityExpression(context, (EntityExpression) semanticObject); 
				return; 
			case QueryPackage.ENTITY_JOIN_CRITERIA:
				sequence_EntityJoinCriteria(context, (EntityJoinCriteria) semanticObject); 
				return; 
			case QueryPackage.ENTITY_JOIN_EXPRESSION:
				sequence_EntityJoinExpression(context, (EntityJoinExpression) semanticObject); 
				return; 
			case QueryPackage.ENTITY_TYPE_CHARACTERISTIC_EQUIVALENCE_EXPRESSION:
				sequence_EntityTypeCharacteristicEquivalenceExpression(context, (EntityTypeCharacteristicEquivalenceExpression) semanticObject); 
				return; 
			case QueryPackage.ENUM_LITERAL_REFERENCE_EXPRESSION:
				sequence_EnumLiteralReferenceExpression(context, (EnumLiteralReferenceExpression) semanticObject); 
				return; 
			case QueryPackage.ENUM_LITERAL_SET:
				sequence_EnumLiteralSet(context, (EnumLiteralSet) semanticObject); 
				return; 
			case QueryPackage.EXISTS_PREDICATE:
				sequence_ExistsPredicate(context, (ExistsPredicate) semanticObject); 
				return; 
			case QueryPackage.EXPLICIT_SELECTED_ENTITY_CHARACTERISTIC_REFERENCE:
				sequence_ExplicitSelectedEntityCharacteristicReference(context, (ExplicitSelectedEntityCharacteristicReference) semanticObject); 
				return; 
			case QueryPackage.FROM_CLAUSE:
				sequence_FromClause(context, (FromClause) semanticObject); 
				return; 
			case QueryPackage.ORDER_BY_CLAUSE:
				sequence_OrderByClause(context, (OrderByClause) semanticObject); 
				return; 
			case QueryPackage.ORDERING_EXPRESSION:
				sequence_OrderingExpression(context, (OrderingExpression) semanticObject); 
				return; 
			case QueryPackage.PROJECTED_CHARACTERISTIC_LIST:
				sequence_ProjectedCharacteristicList(context, (ProjectedCharacteristicList) semanticObject); 
				return; 
			case QueryPackage.QUALIFIED_PROJECTED_CHARACTERISTIC_REFERENCE:
				sequence_QualifiedProjectedCharacteristicReference(context, (QualifiedProjectedCharacteristicReference) semanticObject); 
				return; 
			case QueryPackage.QUERY_IDENTIFIER:
				sequence_QueryIdentifier(context, (QueryIdentifier) semanticObject); 
				return; 
			case QueryPackage.QUERY_STATEMENT:
				sequence_QueryStatement(context, (QueryStatement) semanticObject); 
				return; 
			case QueryPackage.SCALAR_COMPARE_PREDICATE:
				sequence_ScalarComparePredicate(context, (ScalarComparePredicate) semanticObject); 
				return; 
			case QueryPackage.SELECTED_ENTITY:
				sequence_SelectedEntity(context, (SelectedEntity) semanticObject); 
				return; 
			case QueryPackage.SELECTED_ENTITY_CHARACTERISTIC_REFERENCE:
				sequence_SelectedEntityCharacteristicReference(context, (SelectedEntityCharacteristicReference) semanticObject); 
				return; 
			case QueryPackage.SELECTED_ENTITY_CHARACTERISTIC_WILDCARD_REFERENCE:
				sequence_SelectedEntityCharacteristicWildcardReference(context, (SelectedEntityCharacteristicWildcardReference) semanticObject); 
				return; 
			case QueryPackage.SELECTED_ENTITY_EXPRESSION:
				sequence_SelectedEntityExpression(context, (SelectedEntityExpression) semanticObject); 
				return; 
			case QueryPackage.SET_COMPARE_PREDICATE:
				sequence_SetComparePredicate(context, (SetComparePredicate) semanticObject); 
				return; 
			case QueryPackage.SET_MEMBERSHIP_PREDICATE:
				sequence_SetMembershipPredicate(context, (SetMembershipPredicate) semanticObject); 
				return; 
			case QueryPackage.SUBQUERY:
				sequence_Subquery(context, (Subquery) semanticObject); 
				return; 
			case QueryPackage.WHERE_CLAUSE:
				sequence_WhereClause(context, (WhereClause) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Criteria returns BooleanExpression
	 *     BooleanExpression returns BooleanExpression
	 *     BooleanPredicate returns BooleanExpression
	 *
	 * Constraint:
	 *     (term+=BooleanTerm term+=BooleanTerm*)
	 * </pre>
	 */
	protected void sequence_BooleanExpression(ISerializationContext context, BooleanExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     BooleanFactor returns BooleanFactor
	 *
	 * Constraint:
	 *     (not?=KW_NOT? pred=BooleanPredicate)
	 * </pre>
	 */
	protected void sequence_BooleanFactor(ISerializationContext context, BooleanFactor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     BooleanTerm returns BooleanTerm
	 *
	 * Constraint:
	 *     (factor+=BooleanFactor factor+=BooleanFactor*)
	 * </pre>
	 */
	protected void sequence_BooleanTerm(ISerializationContext context, BooleanTerm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     LogicalSet returns CharacteristicBasisSet
	 *     CharacteristicBasisSet returns CharacteristicBasisSet
	 *
	 * Constraint:
	 *     (characteristicBasis+=CharacteristicBasis characteristicBasis+=CharacteristicBasis*)
	 * </pre>
	 */
	protected void sequence_CharacteristicBasisSet(ISerializationContext context, CharacteristicBasisSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EntityExpression returns EntityExpression
	 *
	 * Constraint:
	 *     (selectedEntity=SelectedEntity eje+=EntityJoinExpression*)
	 * </pre>
	 */
	protected void sequence_EntityExpression(ISerializationContext context, EntityExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EntityJoinCriteria returns EntityJoinCriteria
	 *
	 * Constraint:
	 *     (etcee+=EntityTypeCharacteristicEquivalenceExpression etcee+=EntityTypeCharacteristicEquivalenceExpression*)
	 * </pre>
	 */
	protected void sequence_EntityJoinCriteria(ISerializationContext context, EntityJoinCriteria semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EntityJoinExpression returns EntityJoinExpression
	 *
	 * Constraint:
	 *     (joinEntity=JoinEntity entityJoinCriteria=EntityJoinCriteria)
	 * </pre>
	 */
	protected void sequence_EntityJoinExpression(ISerializationContext context, EntityJoinExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.ENTITY_JOIN_EXPRESSION__JOIN_ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.ENTITY_JOIN_EXPRESSION__JOIN_ENTITY));
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.ENTITY_JOIN_EXPRESSION__ENTITY_JOIN_CRITERIA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.ENTITY_JOIN_EXPRESSION__ENTITY_JOIN_CRITERIA));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEntityJoinExpressionAccess().getJoinEntityJoinEntityParserRuleCall_1_0(), semanticObject.getJoinEntity());
		feeder.accept(grammarAccess.getEntityJoinExpressionAccess().getEntityJoinCriteriaEntityJoinCriteriaParserRuleCall_3_0(), semanticObject.getEntityJoinCriteria());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EntityTypeCharacteristicEquivalenceExpression returns EntityTypeCharacteristicEquivalenceExpression
	 *
	 * Constraint:
	 *     (secr=SelectedEntityCharacteristicReference selectedEntity=SelectedEntityReference?)
	 * </pre>
	 */
	protected void sequence_EntityTypeCharacteristicEquivalenceExpression(ISerializationContext context, EntityTypeCharacteristicEquivalenceExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PredicateTerm returns EnumLiteralReferenceExpression
	 *     EnumLiteralReferenceExpression returns EnumLiteralReferenceExpression
	 *
	 * Constraint:
	 *     (typ=EnumerationTypeReference literal=EnumerationLiteralReference)
	 * </pre>
	 */
	protected void sequence_EnumLiteralReferenceExpression(ISerializationContext context, EnumLiteralReferenceExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.ENUM_LITERAL_REFERENCE_EXPRESSION__TYP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.ENUM_LITERAL_REFERENCE_EXPRESSION__TYP));
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.ENUM_LITERAL_REFERENCE_EXPRESSION__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.ENUM_LITERAL_REFERENCE_EXPRESSION__LITERAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEnumLiteralReferenceExpressionAccess().getTypEnumerationTypeReferenceParserRuleCall_1_0(), semanticObject.getTyp());
		feeder.accept(grammarAccess.getEnumLiteralReferenceExpressionAccess().getLiteralEnumerationLiteralReferenceParserRuleCall_3_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     LogicalSet returns EnumLiteralSet
	 *     EnumLiteralSet returns EnumLiteralSet
	 *
	 * Constraint:
	 *     (type=EnumerationTypeReference literal+=EnumerationLiteralReference literal+=EnumerationLiteralReference*)
	 * </pre>
	 */
	protected void sequence_EnumLiteralSet(ISerializationContext context, EnumLiteralSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     BooleanPredicate returns ExistsPredicate
	 *     ExistsPredicate returns ExistsPredicate
	 *
	 * Constraint:
	 *     sub=Subquery
	 * </pre>
	 */
	protected void sequence_ExistsPredicate(ISerializationContext context, ExistsPredicate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.EXISTS_PREDICATE__SUB) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.EXISTS_PREDICATE__SUB));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExistsPredicateAccess().getSubSubqueryParserRuleCall_1_0(), semanticObject.getSub());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProjectedCharacteristicExpression returns ExplicitSelectedEntityCharacteristicReference
	 *     ExplicitSelectedEntityCharacteristicReference returns ExplicitSelectedEntityCharacteristicReference
	 *
	 * Constraint:
	 *     (selectedEntityCharacteristicReference=SelectedEntityCharacteristicReference projectedCharacteristicAlias=ProjectedCharacteristicAlias?)
	 * </pre>
	 */
	protected void sequence_ExplicitSelectedEntityCharacteristicReference(ISerializationContext context, ExplicitSelectedEntityCharacteristicReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FromClause returns FromClause
	 *
	 * Constraint:
	 *     entity=EntityExpression
	 * </pre>
	 */
	protected void sequence_FromClause(ISerializationContext context, FromClause semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.FROM_CLAUSE__ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.FROM_CLAUSE__ENTITY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFromClauseAccess().getEntityEntityExpressionParserRuleCall_1_0(), semanticObject.getEntity());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OrderByClause returns OrderByClause
	 *
	 * Constraint:
	 *     (orderingExpression+=OrderingExpression orderingExpression+=OrderingExpression*)
	 * </pre>
	 */
	protected void sequence_OrderByClause(ISerializationContext context, OrderByClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OrderingExpression returns OrderingExpression
	 *
	 * Constraint:
	 *     (characteristic=ProjectedCharacteristicReference orderingType=OrderingType?)
	 * </pre>
	 */
	protected void sequence_OrderingExpression(ISerializationContext context, OrderingExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProjectedCharacteristicList returns ProjectedCharacteristicList
	 *
	 * Constraint:
	 *     (all=ALL_CHARACTERISTICS | (characteristic+=ProjectedCharacteristicExpression characteristic+=ProjectedCharacteristicExpression*))
	 * </pre>
	 */
	protected void sequence_ProjectedCharacteristicList(ISerializationContext context, ProjectedCharacteristicList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProjectedCharacteristicReference returns QualifiedProjectedCharacteristicReference
	 *     QualifiedProjectedCharacteristicReference returns QualifiedProjectedCharacteristicReference
	 *
	 * Constraint:
	 *     (selectedEntityReference=SelectedEntityReference characteristic=CharacteristicReference)
	 * </pre>
	 */
	protected void sequence_QualifiedProjectedCharacteristicReference(ISerializationContext context, QualifiedProjectedCharacteristicReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.QUALIFIED_PROJECTED_CHARACTERISTIC_REFERENCE__SELECTED_ENTITY_REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.QUALIFIED_PROJECTED_CHARACTERISTIC_REFERENCE__SELECTED_ENTITY_REFERENCE));
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.QUALIFIED_PROJECTED_CHARACTERISTIC_REFERENCE__CHARACTERISTIC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.QUALIFIED_PROJECTED_CHARACTERISTIC_REFERENCE__CHARACTERISTIC));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getQualifiedProjectedCharacteristicReferenceAccess().getSelectedEntityReferenceSelectedEntityReferenceParserRuleCall_0_0(), semanticObject.getSelectedEntityReference());
		feeder.accept(grammarAccess.getQualifiedProjectedCharacteristicReferenceAccess().getCharacteristicCharacteristicReferenceParserRuleCall_2_0(), semanticObject.getCharacteristic());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SelectedEntityReference returns QueryIdentifier
	 *     ProjectedCharacteristicReference returns QueryIdentifier
	 *     UnqualifiedProjectedCharacteristicReferenceOrAlias returns QueryIdentifier
	 *     CharacteristicReference returns QueryIdentifier
	 *     EntityTypeReference returns QueryIdentifier
	 *     EnumerationTypeReference returns QueryIdentifier
	 *     EnumerationLiteralReference returns QueryIdentifier
	 *     SelectedEntityAlias returns QueryIdentifier
	 *     ProjectedCharacteristicAlias returns QueryIdentifier
	 *     QueryIdentifier returns QueryIdentifier
	 *
	 * Constraint:
	 *     id=IDENTIFIER
	 * </pre>
	 */
	protected void sequence_QueryIdentifier(ISerializationContext context, QueryIdentifier semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.QUERY_IDENTIFIER__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.QUERY_IDENTIFIER__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getQueryIdentifierAccess().getIdIDENTIFIERTerminalRuleCall_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     QuerySpecification returns QueryStatement
	 *     QueryStatement returns QueryStatement
	 *
	 * Constraint:
	 *     (qualifier=SetQualifier? projectedCharacteristicList=ProjectedCharacteristicList selectedEntityExpression=SelectedEntityExpression)
	 * </pre>
	 */
	protected void sequence_QueryStatement(ISerializationContext context, QueryStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     BooleanPredicate returns ScalarComparePredicate
	 *     ScalarComparePredicate returns ScalarComparePredicate
	 *
	 * Constraint:
	 *     (left=PredicateTerm op=CompareOperator right=PredicateTerm)
	 * </pre>
	 */
	protected void sequence_ScalarComparePredicate(ISerializationContext context, ScalarComparePredicate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.SCALAR_COMPARE_PREDICATE__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.SCALAR_COMPARE_PREDICATE__LEFT));
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.SCALAR_COMPARE_PREDICATE__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.SCALAR_COMPARE_PREDICATE__OP));
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.SCALAR_COMPARE_PREDICATE__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.SCALAR_COMPARE_PREDICATE__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getScalarComparePredicateAccess().getLeftPredicateTermParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getScalarComparePredicateAccess().getOpCompareOperatorParserRuleCall_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getScalarComparePredicateAccess().getRightPredicateTermParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SelectedEntityCharacteristicReference returns SelectedEntityCharacteristicReference
	 *     PredicateTerm returns SelectedEntityCharacteristicReference
	 *     CharacteristicBasis returns SelectedEntityCharacteristicReference
	 *
	 * Constraint:
	 *     (selectedEntity=SelectedEntityReference? characteristic=CharacteristicReference)
	 * </pre>
	 */
	protected void sequence_SelectedEntityCharacteristicReference(ISerializationContext context, SelectedEntityCharacteristicReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProjectedCharacteristicExpression returns SelectedEntityCharacteristicWildcardReference
	 *     SelectedEntityCharacteristicWildcardReference returns SelectedEntityCharacteristicWildcardReference
	 *
	 * Constraint:
	 *     selectedEntity=SelectedEntityReference
	 * </pre>
	 */
	protected void sequence_SelectedEntityCharacteristicWildcardReference(ISerializationContext context, SelectedEntityCharacteristicWildcardReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.SELECTED_ENTITY_CHARACTERISTIC_WILDCARD_REFERENCE__SELECTED_ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.SELECTED_ENTITY_CHARACTERISTIC_WILDCARD_REFERENCE__SELECTED_ENTITY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSelectedEntityCharacteristicWildcardReferenceAccess().getSelectedEntitySelectedEntityReferenceParserRuleCall_0_0(), semanticObject.getSelectedEntity());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SelectedEntityExpression returns SelectedEntityExpression
	 *
	 * Constraint:
	 *     (from=FromClause where=WhereClause? orderBy=OrderByClause?)
	 * </pre>
	 */
	protected void sequence_SelectedEntityExpression(ISerializationContext context, SelectedEntityExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SelectedEntity returns SelectedEntity
	 *     JoinEntity returns SelectedEntity
	 *
	 * Constraint:
	 *     (entityType=EntityTypeReference selectedEntityAlias=SelectedEntityAlias?)
	 * </pre>
	 */
	protected void sequence_SelectedEntity(ISerializationContext context, SelectedEntity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SetComparePredicate returns SetComparePredicate
	 *
	 * Constraint:
	 *     (pred=PredicateTerm op=CompareOperator quantifier=SetCompareQuantifier set=CompareSet)
	 * </pre>
	 */
	protected void sequence_SetComparePredicate(ISerializationContext context, SetComparePredicate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.SET_COMPARE_PREDICATE__PRED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.SET_COMPARE_PREDICATE__PRED));
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.SET_COMPARE_PREDICATE__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.SET_COMPARE_PREDICATE__OP));
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.SET_COMPARE_PREDICATE__QUANTIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.SET_COMPARE_PREDICATE__QUANTIFIER));
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.SET_COMPARE_PREDICATE__SET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.SET_COMPARE_PREDICATE__SET));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSetComparePredicateAccess().getPredPredicateTermParserRuleCall_0_0(), semanticObject.getPred());
		feeder.accept(grammarAccess.getSetComparePredicateAccess().getOpCompareOperatorParserRuleCall_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getSetComparePredicateAccess().getQuantifierSetCompareQuantifierParserRuleCall_2_0(), semanticObject.getQuantifier());
		feeder.accept(grammarAccess.getSetComparePredicateAccess().getSetCompareSetParserRuleCall_3_0(), semanticObject.getSet());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SetMembershipPredicate returns SetMembershipPredicate
	 *
	 * Constraint:
	 *     (left=PredicateTerm not?=KW_NOT? set=LogicalSet)
	 * </pre>
	 */
	protected void sequence_SetMembershipPredicate(ISerializationContext context, SetMembershipPredicate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     LogicalSet returns Subquery
	 *     CompareSet returns Subquery
	 *     PredicateTerm returns Subquery
	 *     CharacteristicBasis returns Subquery
	 *     Subquery returns Subquery
	 *
	 * Constraint:
	 *     query=QueryStatement
	 * </pre>
	 */
	protected void sequence_Subquery(ISerializationContext context, Subquery semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.SUBQUERY__QUERY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.SUBQUERY__QUERY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSubqueryAccess().getQueryQueryStatementParserRuleCall_1_0(), semanticObject.getQuery());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     WhereClause returns WhereClause
	 *
	 * Constraint:
	 *     criteria=Criteria
	 * </pre>
	 */
	protected void sequence_WhereClause(ISerializationContext context, WhereClause semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.WHERE_CLAUSE__CRITERIA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.WHERE_CLAUSE__CRITERIA));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWhereClauseAccess().getCriteriaCriteriaParserRuleCall_1_0(), semanticObject.getCriteria());
		feeder.finish();
	}
	
	
}
