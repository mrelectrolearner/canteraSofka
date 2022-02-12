package taller2;

import java.util.Arrays;

/**
 * Represent the spacecraft and its basic actions using the launch site
 * as inertial reference system.
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
     * Represent the spacecraft's position vector {left to right, down to up, back to forward}.
     */
    private double[] position;
    /**
     * Represent the spacecraft's type of propulsion system.
     */
    private String typeOfPropulsionSystem;

    /**
     * Represent the spacecraft's fuel.
     */
    private Fuel fuel ;
    /**
     * Represent the spacecraft's mass.
     */
    private double mass;

    /**
     * Instance a spacecraft turn off and with a position in {0,0,0} and speed {0,0,0}.
     * @param power spacecraft's power.
     * @param name spacecraft's name.
     * @param typeOfPropulsionSystem  spacecraft's type of propulsion system.
     * @param fuel  spacecraft's fuel.
     * @param mass spacecraft's mass.
     */
    public Spacecraft(
            double power, String name, String typeOfPropulsionSystem, Fuel fuel, double mass)
    {
        this.mass = mass;
        this.speed = new double[]{0,0,0};
        this.power = power;
        this.name = name;
        this.fuel = fuel;
        this.position = new double[]{0, 0, 0};
        this.typeOfPropulsionSystem = typeOfPropulsionSystem;

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
     * Fuel consumption.
     * @param power the power use for the spacecraft.
     */
    private void fuelConsumed(double power){
        double fuelConsumed=Math.abs(this.powerToFuel(power));
        this.fuel.setVolume(this.fuel.getVolume()-fuelConsumed);
    }

    /**
     * Speed up the spacecraft with an acceleration in a time interval of 1ms.
     *
     * @param acceleration the acceleration thar is used to speed up the spacecraft.
     */
    protected void speedUp(double[] acceleration) {
        double timeInterval=0.001;

        for(int index=0;index<this.speed.length;index++){
            fuelConsumed(acceleration[index]*this.getMass());
            this.speed[index]= this.speed[index] + (timeInterval  * acceleration[index]);
        }
    }

    /**
     * Land the spacecraft.
     */
    public void land(){
        boolean land=Arrays.equals(this.position, new double[]{0, 0, 0});
        double minDistance=1; //With lower values a better resolution, but  my poor computer explodes.
        double minPowerConsumed=this.distanceToPower(minDistance);
        while(!land){
            for (int index = 0; index <this.position.length; index++){
                if(this.position[index]>0){
                    this.fuelConsumed(minPowerConsumed);
                    this.position[index]-=minDistance;
                }else if (this.position[index]<0){
                    this.fuelConsumed(minPowerConsumed);
                    this.position[index]+=minDistance;
                }
            }
            land=Arrays.equals(this.position, new double[]{0, 0, 0});
        }
    }

    /**
     * Move the spacecraft a distance.
     * @param distance the vector distance that is moved the spacecraft.
     */
    protected void move(double [] distance){
        double powerConsumed;
        for (int index = 0; index <this.position.length; index++){
            powerConsumed=this.distanceToPower(distance[index]);
            this.fuelConsumed(powerConsumed);
            this.position[index]+=distance[index];
        }

    }

    /**
     * Calculate the distance between the spacecraft and the site of the launch
     * use as reference inertial system.
     * @return the distance between the spacecraft and the site of the launch
     */
    public double calculateDistance(){
        double distance=0;
        for(int index=0;index<this.position.length;index++){
            distance+=Math.pow(this.position[index],2);
        }
        return Math.sqrt(distance);
    }

    /**
     * Get the mass.
     * @return spacecraft's mass.
     */
    public double getMass() {
        return mass;
    }

    /**
     * Set the mass.
     * @param mass spacecraft's mass to set.
     */

    public void setMass(double mass) {
        this.mass = mass;
    }

    /**
     * Get the spacecraft's speed vector.
     * @return speed vector.
     */
    public double[] getSpeed() {
        return speed;
    }

    /**
     * Set spacecraft's speed vector.
     * @param speed spacecraft's speed vector to set.
     */
    public void setSpeed(double[] speed) {
        this.speed = speed;
    }

    /**
     * Get the spacecraft's power.
     * @return spacecraft's power.
     */
    public double getPower() {
        return power;
    }

    /**
     * Set the spacecraft's power.
     * @param power spacecraft's power to set.
     */
    public void setPower(double power) {
        this.power = power;
    }

    /**
     * Get spacecraft's name.
     * @return spacecraft's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Set spacecraft's name.
     * @param name spacecraft's name to set.
     *
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get spacecraft's position vector.
     * @return  spacecraft's position vector.
     */
    public double[] getPosition() {
        return position;
    }

    /**
     * Set the  spacecraft's position vector.
     * @param position  spacecraft's position vector to set.
     */
    public void setPosition(double[] position) {
        this.position = position;
    }

    /**
     * Get the type of propulsion system used by the spacecraft.
     * @return type of propulsion system used by the spacecraft.
     */
    public String getTypeOfPropulsionSystem() {
        return typeOfPropulsionSystem;
    }

    /**
     * Set type of propulsion system used by the spacecraft.
     * @param typeOfPropulsionSystem type of propulsion system used by the spacecraft to set.
     */
    public void setTypeOfPropulsionSystem(String typeOfPropulsionSystem) {
        this.typeOfPropulsionSystem = typeOfPropulsionSystem;
    }

    /**
     * Get the spacecraft's fuel.
     * @return spacecraft's fuel.
     */

    public Fuel getFuel() {
        return fuel;
    }

    /**
     * Set spacecraft's fuel.
     * @param fuel spacecraft's fuel to set.
     */

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }
}
