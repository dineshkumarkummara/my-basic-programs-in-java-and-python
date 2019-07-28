#area of triangle =(s*(s-a)*(s-b)*(s-c)-1/2)
#s=a+b+c/2

a=(float(input("enter the side a: ")))
b=(float(input("enter the side b: ")))
c=(float(input("enter the side c: ")))

s=(a+b+c)/2
area=(s*(s-a)*(s-b)*(s-c))-(1/2)

print("are of triangle is %0.2f" %area )
