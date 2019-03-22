Customers
+----+-------+
| Id | Name  |
+----+-------+
| 1  | Joe   |
| 2  | Henry |
| 3  | Sam   |
| 4  | Max   |
+----+-------+


Orders
+----+------------+
| Id | CustomerId |
+----+------------+
| 1  | 3          |
| 2  | 1          |
+----+------------+

1
SELECT A.Name from Customers A WHERE NOT EXISTS (SELECT 1 FROM Orders B WHERE A.Id = B.CustomerId) /*headers  Select A as "B"*/

2
SELECT A.Name from Customers A LEFT JOIN Orders B on a.Id = B.CustomerId WHERE b.CustomerId is NULL;/*左链接*/

3
SELECT A.Name from Customers A WHERE A.Id NOT IN ( SELECT B.CustomerId from Orders B)      /*选择A表不在B表中的项*/

