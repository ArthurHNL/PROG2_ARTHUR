package interactorPackage;

/**
 * @author Bob van der Putten
 * @version 1
 */
public class MainClass {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Make our input / output object
		ConsoleIO io = new ConsoleIO();

		System.out.println("Type a sentence...");
		String input = io.readInput();
		System.out.println("The first word is: " + StringOperations.firstWord(input));
		System.out.println("Capitalized: ");
		System.out.println(StringOperations.toUpper(input));
		System.out.println("Decapitalized: ");
		System.out.println(StringOperations.toLower(input));
		if (StringOperations.containsHallo(input)) {
			System.out.println("De zin bevat het woord \"hallo\"");
		} else {
			System.out.println("De zin bevat niet het woord \"hallo\"");
		}
		System.out.println(StringOperations.replace(input, 'a', 'e'));
		System.out.println("De zin bevat " + StringOperations.countChar(input, 'a') + " keer de letter a.");
	}

}
