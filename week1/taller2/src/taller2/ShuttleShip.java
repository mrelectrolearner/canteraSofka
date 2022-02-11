package taller2;

/**
 * Represent a shuttleShip and its basic actions.
 *
 * @author Luis Felipe RIvas
 */

public class ShuttleShip extends Spacecraft implements IpropulsionSystem{
    private double loadCarryingCapacity;

    /**
     * Instance a shuttleShip turn off and with a position in {0,0,0} and speed {0,0,0}.
     *  @param power                  spacecraft's power.
     * @param name                   spacecraft's name.
     * @param typeOfPropulsionSystem spacecraft's type of propulsion system.
     * @param fuel                   spacecraft's fuel.
     * @param loadCarryingCapacity the load carrying capacity of the spacecraft.
     */
    public ShuttleShip(
            double power,
            String name,
            String typeOfPropulsionSystem,
            Fuel fuel,
            double loadCarryingCapacity,double mass)
    {
        super(power, name, typeOfPropulsionSystem, fuel, mass);
        this.loadCarryingCapacity = loadCarryingCapacity;
    }



    /**
     * Activate the propulsion system .
     *
     * @param power the power of the propulsion.
     */
    @Override
    public void propulsionPower(double[] power) {
        double[] acceleration = new double[3];

        for(int index=0;index<power.length;index++){
            acceleration[index]=1+power[index]/(this.getMass());

        }

        this.speedUp(acceleration);


    }

    /**
     * Move the spacecraft.
     * @param distance the vector distance that is moved the spacecraft.
     */
    @Override
    protected void move(double[] distance) {
        super.move(distance);
        propulsionPower(distance);
    }


    /**
     * Calculates the power value for a distance movement.
     *
     * @param distance Distance moved.
     * @return Power consumed.
     */
    @Override
    public double distanceToPower(double distance) {
        double height=this.getPosition()[1];
        double gravity=9.8;
        double factor=1.5;
        double mass=this.getMass()*factor;
        return distance*gravity*mass*height;
    }

    /**
     * Calculates the fuel consumption for a power value.
     *
     * @param power the power use for the spacecraft.
     * @return the fuel consumed.
     */
    @Override
    public double powerToFuel(double power) {
        return power*(this.calculateDistance())/10000;
    }
}
