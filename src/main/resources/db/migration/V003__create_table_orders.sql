create table if not exists orders(
                                     id int not null auto_increment,
                                     date date,
                                     customer_id int references customers(id),
                                     product_name varchar(25),
                                     amount int,
                                     primary key (id)
);