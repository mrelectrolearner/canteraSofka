package taller2;

public class UnmannedSpacecraft extends Spacecraft implements IpropulsionSystem {


    /**
     * Instance a spacecraft turn off and with a position in {0,0,0} and speed {0,0,0}.
     *
     * @param power                  spacecraft's power.
     * @param name                   spacecraft's name.
     * @param typeOfPropulsionSystem spacecraft's type of propulsion system.
     * @param fuel                   spacecraft's fuel.
     */
    public UnmannedSpacecraft(
            double power, String name, String typeOfPropulsionSystem, Fuel fuel, double mass) {
        super(power, name, typeOfPropulsionSystem, fuel, mass);

    }

    /**
     * Calculates the power value for a distance movement.
     *
     * @param distance Distance moved.
     * @return Power consumed.
     */
    @Override
    public double distanceToPower(double distance) {
        double powerAux = Math.abs(this.calculateDistance() - distance) * 5;
        return powerAux;
    }

    /**
     * Calculates the fuel consumption for a power value.
     *
     * @param power the power use for the spacecraft.
     * @return the fuel consumed.
     */
    @Override
    public double powerToFuel(double power) {
        return Math.abs(this.getPower() - power) * 5;
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
            acceleration[index]=power[index]*0.001;
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

}
