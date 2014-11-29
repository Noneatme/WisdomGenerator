package de.noneatme.worldbuilder.code.program.sentence;

import de.noneatme.worldbuilder.code.program.wordDeclarations.cWordDeclaration;
import de.noneatme.worldbuilder.code.program.words.cNoun;
import de.noneatme.worldbuilder.code.program.words.cPraePosition;
import de.noneatme.worldbuilder.code.program.words.cTimeStatusWord;
import de.noneatme.worldbuilder.code.program.words.cVerb;

/**
 * Created by Noneatme on 28.11.2014.
 */
public class cObjectSentence extends cSentence
{
	public cObjectSentence(cWordDeclaration dec)
	{
		this.generateSentence(dec);
	}
	@Override
	public void generateSentence(cWordDeclaration dec)
	{
		// Praeposition + Nomen + Verb + Nomen + TimeStatus + Nomen + End //
		if(dec.getLanguage() == "de")
		{
			this.sSentence =
					(new cPraePosition(true, dec).getWord()) +
							dec.getSpacer() +
							(new cNoun(false, dec).getWord()) +
							dec.getSpacer() +
							(new cVerb(false, dec, true).getWord()) +
							dec.getSpacer() +
							(new cTimeStatusWord(false, dec).getWord()) +
							dec.getSpacer() +
							(new cNoun(false, dec).getWord()) +
							dec.getSpacer() +
							(new cNoun(false, dec).getWord()) +
					/*
					(new cVerb(false, dec, false).getWord()) + */
							dec.getSentenceEnd()
			;
		}
		else if(dec.getLanguage() == "en")
		{
			this.sSentence =
					(new cPraePosition(true, dec).getWord()) +
							dec.getSpacer() +
							(new cNoun(false, dec).getWord()) +
							dec.getSpacer() +
							(new cNoun(false, dec).getWord()) +
							dec.getSpacer() +
							(new cVerb(false, dec, true).getWord()) +
							dec.getSpacer() +
							(new cNoun(false, dec).getWord()) +
							dec.getSpacer() +
							(new cTimeStatusWord(false, dec).getWord()) +
					/*
					(new cVerb(false, dec, false).getWord()) + */
							dec.getSentenceEnd()
			;
		}
	}
}
