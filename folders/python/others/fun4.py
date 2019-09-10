def greet():
    return "something"
print(greet)             #works when print is in function
print(greet())

greeting=lambda:"dinesh"           #returns after : value
print(greeting())

#arguments in lambda
str=lambda s:s.strip().upper()
print(str("hello"))


#They can also take arbitrary number of arguments / keyword arguments, like normal functions
f=lambda x,*args,**kwargs:print(x.strip().upper(),args,kwargs)
f("hello","gdw","rgsg",one="ONE")
