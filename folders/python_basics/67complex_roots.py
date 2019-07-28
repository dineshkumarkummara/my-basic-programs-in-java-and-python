#Using the "cmath" module to replace a traditional "math" 
#when you need to deal with complex numbers. The rest remains the same. 
#Here is a program that solves a square equation 
#when its discriminant is negative. Only change math to cmath and you are done!
#d<0

import cmath
def solve(a,b,c):
    d=cmath.sqrt((b**2)-(4*a*c))
    x1=((-b-d)/2*a)
    x2=((-b+d)/2*a)
    return x1,x2
x1,x2=solve(1,2,3)
print(x1)
print(x2)
