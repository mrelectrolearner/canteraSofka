package taller2;

/**
 * Represent the spacecraft and its basic operation using the launch site
 * as inertial reference system and mks unit for measurement.
 *
 * @author  Luis Felipe Rivas
 */
public abstract class Spacecraft {
    /**
     * Represent the spacecraft's speed.
     */
    private float[] speed;
    /**
     * Represent the spacecraft's power.
     */
    private float power;
    /**
     * Represent the spacecraft's name.
     */
    private String name;
    /**
     * Represent the spacecraft's position.
     */
    private float[] position;
    /**
     * Represent the spacecraft's type of propulsion system.
     */
    private String typeOfPropulsionSystem;
    /**
     * Represent if the spacecraft is on.
     */
    public boolean state;
    /**
     * Represent the spacecraft's fuel.
     */
    private Fuel fuel ;

    /**
     * Instance a spacecraft turn off and with a position in {0,0,0}
     * @param speed spacecraft's speed.
     * @param power spacecraft's power.
     * @param name spacecraft's name.
     * @param typeOfPropulsionSystem  spacecraft's type of propulsion system.
     * @param fuel  spacecraft's fuel.
     */
    public Spacecraft(float speed, float power, String name, String typeOfPropulsionSystem, Fuel fuel) {
        this.speed = speed;
        this.power = power;
        this.name = name;
        this.fuel = fuel;
        this.position = new float[]{0, 0, 0};
        this.typeOfPropulsionSystem = typeOfPropulsionSystem;
        this.state =false;

    }

    /**
     * land the spacecraft.
     */
    public abstract void land();

    /**
     * Move the spacecraft  a distance
     * @param distance the vector distance that is moved the spacecraft.
     */
    public abstract void move(float [] distance);

    /**
     * Speed up the spacecraft with an acceleration.
     * @param acceleration the acceleration thar is used to speed up the spacecraft.
     */
    public abstract void speedUp(float[] acceleration);

}
