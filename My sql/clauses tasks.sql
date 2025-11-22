create database task3;
use task3;
CREATE TABLE employees (
    emp_id INT PRIMARY KEY AUTO_INCREMENT,
    emp_name VARCHAR(50),
    department VARCHAR(50),
    salary INT,
    city VARCHAR(50)
);

INSERT INTO employees (emp_name, department, salary, city) VALUES
('Ravi', 'HR', 35000, 'Hyderabad'),
('Sita', 'IT', 60000, 'Bangalore'),
('Krishna', 'IT', 75000, 'Hyderabad'),
('John', 'Sales', 40000, 'Chennai'),
('Meena', 'Finance', 50000, 'Delhi'),
('Arjun', 'IT', 65000, 'Chennai'),
('Radha', 'HR', 37000, 'Delhi'),
('Kiran', 'Finance', 48000, 'Bangalore');

select *from employees;

select * from employees where department in('IT','Finance') AND city in ('Hyderabad','Banglore') AND salary>45000 limit 2;

select * from employees where salary>50000;
select * from employees where city='Delhi';
select *from employees  order by emp_name ASC;
select *from employees order by salary ASC;
select department, sum(salary)  From employees group by department;
select city,count(emp_name) AS counting_employees_in_each_city from employees group by city; 
select department,sum(salary) AS salaryy from employees group by department having sum(salary)>100000;
select city,count(emp_name) AS Employee from employees group by city having count(emp_name)>1;