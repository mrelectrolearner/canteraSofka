package com.sofka.game;

import java.util.ArrayList;

/**
 * Represent the functions need to be implemented to create a bingo card for a player.
 *
 * @version 1.0.0 2022-03-13.
 *
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 *
 * @since 1.0.0 2022-03-13.
 *
 */
public interface ICardGenerator {

    /**
     * Generate a  vector of number that correspond to a b tuple (1-15).
     * @return a b tuple randomly generated.
     */
    public ArrayList<Integer> generateBTuple();

    /**
     * Generate a  vector of number that correspond to an i tuple (16-30).
     * @return an i tuple randomly generated.
     */
    public ArrayList<Integer> generateITuple();

    /**
     * Generate a  vector of number that correspond to an n tuple (31-45).
     * @return an n tuple randomly generated.
     */
    public ArrayList<Integer> generateNTuple();

    /**
     * Generate a  vector of number that correspond to a g tuple (46-60).
     * @return a g tuple randomly generated.
     */
    public ArrayList<Integer> generateGTuple();

    /**
     * Generate a  vector of number that correspond to an o tuple (61-75).
     * @return an o tuple randomly generated.
     */
    public ArrayList<Integer> generateOTuple();



}
