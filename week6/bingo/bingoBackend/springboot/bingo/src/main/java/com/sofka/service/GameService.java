package com.sofka.service;

import com.sofka.dao.GameDao;
import com.sofka.domain.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameService implements IGameService{
    @Autowired
    private GameDao gameDao;

    @Override
    @Transactional
    public void deleteGame(Game game) {
        gameDao.delete(game);
    }

    @Override
    @Transactional
    public void updateGame(Game game) {
        gameDao.save(game);

    }

    @Override
    @Transactional
    public void saveGame(Game game) {
        gameDao.save(game);

    }
}
