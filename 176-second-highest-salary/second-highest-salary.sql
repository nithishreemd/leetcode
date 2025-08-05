# Write your MySQL query statement bel
Select(Select Distinct salary 
from Employee 
order by salary Desc
limit 1 offset 1)as SecondHighestSalary;