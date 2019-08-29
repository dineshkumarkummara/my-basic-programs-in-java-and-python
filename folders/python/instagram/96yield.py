#This keyword, "yield", is maybe the least intuitive in Python. 
# You place it where you would normally place a "return" in a function. 
# But with "yield", the function can be converted into a generator object 
# that keeps its state between calls. In the given example, the f() function returns (yields) 
# another number from the range each time you call it. 
# The next time you call it, the "i" variable continues from where it was last time.

def f():
    for i in range(100):
        yield i
g=f()
print(next(g))
print(next(g))
print(next(g))
print(next(g))
print("-----------------------------------------")
#continuing from where it left
for j in g:
    print(j)


print("another")

def f1():
    for i in range(100):
        return i

g=f1()
print(g)
