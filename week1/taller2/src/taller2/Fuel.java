package taller2;

/**
 *Represent a spacecraft's fuel and its basic operations.
 * @author Luis Felipe Rivas Mina
 */
public class Fuel {
    /**
     * Represent the fuel's name
     */
    private String name;
    /**
     * Represent the fuel's autonomy
     */
    private double autonomy;
    /**
     * Represent the fuel's mass
     */
    private double mass;
    /**
     * Represent the fuel's volume
     */
    private double volume;

    /**
     * Instance a spacecraft's fuel
     * @param name fuel's name
     * @param autonomy fuel's autonomy
     * @param mass fuel's mass
     * @param volume fuel's volume
     */
    public Fuel(String name, double autonomy, double mass, double volume) {
        this.name = name;
        this.autonomy = autonomy;
        this.mass = mass;
        this.volume = volume;
    }

    /**
     *Update the fuel stateOn when it is consumed by the spacecraft.
     * @param wasteVolume The fuel's volume being consumed.
     */
    public void fuelWaste(double wasteVolume){
        if(this.volume > wasteVolume) {
            this.volume -= wasteVolume;
        }else {
            System.out.println("There is not enough fuel");
        }
    }


    /**
     * Get the fuel name.
     * @return fuel name.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the fuel name.
     * @param name is the fuel name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the fuel autonomy.
     * @return the fuel autonomy.
     */
    public double getAutonomy() {
        return autonomy;
    }

    /**
     * Set the fuel autonomy.
     * @param autonomy the fuel autonomy.
     */
    public void setAutonomy(float autonomy) {
        this.autonomy = autonomy;
    }

    /**
     * Get the fuel mass.
     * @return the fuel mass.
     */
    public double getMass() {
        return mass;
    }

    /**
     * Set the fuel mass.
     * @param mass fuel mass.
     */
    public void setMass(float mass) {
        this.mass = mass;
    }

    /**
     * Get the fuel's volume.
     * @return fuel's volume.
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Set the fuel's volume.
     * @param volume fuel's volume.
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }
}
