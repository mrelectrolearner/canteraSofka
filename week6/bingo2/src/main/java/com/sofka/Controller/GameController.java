package com.sofka.controller;

import com.sofka.domain.Game;
import com.sofka.game.GameGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@Slf4j
@RestController
public class GameController {

    GameGenerator gameGenerator=new GameGenerator();


    @GetMapping(path="/lobby")
    public Map<String, String> index(){
        Map<String,String> answer=new HashMap<>();
        answer.put("message","wait..");
        return answer;
    }


    @PostMapping(path = "/game/start/{player}")
    public Map<String, ArrayList<Integer>> startGame(Game game){
        return gameGenerator.createGame(game);
    }

    @PostMapping(path = "/game/bingo")
    public boolean checkBingoWinner(Game game){
        return gameGenerator.WonGame(game);

    }

    @PostMapping(path = "/game/end")
    public void gameEnd(Game game){
        gameGenerator.endGame(game);

    }
}

