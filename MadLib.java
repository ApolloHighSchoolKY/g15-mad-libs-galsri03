//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

//io - input,output
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//Read one time from story.dat
//Scanner to chopup string
//Check if #... concatenate rand noun, @... concatenate verb, &...concatenate rand adjective
public class MadLib
{
	private ArrayList<String> verbs = new ArrayList<String>();
	private ArrayList<String> nouns = new ArrayList<String>();
	private ArrayList<String> adjectives = new ArrayList<String>();
	private String story = "";

	public MadLib()
	{
		verbs.add("punched");
		nouns.add("Walmart");
		adjectives.add("massive");
		story="I punched Walmart in a massive way";
	}

	public MadLib(String fileName)
	{
		//load stuff
		loadNouns();
		loadVerbs();
		loadAdjectives();
		try
		{
			//Read the different parts of the story and concatenate the resulting
			//story using the symbols to tell you the parts of speech
			Scanner reader = new Scanner(new File("story.dat"));
			String builder = "";
			String word = "";


			while (reader.hasNext()) {
				word = reader.next();
				if (word.equals("#"))
					story += getRandomNoun() + "";
				else if (word.equals("@"))
					story += getRandomVerb() + "";
				else if (word.equals("&"))
					story += getRandomAdjective() + "";
				else
				story += word + "";
			reader.close();

			//While there is more of the story, read in the word/symbol

				//If what was read in is one of the symbols, find a random
				//word to replace it.
			


		}
	}
		catch(Exception e)
		{
			System.out.println("Houston we have a problem!");
		}

	}

	public void loadNouns()
	{
		try
		{
			Scanner reader = new Scanner(new File("nouns.dat"));
			while(reader.hasNext())
				nouns.add(reader.next());
		}
		catch(Exception e)
		{
			System.out.println("nouns.dat does not exist");
		}

	}

	public void loadVerbs()
	{
		try
		{
			Scanner reader = new Scanner(new File("verbs.dat"));
			while(reader.hasNext())
			verbs.add(reader.next());
		}
		catch(Exception e)
		{
			System.out.println("verbs.dat does not exist");
		}
	}

	public void loadAdjectives()
	{
		try
		{
			Scanner reader = new Scanner(new File("adjectives.dat"));
			while(reader.hasNext())
			adjectives.add(reader.next());
		}
		catch(Exception e)
		{
			System.out.println("adjectives.dat does not exist");
		}
	}

	public String getRandomVerb()
	{
		int spot = Math.random()*verbs.size();
		return "" + verbs.get(spot);
	}

	public String getRandomNoun()
	{
		int spot = Math.random()*verbs.size();
		return "" + nouns.get(spot);


	}

	public String getRandomAdjective()
	{
		int spot = 	System.out.println((int)(Math.random()*verbs.size();
		return "" + adjectives.get(spot);
	}

	public String toString()
	{
		return "";
	}
}