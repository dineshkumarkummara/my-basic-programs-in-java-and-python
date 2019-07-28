n=int(input("enter any number"))
def factorial(n):
       f=1
       for m in range(1,n+1):
           f*=m
       return f
print(factorial(n))    
