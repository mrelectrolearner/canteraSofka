package com.sofka.service;

import com.sofka.domain.Game;

public interface IGameService {

    /**
     * Delete a game.
     * @param game the game to be deleted.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    public void deleteGame(Game game);

    /**
     * Update a game.
     * @param game the game to be updated.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    public void updateGame(Game game);

    /**
     * Save a game.
     * @param game the game to be saved.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    public void saveGame(Game game);
}
