package com.sofka.service;


import com.sofka.dao.BingoBallotDao;
import com.sofka.domain.BingoBallot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class BingoBallotService implements IBingoBallotService{

    @Autowired
    private BingoBallotDao bingoBallotDao;

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
     * @param bingoBallot the bingo ballot to be checked.
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     * @since 1.0.0 2022-03-13.
     */
    @Override
    @Transactional
    public boolean checkBingoBallot(BingoBallot bingoBallot) {
        return false;
    }
}
