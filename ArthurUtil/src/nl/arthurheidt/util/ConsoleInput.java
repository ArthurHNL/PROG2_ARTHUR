package nl.arthurheidt.util;

import java.util.Scanner;

/**
 * Class to read information from user console input
 * 
 * @author Arthur Heidt
 */
public class ConsoleInput {
	private Scanner sc;
	private boolean debugMode;

	/**
	 * Create a new ConsoleInput object. This will construct a Scanner with the
	 * inputstream System.in. This constructor will disable the debugmode by
	 * default.
	 */
	public ConsoleInput() {
		this(false);
	}

	/**
	 * Create a new ConsoleInput object. This will construct a Scanner with the
	 * inputstream System.in.
	 * 
	 * @param enableDebugMode
	 *            If true, will print exception messages to the console.
	 */
	public ConsoleInput(boolean enableDebugMode) {
		this.debugMode = enableDebugMode;
		this.sc = new Scanner(System.in);
	}

	/**
	 * This method can be used to toggle the debug mode. If the debug mode is
	 * enabled, all exception messages will be written to the console.
	 * 
	 * @param debugMode
	 *            TRUE to enable debug mode.
	 */
	public void setDebugMode(boolean debugMode) {
		this.debugMode = debugMode;
	}

	/**
	 * Get a String line from the console input
	 * 
	 * @return Line from the console input
	 */
	public String getString() {
		return sc.nextLine();
	}

	/**
	 * Will get a line from the console and try to parse it as an integer. Will
	 * handle exceptions for you and if the input can not be parsed, will return the
	 * value 76577432.
	 * 
	 * @return Parsed int from the console input
	 */
	public int getInt() {
		try {
			return Integer.parseInt(this.getString());
		} catch (NumberFormatException nex) {
			if (debugMode) {
				System.out.println("Something went wrong: " + nex.getMessage());
			}
			return 76577432;
		}
	}

	/**
	 * Will get a line from the console and try to parse it as an integer. Will pass
	 * NumberFormatExceptions to you.
	 * 
	 * @return Parsed int from the console input
	 * @throws NumberFormatException
	 *             if the input cannot be parsed.
	 */
	public int getIntAdvanced() throws NumberFormatException {
		try {
			return Integer.parseInt(this.getString());
		} catch (NumberFormatException nex) {
			throw nex;
		}
	}

	/**
	 * Will get a line from the console and try to parse it as a double. Will handle
	 * exceptions for you and if the input can not be parsed, will return the value
	 * 3.14159.
	 * 
	 * @return Parsed double from the console input
	 */
	public double getDouble() {
		try {
			return Double.parseDouble(this.getString());
		} catch (NumberFormatException nex) {
			if (debugMode) {
				System.out.println("Something went wrong: " + nex.getMessage());
			}
			return 3.14159;
		}
	}

	/**
	 * Will get a line from the console and try to parse it as a double. Will pass
	 * NumberFormatExceptions to you.
	 * 
	 * @return Parsed double from the console input
	 * @throws NumberFormatException
	 *             if the input cannot be parsed.
	 */
	public double getDoubleAdvanced() throws NumberFormatException {
		try {
			return Double.parseDouble(this.getString());
		} catch (NumberFormatException nex) {
			throw nex;
		}
	}

}
