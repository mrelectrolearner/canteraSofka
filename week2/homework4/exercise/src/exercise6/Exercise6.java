package exercise6;

import java.util.Scanner;
import java.util.Vector;

public class Exercise6 {
    public static void main(String[] args) {
        Vector numberList=new Vector<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome!!");
        boolean isNumberInTheList =false;
        while(!isNumberInTheList) {
            System.out.println("\nPlease, enter a number: ");
            Double enterNumber=scanner.nextDouble();
            isNumberInTheList=numberList.contains(enterNumber);
            numberList.add(enterNumber);
            System.out.println("the number " + enterNumber + " was added to the list\n");
        }

        System.out.println("The number entered were: "+numberList);
    }
}
