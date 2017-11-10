import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Enter a number... (2 to exit)");
			int input;
			try {
				input = StringTest.makeStringOfInt(br.readLine());
			} catch (Exception ex) {
				if (ex instanceof NumberFormatException) {
					System.out.println("Invalid input!");
					continue;
				}
				System.out.println(ex.getMessage());
				continue;
			}
			if (input == 2) {
				break;
			}
			System.out.println(input);
		}
	}
}
