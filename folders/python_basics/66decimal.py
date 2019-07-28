#Floating-point calculations are not always 100% "correct" from human perspective. 
# Use the "decimal" module to work with numbers as strings and keep preciseness.


a=0.1+0.7-0.3
print(a)

from decimal import Decimal
b=Decimal("0.1")+Decimal("0.7")-Decimal("0.3")
print(b)
