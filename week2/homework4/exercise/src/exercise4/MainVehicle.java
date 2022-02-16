package exercise4;


import exercise4.Controller.VehicleType;

import java.util.ArrayList;
import java.util.Objects;
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
     * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15.
     * @param args argument that received the program when is executed.
     */
    public static void main(String[] args) {
        int counter=0;
        ArrayList<Vehicle> vehiclesList=new ArrayList<>();
        System.out.println("Welcome");
        Scanner scanner = new Scanner(System.in);
        while (counter<10) {
            VehicleType.createVehicle(scanner,vehiclesList,counter,0);
        }
        for(Vehicle vehiclesListElement: vehiclesList){
            System.out.println("Vehicles list:" +"\n");
            System.out.println(vehiclesListElement +"\n");
        }
        

    }
}
