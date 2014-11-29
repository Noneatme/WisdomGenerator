package de.noneatme.worldbuilder.code.program.sentence;

import de.noneatme.worldbuilder.code.program.wordDeclarations.cWordDeclaration;

/**
 * Created by Noneatme on 28.11.2014.
 */
public abstract class cSentence
{
	public String sSentence;

	abstract void generateSentence(cWordDeclaration dec);

	public String getSentence()
	{
		return sSentence;
	}
}
