package exercise1.Model;

import java.util.ArrayList;

/**
 * Represent a Solar system.
 */
public class SolarSystem {
    /**
     *Represent the list of the solar System's planets
     */
    private ArrayList<Planet> planets;
    /**
     * Represent the sun of the solar system.
     */
    private Sun sun;

    /**
     * Instance an empty the solar system.
     */
    public SolarSystem() {
        this.planets =new ArrayList<>();
        sun=null;
    }

    /**
     * Set the Sun of the solar system.
     * @param sun the sun of the solar system.
     */

    public void setSun(Sun sun){
        this.sun=sun;
    }

    /**
     * Get the sun of the solar system.
     * @return the su of the solar system.
     */

    public Sun getSun() {
        return sun;
    }
    public void addPlanet(Planet planet){
        this.planets.add(planet);
    }

    public ArrayList<Planet> getPlanets() {
        return planets;
    }
    /**
     * Create a String of the solar system attributes.
     * @return String of the solar system attributes.
     */
    @Override
    public String toString() {
        return "SolarSystem{" +
                "" + planets +
                ", sun=[" + sun +"]"+
                '}';
    }
}