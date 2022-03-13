package com.sofka.service;

import com.sofka.dao.*;
import com.sofka.domain.*;
import com.sofka.dao.*;
import com.sofka.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Optional;

public class TuplesService implements InterfaceTuplesService{


    @Autowired
    private BTuplesDao bTuplesDao;

    @Autowired
    private ITuplesDao iTuplesDao;

    @Autowired
    private NTuplesDao nTuplesDao;

    @Autowired
    private GTuplesDao gTuplesDao;

    @Autowired
    private OTuplesDao oTuplesDao;

    public TuplesService(){}
    /**
     * Find a b tuple of a player.
     *
     * @param game the game where the tuples have been used (player).
     * @return a b tuple
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     * @since 1.0.0 2022-03-13.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<BTuples> findBTupleByPlayerId(Game game) {
        return bTuplesDao.findById(game.getBTuplesId());
    }

    /**
     * Find an i tuple of a player.
     *
     * @param game the game where the tuples have been used (player).
     * @return an i tuple
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     * @since 1.0.0 2022-03-13.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<ITuples> findITupleByPlayerId(Game game) {
        return iTuplesDao.findById(game.getITuplesId());
    }

    /**
     * Find an n tuple of a player.
     *
     * @param game the game where the tuples have been used (player).
     * @return an n tuple
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     * @since 1.0.0 2022-03-13.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<NTuples> findNTupleByPlayerId(Game game) {
        return nTuplesDao.findById(game.getNTuplesId());
    }

    /**
     * Find a g tuple of a player.
     *
     * @param game the game where the tuples have been used (player).
     * @return a g tuple
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     * @since 1.0.0 2022-03-13.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<GTuples> findGTupleByPlayerId(Game game) {
        return gTuplesDao.findById(game.getGTuplesId());
    }

    /**
     * Find an o tuple of a player.
     *
     * @param game the game where the tuples have been used (player).
     * @return an o tuple
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     * @since 1.0.0 2022-03-13.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<OTuples> findOTupleByPlayerId(Game game) {
        return oTuplesDao.findById(game.getOTuplesId());
    }

    /**
     * Delete b tuple by id
     *
     * @param tuple b tuple (id) to be deleted.
     */
    @Override
    @Transactional
    public void deleteBTuple(BTuples tuple) {
        bTuplesDao.delete(tuple);

    }

    /**
     * Delete i tuple by id
     *
     * @param tuple tuple (id) to be deleted.
     */
    @Override
    @Transactional
    public void deleteITuple(ITuples tuple) {
        iTuplesDao.delete(tuple);

    }

    /**
     * Delete n tuple by id.
     *
     * @param tuple tuple (id) to be deleted.
     */
    @Override
    @Transactional
    public void deleteNTuple(NTuples tuple) {
        nTuplesDao.delete(tuple);
    }

    /**
     * Delete g tuple by id.
     *
     * @param tuple tuple (id) to be deleted.
     */
    @Override
    @Transactional
    public void deleteGTuple(GTuples tuple) {
        gTuplesDao.delete(tuple);
    }

    /**
     * Delete o tuple by id
     *
     * @param tuple tuple (id) to be deleted.
     */
    @Override
    @Transactional
    public void deleteOTuple(OTuples tuple) {
        oTuplesDao.delete (tuple);
    }

    /**
     * Create a b tuple in the database.
     *
     * @param tupleNumbers number use to create the tuple
     */
    @Override
    @Transactional
    public void createBTuple(ArrayList<Integer> tupleNumbers, Long idBTuple) {
        BTuples tuple=new BTuples();
        tuple.setNumber1( tupleNumbers.get(0));
        tuple.setNumber2(tupleNumbers.get(1));
        tuple.setNumber3(tupleNumbers.get(2));
        tuple.setNumber4(tupleNumbers.get(3));
        tuple.setNumber5(tupleNumbers.get(4));
        tuple.setId(idBTuple);
        System.out.println("Es el guardado");
        bTuplesDao.save(tuple);
    }

    /**
     * Create an i tuple in the database.
     *
     * @param tupleNumbers number use to create the tuple
     */
    @Override
    @Transactional
    public void createITuple(ArrayList<Integer>tupleNumbers,Long idITuple) {
        ITuples tuple=new ITuples();
        tuple.setNumber1(tupleNumbers.get(0));
        tuple.setNumber2(tupleNumbers.get(1));
        tuple.setNumber3(tupleNumbers.get(2));
        tuple.setNumber4(tupleNumbers.get(3));
        tuple.setNumber5(tupleNumbers.get(4));
        tuple.setId(idITuple);
        iTuplesDao.save(tuple);

    }

    /**
     * Create an n tuple in the database.
     *
     * @param tupleNumbers number use to create the tuple
     */
    @Override
    @Transactional
    public void createNTuple(ArrayList<Integer> tupleNumbers,Long idNTuple) {
        NTuples tuple=new NTuples();
        tuple.setNumber1(tupleNumbers.get(0));
        tuple.setNumber2(tupleNumbers.get(1));
        tuple.setNumber3(tupleNumbers.get(2));
        tuple.setNumber4(tupleNumbers.get(3));
        tuple.setId(idNTuple);
        nTuplesDao.save(tuple);
    }

    /**
     * Create a g tuple in the database.
     *
     * @param tupleNumbers number use to create the tuple
     * @param idGTuple
     */
    @Override
    @Transactional
    public void createGTuple(ArrayList<Integer> tupleNumbers, Long idGTuple) {
        GTuples tuple=new GTuples();
        tuple.setNumber1(tupleNumbers.get(0));
        tuple.setNumber2(tupleNumbers.get(1));
        tuple.setNumber3(tupleNumbers.get(2));
        tuple.setNumber4(tupleNumbers.get(3));
        tuple.setNumber5(tupleNumbers.get(4));
        tuple.setId(idGTuple);
        gTuplesDao.save(tuple);
    }

    /**
     * Create an o tuple in the database.
     *
     * @param tupleNumbers number use to create the tuple
     * @param idOTuple
     */
    @Override
    @Transactional
    public void createOTuple(ArrayList<Integer> tupleNumbers, Long idOTuple) {
        OTuples tuple=new OTuples();
        tuple.setNumber1(tupleNumbers.get(0));
        tuple.setNumber2(tupleNumbers.get(1));
        tuple.setNumber3(tupleNumbers.get(2));
        tuple.setNumber4(tupleNumbers.get(3));
        tuple.setNumber5(tupleNumbers.get(4));
        tuple.setId(idOTuple);
        oTuplesDao.save(tuple);
    }
}
