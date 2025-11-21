create database task_2;
use task_2;

create table employees(emp_id int,emp_name varchar(50) not null,salary decimal(8,2) not null);
insert into employees values
(01,'perni',250000.00),
(02,'soma',650000.90),
(03,'akash',450000.50),
(04,NULL,450000.90),
(05,350000.50);

create table departments(dept_id int,dept_name varchar(30));
alter table departments modify column dept_name varchar(30) NOT NULL;
insert into departments(dept_id,dept_name) values (01);
insert into departments(dept_id,dept_name) values (01,NULL);
create table PRODUCTS(product_id int,product_name varchar(50) NOT NULL,price decimal(6,2) NOT NULL);
select * from products;
insert into products values
(001,'',1000.30),
(002,'honda',2000.50),
(003,'splender',3000.50);

create table employes(emp_id int,emp_name varchar(50),age int CHECK(age>=18));
insert into employes values
(01,'perni',21),
(02,'soma',18),
(03,'akash',19),
(05,'bye',22);
select*from employes;
CREATE TABLE productsss (
    price DECIMAL(6,2) CHECK (price > 0),
    discount DECIMAL(5,2),
    CONSTRAINT chk_discount CHECK (discount < price)
);
CREATE TABLE customers (
    gender char(1) CHECK (gender IN ('M','F')));
insert into customers(gender) values ('n');
create table students(student_name varchar(50) not null,marks int check(marks BETWEEN 0 AND 100));

CREATE table studentsss(student_id INT UNIQUE,student_email VARCHAR(50) UNIQUE,student_name VARCHAR(50));
insert into studentsss(student_id,student_email,student_name) values
(01,'abcd@gmail.com','abcd'),
(02,'abba@gmail.com','abba'),
(03,'bcda@gmail.com','bcda');
desc students;

create table users(usernae varchar(10) unique,email varchar(20) unique,status varchar(20) default 'active',account_vverification boolean,login int default 0);
alter table users 

create table productsssss(product_id int primary key auto_increment,product_name varchar(10) unique not null,price int check(price>0),category varchar(10) default 'general',stock int default 10);

create table blog_posts(Post_id int auto_increment primary key,title varchar(100) not null,content text,published_date date default (current_date ),created_at timestamp default current_timestamp,updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP);


create table customer_s(customer_id int  primary key ,name varchar(10));
create table orders(order_id int primary key,item_name varchar(10),customer_id int,foreign key(customer_id) references customer_s(customer_id));
insert into customer_s values(1,'aabb'),(2,'bbaa');
insert into orders values(101,'charger',1),(102,'cable',2);
select* from customer_s;
select * from orders;





