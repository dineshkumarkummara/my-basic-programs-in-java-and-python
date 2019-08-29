#The "assert" keyword can be used to check the input data for validity. 
# If the assert condition is not true, the program quits with the "AssertionError" exception (if you did not catch it). 

def aun(x,y):
    assert x!=2
    return x*y

print(aun(3,2)) #ok
print(aun(2,4)) #error x!=2
