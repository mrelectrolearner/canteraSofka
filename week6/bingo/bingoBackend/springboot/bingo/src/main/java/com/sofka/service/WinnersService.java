package com.sofka.service;

import com.sofka.dao.WinnersDao;
import com.sofka.domain.Winners;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WinnersService implements IWinnersService{

    @Autowired
    private WinnersDao winnersDao;

    @Override
    @Transactional
    public void deleteWinner(Winners winner) {
        winnersDao.delete(winner);
    }

    @Override
    @Transactional
    public void updateWinner(Winners winner) {
        winnersDao.save(winner);

    }

    @Override
    @Transactional
    public void saveWinner(Winners winner) {
        winnersDao.save(winner);
    }
}
