package taller2;

/**
 * Represent the spacecraft and its basic actions using the launch site
 * as inertial reference system and mks unit for measurement.
 *
 * @author  Luis Felipe Rivas
 */
public abstract class Spacecraft {
    /**
     * Represent the spacecraft's speed.
     */
    private double[] speed;
    /**
     * Represent the power consumed by the spacecraft.
     */
    private double power;
    /**
     * Represent the spacecraft's name.
     */
    private String name;
    /**
     * Represent the spacecraft's position.
     */
    private double[] position;
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
     * Instance a spacecraft turn off and with a position in {0,0,0} and speed {0,0,0}.
     * @param power spacecraft's power.
     * @param name spacecraft's name.
     * @param typeOfPropulsionSystem  spacecraft's type of propulsion system.
     * @param fuel  spacecraft's fuel.
     */
    public Spacecraft( double power, String name, String typeOfPropulsionSystem, Fuel fuel) {
        this.speed = new double[]{0,0,0};
        this.power = power;
        this.name = name;
        this.fuel = fuel;
        this.position = new double[]{0, 0, 0};
        this.typeOfPropulsionSystem = typeOfPropulsionSystem;
        this.state =false;

    }

    /**
     * Speed up the spacecraft with an acceleration.
     *
     * @param acceleration the acceleration thar is used to speed up the spacecraft.
     */
    public void speedUp(double[] acceleration) {

    }

    /**
     * Calculates the power value for a distance movement.
     * @param distance Distance moved.
     * @return Power consumed.
     */
    public abstract double distanceToPower(double distance);


    /**
     * Calculates the fuel consumption for a power value.
     * @param power the power use for the spacecraft.
     * @return the fuel consumed.
     */
    public abstract double powerToFuel(double power);

    /**
     * fuel consumption
     * @param power the power use for the spacecraft
     */
    public void fuelConsumed(double power){
        double fuelConsumed=this.powerToFuel(power);
        this.fuel.setVolume(this.fuel.getVolume()-fuelConsumed);
    }

    /**
     * Land the spacecraft.
     */
    public void land(){
        boolean land=this.position.equals(new double[]{0,0,0});
        double minDistance=0.001;
        double minPowerConsumed=this.distanceToPower(minDistance);
        while(!land){
            for (int index = 0; index <position.length; index++){
                if(this.position[index]>0){
                    this.fuelConsumed(minPowerConsumed);
                    this.position[index]-=minDistance;
                }else if (this.position[index]<0){
                    this.fuelConsumed(minPowerConsumed);
                    this.position[index]+=minDistance;
                }
            }
        }
    };

    /**
     * Move the spacecraft a distance
     * @param distance the vector distance that is moved the spacecraft.
     */
    public void move(double [] distance){
        double powerConsumed=0;
        for (int index = 0; index <position.length; index++){
            powerConsumed=this.distanceToPower(distance[index]);
            this.fuelConsumed(powerConsumed);
            this.position[index]+=distance[index];
        }

    };







}
