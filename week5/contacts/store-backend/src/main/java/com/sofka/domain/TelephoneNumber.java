package com.sofka.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
/**
 * Represent telephone_numbers table of the database.
 *
 * @version 1.0.0 2022-03-12.
 *
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 *
 * @since 1.0.0 2022-03-12.
 */
@Data
@Entity
@Table(name="telephone_numbers")
public class TelephoneNumber implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//
    @Column(name="contacts_personal_info_id ")
    private long idNumber;

    @Column(name="telephone_numbers")
    private String telephone;

    @Column (name="created_at")
    private String createdAt;

    @Column (name="updated_at")
    private String updatedAt;

    @Column (name="deleted_at")
    private String deletedAt;
}
