package com.sofka.service;

import com.sofka.domain.BingoBallot;

import java.util.List;


public interface IBingoBallotService {

    /**
     * Delete a bingo ballot.
     * @param bingoBallot the bingo ballot to be deleted.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    public void delete(BingoBallot bingoBallot);

    /**
     * Update a bingo ballot.
     * @param bingoBallot the bingo ballot to be updated.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    public void update(BingoBallot bingoBallot);

    /**
     * Save a bingo ballot.
     * @param bingoBallot the bingo ballot to be saved.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    public void save(BingoBallot bingoBallot);

    /**
     * find all bingo ballot.
     *
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    public List<BingoBallot> findAll();

    /**
     * Checked a bingo ballot.
     *
     * @param ballotLetter
     * @param ballotNumber
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    public boolean checkBingoBallot( int ballotLetter, int ballotNumber);
}
