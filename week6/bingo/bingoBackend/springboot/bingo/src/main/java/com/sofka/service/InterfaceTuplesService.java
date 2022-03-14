package com.sofka.service;

import com.sofka.domain.*;

import java.util.ArrayList;
import java.util.Optional;

/**
 * Represents the interface with the  functions use to build the tuples in the application service layer.
 *
 * @version 1.0.0 2022-03-13.
 *
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 *
 * @since 1.0.0 2022-03-13.
 */
public interface InterfaceTuplesService {
    /**
     * Find a b tuple of a player.
     * @param game the game where the tuples have been used (player).
     * @return a b tuple
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    public Optional<BTuples> findBTuple(Game game);

    /**
     * Find an i tuple of a player.
     * @param game the game where the tuples have been used (player).
     * @return an i tuple
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    public Optional<ITuples> findITuple(Game game);

    /**
     * Find an n tuple of a player.
     * @param game the game where the tuples have been used (player).
     * @return an n tuple
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    public Optional<NTuples> findNTuple(Game game);

    /**
     * Find a g tuple of a player.
     * @param game the game where the tuples have been used (player).
     * @return a g tuple
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    public Optional<GTuples> findGTuple(Game game);

    /**
     * Find an o tuple of a player.
     * @param game the game where the tuples have been used (player).
     * @return an o tuple
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    public Optional<OTuples> findOTuple(Game game);

    /**
     * Delete b tuple by id
     * @param tuple b tuple (id) to be deleted.
     */
    public void deleteBTuple(BTuples tuple);

    /**
     * Delete i tuple by id
     * @param tuple tuple (id) to be deleted.
     */
    public void deleteITuple(ITuples tuple);

    /**
     * Delete n tuple by id.
     * @param tuple  tuple (id) to be deleted.
     */
    public void deleteNTuple(NTuples tuple);
    /**
     * Delete g tuple by id.
     * @param tuple tuple (id) to be deleted.
     */
    public void deleteGTuple(GTuples tuple);
    /**
     * Delete o tuple by id
     * @param tuple tuple (id) to be deleted.
     */
    public void deleteOTuple(OTuples tuple);

    /**
     * Create a b tuple in the database.
     * @param tupleNumbers number use to create the tuple
     * @param idBTuple
     */
    public void createBTuple(ArrayList<Integer> tupleNumbers, Long idBTuple);

    /**
     * Create an i tuple in the database.
     * @param tupleNumbers number use to create the tuple
     * @param idITuple
     */
    public void createITuple(ArrayList<Integer> tupleNumbers, Long idITuple);

    /**
     * Create an n tuple in the database.
     * @param tupleNumbers number use to create the tuple
     */
    public void createNTuple(ArrayList<Integer> tupleNumbers, Long idNTuple);

    /**
     * Create a g tuple in the database.
     * @param tupleNumbers number use to create the tuple
     * @param idGTuple
     */
    public void createGTuple(ArrayList<Integer> tupleNumbers, Long idGTuple);

    /**
     * Create an o tuple in the database.
     * @param tupleNumbers number use to create the tuple
     * @param idOTuple
     */
    public void createOTuple(ArrayList<Integer> tupleNumbers, Long idOTuple);








}
