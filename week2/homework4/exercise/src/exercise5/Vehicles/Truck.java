package exercise5.Vehicles;

import exercise4.Vehicle;

import java.util.Calendar;

/**
 * Represent a truck and ist basic behaviors.
 * @version 1.0.0 2022-02-15.
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 * @since 1.0.0 2022-02-15.
 */
public class Truck extends Vehicle {
    /**
     * Represent the truck's height.
     */
    private final double height;
    /**
     * Represent the truck's load capacity.
     */
    private final double loadCapacity;

    /**
     * Instance a vehicle.
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15.
     *  @param passengersNumber the passengers number
     * @param thereAreCrew     represent is there are a crew.
     * @param wheelsNumber     the wheels number.
     * @param registerDate     the  vehicle's register date.
     * @param travelMeans      the vehicle's travel means.
     * @param height  represent the truck's height.
     * @param loadCapacity represent the truck's load capacity.
     */
    public Truck(int passengersNumber,
                 boolean thereAreCrew,
                 int wheelsNumber,
                 Calendar registerDate,
                 String travelMeans,
                 double height,
                 double loadCapacity)
    {
        super(passengersNumber, thereAreCrew, wheelsNumber, registerDate, travelMeans);
        this.height = height;
        this.loadCapacity = loadCapacity;
    }

    /**
     * Get the truck's height.
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15.
     * @return the truck's height.
     */

    public double getHeight() {
        return height;
    }

    /**
     * get the truck's load capacity.
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15.
     * @return the truck's load capacity.
     */

    public double getLoadCapacity() {
        return loadCapacity;
    }
    /**
     * Catch in a string the information of the truck.
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15.
     * @return the truck's information.
     */
    @Override
    public String toString() {
        return "Truck{" +
                "height=" + height +
                ", loadCapacity=" + loadCapacity +","+'\'' +
                 super.toString()+"} ";
    }
}
