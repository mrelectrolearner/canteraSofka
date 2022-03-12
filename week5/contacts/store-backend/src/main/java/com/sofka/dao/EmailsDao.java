package com.sofka.dao;

import com.sofka.domain.Emails;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;
/**
 * Represent the email Dao (data access object) . This make the connection with the database and implement the crud.
 *
 * @version 1.0.0 2022-03-13.
 *
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 *
 * @since 1.0.0 2022-03-13.
 */
public interface EmailsDao extends CrudRepository<Emails,Long> {
    /**
     * Find a contact's email.
     *
     * @param id identifier of the contact to be found.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    @Modifying
    @Query(value = "select e.id, e.email, e.created_at, e.updated_at,e.deleted_at from emails e " +
            "inner join contacts_personal_info_emails cem on e.id = cem.email_id " +
            "inner join contacts_personal_info info on cem.contacts_personal_info_id = info.id " +
            "where info.id = :id and e.deleted_at is null",
            nativeQuery = true)
    public List<Emails> findEmailByContact(
           @Param("id") Long id
    );
}
