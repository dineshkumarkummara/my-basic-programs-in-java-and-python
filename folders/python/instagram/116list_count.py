#This program takes a list and for each item in it, prints the number of occurances. 
# To make the output more compact, the list is first transfomed to a set, which helps to avoid repeated output lines. 
#The "count" method is defined for the "list" data type: for the given argument, it returns a number of repetitions of that value in the list.


l=["a","b","c","a"]
for i in sorted(set(l)):
    count=l.count(i)
    print("the element {} occured {} times".format(i,count) )

