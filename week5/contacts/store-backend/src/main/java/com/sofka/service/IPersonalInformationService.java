package com.sofka.service;
import com.sofka.domain.Emails;
import com.sofka.domain.PersonalInformation;
import com.sofka.domain.TelephoneNumber;

import java.util.List;
import java.util.Map;
import java.util.Optional;
/**
 * This interface represents the  functions use to build the application service layer.
 *
 * @version 1.0.0 2022-03-13.
 *
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 *
 * @since 1.0.0 2022-03-13.
 */
public interface IPersonalInformationService {
    /**
     * List the contacts
     * @return a list of contacts personal information.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    public List<PersonalInformation> list();

    /**
     * Save a contact.
     *
     * @param personalInformation the contact personal information to be saved.
     * @param email the contact email to be saved.
     * @param telephoneNumber the contact telephone number to be saved.
     * @return a sumary of the contact information save (name, email, telephone number).
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    public Map<String,String> save(PersonalInformation personalInformation,
                                   Emails email, TelephoneNumber telephoneNumber);

    /**
     * Update a contact information.
     *
     * @param id identifier of the contact to be updated.
     * @param personalInformation contact personal information use to updated the contact.
     * @return the contact updated personal information.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    public PersonalInformation update(Long id, PersonalInformation personalInformation);

    /**
     * Update the contact first name.
     *
     * @param id identifier of the contact to be updated.
     * @param personalInformation contact personal information use to updated the contact (the first name).
     * @return the contact updated personal information.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    public Optional<PersonalInformation> updateFirstName(Long id, PersonalInformation personalInformation);

    /**
     * Delete a contact.
     * @param personalInformation personal informaation of the contact to be deleted (identifier).
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    public void delete(PersonalInformation personalInformation);

    /**
     * Logic delete a contact
     * @param personalInformation personal informaation of the contact to be logic deleted (identifier).
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    public void logicDelete(PersonalInformation personalInformation);

    /**
     * Find a contact
     * @param personalInformation  personal informaation of the contact to be found (identifier).
     * @return the contact found.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    public Optional<PersonalInformation> findContact(PersonalInformation personalInformation);

    /**
     * Find contact's email.
     * @param personalInformation  personal information of the contact to be found (identifier).
     * @return contact's email.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    public List<Emails> findEmailByContact(PersonalInformation personalInformation);

    /**
     * Find contact's telephone number.
     * @param personalInformation  personal information of the contact to be found (identifier).
     * @return contact's telephone number.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    public List<Emails> findNumberByContact(PersonalInformation personalInformation);


}
