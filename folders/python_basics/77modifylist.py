#In Python, when you pass a list to a function, you pass it by reference. 
# So modifying a list from inside that function will result in a modified list 
# after you return from it.

list=["1","2","3"]

def f(x):
    x[2]="two"
    x[1]="one"
f(list)    #modified
print(list)
