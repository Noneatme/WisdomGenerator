package de.noneatme.worldbuilder.code.program.wordDeclarations;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Noneatme on 28.11.2014.
 */
public class cGermanWordDeclaration extends cWordDeclaration
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
		return Arrays.asList("ein Tier",
				"ein Haus", "eine Bratpfanne", "eine Tastatur",
				"deine Mutter", "ein Handy", "ein Lautsprecher",
				"Mett", "ein Spielzeug", "ein Bett",
				"eine Madratze", "ein Bahnhof", "ein Auto",
				"ein Salat", "ein Regal", "ein Taschentuch",
				"ein Administrator", "ein Computer", "ein Tischbein",
				"ein Bein", "ein Busch", "ein Fernseher",
				"ein Lichtschalter", "ein Baum", "eine Anlage",
				"eine Programmiersprache", "C++", "C#", "Java",
				"ein Sofa", "ein Teppich", "ein Wohnzimmer",
				"eine Kueche", "eine Strasse", "eine Kirche", "ein Kirchturm",
				"eine Glocke", "eine Melone", "ein Apfel", "eine Aprikose", "eine Birne",
				"eine Himbeere", "eine Pizza", "eine Nudel", "das Abwasser", "ein Kanal",
				"ein Smartphone", "eine Matte", "Kaese", "ein Headset", "Gott",
				"Jesus", "Lord Gaben", "Internet Explorer", "ein Meme", "9GAG",
				"Reddit", "Facebook", "Google", "YouTube", "Google+",
				"ein Tab", "ein Leesezeichen", "ein Keramikkochfeld",
				"eine Tuer", "eine Platte", "eine Heizung", "Schnee", "Brei",
				"eine Suppe", "ein Truthahn", "eine Toilette", "ein Waschbecken",
				"eine Baeckerei", "eine Konditorei", "ein Restaurant", "ein Kaffee",
				"eine Zigarette", "ein Abfalleimer", "eine Muelltonne", "ein Gleisbett",
				"ein Zug", "eine Schranke", "eine Markierung", "eine Energiesparlampe",
				"ein Monitor", "ein Zollstock", "eine Wand", "ein Fussboden", "ein Fussball",
				"ein Zaun", "ein Pool", "ein Baumhaus", "eine Latte", "ein Glas", "ein Fenster",
				"ein Bordstein", "ein Videospiel", "eine Konsole", "Windows 98", "ein Bahnuebergang",
				"eine Steckdose", "die Elektrizitaet", "Rick Astley", "Steve Jobs", "Bill Gates",
				"Sharika", "Leonardo DiCaprio", "Clint Eastwood", "Albert Einstein", "Steven Hawking",
				"Helene Fischer", "Johnny Cash", "Winston Churchill", "Adolf Hitler", "eine PaK 38",
				"eine FlaK 88", "John F. Kennedy", "Barack Obama", "Mitt Romney", "Nytech", "Abrahamn Lincoln",
				"eine Colt", "eine Waffe", "eine Panzerabwehrkannone", "Martin Luther King", "Manuel Neuer",
				"ein Weltrekord", "eine Schere", "eine Katze", "ein Hund", "ein Kondom");
	}

	@Override
	public List<String> getVerbsAbsolute()
	{
		return Arrays.asList(
				"ist", "hat", "kann",
				"macht", "baut", "schlaeft",
				"rennt", "geht", "malt",
				"verbrennt", "spielt", "singt",
				"schlaegt", "scheisst", "treibt",
				"schiesst", "stehlt", "steigt",
				"nimmt", "fliegt", "isst",
				"prophezeit"
		);
	}

	@Override
	public List<String> getVerbs()
	{
		return Arrays.asList(
				"bauen", "brennen", "rennen",
				"gehen", "haben", "tuen",
				"fliegen", "scheissen", "braten",
				"backen", "kochen", "prophezeien",
				"rennen", "gehen", "malen",
				"schiessen", "stehlen",
				"schlagen", "treiben", "schwimmen",
				"klauen"
		);
	}

	@Override
	public List<String> getTimeStates()
	{
		return Arrays.asList(
				"ab und zu", "manchmal", "immer mal wieder",
				"morgen", "heute", "uebermorgen", "jetzt", "irgendwann",
				"am Ende der Welt", "im Sommer", "im Winter", "im Herbst", "im Fruehling"
		);
	}

	@Override
	public List<String> getPraepositions()
	{
		return Arrays.asList(
				"durch", "fuer", "ohne", "gegen", "mit", "um", "auf",
				"vor", "zwischen", "hinter", "neben", "in", "unter", "ueber",
				"mittels", "abseits", "waehrend", "trotz", "aus", "mit", "bei"
		);
	}

	@Override
	public List<String> getObjects()
	{
		return Arrays.asList(
				"man", "jemand", "er", "sie", "es"

		);
	}

	@Override
	public String getLanguage()
	{
		return "de";
	}

}
