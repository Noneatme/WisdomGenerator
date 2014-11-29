package de.noneatme.worldbuilder.code.program.words;


import java.util.Random;

/**
 * Created by Noneatme on 28.11.2014.
 */
// Main Class for any word //
public abstract class cWord
{
	public String sWord;
	public String sTyp;
	public Random randomGen = new Random();

	private boolean isSentenceBeginning;

	// Constructor //
	protected cWord(boolean bSentenceBeginning)
	{
		this.isSentenceBeginning	= bSentenceBeginning;

	}


	// GetTyp //
	public abstract String getTyp();

	// Get Word //
	public String getWord()
	{
		return this.sWord;
	}
}
