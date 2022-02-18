package exercise3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 */

public class MainExercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome");

        while (true) {
            try {
                System.out.println("\nEnter the highest random number to be add in the array of: ");
                double highestNumber = scanner.nextDouble();
                NumberArray numberArray = new NumberArray(highestNumber);
                System.out.println("Enter the size of the array of numbers: ");
                int arraySize = scanner.nextInt();
                numberArray.generateRandomNumbersArray(arraySize);
                System.out.println("Array: " + numberArray + "\n");
                System.out.println("Select the algorithm to sort:\n" +
                        "0. Bubble.\n" +
                        "1. Quick sort.\n" +
                        "Enter a number: ");
                int selectedAlgorithm = scanner.nextInt();

                switch (selectedAlgorithm) {
                    case 0:
                        numberArray.bubbleOrder();
                        break;
                    case 1:
                        ArrayList<Double> numberList = numberArray.getNumberList();
                        ArrayList<Double> orderedList = numberArray.quickDivider(numberList);
                        numberArray.setNumberList(orderedList);
                        break;
                    default:
                        System.out.println("Enter an Invalid election\n");
                }
                System.out.println("Result: " + numberArray);
            }catch (InputMismatchException exc) {
                System.out.println("Error in the argument type, "
                + "it was not possible create the vehicle.\n" + exc);
                scanner.nextLine();
            }
        }
    }
}
