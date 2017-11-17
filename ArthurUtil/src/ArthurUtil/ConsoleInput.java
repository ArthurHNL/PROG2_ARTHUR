package ArthurUtil;

import java.util.Scanner;

/**
 * Class to read information from user console input
 * 
 * @author Arthur Heidt
 * 
 *
 */
public class ConsoleInput {
	private Scanner sc;

	/**
	 * Create a new ConsoleInput object. This will construct a Scanner with the
	 * inputstream System.in
	 */
	public ConsoleInput() {
		this.sc = new Scanner(System.in);
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
	 * @param writeExceptions
	 *            TRUE if you want to write the exception messages to the console.
	 * @return Parsed int from the console input
	 */
	public int getInt(boolean writeExceptions) {
		try {
			return Integer.parseInt(this.getString());
		} catch (NumberFormatException nex) {
			if (writeExceptions) {
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
	 * @throws NumberFormatException if the input cannot be parsed.
	 */
	public int getIntAdvanced() throws NumberFormatException {
		try {
			return Integer.parseInt(this.getString());
		} catch (NumberFormatException nex) {
			throw nex;
		}
	}

	/**
	 * Will get a line from the console and try to parse it as a double. Will
	 * handle exceptions for you and if the input can not be parsed, will return the
	 * value 76577432.
	 * 
	 * @param writeExceptions
	 *            TRUE if you want to write the exception messages to the console.
	 * @return Parsed double from the console input
	 */
	public double getDouble(boolean writeExceptions) {
		try {
			return Double.parseDouble(this.getString());
		} catch (NumberFormatException nex) {
			if (writeExceptions) {
				System.out.println("Something went wrong: " + nex.getMessage());
			}
			return 76577432;
		}
	}

	/**
	 * Will get a line from the console and try to parse it as a double. Will pass
	 * NumberFormatExceptions to you.
	 * 
	 * @return Parsed double from the console input
	 * @throws NumberFormatException if the input cannot be parsed.
	 */
	public double getDoubleAdvanced() throws NumberFormatException {
		try {
			return Double.parseDouble(this.getString());
		} catch (NumberFormatException nex) {
			throw nex;
		}
	}

}
