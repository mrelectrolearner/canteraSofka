package exercise1.Model;

import java.util.Objects;

/**
 * Represent a plant and calculate its gravitational attraction with other celestial bodies.
 * @version 1.0.0 2022-02-15.
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com
 * @since 1.0.0 2022-02-15.
 */
public class Planet extends CelestialBody {
    /**
     * Represent the counter of planets created.Use for creating the identifier  assign to the planets.
     */
    private static int counter=0;
    /**
     * Represent the distance to the sun of the planet.
     */
    private final double distanceToSun;
    /**
     * Represent the identifier of the planet.
     */
    private final int id;

    /**
     * Instance a celestial body.
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com
     * @since 1.0.0 2022-02-15.
     *  @param mass     the mass of the celestial body.
     * @param density  the density of the celestial body.
     * @param name     the name of the celestial body.
     * @param diameter the diameter of the celestial body.
     * @param distanceToSun the distance to the Sun of the planet.
     */
    public Planet(double mass, double density, String name, double diameter,double distanceToSun) {
        super(mass, density, name, diameter);
        this.distanceToSun = Objects.requireNonNull(distanceToSun);
        this.id = counter;
        counter+=1;
        boolean negativeDistanceToSun=(this.getDistanceToSun()<0);
        if(negativeDistanceToSun){
            throw new IllegalArgumentException("Negative distance to the sun is not allowed.");
        }

    }

    /**
     * Calculate the gravitational attraction between a celestial body and a planet using the Newton law.
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com
     * @since 1.0.0 2022-02-15.
     * @param planetObject the planet use to calculate the gravitational attraction.
     * @return the gravitational attraction between a celestial body and a planet.
     */
    @Override
    public double gravitationalAttraction(Object planetObject) {
        Planet planet=Objects.requireNonNull((Planet) planetObject);
        try{
            double distance=Math.abs(this.distanceToSun-planet.getDistanceToSun());
            return this.getMass()*planet.getMass()*
                    this.getGravityConstant()/Math.pow(distance,2);

        }catch (ArithmeticException exc){
            System.out.println("Arithmetic error in the gravity attraction calculation: \n"+exc);
            return 0;
        }catch (Exception exc){
            System.out.println("Error in the gravity attraction calculation: \n"+exc);
            return 0;
        }
    }

    /**
     * Get the planet's distance to the sun.
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com
     * @since 1.0.0 2022-02-15.
     * @return the planet's distance to the sun.
     */
    public double getDistanceToSun() {
        return distanceToSun;
    }

    /**
     * Create a String of the celestial body's attributes.
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com
     * @since 1.0.0 2022-02-15.
     * @return String of the planet attributes.
     */
    @Override
    public String toString() {
        return "Planet{" +
                "distanceToSun=" + distanceToSun +
                ", id=" + id +
                " " + super.toString()+"}\n";
    }
}
