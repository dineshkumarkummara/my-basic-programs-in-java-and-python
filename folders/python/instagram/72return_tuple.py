#When a function returns more than one value, make sure to read all of them, 
# as if you accidentally take a single value, 
# you will get that value containing a tuple, not a single value.

def f():
    return 10,11
a,b=f()
print(a)
print(b)
c=f()
print(c)
