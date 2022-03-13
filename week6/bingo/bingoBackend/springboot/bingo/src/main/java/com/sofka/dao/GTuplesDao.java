package com.sofka.dao;

import com.sofka.domain.GTuples;
import org.springframework.data.repository.CrudRepository;
/**
 * Represent the letter G tuples Dao (data access object) . This make the connection with the database and implement the crud.
 *
 * @version 1.0.0 2022-03-13.
 *
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 *
 * @since 1.0.0 2022-03-13.
 */
public interface GTuplesDao extends CrudRepository<GTuples,Long> {
}
