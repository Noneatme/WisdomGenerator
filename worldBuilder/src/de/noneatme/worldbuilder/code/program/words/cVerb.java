package de.noneatme.worldbuilder.code.program.words;

import de.noneatme.worldbuilder.code.program.wordDeclarations.cWordDeclaration;

import java.util.List;

/**
 * Created by Noneatme on 28.11.2014.
 */
public class cVerb extends cWord
{

	// Constructor //
	public cVerb(boolean bSentenceBeginning, cWordDeclaration dec, boolean bAbsolute)
	{
		super(bSentenceBeginning);

		// Dynamische Verbliste //
		List<String> verbList;

		// Absolutes Verb ? //
		if(bAbsolute)
			verbList	= dec.getVerbsAbsolute();
		else
			verbList	= dec.getVerbs();

		// Random Verb //
		int index = randomGen.nextInt(verbList.size());

		this.sWord	= verbList.get(index);

		// Beginning of sentence?//
		if(bSentenceBeginning)
		{
			this.sWord = this.sWord.substring(0, 1).toUpperCase() + this.sWord.substring(1);
		}
		// The Same thing for Noun, PraePosition and stuff //
	}

	@Override
	// Get Typ //
	public String getTyp()
	{
		return "VerbAbsolute";
	}
}
