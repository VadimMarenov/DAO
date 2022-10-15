create table if not exists customers(
                                        id int not null auto_increment,
                                        name varchar(25),
                                        surname varchar(25),
                                        age int,
                                        phone_number varchar(15),
                                        primary key (id)
);