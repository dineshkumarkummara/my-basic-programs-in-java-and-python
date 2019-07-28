import cmath
a=(float(input("enter a: ")))
b=(float(input("enter b: ")))
c=(float(input("enter c: ")))

d=(b**2-(4*a*c))
print(d)

x=(-b+cmath.sqrt(d)/(2*a))
y=(-b-cmath.sqrt(d)/(2*a))

print(x)
print(y)
