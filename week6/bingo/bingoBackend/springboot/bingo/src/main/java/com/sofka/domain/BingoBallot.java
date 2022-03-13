package com.sofka.domain;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
/**
 * Represent the letter b tuples table of the database.
 *
 * @version 1.0.0 2022-03-13.
 *
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 *
 * @since 1.0.0 2022-03-13.
 */
@Data
@Entity
@Table(name = "bingo_ballot")
public class BingoBallot implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="letter")
    private Integer letter;

    @Column(name="numbers")
    private Integer number;

    @Column (name="created_at")
    private String createdAt;

    @Column (name="updated_at")
    private String updatedAt;

    @Column (name="deleted_at")
    private String deletedAt;

}