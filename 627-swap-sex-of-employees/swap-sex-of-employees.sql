-- # Write your MySQL query statement below
-- select id , name , sex , salary,
-- if(sex = 'm', sex = 'f',sex = 'm') as status
-- from Salary;

UPDATE Salary
SET sex = CASE
    WHEN sex = 'm' THEN 'f'
    WHEN sex = 'f' THEN 'm'
END;