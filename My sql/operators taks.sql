create database task_3;
use task_3;
show tables;
CREATE TABLE students (
    student_id INT,
    name VARCHAR(50),
    marks INT,
    city VARCHAR(50)
);

INSERT INTO students VALUES
(1, 'Ravi', 85, 'Hyderabad'),
(2, 'Sita', NULL, 'Bangalore'),
(3, 'Krishna', 92, NULL),
(4, 'John', NULL, 'Chennai'),
(5, 'Mary', 76, 'Hyderabad');

SELECT name,IFNULL(marks, 0) AS marks
FROM students;

select name,ifnull(city,'not mentioned') AS city from students;

select name,ifnull(marks,0) +10 AS marks from students;

select name from students where ifnull(marks,0) >50;

select name,ifnull(marks,0) AS final_marks from students;

select name AS student_name, marks AS Total_marks from students;

select student_id,name,marks,city AS Location from students;

SELECT name,
CONCAT(name, ' from ', ifnull(city, 'Not Mentioned')) AS Full_Info
FROM students;

select name, marks+10 AS bouns_marks from students;

select student_id AS ID,name AS student_name,ifnull(marks,0)AS marks,ifnull(city,0) AS city from students;

create table employees(emp_id int not null, emp_name varchar(10), department varchar(10), salary int);

INSERT INTO employees VALUES
(1, 'Ravi', 'HR', 35000),
(2, 'Sita', 'IT', 60000),
(3, 'Krishna', 'IT', 75000),
(4, 'John', 'Sales', 45000),
(5, 'Mary', 'Finance', 90000);

select * from employees where salary between 40000 AND 80000;

select emp_name from employees where salary between 35000 AND 60000; 

select emp_name from employees where salary not between 40000 AND 70000; 

select emp_name from employees where department='IT' AND salary between 50000 AND 80000; 

select emp_name from employees where department='HR'OR department='Finance' AND salary between 35000 AND 90000; 

select emp_name from employees where department IN('IT','HR') AND salary>40000;

select emp_name from employees where salary IN(35000 ,45000 ,60000);

select emp_name from employees where department not IN('IT','finance') ;

select emp_name from employees where department IN('HR','Sales') AND salary>40000;

select emp_name from employees where department IN('IT','Finance');

select * from employees where emp_name LIKE 'S%';

select * from employees where emp_name LIKE '%N';

select * from employees where emp_name LIKE '%a%';

select * from employees where department LIKE 'f%';

SELECT * FROM employees
WHERE CHAR_LENGTH(emp_name) = 5;

select * from students where marks is null;

select * from students where city is null;

select * from students where marks is not null;

select name,count(marks) from students group by marks is null;

SELECT COUNT(*) AS null_marks_count
FROM students
WHERE marks IS NULL;

SELECT name,
ifnull(city, 'Unknown') AS city
FROM students;

SELECT emp_name from employees
WHERE department = 'IT' AND salary > 60000;






