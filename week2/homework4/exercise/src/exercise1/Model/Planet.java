package exercise1.Model;

/**
 * Represent a plant and calculate its gravitational attraction with other celestial bodies.
 * @author Luis Felipe Rivas Mina.
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
     *  @param mass     the mass of the celestial body.
     * @param density  the density of the celestial body.
     * @param name     the name of the celestial body.
     * @param diameter the diameter of the celestial body.
     * @param distanceToSun the distance to the Sun of the planet.
     */
    public Planet(double mass, double density, String name, double diameter,double distanceToSun) {
        super(mass, density, name, diameter);
        this.distanceToSun = distanceToSun;
        this.id = counter;
        counter+=1;
    }

    /**
     * Calculate the gravitational attraction between a celestial body and a planet using the Newton law.
     * @param planetObject the planet use to calculate the gravitational attraction.
     * @return the gravitational attraction between a celestial body and a planet.
     */
    @Override
    public double gravitationalAttraction(Object planetObject) {
        Planet planet=(Planet) planetObject;
        double distance=Math.abs(this.distanceToSun-planet.getDistanceToSun());
        return this.getMass()*planet.getMass()*
                this.getGravityConstant()/Math.pow(distance,2);

    }

    /**
     * Get the planet's distance to the sun.
     * @return the planet's distance to the sun.
     */
    public double getDistanceToSun() {
        return distanceToSun;
    }

    /**
     * Create a String of the celestial body's attributes.
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
