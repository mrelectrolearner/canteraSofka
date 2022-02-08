package taller1;

import java.util.Date;
/**
 * Represent a person and some of its operations.
 * @author Luis Felipe Rivas
 *
 */
public class Person {
	/**
	 * The person's name.
	 */
	public String name;
	/**
	 * The person's first last name.
	 */
	public String lastName1;
	/**
	 * The person's second last name.
	 */
	public String lastName2;
	/**
	 * The person's date of birth.
	 */
	public Date dateBirth;
	/**
	 * The person's height.
	 */
	public float height;
	/**
	 * The person's weight.
	 */
	public float weight;
	
	/**
	 * Instance of the class person.
	 * @param name The person's name.
	 * @param lastName1 The person's first last name.
	 * @param lastName2 The person's second last name.
	 * @param dateBirth The person's date of birth.
	 * @param height The person's height.
	 * @param weight The person's weight.
	 */

	public Person(String name, String lastName1, String lastName2, Date dateBirth, float height, float weight) {
		this.name = name;
		this.lastName1 = lastName1;
		this.lastName2 = lastName2;
		this.dateBirth = dateBirth;
		this.height = height;
		this.weight = weight;
	}
	
	/**
	 * Set the person's name.
 	 * @param name the person's name to be set.
	 */
	public void setName(String name) {
		this.name=name;
	}
	/**
	 * Get the person's name.
	 * @return the person's name.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * Get the person's first last name.
	 * @return the person's first last name.
	 */
	public String getLastName1() {
		return this.lastName1;
	}
	/**
	 * Set the person's first last name.
	 * @param lastName1  the person's first last name to be set.
	 */
	public void setLastName1(String lastName1) {
		this.lastName1 = lastName1;
	}
	/**
	 * Get the person's second last name.
	 * @return the person's second last name.
	 */
	public String getLastName2() {
		return this.lastName2;
	}
	/**
	 * Set the person's second last name.
	 * @param lastName2 The person's second last name to be set.
	 */
	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}
	/**
	 * Get the person's date of birth.
	 * @return The person's date of birth.
	 */
	
	public Date getDateBirth() {
		return this.dateBirth;
	}
	/**
	 * Set the person's date of birth.
	 * @param dateBirth the person's date of birth to be set.
	 */
	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}
	/**
	 * Get the person's height.
	 * @return the person's height.
	 */
	public float getHeight() {
		return this.height;
	}
	/**
	 * Set the person's height. 
	 * @param height the person's height to be set.
	 */
	public void setHeight(float height) {
		this.height = height;
	}
	/**
	 * Get the person's weight.
	 * @return the person's weight.
	 */
	public float getWeight() {
		return this.weight;
	}
	/**
	 * Set the person's weight. 
	 * @param height the person's weight to be set.
	 */
	public void setWeight(float weight) {
		this.weight = weight;
	}

	
}
