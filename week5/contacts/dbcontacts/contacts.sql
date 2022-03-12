-- -----------------------------------------------------
-- Schema contacts
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS contacts DEFAULT CHARACTER SET utf8 ;
USE contacts;

-- -----------------------------------------------------
-- Table contacts_personal_info
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS contacts_personal_info (
  id INT NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(15) NULL,
  last_name VARCHAR(15) NULL,
  date_of_birthday DATE NULL,
  created_at DATE DEFAULT (CURRENT_DATE),
  updated_at DATE NULL,
  deleted_at DATE NULL,
  PRIMARY KEY (id),
  UNIQUE INDEX fullname_bithday  (first_name ASC, last_name ASC, date_of_birthday ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table telephone_numbers
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS telephone_numbers (
  id INT NOT NULL AUTO_INCREMENT,
  telephone_numbers VARCHAR(12) NULL,
  created_at DATE DEFAULT (CURRENT_DATE),
  updated_at DATE NULL,
  deleted_at DATE NULL,
  PRIMARY KEY (id),
  UNIQUE INDEX telephone_numbers_UNIQUE (telephone_numbers ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table emails
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS emails (
  id INT NOT NULL AUTO_INCREMENT,
  email VARCHAR(45) NOT NULL,
  created_at DATE DEFAULT (CURRENT_DATE),
  updated_at DATE NULL,
  deleted_at DATE NULL,
  PRIMARY KEY (id),
  UNIQUE INDEX email_UNIQUE (email ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table contacts_personal_info_numbers
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS contacts_personal_info_numbers (
  contacts_personal_info_id INT NOT NULL,
  telephone_numbers_id INT NOT NULL,
  created_at DATE DEFAULT (CURRENT_DATE),
  updated_at DATE NULL,
  deleted_at DATE NULL,
  PRIMARY KEY (contacts_personal_info_id, telephone_numbers_id),
  UNIQUE INDEX fk_contacts_personal_info_numbers_telephone_numbers1_idx (telephone_numbers_id ASC) VISIBLE,
  CONSTRAINT fk_contacts_personal_info_numbers_contacts_personal_info
    FOREIGN KEY (contacts_personal_info_id)
    REFERENCES contacts_personal_info (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT fk_contacts_personal_info_numbers_telephone_numbers1
    FOREIGN KEY (telephone_numbers_id)
    REFERENCES telephone_numbers (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;



-- -----------------------------------------------------
-- Table contacts_personal_info_emails
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS contacts_personal_info_emails (
  contacts_personal_info_id INT NOT NULL,
  email_id INT NOT NULL,
  created_at DATE DEFAULT (CURRENT_DATE),
  updated_at DATE NULL,
  deleted_at DATE NULL,
  PRIMARY KEY (contacts_personal_info_id, email_id),
  UNIQUE INDEX fk_contacts_personal_info_emails_email1_idx (email_id ASC) VISIBLE,
  CONSTRAINT fk_contacts_personal_info_emails_contacts_personal_info
    FOREIGN KEY (contacts_personal_info_id)
    REFERENCES contacts_personal_info (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT fk_contacts_personal_info_emails_email1
    FOREIGN KEY (email_id)
    REFERENCES emails (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;



-- ------------------------------------------------
-- Insert data in contacts_personal_info
-- ------------------------------------------------
INSERT INTO contacts_personal_info (first_name, last_name, date_of_birthday,created_at)
VALUES ('fifi','lepe','1992-02-15','2002-02-15'),
('pupu', 'lepe', '1992-02-11','2012-02-15');

-- ------------------------------------------------
-- Insert data in telephone_numbers
-- ------------------------------------------------
INSERT INTO telephone_numbers (telephone_numbers, created_at)
VALUES ('3193456343','2021-02-15'),
('3103457343','2021-02-15'),
('3115743111','2021-02-15'),
('3002930292', '2021-02-15');

-- ------------------------------------------------
-- Insert data in email
-- ------------------------------------------------
INSERT INTO emails (email, created_at)
VALUES ('Johnny_Wright1197@zorer.org','2020-05-15'),
('Monica_Rose1388@dionrab.com','2020-06-11'),
('Josephine_King6911@sveldo.biz','2015-07-05'),
('Hailey_Woodcock5146@jiman.org', '2020-08-25');

-- ------------------------------------------------
-- Insert data in contacts_personal_info_emails
-- ------------------------------------------------
INSERT INTO contacts_personal_info_emails (contacts_personal_info_id, email_id)
VALUES ('1','1'),
('1','2'),
('2','3');
INSERT INTO contacts_personal_info_emails (contacts_personal_info_id, email_id)
VALUES ('2','4');

-- ------------------------------------------------
-- Insert data in contacts_personal_info_numbers 
-- ------------------------------------------------
INSERT INTO contacts_personal_info_numbers (contacts_personal_info_id,telephone_numbers_id)
VALUES ('1','2'),
('1','1'),
('2','4');

use contacts;
select * from contacts_personal_info;
select * from emails;
select * from telephone_numbers;
select * from contacts_personal_info_numbers;
select * from contacts_personal_info_emails;


-- DROP DATABASE contacts_personal_info;
-- DROP DATABASE contacts;
use contacts;
select distinct emails.email from emails 
inner join contacts_personal_info_emails cem on emails.id = cem.email_id 
inner join contacts_personal_info info on cem.contacts_personal_info_id = info.id
where info.id=1;
