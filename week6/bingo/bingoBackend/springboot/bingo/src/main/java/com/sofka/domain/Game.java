package com.sofka.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
/**
 * Represent the game table of the database.
 *
 * @version 1.0.0 2022-03-13.
 *
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com.
 *
 * @since 1.0.0 2022-03-13.
 */
@Data
@Entity
@Table(name = "game")
public class Game implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "player")
    private Long player;
    @Column(name = "game_group")
    private Long gameGroup;

    @Column(name = "b_tuples_id")
    private Long bTuplesId;

    @Column(name = "i_tuples_id")
    private Long iTuplesId;

    @Column(name = "n_tuples_id")
    private Long nTuplesId;

    @Column(name = "g_tuples_id")
    private Long gTuplesId;

    @Column(name = "o_tuples_id")
    private Long oTuplesId;

    @Column (name="created_at")
    private String createdAt;

    @Column (name="updated_at")
    private String updatedAt;

    @Column (name="deleted_at")
    private String deletedAt;


}
