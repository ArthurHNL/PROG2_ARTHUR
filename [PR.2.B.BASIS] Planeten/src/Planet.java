/**
 * A simple planet
 * @author Arthur Heidt
 * @version 0.1
 *
 */
public class Planet {
	private String name; //[length = 1]
	private int mass; //[> 0, if =< 0 set 1]
	private int distanceToSun; //[> 0, if =< 0 set 1]
	private boolean canHaveLife; //[heeft altijd een waarde]
	private int numOfMoons; //[>= 0, if < 0 set 0]
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		if (name.length() < 1) {
			name = "A planet";
			System.out.println("Name was set to: \"A planet\"");
		}
		this.name = name;
	}
	/**
	 * @return the mass
	 */
	public int getMass() {
		return mass;
	}
	/**
	 * @param mass the mass to set
	 */
	public void setMass(int mass) {
		if (mass <= 0) {
			mass = 1;
			System.out.println("Mass was set to 1");
		}
		this.mass = mass;
	}
	/**
	 * @return the distanceToSun
	 */
	public int getDistanceToSun() {
		return distanceToSun;
	}
	/**
	 * @param distanceToSun the distanceToSun to set in 10^6 km
	 */
	public void setDistanceToSun(int distanceToSun) {
		if (distanceToSun <= 0) {
			distanceToSun = 1;
			System.out.println("Distance to sun awas set to 1.");
		}
		this.distanceToSun = distanceToSun;
	}
	/**
	 * @return the canHaveLife
	 */
	public boolean isCanHaveLife() {
		return canHaveLife;
	}
	/**
	 * @param canHaveLife the canHaveLife to set
	 */
	public void setCanHaveLife(boolean canHaveLife) {
		this.canHaveLife = canHaveLife;
	}
	/**
	 * @return the numOfMoons
	 */
	public int getNumOfMoons() {
		return numOfMoons;
	}
	/**
	 * @param numOfMoons the numOfMoons to set
	 */
	public void setNumOfMoons(int numOfMoons) {
		if (numOfMoons < 0) {
			numOfMoons = 0;
			System.out.println("Number of moons was set to 0");
		}
		this.numOfMoons = numOfMoons;
	}
	/**
	 * @param name name of the planet
	 * @param mass mass of the planet
	 * @param distanceToSun distance from the planet to the sun in 10^6 km
	 * @param canHaveLife if the planet can have life
	 * @param numOfMoons how many moons the planet has
	 */
	public Planet(String name, int mass, int distanceToSun, boolean canHaveLife, int numOfMoons) {
		this.setName(name);
		this.setMass(mass);
		this.setDistanceToSun(distanceToSun);
		this.setCanHaveLife(canHaveLife);
		this.setNumOfMoons(numOfMoons);
	}
	/**
	 * Print information about the planet to the console.
	 */
	public void printOut() {
		System.out.println("***" + this.name + "***");
		System.out.println("Mass: " + this.mass);
		System.out.println("Distance to sun: " + this.distanceToSun);
		if (this.canHaveLife) {
			System.out.println("Live can form on this planet: yes");
		} else {
			System.out.println("Live can form on this planet: no");
		}
		System.out.println("Number of moons: " + this.numOfMoons);
		System.out.print("***");
		for (int i = 0; i < this.name.length(); i++) {
			System.out.print("*");
		}
		System.out.println("***");
		System.out.println();
	}
	
	
	

}
