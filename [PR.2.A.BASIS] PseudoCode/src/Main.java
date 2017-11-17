import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Student[] sa = new Student[10];
		Random rnd = new Random();
		for (int i = 0; i < sa.length; i++) {
			sa[i] = new Student(rnd.nextInt(25) + 10);
		}
		int total = 0;
		int count = 0;
		double avg = 0;
		for (Student s : sa) {
			if (s != null) {
				count++;
				total += s.getAge();
			}
		}
		double totald = (double) (total);
		double countd = (double) (count);
		avg = totald / countd;
		for (Student s : sa) {
			if (s != null) {
				if (s.getAge() > avg){
					System.out.println(s.getAge());
				}
			}
		}

	}

}
