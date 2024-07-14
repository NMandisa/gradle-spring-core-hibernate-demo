drop schema db_spring_jackson_json;
use db_spring_jackson_json;
show tables;
SELECT * FROM db_spring_jackson_json.customer;
SELECT * FROM db_spring_jackson_json.orders;
SELECT * FROM db_spring_jackson_json.rating;
SELECT * FROM db_spring_jackson_json.review;
SELECT * FROM db_spring_jackson_json.product;
SELECT * FROM db_spring_jackson_json.order_belongs_to_customer;
SELECT * FROM db_spring_jackson_json.product_has_order;
SELECT * FROM db_spring_jackson_json.rating_belong_to_product;
SELECT * FROM db_spring_jackson_json.review_belong_to_rating;
SELECT * FROM db_spring_jackson_json.sequence_customer_id;
SELECT * FROM db_spring_jackson_json.sequence_order_id;