
public class GridLine {
	private GridNumber[] gna;
	public GridLine(int yPos) {
		gna = new GridNumber[5];
		for (int i = 0; i < gna.length; i++) {
			gna[i] = new GridNumber(i, yPos);
			gna[i].outputNumber();
		}
	}
	public void increaseAndPrint() {
		for (GridNumber gn : gna) {
			gn.increaseAndOut();
		}
	}
	

}
