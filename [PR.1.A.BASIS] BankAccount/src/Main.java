import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random rnd = new Random();
		int secCode = rnd.nextInt(10000);
		BankAccount ba = new BankAccount("Arthur", 1000, secCode);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Your security code is: " + secCode);
		System.out.println("Press any key to continue...");
		try {br.readLine();} catch (IOException IOe) {}
		secCode = 0;
		loop: while (true) {
			clearScreen();
			System.out.println("1 = Check balance");
			System.out.println("2 = Withdraw");
			System.out.println("3 = Deposit");
			System.out.println("4 = Quit");
			int choice;
			try {
				choice = Integer.parseInt(br.readLine());
			} catch (IOException IOe) {
				System.out.println("Invalid input!");
				continue;
			}
			switch (choice) {
			case 1:
				System.out.println("Your balance is: " + ba.getCreditLevel());
				break;
			case 2:
				System.out.println("Please enter the amount of money that you want to withdraw...");
				int witAmount;
				try {
					witAmount = Integer.parseInt(br.readLine());
				} catch (Exception ex) {
					System.out.println("Invalid input!");
					break;
				}
				System.out.println("Please enter your security code...");
				try {
					ba.withDraw(Integer.parseInt(br.readLine()), witAmount);
				} catch (Exception ex) {
					System.out.println("Invalid input!");
					break;
				}
				System.out.println("Press any key to continue...");
				try {br.readLine();} catch (IOException ioe) {}
				break;
			case 3:
				System.out.println("Please enter the amount of money you want to deposit...");
				int depAmount;
				try {
					depAmount = Integer.parseInt(br.readLine());
				} catch (Exception ex) {
					System.out.println("Invalid input!");
					break;
				}
				ba.deposit(depAmount);
				System.out.println("Press any key to continue...");
				try {br.readLine();} catch (IOException ioe) {}
				break;
			case 4:
				System.out.println("Have a nice day!");
				break loop;
			default:
				System.out.println("Invalid input!");
				break;
			}
		}
	}

	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
