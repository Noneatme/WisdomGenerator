package de.noneatme.worldbuilder.code.program;

import de.noneatme.worldbuilder.code.program.sentence.cBasicSentence;
import de.noneatme.worldbuilder.code.program.sentence.cObjectSentence;
import de.noneatme.worldbuilder.code.program.wordDeclarations.cEnglishWordDeclaration;
import de.noneatme.worldbuilder.code.program.wordDeclarations.cGermanWordDeclaration;
import de.noneatme.worldbuilder.code.program.wordDeclarations.cWordDeclaration;
import de.noneatme.worldbuilder.code.program.words.cWord;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Noneatme on 28.11.2014.
 */
public class cSentenceBuilder
{
    public static final String version                  = "V 0.0.1";
    private String sLanguage;
    private List<String> listLanguages      = Arrays.asList("de", "en");

    // Constructor //
    public cSentenceBuilder(String sLanguage) throws Exception
    {
        this.sLanguage       = sLanguage;

        if(!this.isCorrectLanguage(this.sLanguage))
        {
            throw new Exception();
        }
    }

    // CheckLanguage //
    public boolean isCorrectLanguage(String sLanguage)
    {
        if(this.listLanguages.contains(sLanguage))
        {
            return true;
        }
        return false;
    }

    // GetLanguageDeclaration //
    private cWordDeclaration getLanguageDeclaration()
    {
        if(this.sLanguage.equals("de"))
        {
            return new cGermanWordDeclaration();
        }
        else if (this.sLanguage.equals("en"))
        {
            return new cEnglishWordDeclaration();
        }
        return null;
    }

    // BuildWord //
    public String buildSentence()
    {
        int minSentences    = 1;
        int maxSentences    = 3;
        int r = (int) (Math.random() * (maxSentences - minSentences)) + minSentences;
        System.out.println(r);
        if(r == 1)
        {
            return (new cBasicSentence(this.getLanguageDeclaration()).sSentence);
        }
        else if(r == 2)
        {
            return (new cObjectSentence(this.getLanguageDeclaration()).sSentence);
        }
        else
        {
            return (new cBasicSentence(this.getLanguageDeclaration()).sSentence);
        }
    }
}
