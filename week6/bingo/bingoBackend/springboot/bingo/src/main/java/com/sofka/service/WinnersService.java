package com.sofka.service;

import com.sofka.dao.WinnersDao;
import com.sofka.domain.Winners;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Represents the functions use to build winners in the application service layer.
 *
 * @version 1.0.0 2022-03-13.
 *
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 *
 * @since 1.0.0 2022-03-13.
 */
@Service
public class WinnersService implements IWinnersService{

    @Autowired
    private WinnersDao winnersDao;
    /**
     * Delete a winner.
     * @param winner the winner to be deleted.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    @Override
    @Transactional
    public void deleteWinner(Winners winner) {
        winnersDao.delete(winner);
    }

    /**
     * Update winner.
     * @param winner the winner to be updated.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    @Override
    @Transactional
    public void updateWinner(Winners winner) {
        winnersDao.save(winner);

    }

    /**
     * Save a winner.
     * @param winner the winner to be saved.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    @Override
    @Transactional
    public void saveWinner(Winners winner) {
        winnersDao.save(winner);
    }
}
