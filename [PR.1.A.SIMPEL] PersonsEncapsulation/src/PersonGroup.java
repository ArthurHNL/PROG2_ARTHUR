
public class PersonGroup {
	private Person[] persons;

	public PersonGroup() {
		persons = new Person[5];
	}

	public void addPerson(Person p) {
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] == null) {
				persons[i] = p;
				return;
			}
		}
		System.out.println("Error: no more space in the array!");
	}

	public void findYoungest() {
		int youngestIndex = -1;
		int youngestAge = 200;
		for (int i = 0; i < persons.length; i++) {
			Person p = persons[i];
			if (p != null) {
				if (p.getAge() < youngestAge) {
					youngestAge = p.getAge();
					youngestIndex = i;
				}
			}
		}
		if (youngestIndex == -1) {
			System.out.println("There are no persons in the array!");
		} else {
			System.out.println("The youngest person is " + persons[youngestIndex].getName());
		}
	}

	public void findOldest() {
		int youngestIndex = -1;
		int youngestAge = 0;
		for (int i = 0; i < persons.length; i++) {
			Person p = persons[i];
			if (p != null) {
				if (p.getAge() > youngestAge) {
					youngestAge = p.getAge();
					youngestIndex = i;
				}
			}
		}
		if (youngestIndex == -1) {
			System.out.println("There are no persons in the array!");
		} else {
			System.out.println("The oldest person is " + persons[youngestIndex].getName());
		}
	}

	public void findMen() {
		for (Person p : persons) {
			if (p != null) {
				if (p.getGender().equals("male")) {
					System.out.println(p.getName());
				}
			}
		}
	}

	public void findWomen() {
		for (Person p : persons) {
			if (p != null) {
				if (p.getGender().equals("female") || p.getGender().equals("crazy buzzfeed feminist female")) {
					System.out.println(p.getName());
				}
			}
		}
	}

}
