package com.sofka.service;


import com.sofka.dao.BingoBallotDao;
import com.sofka.domain.BingoBallot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Represents the  functions use to build the bingo ballots (ball) in the application service layer.
 *
 * @version 1.0.0 2022-03-13.
 *
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 *
 * @since 1.0.0 2022-03-13.
 */

import java.util.List;
@Service
public class BingoBallotService implements IBingoBallotService{

    @Autowired
    private BingoBallotDao bingoBallotDao;
    @Autowired
    private TuplesService tuplesService;

    /**
     * Delete a bingo ballot.
     *
     * @param bingoBallot the bingo ballot to be deleted.
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     * @since 1.0.0 2022-03-13.
     */
    @Override
    @Transactional
    public void delete(BingoBallot bingoBallot) {
        bingoBallotDao.delete(bingoBallot);
    }

    /**
     * Update a bingo ballot.
     *
     * @param bingoBallot the bingo ballot to be updated.
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     * @since 1.0.0 2022-03-13.
     */
    @Override
    @Transactional
    public void update(BingoBallot bingoBallot) {
        bingoBallotDao.save(bingoBallot);


    }

    /**
     * Save a bingo ballot.
     *
     * @param bingoBallot the bingo ballot to be saved.
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     * @since 1.0.0 2022-03-13.
     */
    @Override
    @Transactional
    public void save(BingoBallot bingoBallot) {
        bingoBallotDao.save(bingoBallot);

    }

    /**
     * find all bingo ballot.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     * @since 1.0.0 2022-03-13.
     */
    @Override
    @Transactional
    public List<BingoBallot> findAll() {
        return (List<BingoBallot>) bingoBallotDao.findAll();
    }

    /**
     * Checked a bingo ballot.
     *
     *
     * @param ballotLetter the letter in the ballot (ball).
     * @param ballotNumber the number in the ballot (ball).
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     * @since 1.0.0 2022-03-13.
     */
    @Override
    @Transactional
    public boolean checkBingoBallot(int ballotLetter, int ballotNumber) {
        boolean found =false;
        List<BingoBallot> ballots= (List<BingoBallot>) bingoBallotDao.findAll();
        for (BingoBallot ballot: ballots ) {
            boolean isLetter=ballot.getLetter().equals(ballotLetter);
            boolean isNumber=ballot.getNumber().equals(ballotNumber);
            if(isLetter & isNumber){
                found =true;
            }
        }
        return found;
    }
}
