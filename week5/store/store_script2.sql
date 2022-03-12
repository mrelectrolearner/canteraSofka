-- --------------------------------------------------------------------
-- show products sold by typing the type of document and document number.
-- --------------------------------------------------------------------
use store;

SELECT  DISTINCT products.pro_id, name FROM products 
INNER JOIN products_sold ON products.pro_id=products_sold.pro_id
INNER JOIN sales_record ON products_sold.sale_id=sales_record.sale_id
INNER JOIN customers ON sales_record.customers_id=customers.id
WHERE  document_type='TI' AND document='10871829265';

-- --------------------------------------------------------------------
-- show products by name, which should show who has been your supplier.
-- --------------------------------------------------------------------

SELECT DISTINCT supplier.name, sup_id from supplier
INNER JOIN product_inventory ON supplier.sup_id=product_inventory.supplier_sup_id
INNER JOIN products ON product_inventory.pro_id=products.pro_id
WHERE products.name="pastel";

