package interactorPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Bob van der Putten
 * @version 1
 */
public class ConsoleIO
{
	BufferedReader br;
	
	// The constructor constructs our
	// BufferedReader object:
	public ConsoleIO()
	{
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public String readInput()
	{
		// Give returnstring a temp value so it 
		// resembles an error when nothing was read:
		String returnString = "ERROR";
		try
		{
			// Try to read a line of text:
			returnString = br.readLine();
		}
		catch(Exception e)		
		{
			// If the read didn't work, put something in the console:
			writeOutput("AII - Something went wrong: " + e.getMessage());
		}
		return returnString;
	}
	
	// This should be no problem for you:
	public void writeOutput(String message)
	{
		System.out.println(message);
	}
}