package exercise4;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Represent the interface with the user and its interactions.
 * @version 1.0.0 2022-02-15.
 * @author Luis Felipe Rivas.
 * @since 1.0.0 2022-02-15.
 */
public class Main {
    public static void main(String[] args) {
        int passengersNumber;
        boolean thereAreCrew;
        int wheelsNumber;
        int counter=0;
        while (counter<10) {
            try {
                Calendar registerDate = new GregorianCalendar();
                String travelMeans;
                Scanner scanner = new Scanner(System.in);

                System.out.println("Welcome, for creating a new vehicle please: \n");
                System.out.println("Enter the passengerNumber: ");
                passengersNumber = scanner.nextInt();
                if(passengersNumber <0){
                    throw new IllegalArgumentException("Negative  passenger number is not allowed.");
                }
                System.out.println("Enter is thereAreCrew ");
                thereAreCrew = scanner.nextBoolean();
                System.out.println("Enter is wheelsNumber ");
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
                Vehicle vehicle = new Vehicle(passengersNumber,
                        thereAreCrew, wheelsNumber, registerDate, travelMeans);
                System.out.println("A new Vehicle was created\n");
                System.out.print(vehicle);
                counter+=1;

            }catch (IllegalArgumentException exc){
                System.out.println("Error in the argument enter, " +
                        "it was not possible create the vehicle.\n"+exc);
            }catch (Exception exc){
                System.out.println("Error, it was not possible create the vehicle.\n"+exc);

            }


        }





    }
}
