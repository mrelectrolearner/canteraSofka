package exercise6;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

/**
 * Represent a list of number enter by the user until its enter two numbers equals next to each other.
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 * @since 1.0.0 2022-02-15.
 */
public class Exercise6 {
    /**
     * Ask the user a number and save in a list until it receive to two equals number next to each other.
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15.
     * @param args
     */
    public static void main(String[] args) {
        Vector numberList=new Vector<>(0);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome!!");
        boolean isEqualToTheLastNumber =false;
        while(!isEqualToTheLastNumber) {
            try {
                System.out.println("\nPlease, enter a number: ");
                Double enterNumber= (Double) scanner.nextDouble();
                enterNumber.
                if(numberList.size()>0){
                    Double lasElement= (Double) numberList.lastElement();
                    isEqualToTheLastNumber =enterNumber.equals(lasElement);
                }
                numberList.add(enterNumber);
                System.out.println("the number " + enterNumber + " was added to the list\n");
            }catch (ExceptionInInitializerError exc){
                System.out.println("Error type! "+ exc+" try again\n");
            }catch (ClassCastException exc){
                System.out.println("Error! cast "+ exc+" try again\n");
            }catch (InputMismatchException exc){
                System.out.println("Error! miss "+ exc+" try again\n");

            }

        }

        System.out.println("The numbers entered were: "+numberList);
    }
}
