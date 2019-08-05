n= int(input("enter a number: "))
n1=0
n2=1
print(n1)
print(n2)
for i in range(0,n):
    n3=n1+n2
    n1=n2
    n2=n3
    print(n3)
