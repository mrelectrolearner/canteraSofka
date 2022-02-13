package exercise1.Main;

import exercise1.Controller.Controller;
import exercise1.Model.Planet;
import exercise1.Model.SolarSystem;
import exercise1.Model.Sun;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Represent the execution of the project.Create an interface for the users to operate on the solar system.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
         * Create the solar system.
         */
        SolarSystem solarSystem= Controller.createSolarSystem();
        System.out.println("Welcome !!!" );

        while(true) {
            /*
            Ask the user what operation he wants to do over the solar System.
             */
            System.out.println("\nYour solar system is compose of:\n");
            System.out.print(solarSystem);

            System.out.println("\nWhat do you want to do? \n" +
                    "0. Know the gravity force of all the planets.\n" +
                    "1. Know the gravitational attraction between two planets.\n" +
                    "2. Know the gravitational attraction between the sun and one planet\n" +
                    "3. Add other planet.\n" +
                    "Select one number:  ");


            int selBehavior = scanner.nextInt();
            ArrayList<Planet> planetList = solarSystem.getPlanets();

            switch (selBehavior) {
                case 0:
                    for (Planet planet : planetList) {
                        System.out.println("the gravity force of the planet " + planet.getName() + " is: " + planet.gravityForce());
                    }
                    break;
                case 1:
                    System.out.println("Select the id of tha planet1: ");
                    int numberPlanet1 = scanner.nextInt();
                    Planet planet1 = planetList.get(numberPlanet1);
                    System.out.println("Select the id of tha planet2: ");
                    int numberPlanet2 = scanner.nextInt();
                    Planet planet2 = planetList.get(numberPlanet2);
                    System.out.println("The gravitational attraction between " + planet1.getName() + " and " + planet2.getName() + " is " + planet1.gravitationalAttraction(planet2));
                    break;
                case 2:
                    System.out.println("Select the id of tha planet: ");
                    int numberPlanet = scanner.nextInt();
                    Planet planet = planetList.get(numberPlanet);
                    Sun sun=solarSystem.getSun();
                    System.out.println("The gravitational attraction between " + sun.getName() + " and " + planet.getName() + " is " + sun.gravitationalAttraction(planet));
                    break;


                case 3:
                    System.out.println("Enter the mass of tha planet: ");
                    double mass = scanner.nextDouble();
                    System.out.println("Enter the density of tha planet: ");
                    double density = scanner.nextDouble();
                    System.out.println("Enter the name of tha planet: ");
                    String name = String.valueOf(scanner.next());
                    System.out.println("Enter the diameter of tha planet: ");
                    double diameter= scanner.nextDouble();
                    System.out.println("Enter the distance to sun of tha planet: ");
                    double distanceToSun = scanner.nextDouble();

                    Planet newPlanet=new Planet(mass,density,name,diameter,distanceToSun);
                    solarSystem.addPlanet(newPlanet);
                    System.out.println("the new planet has been added\n" +
                            newPlanet);
                    break;
                default:
                    System.out.println("Invalid election, try again.\n");
            }
            System.out.println("Press any button and enter to continue.");
            scanner.next();

        }

    }
}
