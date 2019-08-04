n=int(input("enter any number:"))
factorial=1
if n<0:
    print("number can not be negative")
elif n==0:
    print("the factorial of 0 is 1")
else:
    for i in range(1,n+1):
        factorial*=i
    print("the factorial of" , n ,"is" ,factorial, "." )

