package interactorPackage;

public class StringOperations {
	public static String firstWord(String input) {
		int indexOfFirstSpace = input.indexOf(" ");
		return input.substring(0, indexOfFirstSpace);
	}

	public static String toUpper(String input) {
		return input.toUpperCase();
	}

	public static String toLower(String input) {
		return input.toLowerCase();
	}

	public static boolean containsHallo(String input) {
		if (input.contains("hallo")) {
			return true;
		} else if (input.contains("Hallo")) {
			return true;
		} else {
			return false;
		}
	}

	public static String replace(String input, char oldChar, char newChar) {
		return input.replace(oldChar, newChar);
	}

	public static int countChar(String input, char charToCount) {
		char[] charArray = input.toCharArray();
		int count = 0;
		for (char c : charArray) {
			if (c == charToCount) {
				count++;
			}
		}
		return count;
	}
}
