package exercise4;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

/**
 * Represent a vehicle and its basic operations.
 * @version 1.0.0 2022-02-15.
 * @author Luis Felipe Rivas.
 * @since 1.0.0 2022-02-15.
 */
public class Vehicle {
    private final int passengersNumber;
    private final boolean thereAreCrew;
    private final int wheelsNumber;
    private final Calendar registerDate;
    private final String travelMeans;
    private double[] position;
    private double[] velocity;

    /**
     * Instance a vehicle.
     * @param passengersNumber the passengers number
     * @param thereAreCrew represent is there are a crew.
     * @param wheelsNumber the wheels number.
     * @param registerDate the  vehicle's register date.
     * @param travelMeans the vehicle's travel means.
     */
    public Vehicle(int passengersNumber,
            boolean thereAreCrew,
            int wheelsNumber,
            Calendar registerDate,
            String travelMeans)
    {
        this.passengersNumber = passengersNumber;
        this.thereAreCrew = thereAreCrew;
        this.wheelsNumber = wheelsNumber;
        this.registerDate = Objects.requireNonNull(registerDate);
        this.travelMeans = Objects.requireNonNull(travelMeans);
        this.position = new double[3];
        this.velocity = new double[3];
    }

    /**
     * add two arrays of doubles of tree dimensions.
     * @param array1 the first array to add.
     * @param array2 the second array to add.
     * @return the addition of the first and second array.
     */

    private double[] addArrays(double [] array1, double[] array2){
        double[] sum = new double[3];
        for (int index = 0; index < array1.length; index++) {
            sum[index] = array1[index] + array2[index];
        }
        return sum;

    }

    /**
     *  Change the position of a vehicle a distance.
     * @param distance the distance to move the vehicle.
     */

    public void move(double[] distance){
        try {
           this.setPosition(this.addArrays(this.getPosition(), distance));
        }catch (ArrayIndexOutOfBoundsException exc ){
            System.out.println("Array out of index exception in the position addition:\n"+exc);


        }
    }

    /**
     * Change the velocity of the vehicle.
     * @param acceleration the amount that change the velocity.
     */
    public void speedup(double[] acceleration){
        try {
            this.setVelocity(this.addArrays(this.getVelocity(), acceleration));
        }catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Array out of index exception in the velocity addition:\n"+exc);

        }
    }

    /**
     * Get the passengers number.
     * @return the passengers number.
     */
    public int getPassengersNumber() {
        return passengersNumber;
    }

    /**
     * Get if the vehicle  are crewed.
     * @return if vehicle are crewed.
     */

    public boolean ThereAreCrew() {
        return thereAreCrew;
    }

    /**
     * Get the wheels number.
     * @return the wheels number.
     */

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    /**
     * Get the vehicle's register Date.
     * @return vehicle's register Date.
     */

    public Calendar getRegisterDate() {
        return registerDate;
    }

    /**
     * Get the vehicle's travel means.
     * @return vehicle's travel means.
     */

    public String getTravelMeans() {
        return travelMeans;
    }

    /**
     * Get the vehicle's position.
     * @return vehicle's position.
     */

    public double[] getPosition() {
        return position;
    }

    /**
     * Set the vehicle's position.
     * @param position the vehicle's position.
     */

    public void setPosition(double[] position) {
        this.position = Objects.requireNonNull(position);
    }

    /**
     * Get the velocity.
     * @return the velocity.
     */

    public double[] getVelocity() {
        return velocity;
    }

    /**
     * Set the vehicle's velocity.
     * @param velocity the vehicle's velocity.
     */

    public void setVelocity(double[] velocity) {
        this.velocity = Objects.requireNonNull(velocity);
    }

    /**
     * Catch in a string the information of the vehicle.
     * @return the vehicle's information.
     */

    @Override
    public String toString() {
        return "Vehicle{" +
                "passengersNumber=" + passengersNumber +
                ", thereAreCrew=" + thereAreCrew +
                ", wheelsNumber=" + wheelsNumber +
                ", registerDate=" +   registerDate.get(Calendar.DAY_OF_MONTH)+"/"
                + registerDate.get(Calendar.MONTH)+"/"+ registerDate.get(Calendar.YEAR)+
                ", travelMeans='" + travelMeans + '\'' +
                ", position=" + Arrays.toString(position) +
                ", velocity=" + Arrays.toString(velocity) +
                '}';
    }
}
