package com.sofka.game;

import com.sofka.domain.Game;

import java.util.ArrayList;
import java.util.Map;

/**
 * Represent the functions that need to be implemented to generate a game.
 *
 * @version 1.0.0 2022-03-13.
 *
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 *
 * @since 1.0.0 2022-03-13.
 *
 */
public interface IGameGenerator {
    /**
     * Create a game every 5 minutes with the gamers in the waiting room.
     * @return
     */
    public Map<String, ArrayList<Integer>> createGame(Game game);

    /**
     * Check if a player won a game.
     * @param game the game information (player).
     * @return if the player won the game.
     */
    public boolean WonGame(Game game);

    /**
     * Generate a random ballot of two numbers. One with range from 0 to 4 and the other from 1 to 75.
     *
     * @return random ballot for the bingo.
     */
    public ArrayList<Integer> randomBallot();

    /**
     * Convert the random ballot to a bingo ballot.One with range {B, I, N, G, O} and the other from 1 to 75.
     * @return a bingo random ballot.
     * @param randomBallot a random valot of two integer numbers.
     */
    public Map<String,Integer> bingoRandomBallot(ArrayList<Integer>  randomBallot);

    /**
     * Finish the game.
     * @param game the game to be finish.
     */
    public void endGame(Game game);

    /**
     * Convert the random ballot to a bingo ballot.One with range {B, I, N, G, O} and the other from 1 to 75.
     * @return a bingo random ballot.
     *
     */
    public Map<String,Integer> newBingoBallot();
}
