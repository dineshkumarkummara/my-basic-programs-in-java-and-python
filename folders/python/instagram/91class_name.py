#An example of how you save data inside instances of a class 
# using the "self" keyword to reference to the current object. 
# Take in mind that cats and dogs can be split by using different classes, 
# but we'll see that later when we'll be talking about inheritance.

class animal:
    def __init__(self,name):    #constructor
        self.name=name
    def talk(self):
        print("my name is " +self.name+"")

animal1=animal("cat")
animal1.talk()

animal2=animal("dog")
animal2.talk()
