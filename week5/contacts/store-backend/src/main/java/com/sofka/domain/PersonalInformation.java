package com.sofka.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Represent the contacts_personal_info table of the database.
 *
 * @version 1.0.0 2022-03-12.
 *
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 *
 * @since 1.0.0 2022-03-12.
 */
@Data
@Entity
@Table(name="contacts_personal_info")

public class PersonalInformation implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//
    @Column(name="id")
    private long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="date_of_birthday")
    private String dateOfBirthday;

    @Column (name="created_at")
    private String createdAt;

    @Column (name="updated_at")
    private String updatedAt;

    @Column (name="deleted_at")
    private String deletedAt;
}
