package exercise6;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

/**
 * Represent a list of number enter by the user until is entered two numbers equals next to each other.
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 * @since 1.0.0 2022-02-15.
 */
public class Exercise6 {
    /**
     * Ask the user a number and save in a list until it receive to two equals number next to each other.
     * @param args
     * @exception InputMismatchException It catches when a wrong type argument is introduced by the user.
     * @exception Exception It catches any exception that were not detected yet.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15.
     */
    public static void main(String[] args) {
        try {
            Vector numberList = new Vector<>(0);
            double enterNumber;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome!!");

            boolean areEqualsTheLastNumbers = false;
            while (!areEqualsTheLastNumbers) {
                try {
                    System.out.println("\nPlease, enter a number: ");
                    enterNumber = (double) scanner.nextDouble();
                    if (numberList.size() > 0) {
                        Double lasElement = (Double) numberList.lastElement();
                        areEqualsTheLastNumbers = lasElement.equals(enterNumber);
                    }
                    numberList.add(enterNumber);
                    System.out.println("the number " + enterNumber + " was added to the list\n");
                } catch (InputMismatchException exc) {
                    System.out.println("Error  input Type " + exc + " try again\n");
                    enterNumber= 0;
                    scanner.nextLine();
                }
            }
            System.out.println("The numbers entered were: "+numberList);

        }catch (Exception exc){
            System.out.println("Error! "+ exc+" try again\n");
    }


    }
}
