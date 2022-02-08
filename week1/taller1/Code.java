package taller1;

import java.util.ArrayList;

/**
 * Represent a programming source code and some of its operations,
 * @author Luis Felipe Rivas 
 *
 */
public class Code {
	/**
	 * The programming language use coding.
	 */
	public String language;
	/**
	 * The code's line of the source program,
	 */
	private ArrayList<String> codeLines;
	/**
	 * the libraries use to build the source program.
	 */
	protected ArrayList<String> libraries;
	/**
	 * Instance of the source code.
	 * @param lenguage the language use to coding.
	 */

	public Code(String language) {
		this.language = language;
		this.codeLines=new ArrayList<>();
		this.libraries=new ArrayList<>();

	}
	/**
	 * Add a new line in the end of the code.
	 * @param line The line to be added.
	 */
	protected void addLine(String line){
		this.codeLines.add(line);
	}
	/**
	 * Delete a line of the code.
	 * @param lineNumber Index of the line to be deleted.
	 */
	protected void deleteLine(int lineNumber) {
		this.codeLines.remove(lineNumber);
	}
	/**
	 * Get the code's lines.
	 * @return The code's lines.
	 */
	public ArrayList<String> getCodeLines() {
		return this.codeLines;
	}
	/**
	 * Set the code's lines.
	 * @param codeLines The code's lines to be set.
	 */

	public void setCodeLines(ArrayList<String> codeLines) {
		this.codeLines = codeLines;
	}
	/**
	 * Get the language of the code.
	 * @return the code's language.
	 */

	
	public String getLanguage() {
		return this.language;
	}
	/**
	 * Set the code's language.
	 * @param lenguage the language of the code.
	 */
	public void setLanguage(String lenguage) {
		this.language = lenguage;
	}
	/**
	 * Get the libraries of the code.
	 * @return the labraries of the code.
	 */

	public ArrayList<String> getLibraries() {
		return this.libraries;
	}
	/**
	 * Set the libraries of the code.
	 * @param libraries the libraries of the code to be set.
	 */

	public void setLibraries(ArrayList<String> libraries) {
		this.libraries = libraries;
	}
	

}
