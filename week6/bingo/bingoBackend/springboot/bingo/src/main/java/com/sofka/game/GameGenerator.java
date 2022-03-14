package com.sofka.game;

import com.sofka.domain.*;
import com.sofka.service.BingoBallotService;
import com.sofka.service.GameService;
import com.sofka.service.TuplesService;
import com.sofka.service.WinnersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * This implement the interface that represents the functions use to build the bingo's game for a player.
 *
 * @version 1.0.0 2022-03-13.
 *
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 *
 * @since 1.0.0 2022-03-13.
 */

@Service
public class GameGenerator implements IGameGenerator{


    @Autowired
    private TuplesService tuplesService;
    @Autowired
    private GameService gameService;
    @Autowired
    private BingoBallotService bingoBallotService;
    @Autowired
    private WinnersService winnersService;
    @Autowired
    private WinCheck winCheck;

    public GameGenerator(){}
    /**
     * Create a game every 5 minutes with the gamers in the waiting room.
     *
     * @param game game for a player.
     * @return a player's card for the bingo.
     */
    @Override
    public Map<String, ArrayList<Integer>> createGame(Game game) {
        Map<String, ArrayList<Integer>> card= new HashMap<>();
        CardGenerator cardGenerator= new CardGenerator();
        BTuples tuple=new BTuples();
        ArrayList<Integer> tupleBNumbers=new ArrayList<>();
        ArrayList<Integer> tupleINumbers=new ArrayList<>();
        ArrayList<Integer> tupleNNumbers=new ArrayList<>();
        ArrayList<Integer> tupleGNumbers=new ArrayList<>();
        ArrayList<Integer> tupleONumbers=new ArrayList<>();

        tupleBNumbers=cardGenerator.generateBTuple();
        tupleINumbers=cardGenerator.generateITuple();
        tupleNNumbers=cardGenerator.generateNTuple();
        tupleGNumbers=cardGenerator.generateGTuple();
        tupleONumbers=cardGenerator.generateOTuple();

        card.put("B",tupleBNumbers);
        card.put("I",tupleINumbers);
        card.put("N",tupleNNumbers);
        card.put("G",tupleGNumbers);
        card.put("O",tupleONumbers);

        tuplesService.createBTuple(tupleBNumbers, game.getBTuplesId());
        tuplesService.createITuple(tupleINumbers, game.getITuplesId());
        tuplesService.createNTuple(tupleNNumbers, game.getNTuplesId());
        tuplesService.createGTuple(tupleGNumbers, game.getGTuplesId());
        tuplesService.createOTuple(tupleONumbers, game.getOTuplesId());

        gameService.saveGame(game);

        return card;
    }

    /**
     * Check if a player won a game.
     *
     * @param game the game information (player).
     * @return if the player won the game.
     */
    @Override
    public boolean WonGame(Game game) {
        boolean won=false;
        Winners winners=new Winners();
        winners.setPlayer(game.getPlayer());
        winCheck.init(game);
        won= winCheck.won();
        if(won){
            this.endGame(game);
            winnersService.saveWinner(winners);
        }
        return won;
    }

    /**
     * Generate an int random number.
     * @param small smallest random number to be generated.
     * @param high highest random number to be generated.
     * @return a random number between small and high.
     */

    public int randomNumber(int small, int high){
        Random rd=new Random();
        return small+(rd.nextInt(high-small));
    }
    /**
     * Generate a random ballot.
     *
     * @return random ballot (ball) for the bingo.
     */
    @Override
    public ArrayList<Integer> randomBallot() {
        ArrayList<Integer> randomBallot=new ArrayList<>();
        Random rd=new Random();
        int randomNumber =1+rd.nextInt(74);
        int randomLetter;
        randomLetter=1+ rd.nextInt(4);
        switch (randomLetter){
            case 0:
                randomNumber= this.randomNumber(0,15);
                break;
            case 1:
                randomNumber= this.randomNumber(16,30);
                break;
            case 2:
                randomNumber= this.randomNumber(31,45);
                break;
            case 3:
                randomNumber= this.randomNumber(46,60);
                break;
            case 4:
                randomNumber= this.randomNumber(61,75);
                break;
        }
        randomBallot.add(randomLetter);
        randomBallot.add(randomNumber);
        BingoBallot bingoBallot=new BingoBallot();
        bingoBallot.setLetter(randomLetter);
        bingoBallot.setNumber(randomNumber);
        bingoBallotService.save(bingoBallot);
        return randomBallot;
    }



    /**
     * Convert the random ballot to a bingo ballot.One with range {B, I, N, G, O} and the other from 1 to 75.
     *
     * @param randomBallot a random valot of two integer numbers.
     * @return a bingo random ballot.
     */
    @Override
    public Map<String, Integer> bingoRandomBallot(ArrayList<Integer> randomBallot) {
        Map<String, Integer> bingoBallot=new HashMap<>();
        int sel=randomBallot.get(0);
        switch (sel){
            case 0:
                bingoBallot.put("B",randomBallot.get(1));
                break;
            case 1:
                bingoBallot.put("I",randomBallot.get(1));
                break;
            case 2:
                bingoBallot.put("N",randomBallot.get(1));
                break;
            case 3:
                bingoBallot.put("G",randomBallot.get(1));
                break;
            case 4:
                bingoBallot.put("O",randomBallot.get(1));
                break;

        }

        return bingoBallot;
    }

    /**
     * Finish the game.
     *
     * @param game the game to be finish.
     */
    @Override
    public void endGame(Game game) {


    }

    /**
     * Convert the random ballot to a bingo ballot.One with range {B, I, N, G, O} and the other from 1 to 75.
     *
     * @return a bingo random ballot.
     */
    @Override
    public Map<String, Integer> newBingoBallot() {
        return this.bingoRandomBallot(this.randomBallot());
    }


}
