--REM   Script: Activity1_2_3_4_5_6_7_8
--REM   FST Practice session

--Activity1
Create Table salesman(salesman_id int Primary Key,salesman_name varchar2(20) Not Null,salesman_city varchar2(20),commission int);

Describe salesman

--Activity2
INSERT ALL 
    INTO salesman VALUES(5001, 'James Hoog', 'New York', 15)
    INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13)
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)
SELECT 1 FROM DUAL;

--To display all rows
Select * from salesman;

--Activity3
SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT * FROM salesman;

--Activity4
ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade=100;

SELECT * FROM salesman;

--Activity5
UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog';

UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';
