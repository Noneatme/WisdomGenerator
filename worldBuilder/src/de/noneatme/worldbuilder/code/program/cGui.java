package de.noneatme.worldbuilder.code.program;

import de.noneatme.worldbuilder.code.cMainApplet;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Created by Noneatme on 28.11.2014.
 */
public class cGui
{
	public JFrame frame;
	public cSentenceBuilder sentenceBuilder;
	private String startString;
	public JTextArea textArea;

	public String language	= "NA";

	// Simples Billiges GUI //
	public cGui()
	{
		this.frame = new JFrame("Wisdom Generator");
		frame.setSize(500, 250);

		this.startString = "Noneatme's Wisdomgenerator " + this.sentenceBuilder.version + "\nPress 1 for english wisdoms or press 2 for german wisdoms.!\n\n";
		textArea = new JTextArea(this.startString);

		JScrollPane pane = new JScrollPane(textArea);

		textArea.setEditable(false);

		this.frame.add(pane);

		textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));

		textArea.addKeyListener(new KeyListener()
		{
			@Override
			public void keyTyped(KeyEvent e)
			{

			}

			@Override
			public void keyPressed(KeyEvent e)
			{
				if(cMainApplet.gui.language.equals("NA"))
				{
					if(e.getKeyCode() == KeyEvent.VK_1)
					{
						cMainApplet.gui.language = "en";
						cMainApplet.gui.launch();
					}
					if(e.getKeyCode() == KeyEvent.VK_2)
					{
						cMainApplet.gui.language = "de";
						cMainApplet.gui.launch();
					}
					else
					{
						cMainApplet.gui.writeToTextArea("Please select your language.");
						cMainApplet.gui.writeToTextArea("Press 1 for english wisdoms or press 2 for german wisdoms!");
						cMainApplet.gui.writeToTextArea("");
					}
					if(!cMainApplet.gui.language.equals("NA"))
					{
						cMainApplet.gui.writeToTextArea(cMainApplet.gui.language + " is now the selected language. Press ENTER to generate wisdoms!");
						cMainApplet.gui.writeToTextArea("");
						cMainApplet.gui.writeToTextArea("");
					}
				}
				else
				{
					if (e.getKeyCode() == KeyEvent.VK_ENTER)
					{
						cMainApplet.gui.writeToTextArea(cMainApplet.gui.sentenceBuilder.buildSentence() + "\n");
					}
					else
					{
						String t = cMainApplet.gui.textArea.getSelectedText();
						Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(t), null);

					}
				}
			}

			@Override
			public void keyReleased(KeyEvent e)
			{

			}
		});

	}

	public void launch()
	{
		try
		{
			this.sentenceBuilder = new cSentenceBuilder(cMainApplet.gui.language);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public void writeToTextArea(String s)
	{
		this.startString = this.startString + s + "\n";
		this.textArea.setText(this.startString);
		this.textArea.setCaretPosition(this.textArea.getDocument().getLength());
	}
}
