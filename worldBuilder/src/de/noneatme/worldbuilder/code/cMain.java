package de.noneatme.worldbuilder.code;

import de.noneatme.worldbuilder.code.program.cSentenceBuilder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Noneatme on 18.11.2014.
 */
public class cMain
{
    public static void main(String[] args)
    {
        try
        {
            cSentenceBuilder sentenceBuilder = new cSentenceBuilder("de");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while(true)
            {
                String input = br.readLine();
                System.out.println(sentenceBuilder.buildSentence());
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
