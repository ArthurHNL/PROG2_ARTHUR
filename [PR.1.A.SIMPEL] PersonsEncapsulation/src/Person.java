
public class Person {
	private String name;
	private int age; // (0 < value < 150)
	private String gender; // either "male" or "female"
	private double weight; // (0 < value < 500)
	private double length; // (0 < value < 2.5)
	private String skinColor; // either "white", "black", "brown" or "yellow"
	private String eyeColor; // either "brown", "blue" or "green"
	private String race; // either "caucasian", "african", "hispanic" or "asian"
	private boolean isMarried; // no checking necessary
	private int numOfChildren; // (0 <= value < 10)\

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			age = 0;
		}
		if (age > 150) {
			age = 150;
		}
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		if (!gender.equals("female") && !gender.equals("male")) {
			gender = "crazy buzzfeed feminist female";
		}
		this.gender = gender;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if (weight < 1.0) {
			weight = 1.0;
		} else if (weight > 500.0) {
			weight = 500.0;
		}
		this.weight = weight;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		if (length < 0.0) {
			length = 0.1;
		} else if (length > 2.5) {
			length = 2.5;
		}
		this.length = length;
	}

	public String getSkinColor() {
		return skinColor;
	}

	public void setSkinColor(String skinColor) {
		if (!skinColor.equals("black") && !skinColor.equals("brown") && !skinColor.equals("white")
				&& !skinColor.equals("yellow")) {
			skinColor = "white";
		}
		this.skinColor = skinColor;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		if (!eyeColor.equals("blue") && !eyeColor.equals("green") && !eyeColor.equals("brown")) {
			eyeColor = "blue";
		}
		this.eyeColor = eyeColor;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		if (!race.equals("caucasian") && !race.equals("african") && !race.equals("hispanic") && !race.equals("asian")) {
			race = "caucasian";
		}
		this.race = race;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	public int getNumOfChildren() {
		return numOfChildren;
	}

	public void setNumOfChildren(int numOfChildren) {
		if (numOfChildren < 0) {
			numOfChildren = 0;
		}
		this.numOfChildren = numOfChildren;
	}

}
