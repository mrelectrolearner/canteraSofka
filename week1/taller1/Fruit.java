package taller1;

import java.util.ArrayList;
/**
 * Represent a fruit and some basic operations.
 * @author Luis Felipe Rivas
 *
 */

public class Fruit {
	/**
	 * Represent the fruit's name.
	 */
	public String name;
	/**
	 * Represent the frut's average weight.
	 */
	private float averageWeight;
	/**
	 * Represent the fruit's color.
	 */
	public ArrayList<String> colors;
	/**
	 * Instance the fruit class
	 * @param name the name of the fruit.
	 * @param averageWeight the fruit's average weight.
	 * @param colors the fuit's color.
	 */

	public Fruit(String name, float averageWeight, ArrayList<String> colors) {
		super();
		this.name = name;
		this.averageWeight = averageWeight;
		this.colors = colors;
	}
	/**
	 * Get the fruit's name.
	 * @return the fruit's name.
	 */

	public String getName() {
		return name;
	}
	/**
	 * Set the fruit's name.
	 * @param name the fruit's name to be set.
	 */

	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Get the fruit's average weight.
	 * @return the fruit's average weight.
	 */

	public float getAverageWeight() {
		return averageWeight;
	}
	/**
	 * Set the fruit's average weight.
	 * @param averageWeight the fruit's average weight to be set.
	 */

	public void setAverageWeight(float averageWeight) {
		this.averageWeight = averageWeight;
	}
	/**
	 * Set the fruit's color.
	 * @param name the fruit's color to be set.
	 */

	public void setColor(String name) {
		this.colors.add(name);
	}
	/**
	 * Get the fruit's color list.
	 * @return the fruit's color list.
	 */
	
	public ArrayList <String> getColors(){
		return this.colors;
	}

}
