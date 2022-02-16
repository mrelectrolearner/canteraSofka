package exercise1.Model;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Represent a Solar system.
 * @version 1.0.0 2022-02-15.
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 * @since 1.0.0 2022-02-15.
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
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com
     * @since 1.0.0 2022-02-15.
     */
    public SolarSystem() {
        this.planets =new ArrayList<>();
        sun=null;
    }

    /**
     * Set the Sun of the solar system.
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com
     * @since 1.0.0 2022-02-15.
     * @param sun the sun of the solar system.
     */

    public void setSun(Sun sun){

        this.sun=Objects.requireNonNull(sun);
    }

    /**
     * Get the sun of the solar system.
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com
     * @since 1.0.0 2022-02-15.
     * @return the su of the solar system.
     */

    public Sun getSun() {

        return sun;
    }
    public void addPlanet(Planet planet){

        this.planets.add(Objects.requireNonNull(planet));
    }

    public ArrayList<Planet> getPlanets() {

        return planets;
    }
    /**
     * Create a String of the solar system attributes.
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com
     * @since 1.0.0 2022-02-15.
     * @return String of the solar system attributes.
     */
    @Override
    public String toString() {
        return "SolarSystem{"
                +" " + planets
                +", sun=[" + sun +"]"
                +'}';
    }
}
