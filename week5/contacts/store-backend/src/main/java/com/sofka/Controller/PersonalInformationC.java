package com.sofka.Controller;

import com.sofka.domain.Emails;
import com.sofka.domain.PersonalInformation;
import com.sofka.domain.TelephoneNumber;
import com.sofka.service.PersonalInformationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents the API functions, used to build the application controller layer.
 *
 * @version 1.0.0 2022-03-13.
 *
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 *
 * @since 1.0.0 2022-03-13.
 */
@Slf4j
@RestController
public class PersonalInformationC {


    @Autowired
    private PersonalInformationService personalInformationService;

    /**
     * Get petition from the index direction.
     * @return a json object.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    @GetMapping(path="/")
    public Map<String, String> index(){
        Map<String,String> respuesta=new HashMap<>();
        respuesta.put("menssage","Binvenido");
        return respuesta;

    }

    /**
     * Get petition from the  direction /contacts.
     * @return a list of all the contacts.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */

    @GetMapping(path = "/contacts")
    public List<PersonalInformation> list(){
        return personalInformationService.list()  ;

    }


    /**
     * Post petitions from the direction /contact/create that allow to create a new contact.
     * @param personalInformation contact's personal information.
     * @param emails contact's email.
     * @param telephoneNumber contact's telephone number.
     * @return new contact's personal information
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    @PostMapping(path = "/contact/create")
    public ResponseEntity<PersonalInformation> create(PersonalInformation personalInformation,
                                                      Emails emails,
                                                      TelephoneNumber telephoneNumber){
        log.info("PersonalInformation a create: {}", personalInformation);
        personalInformationService.save(personalInformation,emails,telephoneNumber);
        return new ResponseEntity<>(personalInformation, HttpStatus.CREATED);

    }




    /**
     * Delete petition from the direction /contact/delete/{id} that delete contact by the identifier.
     * @param personalInformation contact's personal information (identifier).
     * @return the deleted contact.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    @DeleteMapping(path = "/contact/delete/{id}")
    public ResponseEntity<PersonalInformation> delete(PersonalInformation personalInformation){
        log.info("Contact logical deleted: {}", personalInformation);
        personalInformationService.delete(personalInformation);
        return new ResponseEntity<>(personalInformation, HttpStatus.OK);

    }

    /**
     *Patch petition from the direction /contact/delete/logic/{id} that logical delete a contact by the identifier.
     * @param personalInformation contact's personal information (identifier).
     * @return the logic deleted contact.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    @PatchMapping(path = "/contact/delete/logic/{id}")
    public ResponseEntity<PersonalInformation> logicDelete(PersonalInformation personalInformation){
        log.info("Contact logical deleted:  {}", personalInformation);
        personalInformationService.logicDelete(personalInformation);
        return new ResponseEntity<>(personalInformation, HttpStatus.OK);

    }


    /**
     * Put petition from the direction /contact/update/{id} that update a contact by the identifier.
     * @param personalInformation contact's personal information.
     * @param id contact's identifier.
     * @return the updated contact.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    @PutMapping(path = "/contact/update/{id}")
    public ResponseEntity<PersonalInformation> update(PersonalInformation personalInformation, @PathVariable("id") Long id){
        log.info("PersonalInformation a modificar: {}", personalInformation);
        personalInformationService.update(id, personalInformation);
        return new ResponseEntity<>(personalInformation, HttpStatus.OK);
    }


    /**
     * Patch petition from the direction /contact/update/firstname/{id} that update a contact's first name by the identifier.
     * @param personalInformation contact's personal information (fist name).
     * @param id contact's identifier.
     * @return the updated contact.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    @PatchMapping(path = "/contact/update/firstname/{id}")
    public ResponseEntity<PersonalInformation> updateFirstName(PersonalInformation personalInformation, @PathVariable("id") Long id){
        log.info("PersonalInformation a modificar: {}", personalInformation);
        personalInformationService.updateFirstName(id, personalInformation);
        return new ResponseEntity<>(personalInformation, HttpStatus.OK);
    }

    /**
     * Patch petition from the direction /contact/update/lastname/{id} that update a contact's last name by the identifier.
     * @param personalInformation contact's personal information (last name).
     * @param id contact's identifier.
     * @return the updated contact.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    @PatchMapping(path = "/contact/update/lastname/{id}")
    public ResponseEntity<PersonalInformation>  upateLastName(PersonalInformation personalInformation, @PathVariable("id") Long id){
        log.info("PersonalInformation a modificar: {}", personalInformation);
        personalInformationService.updateFirstName(id, personalInformation);
        return new ResponseEntity<>(personalInformation, HttpStatus.OK);
    }

    /**
     * Patch petition from the direction /contact/update/lastname/{id} that update a contact's birthday by the identifier.
     * @param personalInformation contact's personal information (birthday).
     * @param id contact's identifier.
     * @return the updated contact.
     *
     * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-03-13.
     */
    @PatchMapping(path = "/contact/update/birthday/{id}")
    public ResponseEntity<PersonalInformation>  upateBirthday(PersonalInformation personalInformation, @PathVariable("id") Long id){
        log.info("PersonalInformation a modificar: {}", personalInformation);
        personalInformationService.updateFirstName(id, personalInformation);
        return new ResponseEntity<>(personalInformation, HttpStatus.OK);
    }
}
