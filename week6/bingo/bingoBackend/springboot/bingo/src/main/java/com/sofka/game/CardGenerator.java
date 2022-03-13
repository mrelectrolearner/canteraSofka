package com.sofka.game;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CardGenerator implements ICardGenerator{
    public  CardGenerator(){

    }

    /**
     * Generate a  vector of number that correspond to a b tuple (1-15).
     *
     * @return a b tuple randomly generated.
     */
    @Override
    public ArrayList<Integer> generateBTuple() {
        RandomNumbersGenerator tuple=new RandomNumbersGenerator(15,1);
        tuple.generateRandomNumbersArray(5);
        return tuple.getNumberList();
    }

    /**
     * Generate a  vector of number that correspond to an i tuple (16-30).
     *
     * @return an i tuple randomly generated.
     */
    @Override
    public ArrayList<Integer> generateITuple() {
        RandomNumbersGenerator tuple=new RandomNumbersGenerator(30,16);
        tuple.generateRandomNumbersArray(5);
        return tuple.getNumberList();
    }

    /**
     * Generate a  vector of number that correspond to an n tuple (31-45).
     *
     * @return an n tuple randomly generated.
     */
    @Override
    public ArrayList<Integer> generateNTuple() {
        RandomNumbersGenerator tuple=new RandomNumbersGenerator(45,31);
        tuple.generateRandomNumbersArray(4);
        return tuple.getNumberList();
    }

    /**
     * Generate a  vector of number that correspond to a g tuple (46-60).
     *
     * @return a g tuple randomly generated.
     */
    @Override
    public ArrayList<Integer> generateGTuple() {
        RandomNumbersGenerator tuple=new RandomNumbersGenerator(60,46);
        tuple.generateRandomNumbersArray(5);
        return tuple.getNumberList();
    }

    /**
     * Generate a  vector of number that correspond to an o tuple (61-75).
     *
     * @return an o tuple randomly generated.
     */
    @Override
    public ArrayList<Integer> generateOTuple() {
        RandomNumbersGenerator tuple=new RandomNumbersGenerator(75,61);
        tuple.generateRandomNumbersArray(5);
        return tuple.getNumberList();
    }
}
