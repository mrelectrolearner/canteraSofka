package taller2;
/**
* Represent the manned spacecraft and its basics operations.
* @author Luis Felipe Rivas.
*/

public class MannedSpacecraft extends Spacecraft implements IpropulsionSystem {
    /**
     * represents the maximum number of people in the crew.
     */
    private int crewCapacity;

    /**
     * Instance the maned spacecraft
     * @param power spacecraft's power.
     * @param name spacecraft's name.
     * @param typeOfPropulsionSystem  spacecraft's type of propulsion system.
     * @param fuel  spacecraft's fuel.
     * @param crewCapacity maximum number of people in the crew.
     */
    public MannedSpacecraft(
            double power,
            String name,
            String typeOfPropulsionSystem,
            Fuel fuel,
            int crewCapacity,
            double mass)
    {
        super(power, name, typeOfPropulsionSystem, fuel, mass);
        this.crewCapacity = crewCapacity;
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
            acceleration[index]=power[index]/this.calculateDistance();
        }
        this.speedUp(acceleration);
    }

    /**
     * Move the spacecraft a distance.
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

        return distance*5;
    }

    /**
     * Calculates the fuel consumption for a power value.
     *
     * @param power the power use for the spacecraft.
     * @return the fuel consumed.
     */
    @Override
    public double powerToFuel(double power) {
        return power/10;
    }
}
