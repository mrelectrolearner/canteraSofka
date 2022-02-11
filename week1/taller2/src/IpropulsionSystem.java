/**
 * Represent the propulsion System interface
 * @author Luis Felipe Rivas
 */
public interface IpropulsionSystem {
    /**
     * Activate the propulsion system from lef to right.
     * @param power the power of the propulsion.
     */
    void propulsionPowerX(float power);

    /**
     * Activate the propulsion system from down to up.
     * @param power the power of the propulsion.
     */
    void propulsionPowerY(float power);

    /**
     * Activate the propulsion system back to forward.
     * @param power the power of the propulsion.
     */
    void propulsionPowerZ(float power);

}
