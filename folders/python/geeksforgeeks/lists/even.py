l=[1,2,3,4,5,6,7,8,9,10]

odds=list(filter(lambda x:(x%2!=0),l))
print(odds)

for x in l:
    if(x%2!=0):
        print(x)
    elif (x%2==0):
        print("even numbers are",x)