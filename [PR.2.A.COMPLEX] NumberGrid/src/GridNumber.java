
public class GridNumber {
	private int number = 0;
	private int xPos;
	private int yPos;
	public GridNumber(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}
	private void increaseNumber() {
		number+= (xPos + yPos + 1);
	}
	public void outputNumber() {
		if (number < 10) {
			System.out.print(" 00" + number + " ");
			return;
		} else if (number < 100) {
			System.out.print(" 0" + number + " ");
			return;
		} else {
			System.out.print(" " + number + " ");
		}
	}
	public void increaseAndOut() {
		increaseNumber();
		outputNumber();
	}
}
