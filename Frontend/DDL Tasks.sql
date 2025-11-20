create database task_1;
create table task_no_1(product_id int ,product_name varchar(50),price decimal(10,2),quantity int);
alter table task_no_1 add column description varchar(100);
select*from task_no_1;
alter table task_no_1 drop column description;
truncate table task_no_1;
drop table task_no_1;

show databases;
use techstore_db;

create database comapany_db;
create table employees(emp_id int,emp_name varchar(50),salary decimal(10,2),city varchar(40));
create database shopping_db;
create table products(product_id int,product_name varchar(50),price decimal(10,2),quantity int);
rename table employees to employees_details;
alter table employees_details add column department varchar(50);
alter table products add column category varchar(30);
alter table products add column rating int;
alter table products rename column product_name to name;
alter table employees_details modify column salary decimal(12,2);
alter table products modify column quantity int(5);
alter table products drop column rating;
alter table employees_details drop column city;
alter table employees_details rename column emp_name to full_name;
drop table employees_details;
drop table products;
drop database shopping_db;
create table students(id int,name varchar(50),age int,city varchar(50));
alter table students add column email varchar(70);
rename table  students to students_info;
alter table students_info modify column age int(3);
alter table students_info drop column city;

create database university_portal;
use university_portal;
create table departments(dept_id int,dept_name varchar(60),location varchar(50));
create table faculty(faculty_id int,faculty_name varchar(60),subject varchar(50),salary decimal(10,2),dept_id int);
create table courses(course_id int,course_name varchar(60),credits int,depy_id int);
alter table faculty add column contact_number varchar(15);
alter table departments add column email varchar(70);
alter table departments add column hod_name varchar(60);
alter table courses modify column credits int(3);
alter table faculty modify column faculty_name varchar(80);
alter table faculty rename column subject to specializtion;
RENAME table faculty to faculty_info;
alter table departments drop column location;
alter table departments drop hod_name;
create table classroom(room_no int,building varchar(50),capacity int);
rename table courses to course_catalog;
alter table faculty_info modify column contact_number varchar(20);
alter table classroom add column room_type varchar(20);
alter table classroom drop column room_type;
alter table faculty_info modify column salary decimal(12,2);
alter table course_catalog add column semester varchar(20);
DELETE from course_catalog;
TRUNCATE table faculty_info;
drop table classroom;
drop database university_portal;



