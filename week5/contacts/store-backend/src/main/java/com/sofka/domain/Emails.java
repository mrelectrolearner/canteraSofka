package com.sofka.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
/**
 * Represent emails table of the database.
 *
 * @version 1.0.0 2022-03-12.
 *
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 *
 * @since 1.0.0 2022-03-12.
 */
@Data
@Entity
@Table(name="emails")
public class Emails implements Serializable{
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//
    @Column(name="id")
    private long id;

    @Column(name="email")
    private String email;

    @Column (name="created_at")
    private String createdAt;

    @Column (name="updated_at")
    private String updatedAt;

    @Column (name="deleted_at")
    private String deletedAt;
}
