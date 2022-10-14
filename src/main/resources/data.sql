insert into customers (name, surname, age, phone_number)
values ('Max', 'Maxov', 20, '111'),
       ('Ivan', 'Ivanov', 21, '121'),
       ('Petr', 'Petrov', 22, '131'),
       ('Alex', 'Alexov', 23, '141'),
       ('petr', 'Nepetrov', 25, '151');

insert into orders(customer_id, product_name)
values (1, 'Notebook'),
       (1, 'Book'),
       (2, 'Skateboard'),
       (2, 'Phone'),
       (3, 'Pen'),
       (3, 'Laptop'),
       (4, 'Watch'),
       (4, 'Headphones'),
       (5, 'Beer'),
       (5, 'Cigarette');
