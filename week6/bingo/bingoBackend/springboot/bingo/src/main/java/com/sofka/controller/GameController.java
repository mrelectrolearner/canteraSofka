package com.sofka.controller;

import com.sofka.domain.Game;
import com.sofka.game.GameGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Represents the API functions, used to build the application controller layer.
 *
 * @version 1.0.0 2022-03-13.
 *
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 *
 * @since 1.0.0 2022-03-13.
 */
@Slf4j
@RestController
public class GameController {
    @Autowired
    private GameGenerator gameGenerator;

    /**
     * Get petition from the lobby direction.
     * @return a json object.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */

    @GetMapping(path="/lobby")
    public Map<String, String> index(){
        Map<String,String> answer=new HashMap<>();
        answer.put("message","wait..");
        return answer;
    }

    /**
     * Post petitions from the direction /game/start/ that allow to start the game for a player.
     *

     * @return new contact's personal information
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    @PostMapping(path = "/game/start/")
    public Map<String, ArrayList<Integer>> startGame(Game game){
        return gameGenerator.createGame(game);
    }

    /**
     * Post petitions from the direction /game/bingo that allow to check if a player won a game.
     *
     * @param game  represent a players game.
     * @return new contact's personal information
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    @PostMapping(path = "/game/bingo")
    public boolean checkBingoWinner(Game game){
        return gameGenerator.WonGame(game);

    }

    /**
     * Post petitions from the direction /game/end that allow to end a game.
     *
     * @param game  represent a players game.
     * @return new contact's personal information
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */

    @PostMapping(path = "/game/end")
    public void gameEnd(Game game){
        gameGenerator.endGame(game);

    }

    /**
     * Post petitions from the direction /game/ballot that generate a new bingo ball.
     *
     * @return new contact's personal information
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */

    @GetMapping(path = "/game/ballot")
    public Map<String, Integer> newBallot(){
        return gameGenerator.newBingoBallot();
    }
}


