/*
 * generated by Xtext 2.33.0
 */
/*
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.query.formatting2

import com.epistimis.uddl.query.query.ProjectedCharacteristicList
import com.epistimis.uddl.query.query.QueryStatement
//import com.epistimis.uddl.query.services.QueryGrammarAccess
//import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class QueryFormatter extends AbstractFormatter2 {
	
	//@Inject extension QueryGrammarAccess

	def dispatch void format(QueryStatement queryStatement, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		queryStatement.projectedCharacteristicList.format
		queryStatement.selectedEntityExpression.format
	}

	def dispatch void format(ProjectedCharacteristicList projectedCharacteristicList, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (projectedCharacteristicExpression : projectedCharacteristicList.characteristic) {
			projectedCharacteristicExpression.format
		}
	}
	
	// TODO: implement for SelectedEntityCharacteristicWildcardReference, ExplicitSelectedEntityCharacteristicReference, SelectedEntityExpression, FromClause, EntityExpression, SelectedEntity, EntityJoinExpression, EntityJoinCriteria, EntityTypeCharacteristicEquivalenceExpression, SelectedEntityCharacteristicReference, WhereClause, OrderByClause, OrderingExpression, QualifiedProjectedCharacteristicReference, BooleanExpression, BooleanTerm, BooleanFactor, ScalarComparePredicate, SetMembershipPredicate, CharacteristicBasisSet, SetComparePredicate, ExistsPredicate, Subquery, EnumLiteralSet, EnumLiteralReferenceExpression
}
