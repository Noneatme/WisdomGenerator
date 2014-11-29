package de.noneatme.worldbuilder.code.program.words;

import de.noneatme.worldbuilder.code.program.wordDeclarations.cWordDeclaration;

/**
 * Created by Noneatme on 28.11.2014.
 * Ich weiss das der richtige Ausdruck ein anderer ist als TimeStatusWord, aber beim Programmieren hat man fuer sowas keine Zeit. :D
 */
public class cTimeStatusWord extends cWord
{

	// Constructor //
	public cTimeStatusWord(boolean bSentenceBeginning, cWordDeclaration dec)
	{
		super(bSentenceBeginning);

		int index = randomGen.nextInt(dec.getTimeStates().size());
		this.sWord	= dec.getTimeStates().get(index);

		if(bSentenceBeginning)
		{
			this.sWord = this.sWord.substring(0, 1).toUpperCase() + this.sWord.substring(1);
		}
	}

	@Override
	// Get Typ //
	public String getTyp()
	{
		return "Time Status Word";
	}
}
