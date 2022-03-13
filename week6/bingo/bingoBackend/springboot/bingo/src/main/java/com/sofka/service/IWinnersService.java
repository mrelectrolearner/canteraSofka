package com.sofka.service;

import com.sofka.domain.Winners;

public interface IWinnersService {

    /**
     * Delete a winner.
     * @param winner the winner to be deleted.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    public void deleteWinner(Winners winner);

    /**
     * Update winner.
     * @param winner the winner to be updated.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    public void updateWinner(Winners winner);

    /**
     * Save a winner.
     * @param winner the winner to be saved.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    public void saveWinner(Winners winner);
}
