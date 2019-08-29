#You can create more than one generator object, and the great part of that is that they behave independently. 
# In this example, which extends the previous one, two generator objects, g and g2, 
# are using the same function f(), and produce independent sequences of numbers.

def f():
    for i in range(100):
        yield i
#generator objects
g=f()
g1=f()

print(next(g))
print(next(g1))
print(next(g1))
print(next(g))
print(next(g))
print(next(g))
print(next(g1))
