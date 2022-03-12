package com.sofka.dao;

import com.sofka.domain.ContactsEmails;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
/**
 * Represent the contact's emails Dao (data access object) . This make the connection with the database and implement the crud.
 *
 * @version 1.0.0 2022-03-13.
 *
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 *
 * @since 1.0.0 2022-03-13.
 */
public interface ContactsEmailsDao extends CrudRepository<ContactsEmails,Long> {
    /**
     * Logic delete of a contact's personal information.
     *
     * @param id identifier of the contact to be deleted.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    @Modifying
    @Query(value = "update contacts_personal_info_emails con set con.deleted_at = now() where con.contacts_personal_info_id = :id",nativeQuery = true)
    public void logicDelete(
            @Param("id") Long id);

    /**
     * Save a contact's personal information identifier related to an email identifier.
     *
     * @param idContact identifier of the contact to be saved.
     * @param idEmail identifier of the contact's email to be saved.
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    @Modifying
    @Query(value = "insert into contacts_personal_info_emails (contacts_personal_info_id, email_id) values (:id_contact , :id_email) ",nativeQuery = true)
    public void saveContactId(
            @Param("id_contact") Long idContact,
            @Param("id_email") Long idEmail);

}
