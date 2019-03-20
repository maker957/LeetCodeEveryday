
Write a SQL query to get the second highest salary from the Employee table.

/*

+----+--------+
| Id | Salary |
+----+--------+
| 1  | 100    |
| 2  | 200    |
| 3  | 300    |
+----+--------+

*/

select(select DISTINCT Salary from Employee ORDER By Salary DESC limit 1 offset 1)