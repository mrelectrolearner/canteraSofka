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
     * Launch the shuttle ship until it is out of earth (100000000).
     */
    public void launch(){
        double outOfEarthPosition=100000000;
        double[] positionIncrement={0,0.1,0};
        double[] position=this.getPosition();
        double[] positionToSet;
        while(this.getPosition()[1]<outOfEarthPosition){

            for (int index = 0; index < this.getPosition().length; index++) {
                positionToSet=new double[]{position[index] + positionIncrement[index]};
                this.setPosition(positionToSet);
            }
            position=this.getPosition();
        }
    }


    /**
     * Activate the propulsion system .
     *
     * @param power the power of the propulsion.
     */
    @Override
    public void propulsionPower(double[] power) {
        double[] acceleration = new double[0];
        double[] distance=new double[0];
        for(int index=0;index<power.length;index++){
            acceleration[index]=power[index]/(this.getMass());
            distance[index]=acceleration[index]*0.001+this.getSpeed()[index]*0.01;
        }

        this.speedUp(acceleration);
        this.move(distance);

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
