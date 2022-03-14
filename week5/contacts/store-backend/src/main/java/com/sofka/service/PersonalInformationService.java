package com.sofka.service;

import com.sofka.dao.*;
import com.sofka.domain.Emails;
import com.sofka.domain.PersonalInformation;
import com.sofka.domain.TelephoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * This implement the interface that represents the functions use to build the application service layer.
 *
 * @version 1.0.0 2022-03-13.
 *
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 *
 * @since 1.0.0 2022-03-13.
 */

@Service// con esto le decimos que es un servicio
public class PersonalInformationService implements IPersonalInformationService {

    @Autowired// para inyectar personalInformationDao
    private PersonalInformationDao personalInformationDao;
    @Autowired// para inyectar personalInformationDao
    private EmailsDao emailsDao;
    @Autowired// para inyectar personalInformationDao
    private TelephoneNumberDao telephoneNumberDao;
    @Autowired// para inyectar personalInformationDao
    private ContactsEmailsDao contactsEmailsDao;
    @Autowired// para inyectar personalInformationDao
    private ContactsNumbersDao contactsNumbersDao;


    /**
     * List the contacts
     * @return a list of contacts personal information.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    @Override
    @Transactional(readOnly=true)
    public List<PersonalInformation> list() {
        return (List<PersonalInformation>) personalInformationDao.findAll();
    }

    /**
     * Save a contact.
     *
     * @param personalInformation the contact personal information to be saved.
     * @param emails the contact email to be saved.
     * @param telephoneNumber the contact telephone number to be saved.
     * @return a sumary of the contact information save (name, email, telephone number).
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    @Override
    @Transactional
    public Map<String, String> save(PersonalInformation personalInformation,
                                    Emails emails, TelephoneNumber telephoneNumber) {
        Map<String,String> contact =new HashMap<>();
        personalInformationDao.save(personalInformation);
        contact.put("first name", personalInformation.getFirstName());
        emailsDao.save(emails);
        contact.put("email", emails.getEmail());
        telephoneNumberDao.save(telephoneNumber);
        contact.put("telephone", telephoneNumber.getTelephone());
        contactsNumbersDao.saveContactId(personalInformation.getId(), telephoneNumber.getIdNumber());
        contactsEmailsDao.saveContactId(personalInformation.getId(), emails.getId());
        return  contact;
    }

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
    @Override
    @Transactional
    public PersonalInformation update(Long id, PersonalInformation personalInformation) {
        personalInformation.setId(id);
        return personalInformationDao.save(personalInformation);
    }

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
    @Transactional
    public Optional<PersonalInformation> updateFirstName(Long id, PersonalInformation personalInformation){
       personalInformationDao.updateFirstName(id, personalInformation.getFirstName());
       return personalInformationDao.findById(personalInformation.getId());

    }

    /**
     * Delete a contact.
     * @param personalInformation personal informaation of the contact to be deleted (identifier).
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    @Override
    @Transactional
    public void delete(PersonalInformation personalInformation) {
        personalInformationDao.delete(personalInformation);

    }

    /**
     * Logic delete a contact
     * @param personalInformation personal informaation of the contact to be logic deleted (identifier).
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    @Override
    @Transactional
    public void logicDelete(PersonalInformation personalInformation) {
        personalInformationDao.logicDelete(personalInformation.getId());
        contactsEmailsDao.logicDelete(personalInformation.getId());
        contactsNumbersDao.logicDelete(personalInformation.getId());
    }

    /**
     * Find a contact
     * @param personalInformation  personal informaation of the contact to be found (identifier).
     * @return the contact found.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    @Override
    @Transactional(readOnly=true)
    public Optional<PersonalInformation> findContact(PersonalInformation personalInformation) {
        return personalInformationDao.findById(personalInformation.getId());
    }




}
