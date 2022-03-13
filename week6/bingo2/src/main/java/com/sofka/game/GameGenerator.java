package com.sofka.game;

import com.sofka.domain.BTuples;
import com.sofka.domain.BingoBallot;
import com.sofka.domain.Game;
import com.sofka.service.BingoBallotService;
import com.sofka.service.GameService;
import com.sofka.service.TuplesService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GameGenerator implements IGameGenerator{
    TuplesService tuplesService=new TuplesService();
    @Autowired
    private GameService gameService;
    @Autowired
    private BingoBallotService bingoBallotService;

    public GameGenerator(){}
    /**
     * Create a game every 5 minutes with the gamers in the waiting room.
     *
     * @param game
     * @return
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
        ArrayList<Integer> tupleBNumbers=new ArrayList<>();
        ArrayList<Integer> tupleINumbers=new ArrayList<>();
        ArrayList<Integer> tupleNNumbers=new ArrayList<>();
        ArrayList<Integer> tupleGNumbers=new ArrayList<>();
        ArrayList<Integer> tupleONumbers=new ArrayList<>();
        BTuples bTuples=new BTuples();
        bTuples= tuplesService.findBTupleByPlayerId(game).orElse(null);
        tupleBNumbers.add(bTuples.getNumber1());
        tupleBNumbers.add(bTuples.getNumber2());
        tupleBNumbers.add(bTuples.getNumber3());
        tupleBNumbers.add(bTuples.getNumber4());
        tupleBNumbers.add(bTuples.getNumber5());

        //BingoBallot bingoBallot= IBingoBallotService;
        boolean diagonal;

        return false;
    }

    /**
     * Generate a random ballot.
     *
     * @return random ballot for the bingo.
     */
    @Override
    public Map<Integer, Integer> randomBallot() {
        Map<Integer, Integer> randomBallot=new HashMap<>();
        Random rd=new Random();
        int randomNumber =1+rd.nextInt(74);
        int randomLetter=1+ rd.nextInt(4);
        randomBallot.put(randomLetter,randomNumber);
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
    public Map<String, Integer> bingoRandomBallot(Map<Integer, Integer> randomBallot) {
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


}
