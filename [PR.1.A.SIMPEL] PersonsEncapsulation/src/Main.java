
public class Main {

	public static void main(String[] args) {
		Person p0 = new Person();
		p0.setName("Henk");
		p0.setGender("male");
		p0.setAge(15);
		Person p1 = new Person();
		p1.setName("Sterre");
		p1.setAge(17);
		p1.setGender("female");
		PersonGroup pg = new PersonGroup();
		pg.addPerson(p0);
		pg.addPerson(p1);
		pg.findMen();
		pg.findWomen();
		pg.findOldest();
		pg.findYoungest();
	}

}
