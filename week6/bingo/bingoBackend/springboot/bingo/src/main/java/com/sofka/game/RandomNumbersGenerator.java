package com.sofka.game;

import lombok.Data;

import java.util.ArrayList;
import java.util.Random;

/**
 * Represent an array able to be fill with random number and order it using bubble and quick sort algorithm.
 *
 * @version 1.0.0 2022-02-15.
 * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
 * @since 1.0.0 2022-02-15.
 */

@Data
public class RandomNumbersGenerator {

        private ArrayList<Integer> numberList;
        private final int highestNumber;
        private final int smallerNumber;

        /**
         * Instance an array of number.
         *
         * @param highestNumber the highest number possible to generate randomly.
         *
         * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
         * @since 1.0.0 2022-02-15.
         */
        public RandomNumbersGenerator(int highestNumber, int smallerNumber){
            this.highestNumber = highestNumber;
            this.smallerNumber = smallerNumber;
            this.numberList=new ArrayList<>();
        }

        /**
         * Add a random number to the array as last element.
         *
         * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
         * @since 1.0.0 2022-02-15.
         */
        private void addRandomNumber(){
            Random rd=new Random();
            int randomNumber =this.smallerNumber+(rd.nextInt(this.highestNumber-this.smallerNumber));
            this.numberList.add(randomNumber);
        }



        /**
         * Generate an array of random numbers.
         *
         * @param arraySize the array's size.
         *
         * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
         * @since 1.0.0 2022-02-15.
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
         *
         * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
         * @since 1.0.0 2022-02-15.
         */
}
