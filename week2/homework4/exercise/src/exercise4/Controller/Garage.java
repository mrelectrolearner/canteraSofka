package exercise4.Controller;


import exercise4.Vehicle;
import exercise5.Vehicles.Bike;
import exercise5.Vehicles.Boat;
import exercise5.Vehicles.Car;
import exercise5.Vehicles.Truck;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Represent the garage of vehicles with the addition of vehicles operation.
 * @version 1.0.0 2022-02-15.
 * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
 * @since 1.0.0 2022-02-15.
 */
public class Garage {
    private ArrayList<Vehicle> vehiclesList;
    private int vehiclesNumber;

    /**
     * Instance the garage, creating an empty list whit zero vehicles.
     * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15.
     */
    public Garage(){
        this.vehiclesList=new ArrayList<>();
        this.vehiclesNumber=0;

    }

    /**
     * Add a vehicle to the garage with the characteristics given by the user.
     * @param selVehicle sel the type of vehicle that it's going to be added.
     * @exception IllegalArgumentException It catches when an illegal argument is introduced by the user.
     * @exception InputMismatchException It catches a mismatch in the input introduced by the user.
     * @exception Exception It catches exception that were not detected by the other two.
     *
     * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-02-15.
     */
    public void addVehicle(int selVehicle){
        try {
            Scanner scanner=new Scanner(System.in);
            int passengersNumber;
            boolean thereAreCrew;
            int wheelsNumber;
            Vehicle vehicle=null;
            Calendar registerDate = new GregorianCalendar(0,0,0);
            String travelMeans;

            System.out.println("\nFor creating a new vehicle please: \n");
            System.out.println("Enter the passenger number: ");
            passengersNumber = scanner.nextInt();
            if(passengersNumber <0){
                throw new IllegalArgumentException("Negative  passenger number is not allowed.");
            }

            System.out.println("Enter if there are crew ");
            thereAreCrew = scanner.nextBoolean();

            System.out.println("Enter the wheels number ");
            wheelsNumber = scanner.nextInt();
            if(wheelsNumber <0){
                throw new IllegalArgumentException("Negative wheels number is not allowed.");
            }

            System.out.println("Enter the register year: ");
            int years=scanner.nextInt();
            if(years <0){
                throw new IllegalArgumentException("Negative year is not allowed.");
            }

            registerDate.add(Calendar.YEAR,years );
            System.out.println("Enter the register month: ");
            int month =scanner.nextInt();
            if(month <0){
                throw new IllegalArgumentException("Negative month is not allowed.");
            }
            registerDate.add(Calendar.MONTH, month);
            System.out.println("Enter the register day: ");
            int day =scanner.nextInt();
            if(day <0){
                throw new IllegalArgumentException("Negative day is not allowed.");
            }
            registerDate.add(Calendar.DAY_OF_MONTH, day);

            System.out.println("Enter the travel means: ");
            travelMeans = scanner.next();
            switch (selVehicle) {
                case 0:
                    vehicle = new Vehicle(passengersNumber,
                    thereAreCrew, wheelsNumber, registerDate, travelMeans);
                    System.out.println("A new Vehicle was created\n");
                    System.out.print(vehicle);
                    this.increaseVehiclesNumber();
                    break;
                case 1:
                    System.out.println("Enter the pedal type: ");
                    String pedalType = scanner.next();

                    vehicle = new Bike(passengersNumber,
                            thereAreCrew, wheelsNumber, registerDate, travelMeans,pedalType);
                    System.out.println("A new bike was created\n");
                    System.out.print(vehicle);
                    this.increaseVehiclesNumber();
                    break;
                case 2:
                    System.out.println("Enter if the boat is anchored: ");
                    boolean isAnchored = scanner.nextBoolean();

                    vehicle = new Boat(passengersNumber,
                            thereAreCrew, wheelsNumber, registerDate, travelMeans,isAnchored);
                    System.out.println("A new boat was created\n");
                    System.out.print(vehicle);
                    this.increaseVehiclesNumber();
                    break;
                case 3:
                    System.out.println("Enter if the boat is anchored: ");
                    boolean arefiveDoors = scanner.nextBoolean();

                    vehicle = new Car(passengersNumber,
                            thereAreCrew, wheelsNumber, registerDate, travelMeans,arefiveDoors);
                    System.out.println("A new Car was created\n");
                    System.out.print(vehicle);
                    this.increaseVehiclesNumber();
                    break;
                case 4:
                    System.out.println("Enter if the truck heihgt: ");
                    double height = scanner.nextDouble();

                    System.out.println("Enter if the truck loadCapacity: ");
                    double loadCapacity= scanner.nextDouble();

                    vehicle = new Truck(passengersNumber,
                            thereAreCrew, wheelsNumber, registerDate, travelMeans,height,loadCapacity);
                    System.out.println("A new truck was created\n");
                    System.out.print(vehicle);
                    this.increaseVehiclesNumber();
                    break;
                default:
                    System.out.println("Invalid vehicle selection.");

            }
            this.getVehiclesList().add(vehicle);

        }catch (IllegalArgumentException exc){
            System.out.println("Error in the argument enter, "
                    +"it was not possible create the vehicle.\n"+exc);
        }catch (InputMismatchException exc){
            System.out.println("Error in the argument type, "
                    +"it was not possible create the vehicle.\n"+exc);

        }catch (Exception exc){
            System.out.println("Error, it was not possible create the vehicle.\n"+exc);
        }

    }

    public ArrayList<Vehicle> getVehiclesList() {
        return vehiclesList;
    }

    public  int getVehiclesNumber() {
        return vehiclesNumber;
    }

    public void increaseVehiclesNumber() {
       this.vehiclesNumber++;
    }
}
