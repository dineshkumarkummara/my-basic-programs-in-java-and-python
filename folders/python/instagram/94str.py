#In Python, you can redefine the standard behaviour when converting objects to strings, 
# e.g., when you are printing objects. What you need is to create 
# your own version of the __str__ method in the class, and return a string from it.

class Str:
    def __init__ (self,value):
        self.value=value
    def __str__ (self):
        return str(self.value)

print(Str("i"))
print(str(42))
print(Str(42))
