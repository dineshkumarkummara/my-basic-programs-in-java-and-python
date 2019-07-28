#Iterating over a dictionary using "in" in Python returns you 
# the keys of the dictionary on each iteration. 
# Use standard syntax to get the value in the loop body.

#syntax in dicitonary(sets) to mention the value for some variable
#india=delhi , france = paris
data={"india":"delhi" , "france":"paris" , "italy":"rome"}
for country in data:
    print("the capital of " + country  + " is "  + data[country])
