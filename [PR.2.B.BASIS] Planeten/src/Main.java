/**
 * 
 */

/**
 * @author Arthur Heidt
 * A main class to create planet arrays and objects
 *
 */
public class Main {

	/**
	 * @param args not used
	 */
	public static void main(String[] args) {
		Planet[] pa = {
				new Planet("Mercurius", 2000, 57, false, 2),
				new Planet("Venus", 2000, 108, false, 3),
				new Planet("Earth", 100000, 150, true, 1),
				new Planet("Mars", 200000, 228, true, 5)
		};
		for (Planet p : pa) {
			p.printOut();
		}

	}

}
