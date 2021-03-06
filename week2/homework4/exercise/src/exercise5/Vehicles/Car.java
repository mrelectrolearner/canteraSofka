package exercise5.Vehicles;

import exercise4.Vehicle;

import java.util.Calendar;

/**
 * Represent a car and its basics behaviors.
 *
 * @version 1.0.0 2022-02-15.
 *
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 *
 * @since 1.0.0 2022-02-15.
 */
public class Car extends Vehicle {
    /**
     * Represent if the car has five doors.
     */
    private final boolean arefiveDoors;

    /**
     * Instance a vehicle.
     *  @param passengersNumber the passengers number
     * @param thereAreCrew     represent is there are a crew.
     * @param wheelsNumber     the wheels number.
     * @param registerDate     the  vehicle's register date.
     * @param travelMeans      the vehicle's travel means.
     * @param arefiveDoors   represent if the car has five doors.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-02-15.
     */
    public Car(int passengersNumber,
               boolean thereAreCrew,
               int wheelsNumber,
               Calendar registerDate,
               String travelMeans,
               boolean arefiveDoors)
    {
        super(passengersNumber, thereAreCrew, wheelsNumber, registerDate, travelMeans);
        this.arefiveDoors = arefiveDoors;
    }

    /**
     * Get if there are five doors in the car.
     * @return boolean if there are five doors in the car.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15.
     */
    public boolean refiveDoors() {
        return arefiveDoors;
    }
    /**
     * Catch in a string the information of the car.
     * @return the car's information.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15.
     */
    @Override
    public String toString() {
        return "Car{" +
                "arefiveDoors=" + arefiveDoors +","+'\'' +
                super.toString()+"} ";
    }
}
