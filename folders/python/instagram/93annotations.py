#in this return will give you the expected outcome when we call it by object

#In Python, you can add annotations to the arguments and to the return value of a function. 
# Annotations give the user of the function and idea of what kind of data type that function is working with. 
# You access annoutations via the __annotations__ attribute as shown in the example, or via the help function: "print(help(power))". 
# Notice that annotations can potentially help the IDE to give you hints, 
# but the compiler will not prevent any type errors if, for example, you return a string instead of an annotated integer.

def power(a:int,b:int):
    return a**b
a=power(2,3)
print(a)
print(power.__annotations__)
print(help(power))
