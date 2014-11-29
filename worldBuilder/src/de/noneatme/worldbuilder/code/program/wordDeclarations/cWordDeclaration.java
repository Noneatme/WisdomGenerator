package de.noneatme.worldbuilder.code.program.wordDeclarations;

import java.util.List;

/**
 * Created by Noneatme on 28.11.2014.
 */
public abstract class cWordDeclaration
{
	public abstract String getSpacer();
	public abstract String getSentenceEnd();

	// NOUNS //
	public abstract List<String> getNouns();

	// VERBS //
	public abstract List<String> getVerbsAbsolute();
	public abstract List<String> getVerbs();

	// STATES //
	public abstract List<String> getTimeStates();

	// PRAEPOSITIONS //
	public abstract List<String> getPraepositions();

	// OBJECTS //
	public abstract List<String> getObjects();

	// GetLanguge //
	public abstract String getLanguage();
}
