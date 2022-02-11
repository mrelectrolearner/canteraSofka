package taller2;

/**
 *Represent a spacecraft's fuel
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
    private float autonomy;
    /**
     * Represent the fuel's mass
     */
    private float mass;
    /**
     * Represent the fuel's volume
     */
    private float volume;

    /**
     * Instance a spacecraft's fuel
     * @param name fuel's name
     * @param autonomy fuel's autonomy
     * @param mass fuel's mass
     * @param volume fuel's volume
     */
    public Fuel(String name, float autonomy, float mass, float volume) {
        this.name = name;
        this.autonomy = autonomy;
        this.mass = mass;
        this.volume = volume;
    }

    /**
     *Update the fuel state when it is consumed by the spacecraft.
     * @param wasteVolume The fuel's volume being consumed.
     */
    public void fuelWaste(float wasteVolume){
        if(this.volume > wasteVolume) {
            this.volume -= wasteVolume;
        }else {
            System.out.println("There is not enough fuel");
        }
    }

    /**
     * Update the fuel state when it is refuel.
     * @param volumeToRefuel The fuel volume that is supply.
     * @param tankCapacity The tank capacity of the spacecraft.
     */
    public void refuel(float volumeToRefuel,float tankCapacity){
        float totalRefuel=this.volume +volumeToRefuel;
        if(totalRefuel<tankCapacity){
            this.volume =this.volume +volumeToRefuel;
        }else{
            System.out.println("not allowed, the tank is full");
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
    public float getAutonomy() {
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
    public float getMass() {
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
    public float getVolume() {
        return volume;
    }

    /**
     * Set the fuel's volume.
     * @param volume fuel's volume.
     */
    public void setVolume(float volume) {
        this.volume = volume;
    }
}
