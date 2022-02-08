package taller1;

import java.util.ArrayList;
import java.util.Date;
/**
 * Represents a programmer and some of its basic operations.
 * It extends the representation of a person.
 * @author luis
 *
 */
public class Programmer extends Person {
	/**
	 * Represent the list of programming language that the programmer is able to use.
	 */
	public ArrayList<String> programmingLanguages;
	/**
	 * Represent the programmer's years of experience.
	 */
	protected int yearsOfExperience; 
	/**
	 * Represent the programmer's education.
	 * 
	 */
	protected ArrayList<String> education;
	/**
	 * Represent the programmer's energy to work measured in coffee level.
	 */
	private int coffeeLevel;
/**
 * Instance the class programmer.
 * @param name The programmer's name.
 * @param lastName1 The programmer's first last name.
 * @param lastName2 The programmer's second last name.
 * @param dateBirth The programmer's date of birth.
 * @param height the programmer's height.
 * @param weight the programmer's weight.
 * @param programmingLanguages the list of programming language that the programmer is able to use.
 * @param yearsOfExpirience the programmer's years of experience.
 * @param education the programmer's education.
 * @param coffeeLevel the programmer's energy to work.
 */


	public Programmer(String name, String lastName1, String lastName2, Date dateBirth, float height, float weight,
			ArrayList<String> programmingLanguages, int yearsOfExpirience, ArrayList<String> education,
			int coffeeLevel) {
		super(name, lastName1, lastName2, dateBirth, height, weight);
		this.programmingLanguages = programmingLanguages;
		this.yearsOfExperience = yearsOfExpirience;
		this.education = education;
		this.coffeeLevel = coffeeLevel;
	}
	/***
	 * Decrease the programmer's  energy.
	 */
	private void decreaseCoffeeLevel() {
		this.coffeeLevel-=1;
	}
	
	/**
	 * Programmer write a line of code.
	 * @param programmingLanguage the programming language use to write the code.
	 * @param newLine the new line of the code.
	 * @return a new code.
	 */
	protected Code writeCodeLine(String programmingLanguage,String newLine) {
		Code code=new Code(programmingLanguage);
		code.addLine(newLine);
		decreaseCoffeeLevel();
		return code;
	}
	/**
	 * The programmers read a code.
	 * @param code the code to be read.
	 */

	protected void readCode(Code code) {
		ArrayList<String> codeLines=code.getCodeLines();
		for(String line: codeLines) {decreaseCoffeeLevel();	}	
	}
	/**
	 * Increase the energy.
	 * @param numberCupsofCoffee cup of coffee use to increase programmer energy.
	 */

	public void increaseCoffeeLevel(int numberCupsofCoffee){
		this.coffeeLevel=numberCupsofCoffee*5;
	}
	/**
	 * Get the programmer's years of experience.
	 * @return the programmer's years of experience.
	 */
	
	public int getYearsOfExperience() {
		return this.yearsOfExperience;
	}
	/**
	 * Set the programmer's years of experience.
	 * @param yearsOfExperience the programmer's years of experience to be set.
	 */

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience += yearsOfExperience;
	}
	/**
	 * Get the programmer's education list.
	 * @return programmer's education list.
	 */

	public ArrayList<String> getEducation() {
		return this.education;
	}
	/**
	 * Set the programmer's education list.
	 * @param education the programmer's education list to be set.
	 */

	public void setEducation(String education) {
		this.education.add(education);
	}
	/**
	 * Get the programmer's energy level.
	 * @return the programmer's energy level.
	 */
	
	public int getCoffeeLevel() {
		return coffeeLevel;
	}
	/**
	 * Set the programmer's energy level.
	 * @param coffeeLevel the programmer's energy level to be set.
	 */

	public void setCoffeeLevel(int coffeeLevel) {
		this.coffeeLevel = coffeeLevel;
	}
	/**
	 * Get programmer's programming languages list.
	 * @return programmer's programming languages list.
	 */

	public ArrayList<String> getProgrammingLanguages() {
		return programmingLanguages;
	}
	/**
	 * Set programmer's programming languages list.
	 * @param programmingLanguage programmer's programming languages to be added.
	 */

	public void setProgrammingLanguages(String programmingLanguage) {
		this.programmingLanguages.add(programmingLanguage);
	}


	
}
