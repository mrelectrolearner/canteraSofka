package exercise1.Model;

/**
 * Represent the Sun of a solar system and its gravitational attraction with other celestial bodies.
 * @version 1.0.0 2022-02-15.
 * @author Luis Felipe Rivas.
 * @since 1.0.0 2022-02-15.
 */

public class Sun extends CelestialBody{

    /**
     * Instance a sun.
     *
     * @param mass     the mass of the celestial body.
     * @param density  the density of the celestial body.
     * @param name     the name of the celestial body.
     * @param diameter the diameter of the celestial body.
     */
    public Sun(double mass,
               double density,
               String name,
               double diameter) {
        super(mass, density, name, diameter);
    }

    /**
     * Calculate the gravitational attraction between the sun and a planet using the Newton law.
     *
     * @param planetObject the planet use to calculate the gravitational attraction.
     * @return the gravitational attraction between a celestial body and a planet.
     */
    @Override
    public double gravitationalAttraction(Object planetObject) {
        try {
            Planet planet = (Planet) planetObject;
            return this.getMass() * planet.getMass() *
                    this.getGravityConstant() / Math.pow(planet.getDistanceToSun(), 2);
        }catch (ArithmeticException exc){
            System.out.println("Arithmetic error in the Gravitational Attraction calculation: \n"+exc);
            return 0;
        }catch (Exception exc){
            System.out.println("Error in the Gravitational Attraction calculation: \n"+exc);
            return 0;
        }
    }

    /**
     * Create a String of the sun attributes.
     * @return String of the sun attributes.
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
