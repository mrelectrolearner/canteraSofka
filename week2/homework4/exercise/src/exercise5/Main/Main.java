package exercise5.Main;

import exercise4.Controller.Garage;
import exercise4.Vehicle;

import java.util.Scanner;
/**
 * Represent the interface with the user and its interactions. Creating ten different types of vehicles.
 *
 * @version 1.0.0 2022-02-15.
 *
 * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
 *
 * @since 1.0.0 2022-02-15.
 */
public class Main {

    /**
     * Execute the program and create the interface with the user and allow the interactions between them.
     * .
     * @param args argument that received the program when is executed.
     *
     * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15
     */
    public static void main(String[] args) {
        int vehiclesNumber =0;
        int maximumVehiclesNumber=10;
        System.out.println("Welcome");
        Scanner scanner = new Scanner(System.in);
        Garage garage =new Garage();
        while (vehiclesNumber <maximumVehiclesNumber) {
            System.out.println("\nSelect the type of vehicle:\n" +
                    "1. Bike.\n" +
                    "2. Boat.\n" +
                    "3. Car.\n" +
                    "4. Truck.\n" +
                    "Enter a number: ");
            int selectVehicle=scanner.nextInt();
            garage.addVehicle(selectVehicle);
            vehiclesNumber = garage.getVehiclesNumber();

        }
        System.out.println("\nVehicles list:" +"\n");
        for(Vehicle vehicle: garage.getVehiclesList()){
            System.out.println(vehicle+"\n");
        }

    }
}
