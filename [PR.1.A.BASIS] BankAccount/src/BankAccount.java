import java.util.Random;
public class BankAccount {
	private int accountNumber;
	private String ownerName;
	private int creditLevel;
	private int securityCode;
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getCreditLevel() {
		return creditLevel;
	}
	public BankAccount(String firstOwnerName, int firstCreditLevel, int secCode) {
		this.setOwnerName(firstOwnerName);
		this.setCreditLevel(firstCreditLevel);
		Random rnd = new Random();
		int an = rnd.nextInt(900000) + 100000;
		this.accountNumber = an;
		this.securityCode = secCode;
		System.out.println("Created bank account with number: " + an);
	}
	private void setCreditLevel(int cl) {
		this.creditLevel = cl;
	}
	
	public void withDraw(int secCode, int amount) {
		if (amount < 0 || secCode != this.securityCode) {
			System.out.println("Nice try, the police has been notified!");
			return;
		}
		this.creditLevel -= amount;
		System.out.println(amount + " has been withdrawn from your account. Your balance is now: " + this.creditLevel);
	}
	public void deposit(int amount) {
		if (amount < 0) {
			System.out.println("Nice try!");
			return;
		}
		this.creditLevel += amount;
		System.out.println(amount + " has been added to your account. Your balance is now: " + this.creditLevel);
		
	}
	
	
	
}
