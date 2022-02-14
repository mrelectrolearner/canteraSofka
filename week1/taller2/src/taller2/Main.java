package taller2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Is the interface for the user and its operations.
 * @author Luis Felipe Rivas
 */
public class Main {
   public static void main(String[] args) {
       /**
        * Represent the spacecraft created by the user.
        */
       Spacecraft selectSpacecraft = null;
       /**
        * Represent if the user want to create other spacecraft.
        */
       boolean createOtherSpacecraft;
       /**
        * Represent the left to right movement of the spacecraft.
        */
       double leftToRight;
       /**
        * Represent the down to up movement of the spacecraft.
        */
       double downToUp;
       /**
        * Represent the back to forward movement of the spacecraft.
        */
       double backToForward;

       /**
        * Represent the keyboard scan.
        */
       Scanner scanner =new Scanner(System.in);
       while(true) {
           /**
            * The user select the spacecraft that want to create.
            */
           System.out.println("Welcome, please select what spacecraft you want to create\n");
           System.out.println("1. Shuttle ship:Saturn V \n" +
                   "2. Manned spacecraft: Salyut \n" +
                   "3. unmanned spacecraft: Mariner X\n" +
                   "4. Manned spacecraft: Space station.\n " +
                   "Select one number: ");

           int select = scanner.nextInt();
           switch (select) {
               case 1:
                   Fuel fuelHO = new Fuel("H+O", 100, 1, 1000000);
                   selectSpacecraft = new ShuttleShip(
                           3500,
                           "Saturn V",
                           "Nuclear-chemist",
                           fuelHO,
                           118,
                           2900);
                   System.out.println("Saturn V was created\n");

                   break;

               case 2:
                   Fuel fuelSalyut = new Fuel("H+O", 100, 1, 100000);
                   selectSpacecraft = new MannedSpacecraft(
                           1,
                           "Salyut",
                           "chemist",
                           fuelSalyut,
                           3,
                           19.3);
                   System.out.println("Salyut was created\n");

                   break;

               case 3:
                   Fuel N2H4 = new Fuel("N2H4 ", 100, 1, 1000000);
                   selectSpacecraft = new UnmannedSpacecraft(
                           65.67,
                           "Mariner X",
                           "chemist",
                           N2H4,
                           0.001093);
                   System.out.println("Mainer X was created\n");

                   break;

               case 4:
                   Fuel fuelEEI = new Fuel("fuel EEI", 100, 1, 1000000);
                   selectSpacecraft = new MannedSpacecraft(
                           1,
                           "Salyut",
                           "chemist",
                           fuelEEI,
                           7,
                           420);
                   System.out.println("The international space station (EEI) was created\n");

                   break;
               default:
                   System.out.println("invalid election, try again");
           }

           /**
            * Show to the user, the spacecraft created.
            */
           System.out.print("name: " + selectSpacecraft.getName() + "\n" +
                   "power: " + selectSpacecraft.getPower() + "\n" +
                   "type of propulsion system" + selectSpacecraft.getTypeOfPropulsionSystem() + "\n" +
                   "mass: " + selectSpacecraft.getMass() + "\n" +
                   "position: (" + Arrays.toString(selectSpacecraft.getPosition()) + "\n" +
                   "speed: " + Arrays.toString(selectSpacecraft.getSpeed()) + "\n" +
                   "fuel volume:" + selectSpacecraft.getFuel().getVolume() + "\n");

           /**
            * Allow the user select the behavior  of the spacecraft.
            */
           createOtherSpacecraft = false;
           while (!createOtherSpacecraft) {
               System.out.println("please select what your spacecraft will do\n");
               System.out.println("1. Land. \n" +
                       "2. Move \n" +
                       "3. speedup.\n " +
                       "4. Create other spacecraft\n" +
                       "Select one number: ");
               int selectBehavior = scanner.nextInt();
               switch (selectBehavior) {
                   case 1:
                       selectSpacecraft.land();
                       break;
                   case 2:
                       System.out.println("enter the distance vector separated by an enter");
                       leftToRight = scanner.nextDouble();
                       downToUp = scanner.nextDouble();
                       backToForward= scanner.nextDouble();
                       selectSpacecraft.move(new double[]{leftToRight, downToUp, backToForward});
                       break;
                   case 3:
                       System.out.println("enter the velocity vector separated by an enter");
                       leftToRight = scanner.nextDouble();
                       downToUp = scanner.nextDouble();
                       backToForward= scanner.nextDouble();
                       selectSpacecraft.speedUp(new double[]{leftToRight, downToUp, backToForward});
                       break;
                   case 4:
                       createOtherSpacecraft = true;
                       break;

                   default:
                       System.out.println("invalid election, try again");

               }
               if (selectBehavior <5 && selectBehavior>0) {
                   System.out.print("name: " + selectSpacecraft.getName() + "\n" +
                           "power: " + selectSpacecraft.getPower() + "\n" +
                           "type of propulsion system" + selectSpacecraft.getTypeOfPropulsionSystem() + "\n" +
                           "mass: " + selectSpacecraft.getMass() + "\n" +
                           "position: (" + Arrays.toString(selectSpacecraft.getPosition()) + "\n" +
                           "speed: " + Arrays.toString(selectSpacecraft.getSpeed()) + "\n" +
                           "fuel volume: " + selectSpacecraft.getFuel().getVolume() + "\n");
               }
           }


       }
    }
}
