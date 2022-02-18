package exercise3;

import java.util.ArrayList;

/**
 * Represent an array of number able to be fill with random number and order it.
 * @version 1.0.0 2022-02-15.
 * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
 * @since 1.0.0 2022-02-15.
 */

public class NumberArray {
    private ArrayList<Double> numberList;
    private final double highestNumber;

    /**
     * Instance an array of number.
     * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15.
     * @param highestNumber the highest number possible to generate randomly.
     */
    public NumberArray(double highestNumber){
        this.highestNumber = highestNumber;
        this.numberList=new ArrayList<>();
    }

    /**
     * Add a random number to the array as last element.
     * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15.
     */
    private void addRandomNumber(){
        double randomNumber =Math.random()*this.highestNumber;
        this.numberList.add(randomNumber);
    }

    /**
     * Generate an array of random numbers.
     * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15.
     * @param arraySize the array's size.
     */
    public void generateRandomNumbersArray(int arraySize){
        int counter= 0;
        while(counter<arraySize){
            this.addRandomNumber();
            counter++;
        }
    }

    /**
     * Order the array of number using the bubble algorithm.
     * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15.
     */
    public void bubbleOrder(){
        try {
            Double number1;
            Double number2;
            int counter = 0;
            while (counter < numberList.size()) {
                for (int index = 0; index < numberList.size() - 1; index++) {
                    number1 = this.getNumberList().get(index);
                    number2 = this.getNumberList().get(index + 1);
                    boolean isGrater = number1 > number2;

                    if (isGrater) {
                        this.getNumberList().set(index, number2);
                        this.getNumberList().set(index + 1, number1);
                    }
                }
                counter++;
            }
        }catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Array out of index in the bubble order method: "+exc);
        }
    }

    /**
     * Concatenate an array list, a double and another array list, in thar order.
     * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15.
     * @param list1 first list to be concatenated.
     * @param pivot double to be linked in the list.
     * @param list3 second list to be concatenated.
     * @return the fist list linked with the pivot and the second list.
     */
    private ArrayList<Double> concatenateArrayList(
            ArrayList<Double> list1, Double pivot, ArrayList<Double> list3)
    {
        ArrayList<Double> concatenatedList= new ArrayList<>();
        concatenatedList.addAll(list1);
        concatenatedList.add(pivot);
        concatenatedList.addAll(list3);
        return concatenatedList;

    }

    /**
     * Order the array of numbers using the quick sort algorithm.
     * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15.
     * @param randomNumbersArray random numbers array to be ordered.
     * @return an ordered numbers array.
     */
    public ArrayList<Double> quickDivider(ArrayList<Double> randomNumbersArray){
        try {
            double pivot = 0;
            ArrayList<Double> smallerThanPivot = new ArrayList<>();
            ArrayList<Double> largerThanPivot = new ArrayList<>();
            if (randomNumbersArray.size() > 0) {
                pivot = randomNumbersArray.get(0);
                for (double randomNumber : randomNumbersArray) {
                    boolean isElementLargerThanPivot = randomNumber > pivot;
                    if (randomNumber > pivot) {
                        largerThanPivot.add(randomNumber);
                    } else if (randomNumber < pivot) {
                        smallerThanPivot.add(randomNumber);
                    }
                }
                return concatenateArrayList(quickDivider(smallerThanPivot), pivot, quickDivider(largerThanPivot));
            } else {
                return new ArrayList<>() {};
            }
        }catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Array out of index in the quick sort order method: " + exc);
            return new ArrayList<>() {};
        }

    }


    /**
     * Get the numbers list.
     * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15.
     * @return the numbers list.
     */
    public ArrayList<Double> getNumberList() {
        return numberList;
    }

    /**
     * Set the number list.
     * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15.
     * @param numberList the number list.
     */
    public void setNumberList(ArrayList<Double> numberList) {
        this.numberList = numberList;
    }

    /**
     *Catch the information of the numbers array.
     * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15.
     * @return the information of the numbers array.
     */
    @Override
    public String toString() {
        return "NumberArray{" +
                "numberList=" + numberList +
                ", highestNumber=" + highestNumber +
                '}';
    }
}
