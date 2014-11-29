package de.noneatme.worldbuilder.code;

import de.noneatme.worldbuilder.code.program.cGui;
import de.noneatme.worldbuilder.code.program.cSentenceBuilder;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Noneatme on 28.11.2014.
 */
public class cMainApplet extends JApplet
{
	public static cGui gui;

	public void init()
	{

		try
		{
			SwingUtilities.invokeAndWait(new Runnable()
			{
				public void run()
				{
					cMainApplet.gui = new cGui();
					setContentPane(cMainApplet.gui.frame.getContentPane());
					setSize(500, 250);
				}
			});
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}

