package de.noneatme.worldbuilder.code.program.words;

import de.noneatme.worldbuilder.code.program.wordDeclarations.cWordDeclaration;

/**
 * Created by Noneatme on 28.11.2014.
 */
public class cNoun extends cWord
{

	// Constructor //
	public cNoun(boolean bSentenceBeginning, cWordDeclaration dec)
	{
		super(bSentenceBeginning);

		int index = randomGen.nextInt(dec.getNouns().size());
		this.sWord	= dec.getNouns().get(index);


		if(bSentenceBeginning)
		{
			this.sWord = this.sWord.substring(0, 1).toUpperCase() + this.sWord.substring(1);
		}
		else
		{
			if(dec.getLanguage() == "en")
			{
				this.sWord = this.sWord.toLowerCase();
			}
		}
	}

	@Override
	// GetTyp //
	public String getTyp()
	{
		return "Noun";
	}
}
