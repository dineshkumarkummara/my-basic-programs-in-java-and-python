#Use more than one placeholder in a string if you need to interpolate 
# more than one variable. Prefer the style you like the most. 
# C programmers are familiar with the %s syntax from the 
# well-known printf function. But you may also use the 
# OOP style and call the format method on a string.
name1,name2="dinesh ","dhanush"
print("The names are: " +name1+ "" +name2+"")

print("the names are {}{}! ".format(name1,name2))

#print("the names are: %s and %s" %(name1,%name2))
