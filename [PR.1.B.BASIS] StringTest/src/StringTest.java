
public class StringTest {
	public static String addStrings(String s0, String s1) {
		return s0.concat(s1);
	}
	public static String addStringInt(String s0, int i0) {
		String returnString = new String();
		returnString.concat(" ");
		returnString.concat(Integer.toString(i0));
		return returnString;
	}
	public static int makeStringOfInt(String s0) {
		try {
			return Integer.parseInt(s0);
		} catch (NumberFormatException nfe) {
			throw nfe;
		}
	}
}
