package taller2;

/**
 * Represent the propulsion System interface and its basic actions.
 * @author Luis Felipe Rivas
 */
public interface IpropulsionSystem {
    /**
     * Activate the propulsion system .
     * @param power the power of the propulsion.
     */
    void propulsionPower(double[] power);

    /**
     * Check if the propulsion system is able to work.
     */
    boolean checkPropulsionSystem();


}
