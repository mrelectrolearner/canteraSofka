package taller2;

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
            double power, String name, String typeOfPropulsionSystem, Fuel fuel, int crewCapacity)
    {
        super(power, name, typeOfPropulsionSystem, fuel);
        this.crewCapacity = crewCapacity;
    }


    /**
     * Activate the propulsion system .
     *
     * @param power the power of the propulsion.
     */
    @Override
    public void propulsionPower(double[] power) {

    }

    /**
     * Check if the propulsion system is able to work.
     */
    @Override
    public boolean checkPropulsionSystem() {
        return false;
    }

    /**
     * Calculates the power value for a distance movement.
     *
     * @param distance Distance moved.
     * @return Power consumed.
     */
    @Override
    public double distanceToPower(double distance) {
        return 0;
    }

    /**
     * Calculates the fuel consumption for a power value.
     *
     * @param power the power use for the spacecraft.
     * @return the fuel consumed.
     */
    @Override
    public double powerToFuel(double power) {
        return 0;
    }
}
