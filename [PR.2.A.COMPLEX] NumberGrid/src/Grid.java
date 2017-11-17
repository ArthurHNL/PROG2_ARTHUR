import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Grid {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		GridLine[] gla = new GridLine[5];
		for (int i = 0; i < gla.length; i++) {
			gla[i] = new GridLine(i);
			System.out.println();
		}
		System.out.println();
		System.out.println();
		while(true) {
			try {
				br.readLine();
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
			for (GridLine gl : gla) {
				gl.increaseAndPrint();
				System.out.println();
			}
			System.out.println();
			System.out.println();
		}
	}
		
}
