package de.noneatme.worldbuilder.code.program.wordDeclarations;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Noneatme on 29.11.2014.
 */
public class cEnglishWordDeclaration extends cWordDeclaration
{
	@Override
	public String getSpacer()
	{
		return " ";
	}

	@Override
	public String getSentenceEnd()
	{
		return ".";
	}

	@Override
	public List<String> getNouns()
	{
		return Arrays.asList(
				"a Tree","a Treehouse", "a House",
				"a Wall", "a Frying Pan", "a Keyboard", "a Smartphone",
				"Google", "a Tab", "God", "a Church", "a Melon", "a Toilet",
				"Jesus", "Lord Gaben", "Internet Explorer", "a Meme", "9GAG",
				"Reddit", "Facebook", "Google", "YouTube", "Google+",
				"Adolf Hitler", "a Cat", "a Dog", "a Condom", "a Wall",
				"a Ceiling", "a Boy", "a Girl", "a Bed", "a Display",
				"a CD", "a Record", "Steve Jobs", "a Window", "a Pool",
				"a Fence", "a Cherry", "a Headset", "Cheese",
				"a Bush", "a Leg", "Barack Obama", "a Speaker", "meat",
				"a Computer", "an Administrator", "a Car", "a Motorbike",
				"a Cigarette", "a Pizza", "a Sink", "a Bin", "Mitt Romney", "Abrahamn Lincoln",
				"Clint Eastwood", "Leonardo DiCaprio", "a Console", "a Video Game",
				"a Lego Figure", "a Movie", "John F. Kennedy", "Rick Astley",
				"a Melon", "a Street", "a Mat", "C#", "C++", "Java", "a Programming Language",
				"a Language", "a Shelf", "a Salad", "a Tool", "a Hammer", "a Soup",
				"Minecraft", "a Train", "some Cheese"
				);
	}

	@Override
	public List<String> getVerbsAbsolute()
	{
		return Arrays.asList(
				"is", "has", "can",
				"makes", "uses", "sleeps",
				"runs", "walks", "paints",
				"burnes", "plays", "eats",
				"takes", "shits", "punches",
				"predicts"

		);
	}

	@Override
	public List<String> getVerbs()
	{
		return Arrays.asList(
				"build", "burn", "run",
				"walk", "have", "do",
				"fly", "shit", "cook",
				"bake", "predict",
				"run", "walk", "paint",
				"shoot", "take", "punch",
				"swim", "steal"
		);
	}

	@Override
	public List<String> getTimeStates()
	{
		return Arrays.asList(
				"sometimes", "from time to time", "tomorrow", "today",
				"yesterday", "now", "someday", "at the end of the world",
				"in the summer", "in the winter", "in the autumn", "in the spring"

		);
	}

	@Override
	public List<String> getPraepositions()
	{
		return Arrays.asList(
				"by", "for", "without", "against", "with",
				"between", "behind", "next to", "in", "under", "over",
				"using"
		);
	}

	@Override
	public List<String> getObjects()
	{
		return Arrays.asList(
				"someone", "he", "she", "it", "anyone", "anybody", "somebody"

		);
	}

	@Override
	public String getLanguage()
	{
		return "en";
	}
}
