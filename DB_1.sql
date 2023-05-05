CREATE DATABASE sales;
USE sales;
CREATE TABLE orders (
  order_id int,
  customer_id int,
  order_date date,
  order_total decimal
);