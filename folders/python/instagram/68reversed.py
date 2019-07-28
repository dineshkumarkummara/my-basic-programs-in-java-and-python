#To iterate backwards in Python, either use a range with step = -1, 
#or a "reversed" built-in function:

list=["sai","kaka","dhanush","chan"]
for x in list[::-1]:
    print(x)

print("method2")
#method2
for x in reversed(list):
    print(x)