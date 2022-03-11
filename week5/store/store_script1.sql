
-- -----------------------------------------------------
-- Schema store
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS store DEFAULT CHARACTER SET utf8;
USE store;


-- -----------------------------------------------------
-- Table customers
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS customers (
  id INT NOT NULL AUTO_INCREMENT,
  document_type VARCHAR(4) NOT NULL,
  document VARCHAR(12) NOT NULL,
  created_at DATE NOT NULL,
  updated_at DATE NULL,
  deleted_at DATE NULL,
  PRIMARY KEY (id),
  UNIQUE INDEX cus_document_UNIQUE (document_type ASC,document ASC) INVISIBLE
)ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table products
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS products (
  pro_id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(15) NOT NULL,
  quantity DECIMAL NOT NULL,
  quantity_meansurement_unit VARCHAR(5) NOT NULL,
  expiration_date DATE NOT NULL,
  price DECIMAL NOT NULL,
  created_at DATE NOT NULL,
  updated_at DATE NULL,
  deleted_at DATE NULL,
  PRIMARY KEY (pro_id))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table supplier
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS supplier (
  sup_id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NOT NULL,
  email VARCHAR(45) NOT NULL,
  telephone_number VARCHAR(45) NOT NULL,
  created_at DATE NOT NULL,
  updated_at DATE NULL,
  deleted_at DATE NULL,
  PRIMARY KEY (sup_id))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table product_inventory
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS product_inventory (
  available_units INT NOT NULL,
  updated_at DATE NOT NULL,
  supplier_sup_id INT NOT NULL,
  pro_id INT NOT NULL,
  PRIMARY KEY (supplier_sup_id, pro_id),
  INDEX fk_warehouse_supplier_idx (supplier_sup_id ASC) VISIBLE,
  INDEX fk_warehouse_products1_idx (pro_id ASC) VISIBLE,
  CONSTRAINT fk_warehouse_supplier
    FOREIGN KEY (supplier_sup_id)
    REFERENCES supplier (sup_id)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT fk_warehouse_products1
    FOREIGN KEY (pro_id)
    REFERENCES products (pro_id)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table seller
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS seller (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NOT NULL,
  total_money_soled DECIMAL NOT NULL,
  created_at DATE NOT NULL,
  updated_at DATE NULL,
  deleted_at DATE NULL,
  PRIMARY KEY (id))

ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table sales_record
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS sales_record (
  sale_id INT NOT NULL AUTO_INCREMENT,
  date_of_sale DATE NOT NULL,
  customers_id INT NOT NULL,
  seller_id INT NOT NULL,
  total_money_sold DECIMAL NOT NULL,
  created_at DATE NOT NULL,
  updated_at DATE NULL,
  deleted_at DATE NULL,
  PRIMARY KEY (sale_id, customers_id, seller_id),

  INDEX fk_sale_customers1_idx (customers_id ASC) VISIBLE,
  INDEX fk_sales_record_Seller1_idx (seller_id ASC) VISIBLE,

  CONSTRAINT fk_sale_customers1
    FOREIGN KEY (customers_id)
    REFERENCES customers (id)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT fk_sales_record_Seller1
    FOREIGN KEY (seller_id)

    REFERENCES seller (id)

    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table products_sold
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS products_sold (
  sale_id INT NOT NULL,
  pro_id INT NOT NULL,
  sold_units INT NOT NULL,
  PRIMARY KEY (sale_id, pro_id),
  INDEX fk_products_has_sale_sale1_idx (sale_id ASC) VISIBLE,
  INDEX fk_products_sold_products1_idx (pro_id ASC) VISIBLE,
  CONSTRAINT fk_products_sold_sale1
    FOREIGN KEY (sale_id)
    REFERENCES sales_record (sale_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT fk_products_sold_products1
    FOREIGN KEY (pro_id)
    REFERENCES products (pro_id)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Insert data in customers
-- -----------------------------------------------------

INSERT INTO customers(document_type, document, created_at)
VALUES('CE' ,'3729861340', '2022-01-10') ;
INSERT INTO customers(document_type, document, created_at)
VALUES('TI' ,'10871829265',now()) ;
INSERT INTO customers(document_type, document, created_at)
VALUES('CC' ,'4039663918', now()) ;
INSERT INTO customers(document_type, document, created_at)
VALUES('TI' ,'1288946328', now()) ;

-- -----------------------------------------------------
-- Insert data in products
-- -----------------------------------------------------
INSERT INTO products( name, quantity, quantity_meansurement_unit, expiration_date, price,created_at, updated_at) 
VALUES('MANINIS', '36.6311', 'mm', '2006-08-06', '76.97','1983-04-21','2019-05-14');
INSERT INTO products( name, quantity, quantity_meansurement_unit, expiration_date, price,created_at, updated_at) 
VALUES('PALADINI', '82.2658', 'kg', '2018-11-20', '24.43','1970-02-16','1972-04-23');
INSERT INTO products( name, quantity, quantity_meansurement_unit, expiration_date, price,created_at, updated_at) 
VALUES('LALA', '69.3712', 'lb', '1978-01-16', '93.71','1986-07-04','2017-12-14');
INSERT INTO products( name, quantity, quantity_meansurement_unit, expiration_date, price,created_at, updated_at) 
VALUES('BELLVIEW', '41.8018', 'mm', '1994-03-05', '45.02','1982-07-31','1986-09-24');

-- -----------------------------------------------------
-- Insert data in supplier
-- -----------------------------------------------------
INSERT INTO supplier (name, email, telephone_number, created_at, updated_at)
VALUES('fritolite', 'fritolite@gmail.com','34455622',NOW(),NOW()),
      ('yupiie', 'yupiie@gmail.com','34455622',NOW(),NOW());

-- -----------------------------------------------------
-- Insert data in product_inventory
-- -----------------------------------------------------
INSERT INTO product_inventory (available_units, updated_at, supplier_sup_id, pro_id)
VALUES ('10','2022-02-03','1','1'),
('100','2022-02-03','1','2'),
('100','2022-02-03','1','4'),
('1000','2022-02-03','1','3');

-- -----------------------------------------------------
--  Insert data in seller
-- -----------------------------------------------------
INSERT INTO seller(name, total_money_soled, created_at, updated_at)
VALUES('pepe', '120000',NOW(),NOW());


-- -----------------------------------------------------
-- Insert data in sales_record
-- -----------------------------------------------------
INSERT INTO sales_record (date_of_sale, customers_id, seller_id,
 total_money_sold, created_at, updated_at)
VALUES ('2022-1-1','1','1','1000','2022-01-01','2022-01-01'),
('2022-1-1','1','1','1000','2022-01-01','2022-01-01'),
('2022-1-1','4','1','2500','2022-01-05','2022-01-10'),
('2022-1-1','3','1','3500','2022-01-05','2022-01-10'),
('2022-1-1','2','1','100','2022-01-01','2022-01-01');

-- -----------------------------------------------------
-- Insert data in products_sold
-- -----------------------------------------------------
INSERT INTO products_sold (sale_id, pro_id,sold_units)
VALUES
('1','1','1'),
('1','2','4'),
('1','3','10'),
('1','4','2'),
('2','2','2'),
('2','3','3'),
('3','1','5'),
('3','4','3');

select * from products_sold;
select * from sales_record;
-- select * from product_inventory;
-- show tables;


drop database store;
