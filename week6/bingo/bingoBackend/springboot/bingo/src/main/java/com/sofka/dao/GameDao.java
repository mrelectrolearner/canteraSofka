package com.sofka.dao;

import com.sofka.domain.Game;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Represent the game Dao (data access object) . This make the connection with the database and implement the crud.
 *
 * @version 1.0.0 2022-03-13.
 *
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 *
 * @since 1.0.0 2022-03-13.
 */
public interface GameDao extends CrudRepository<Game,Long> {
    /**
     * find b tuple id of a player.
     *
     * @param player identifier of a player.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    @Modifying
    @Query(value = "select g.b_tuples_id from game g where g.player= :player and g.deleted_at is null",nativeQuery = true)
    public void findBTupleByPlayer(
            @Param("player") String player);
}
