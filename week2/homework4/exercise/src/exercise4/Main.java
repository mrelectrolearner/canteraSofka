package exercise4;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int passangersNumber;
        boolean thereAreCrew;
        int wheelesNumber;
        Calendar registerDate=new GregorianCalendar(0,0,0);
        String travelMeans;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Welcome, for creating a new vehicule please: \n");
        System.out.println("Enter the passangerNumber: ");
        passangersNumber=scanner.nextInt();
        System.out.println("Enter is thereAreCrew ");
        thereAreCrew=scanner.nextBoolean();
        System.out.println("Enter is wheelesNumber ");
        wheelesNumber=scanner.nextInt();
        System.out.println("Enter the register year: ");
        registerDate.add(Calendar.YEAR,scanner.nextInt());
        System.out.println("Enter the register month: ");
        registerDate.add(Calendar.MONTH,scanner.nextInt());
        System.out.println("Enter the register day: ");
        registerDate.add(Calendar.DAY_OF_MONTH,scanner.nextInt());
        System.out.println("Enter the travel means: ");
        travelMeans=scanner.next();
        Vehicle vehicle=new Vehicle(passangersNumber,thereAreCrew,wheelesNumber,registerDate,travelMeans);
        System.out.println("A new Vehicle was created\n");
        System.out.print(vehicle);





    }
}
