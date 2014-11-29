package de.noneatme.worldbuilder.code.program.sentence;

import de.noneatme.worldbuilder.code.program.wordDeclarations.cWordDeclaration;
import de.noneatme.worldbuilder.code.program.words.cNoun;
import de.noneatme.worldbuilder.code.program.words.cTimeStatusWord;
import de.noneatme.worldbuilder.code.program.words.cVerb;

/**
 * Created by Noneatme on 28.11.2014.
 */
public class cBasicSentence extends cSentence
{
	public cBasicSentence(cWordDeclaration dec)
	{
		this.generateSentence(dec);
	}
	@Override
	public void generateSentence(cWordDeclaration dec)
	{
		if(dec.getLanguage() == "de")
		{
			// Nomen + spacer + Verb + Spacer + TimeStatus + Spacer + Nomen + End //
			this.sSentence =
					(new cNoun(true, dec).getWord()) +
							dec.getSpacer() +
							(new cVerb(false, dec, true).getWord()) +
							dec.getSpacer() +
							(new cTimeStatusWord(false, dec).getWord()) +
							dec.getSpacer() +
							(new cNoun(false, dec).getWord()) +
							dec.getSentenceEnd();
		}
		else if(dec.getLanguage() == "en")
		{
			this.sSentence =
					(new cNoun(true, dec).getWord()) +
							dec.getSpacer() +
							(new cVerb(false, dec, true).getWord()) +
							dec.getSpacer() +
							(new cNoun(false, dec).getWord()) +
							dec.getSpacer() +
							(new cTimeStatusWord(false, dec).getWord()) +
							dec.getSentenceEnd();
		}
	}
}
