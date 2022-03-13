package com.sofka.dao;

import com.sofka.domain.BingoBallot;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Represent bingo ballot Dao (data access object) . This make the connection with the database and implement the crud.
 *
 * @version 1.0.0 2022-03-13.
 *
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 *
 * @since 1.0.0 2022-03-13.
 */
public interface BingoBallotDao extends CrudRepository<BingoBallot,Long> {
    /**
     * find all the bingo ballots
     *
     *
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    @Modifying
    @Query(value = "select b.id, b.letter, b.numbers from bingo_ballot b where b.deleted_at is null",nativeQuery = true)
    public List<BingoBallot> findAll(
            @Param("player") String player);
}
