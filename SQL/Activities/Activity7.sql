REM   Script: Activity7
REM   SQL-Activity7

select SUM(purchase_amount) AS "Total purchase" from orders;

select AVG(purchase_amount) AS "avg" from orders;

select MAX(purchase_amount) AS "max" from orders;

select MIN(purchase_amount) AS "min" from orders;

select COUNT(distinct salesman_id) AS "count" from orders;

