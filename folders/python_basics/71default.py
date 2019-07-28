#"Assign" a default value to a parameter of a function. 
# This value will be used if you do not pass it when calling a function in the code.

def greet(name="dinu"):
    print("hello my name is," +name+ "")
greet("dhanu")
greet()
greet("chandu")
