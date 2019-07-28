#In Python, you can return more than one value from a function. 
#Let us see how that works on the example of solving
#a square equation that can return two roots.

import math

def solve(a,b,c):
    d=math.sqrt((b**2)-(4*a*c))
    x1=((-b-d)/2*a)
    x2=((-b+d)/2*a)
    return x1,x2,d
x1,x2,d=solve(1,2,-4)
print(x1)
print(x2)
print(d)
