package com.sofka.dao;

import com.sofka.domain.PersonalInformation;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

/**
 * Represent the contact's personal information Dao (data access object) . This make the connection with the database and implement the crud.
 *
 * @version 1.0.0 2022-03-13.
 *
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 *
 * @since 1.0.0 2022-03-13.
 */
public interface PersonalInformationDao extends CrudRepository<PersonalInformation,Long> {

    /**
     * Update a contact's first name.
     *
     * @param id identifier of the contact to be updated.
     * @param firstName is the first name use to update the contact.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    @Modifying
    @Query(value = "update contacts_personal_info con set con.first_name = :first_name where con.id = :id",nativeQuery = true)
    public void updateFirstName(
            @Param("id") Long id,
            @Param("first_name") String firstName);

    /**
     * Logic delete a contact's personal information.
     *
     * @param id identifier of the contact to be deleted.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    @Modifying
    @Query(value = "update contacts_personal_info con set con.deleted_at = now() where con.id = :id",nativeQuery = true)
    public void logicDelete(
            @Param("id") Long id);

    /**
     * Find all contacts personal information.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    @Modifying
    @Query(value ="select * from contacts_personal_info con where con.deleted_at is null" ,nativeQuery = true)
    public List<PersonalInformation> findAll();

    /**
     * Find a contact's personal information.
     *
     * @param id identifier of the contact to be found.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    @Modifying
    @Query(value ="select * from contacts_personal_info con where con.id= :id and con.deleted_at is null" ,nativeQuery = true)
    public Optional<PersonalInformation> findById(
            @Param("id") Long id);
}
