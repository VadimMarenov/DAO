create schema if not exists netology_hw3;

create table if not exists customers(
                          id int not null auto_increment,
                          name varchar(25),
                          surname varchar(25),
                          age int,
                          phone_number varchar(15),
                          primary key (id)
);
create table if not exists orders(
                       id int not null auto_increment,
                       date date,
                       customer_id int references customers(id),
                       product_name varchar(25),
                       amount int,
                       primary key (id)
);
