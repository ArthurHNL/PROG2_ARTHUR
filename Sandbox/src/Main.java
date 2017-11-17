
public class Main {
	
	public static void main(String[] args) {
		MyObject[] objects = new MyObject[5];
		objects[0] = new MyObject("A");
		objects[1] = new MyObject("B");
		objects[2] = new MyObject("C");
		objects[3] = new MyObject("D");
		objects[4] = new MyObject("E");
		for (int i = 0; i < 100; i++) {
			for(MyObject mo : objects) {
				mo.printMessage();
			}
		}
	}
}
