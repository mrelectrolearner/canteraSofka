package exercise5.Vehicles;

import exercise4.Vehicle;

import java.util.Calendar;

/**
 * Represent a boat and its basics behaviors.
 *
 * @version 1.0.0 2022-02-15.
 *
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 *
 * @since 1.0.0 2022-02-15.
 */
public class Boat extends Vehicle {
    /**
     * Represent if the boat is anchored.
     */
    private boolean isAnchored ;

    /**
     * Instance a vehicle.
     *
     *  @param passengersNumber the passengers number
     * @param thereAreCrew     represent is there are a crew.
     * @param wheelsNumber     the wheels number.
     * @param registerDate     the  vehicle's register date.
     * @param travelMeans      the vehicle's travel means.
     * @param isAnchored  Represent if the boat is anchored.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15.
     */
    public Boat(int passengersNumber,
                boolean thereAreCrew,
                int wheelsNumber,
                Calendar registerDate,
                String travelMeans,
                boolean isAnchored)
    {
        super(passengersNumber, thereAreCrew, wheelsNumber, registerDate, travelMeans);
        this.setAnchored(isAnchored);
    }

    /**
     * Change the position of a boat a distance.
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-02-15.
     * @param distance the distance to move the vehicle.
     */
    @Override
    public void move(double[] distance) {
        if(!isAnchored){
            super.move(distance);
        }else {
            System.out.println("The boat is anchored and cant move");
        }
    }

    /**
     * Get if the boat is anchored.
     * @return boolean if the boat is anchored.
     *
     * @version 1.0.0 2022-02-15.
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     */
    public boolean isAnchored() {
        return isAnchored;
    }

    /**
     * Set if the boat is anchored.
     * @param anchored boolean if the boat is anchored.
     *
     * @version 1.0.0 2022-02-15.
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     */

    public void setAnchored(boolean anchored) {
        isAnchored = anchored;
    }
    /**
     * Catch in a string the information of the Boat.
     * @return the Boat's information.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15.
     */
    @Override
    public String toString() {
        return "Boat{" +
                "isAnchored=" + isAnchored +","+'\'' +
                 super.toString()+"} ";
    }
}
