-- -----------------------------------------------------
-- Schema bingo
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS bingo DEFAULT CHARACTER SET utf8;
use bingo;

-- -----------------------------------------------------
-- Table b_tuples
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS b_tuples (
  id INT NOT NULL,
  number_1 INT NOT NULL,
  number_2 INT NOT NULL,
  number_3 INT NOT NULL,
  number_4 INT NOT NULL,
  number_5 INT NOT NULL,
  created_at DATE DEFAULT (CURRENT_DATE),
  updated_at DATE NULL,
  deleted_at DATE NULL,
  PRIMARY KEY (id)
)ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table i_tuples
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS i_tuples (
  id INT NOT NULL,
  number_1 INT NOT NULL,
  number_2 INT NOT NULL,
  number_3 INT NOT NULL,
  number_4 INT NOT NULL,
  number_5 INT NOT NULL,
  created_at DATE DEFAULT (CURRENT_DATE),
  updated_at DATE NULL,
  deleted_at DATE NULL,
  PRIMARY KEY (id)
)ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table g_tuples
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS g_tuples (
  id INT NOT NULL,
  number_1 INT NOT NULL,
  number_2 INT NOT NULL,
  number_3 INT NOT NULL,
  number_4 INT NOT NULL,
  number_5 INT NOT NULL,
  created_at DATE DEFAULT (CURRENT_DATE),
  updated_at DATE NULL,
  deleted_at DATE NULL,
  PRIMARY KEY (id)
)ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table n_tuples
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS n_tuples (
  id INT NOT NULL,
  number_1 INT NOT NULL,
  number_2 INT NOT NULL,
  number_3 INT NOT NULL,
  number_4 INT NOT NULL,
  created_at DATE DEFAULT (CURRENT_DATE),
  updated_at DATE NULL,
  deleted_at DATE NULL,
  PRIMARY KEY (id)
)ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table o_tuples
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS o_tuples (
  id INT NOT NULL,
  number_1 INT NOT NULL,
  number_2 INT NOT NULL,
  number_3 INT NOT NULL,
  number_4 INT NOT NULL,
  number_5 INT NOT NULL,
  created_at DATE DEFAULT (CURRENT_DATE),
  updated_at DATE NULL,
  deleted_at DATE NULL,
  PRIMARY KEY (id)
)ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table bingo_ballot
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS bingo_ballot (
  id INT NOT NULL AUTO_INCREMENT,
  letter INT NOT NULL,
  numbers INT NOT NULL,
  created_at DATE DEFAULT (CURRENT_DATE),
  updated_at DATE NULL,
  deleted_at DATE NULL,
  PRIMARY KEY (id)
)ENGINE = InnoDB;



-- -----------------------------------------------------
-- Table game
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS game (
  id INT NOT NULL AUTO_INCREMENT,
  game_group int NOT NULL,
  player VARCHAR(45) NOT NULL,
  n_tuples_id INT NOT NULL,
  b_tuples_id INT NOT NULL,
  i_tuples_id INT NOT NULL,
  g_tuples_id INT NOT NULL,
  o_tuples_id INT NOT NULL,
  created_at DATE DEFAULT (CURRENT_DATE),
  updated_at DATE NULL,
  deleted_at DATE NULL,
  PRIMARY KEY (id, n_tuples_id, b_tuples_id, i_tuples_id, g_tuples_id, o_tuples_id),
  INDEX fk_game_n_tuples1_idx (n_tuples_id ASC) VISIBLE,
  INDEX fk_game_b_tuples1_idx (b_tuples_id ASC) VISIBLE,
  INDEX fk_game_i_tuples1_idx (i_tuples_id ASC) VISIBLE,
  INDEX fk_game_g_tuples1_idx (g_tuples_id ASC) VISIBLE,
  INDEX fk_game_o_tuples1_idx (o_tuples_id ASC) VISIBLE,
  CONSTRAINT fk_game_n_tuples1
    FOREIGN KEY (n_tuples_id)
    REFERENCES n_tuples (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT fk_game_b_tuples1
    FOREIGN KEY (b_tuples_id)
    REFERENCES b_tuples (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT fk_game_i_tuples1
    FOREIGN KEY (i_tuples_id)
    REFERENCES i_tuples (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT fk_game_g_tuples1
    FOREIGN KEY (g_tuples_id)
    REFERENCES g_tuples (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT fk_game_o_tuples1
    FOREIGN KEY (o_tuples_id)
    REFERENCES o_tuples (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
)ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table winners
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS winners (
  id INT NOT NULL AUTO_INCREMENT,
  winner VARCHAR(45) NULL,
  game_id INT NOT NULL,
  created_at DATE DEFAULT (CURRENT_DATE),
  updated_at DATE NULL,
  deleted_at DATE NULL,
  PRIMARY KEY (id, game_id),
  INDEX fk_winners_game1_idx (game_id ASC) VISIBLE,
  CONSTRAINT fk_winners_game1
    FOREIGN KEY (game_id)
    REFERENCES game (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
)ENGINE = InnoDB;

-- DROP DATABASE bingo;

use bingo;
select * from game;
select * from bingo_ballot;
select * from b_tuples;