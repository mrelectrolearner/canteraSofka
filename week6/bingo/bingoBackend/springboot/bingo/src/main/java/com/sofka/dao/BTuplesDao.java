package com.sofka.dao;

import com.sofka.domain.BTuples;
import org.springframework.data.repository.CrudRepository;

/**
 * Represent bingo B tuples Dao (data access object) . This make the connection with the database and implement the crud.
 *
 * @version 1.0.0 2022-03-13.
 *
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 *
 * @since 1.0.0 2022-03-13.
 */
public interface BTuplesDao extends CrudRepository<BTuples,Long> {

}
