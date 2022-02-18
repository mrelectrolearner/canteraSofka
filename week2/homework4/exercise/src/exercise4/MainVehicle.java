package exercise4;


import exercise4.Controller.Garage;

import java.util.Scanner;

/**
 * Represent the interface with the user and its interactions. Creating ten different vehicles.
 * @version 1.0.0 2022-02-15.
 * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
 * @since 1.0.0 2022-02-15.
 */
public class MainVehicle {
    /**
     * Execute the program and create the interface with the user and allow the interactions between them.

     * @param args argument that received the program when is executed.
     *
     * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15.
     */
    public static void main(String[] args) {
        int vehiclesNumber =0;
        int maximumVehiclesNumber=10;
        System.out.println("Welcome");
        Garage garage =new Garage();
        while (vehiclesNumber <maximumVehiclesNumber) {
            garage.addVehicle(0);
            vehiclesNumber = garage.getVehiclesNumber();
        }
        System.out.println("\nVehicles list:" +"\n");
        for(Vehicle vehiclesListElement: garage.getVehiclesList()){
            System.out.println(vehiclesListElement +"\n");
        }
        

    }
}
