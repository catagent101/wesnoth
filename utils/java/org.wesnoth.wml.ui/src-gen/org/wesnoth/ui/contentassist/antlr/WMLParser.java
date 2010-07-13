/*
* generated by Xtext
*/
package org.wesnoth.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.wesnoth.services.WMLGrammarAccess;

public class WMLParser extends AbstractContentAssistParser {
	
	@Inject
	private WMLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.wesnoth.ui.contentassist.antlr.internal.InternalWMLParser createParser() {
		org.wesnoth.ui.contentassist.antlr.internal.InternalWMLParser result = new org.wesnoth.ui.contentassist.antlr.internal.InternalWMLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getWMLRootAccess().getAlternatives(), "rule__WMLRoot__Alternatives");
					put(grammarAccess.getWMLMacroAccess().getValueAlternatives_2_0(), "rule__WMLMacro__ValueAlternatives_2_0");
					put(grammarAccess.getWMLTagAccess().getAlternatives_3(), "rule__WMLTag__Alternatives_3");
					put(grammarAccess.getWMLKeyValueAccess().getAlternatives(), "rule__WMLKeyValue__Alternatives");
					put(grammarAccess.getWMLKeyValueAccess().getKey1ValueAlternatives_0_0(), "rule__WMLKeyValue__Key1ValueAlternatives_0_0");
					put(grammarAccess.getPATHAccess().getAlternatives_0_1(), "rule__PATH__Alternatives_0_1");
					put(grammarAccess.getDIRECTIONAccess().getAlternatives_0(), "rule__DIRECTION__Alternatives_0");
					put(grammarAccess.getPROGRESSIVEAccess().getAlternatives_0(), "rule__PROGRESSIVE__Alternatives_0");
					put(grammarAccess.getPROGRESSIVEAccess().getAlternatives_1_1(), "rule__PROGRESSIVE__Alternatives_1_1");
					put(grammarAccess.getPROGRESSIVEAccess().getAlternatives_3_1(), "rule__PROGRESSIVE__Alternatives_3_1");
					put(grammarAccess.getPROGRESSIVEAccess().getAlternatives_3_2_1(), "rule__PROGRESSIVE__Alternatives_3_2_1");
					put(grammarAccess.getWMLMacroAccess().getGroup(), "rule__WMLMacro__Group__0");
					put(grammarAccess.getWMLTagAccess().getGroup(), "rule__WMLTag__Group__0");
					put(grammarAccess.getWMLKeyAccess().getGroup(), "rule__WMLKey__Group__0");
					put(grammarAccess.getFLOATAccess().getGroup(), "rule__FLOAT__Group__0");
					put(grammarAccess.getTSTRINGAccess().getGroup(), "rule__TSTRING__Group__0");
					put(grammarAccess.getTSTRINGAccess().getGroup_0(), "rule__TSTRING__Group_0__0");
					put(grammarAccess.getPATHAccess().getGroup(), "rule__PATH__Group__0");
					put(grammarAccess.getPATHAccess().getGroup_0(), "rule__PATH__Group_0__0");
					put(grammarAccess.getDIRECTIONAccess().getGroup(), "rule__DIRECTION__Group__0");
					put(grammarAccess.getLISTAccess().getGroup(), "rule__LIST__Group__0");
					put(grammarAccess.getLISTAccess().getGroup_1(), "rule__LIST__Group_1__0");
					put(grammarAccess.getPROGRESSIVEAccess().getGroup(), "rule__PROGRESSIVE__Group__0");
					put(grammarAccess.getPROGRESSIVEAccess().getGroup_1(), "rule__PROGRESSIVE__Group_1__0");
					put(grammarAccess.getPROGRESSIVEAccess().getGroup_2(), "rule__PROGRESSIVE__Group_2__0");
					put(grammarAccess.getPROGRESSIVEAccess().getGroup_3(), "rule__PROGRESSIVE__Group_3__0");
					put(grammarAccess.getPROGRESSIVEAccess().getGroup_3_2(), "rule__PROGRESSIVE__Group_3_2__0");
					put(grammarAccess.getPROGRESSIVEAccess().getGroup_3_3(), "rule__PROGRESSIVE__Group_3_3__0");
					put(grammarAccess.getWMLRootAccess().getRtagsAssignment_0(), "rule__WMLRoot__RtagsAssignment_0");
					put(grammarAccess.getWMLRootAccess().getRmacrosAssignment_1(), "rule__WMLRoot__RmacrosAssignment_1");
					put(grammarAccess.getWMLMacroAccess().getNameAssignment_1(), "rule__WMLMacro__NameAssignment_1");
					put(grammarAccess.getWMLMacroAccess().getValueAssignment_2(), "rule__WMLMacro__ValueAssignment_2");
					put(grammarAccess.getWMLTagAccess().getNameAssignment_1(), "rule__WMLTag__NameAssignment_1");
					put(grammarAccess.getWMLTagAccess().getTtagsAssignment_3_0(), "rule__WMLTag__TtagsAssignment_3_0");
					put(grammarAccess.getWMLTagAccess().getTkeysAssignment_3_1(), "rule__WMLTag__TkeysAssignment_3_1");
					put(grammarAccess.getWMLTagAccess().getTmacrosAssignment_3_2(), "rule__WMLTag__TmacrosAssignment_3_2");
					put(grammarAccess.getWMLTagAccess().getEndNameAssignment_5(), "rule__WMLTag__EndNameAssignment_5");
					put(grammarAccess.getWMLKeyAccess().getKeyNameAssignment_0(), "rule__WMLKey__KeyNameAssignment_0");
					put(grammarAccess.getWMLKeyAccess().getValueAssignment_2(), "rule__WMLKey__ValueAssignment_2");
					put(grammarAccess.getWMLKeyValueAccess().getKey1ValueAssignment_0(), "rule__WMLKeyValue__Key1ValueAssignment_0");
					put(grammarAccess.getWMLKeyValueAccess().getKey2ValueAssignment_1(), "rule__WMLKeyValue__Key2ValueAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.wesnoth.ui.contentassist.antlr.internal.InternalWMLParser typedParser = (org.wesnoth.ui.contentassist.antlr.internal.InternalWMLParser) parser;
			typedParser.entryRuleWMLRoot();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_SL_COMMENT" };
	}
	
	public WMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(WMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
