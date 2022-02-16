package exercise5.Vehicles;

import exercise4.Vehicle;

import java.util.Calendar;

/**
 *Represent a bike and its basics behaviors.
 * @version 1.0.0 2022-02-15.
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 * @since 1.0.0 2022-02-15.
 */

public class Bike extends Vehicle {
    /**
     * Represent the Bike's pedal type.
     */
    private final String pedalType;

    /**
     * Instance a vehicle.
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15.
     *  @param passengersNumber the passengers number
     * @param thereAreCrew     represent is there are a crew.
     * @param wheelsNumber     the wheels number.
     * @param registerDate     the  vehicle's register date.
     * @param travelMeans      the vehicle's travel means.
     * @param pedalType  the Bike's pedal type.
     */
    public Bike(int passengersNumber, boolean thereAreCrew, int wheelsNumber, Calendar registerDate, String travelMeans, String pedalType) {
        super(passengersNumber, thereAreCrew, wheelsNumber, registerDate, travelMeans);
        this.pedalType = pedalType;
    }


    /**
     * Get the bike's type of pedal
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15.
     * @return bike's type of pedal.
     */

    public String getPedalType() {
        return pedalType;
    }

    /**
     * Catch in a string the information of the Bike.
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15.
     * @return the bike's information.
     */
    @Override
    public String toString() {
        return "Bike{" +
                "pedalType='" + pedalType + ","+'\'' +
                super.toString()+"} " ;
    }
}
