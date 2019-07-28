#In Python, you can use positional arguments together with their names, 
#and thus make them named arguments.
#If you pass an argument with its name, the order is not imortant any more.

def abc(a,b):
    return a**b

print(abc(2,3))

print(abc(a=2,b=3))

print(abc(b=2,a=3))
