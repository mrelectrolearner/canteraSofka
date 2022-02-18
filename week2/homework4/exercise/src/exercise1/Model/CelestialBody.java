package exercise1.Model;

import java.util.Objects;

/**
 * Represent a celestial body and some og its basic gravitational calculation.
 *
 * @version 1.0.0 2022-02-15.
 *
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com
 *
 * @since 1.0.0 2022-02-15.
 */

public abstract class CelestialBody {
    /**
     * Represent the gravitational Constant.
     */
    private final static double gravityConstant=8;
    /**
     * Represent the mass of the celestial body.
     */
    private final double mass;
    /**
     * Represent the density of the celestial body.
     */
    private final double density;
    /**
     * Represent the name of the celestial body.
     */
    private final String name;
    /**
     * Represent the diameter of the celestial body.
     */
    private final double diameter;


    /**
     * Instance a celestial body.
     *
     * @param mass the mass of the celestial body.
     * @param density  the density of the celestial body.
     * @param name  the name of the celestial body.
     * @param diameter the diameter of the celestial body.
     *
     * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-02-15.
     */

    public CelestialBody(double mass, double density, String name, double diameter) {
        this.mass = Objects.requireNonNull(mass);
        this.density =Objects.requireNonNull(density);
        this.name = name;
        this.diameter =Objects.requireNonNull(diameter);


    }

    /**
     * Calculate the gravitational attraction between a celestial body and a planet using the Newton law.
     *
     * @param planetObject the planet use to calculate the gravitational attraction.
     * @return the gravitational attraction between a celestial body and a planet.
     *
     * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-02-15.
     */

    public abstract double gravitationalAttraction(Object planetObject);

    /**
     * Calculate the gravitational force of the celestial body.
     *
     * @return gravitational force of the celestial body.
     * @exception ArithmeticException It catches when an exceptional arithmetic condition occur.
     * @exception Exception It catches exception that were not detected yet occur.
     *
     * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-02-15.
     */

    public double gravityForce(){
        try{
            double gForce=this.getMass()*this.getGravityConstant()/Math.pow(this.getDiameter(),2);
            return gForce;

        }catch (ArithmeticException exc){
            System.out.println("Arithmetic error in the gravity force calculation: \n" +exc);
            return 0;
        }catch (Exception exc){
            System.out.println("Error in the gravity force calculation: \n"+exc);
            return 0;
        }

    }

    /**
     * Get the celestial body's mass.
     * @return  celestial body's mass.
     *
     * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-02-15.
     */

    public double getMass() {
        return mass;
    }

    /**
     * Get the  celestial body's density.
     * @return  celestial body's density.
     *
     * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-02-15.
     */

    public double getDensity() {
        return density;
    }

    /**
     * Get the  celestial body's name.
     * @return  celestial body's name.
     *
     * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15.
     */

    public String getName() {
        return name;
    }

    /**
     * Get the  celestial body's diameter.
     * @return  celestial body's diameter.
     *
     * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15.
     */

    public double getDiameter() {
        return diameter;
    }

    /**
     * get the gravitational constant.
     * @return the gravitational constant.
     *
     * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-02-15.
     */

    public double getGravityConstant() {
        return gravityConstant;
    }

    /**
     * Create a String of the celestial body's attributes.
     * @return String of the celestial body's attributes.
     *
     * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-02-15.
     */
    @Override
    public String toString() {
        return  "mass=" + mass +
                ", density=" + density +
                ", name=" + name +
                ", diameter=" + diameter +
                ", gravityConstant=" + gravityConstant + " ";
    }
}
