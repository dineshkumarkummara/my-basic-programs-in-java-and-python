#The "zip" built-in function takes a few lists (two in this example), 
# and creates tuples by picking up elements from each list. 
# The first tuple contains elements from the first positions in the lists, and so on.
d1=["a","b","c","d","e"]
d2=["f","g","h","i","j"]
d3=zip(d1,d2)

for x in d3:
    print(x[0] + "" + x[1])
