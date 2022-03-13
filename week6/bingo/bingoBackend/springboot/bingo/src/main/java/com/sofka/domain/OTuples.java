package com.sofka.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
/**
 * Represent the letter o tuples table of the database.
 *
 * @version 1.0.0 2022-03-13.
 *
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 *
 * @since 1.0.0 2022-03-13.
 */
@Data
@Entity
@Table(name="o_tuples")
public class OTuples implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name="number_1")
    private Integer number1;

    @Column(name="number_2")
    private Integer number2;

    @Column(name="number_3")
    private Integer number3;

    @Column(name="number_4")
    private Integer number4;

    @Column(name="number_5")
    private Integer number5;

    @Column (name="created_at")
    private String createdAt;

    @Column (name="updated_at")
    private String updatedAt;

    @Column (name="deleted_at")
    private String deletedAt;
}
