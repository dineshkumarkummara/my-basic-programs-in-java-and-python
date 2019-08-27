l=[1,2,3,4,5,6,78,9,10,12]
c,d=0
for x in l:
    if(x%2==0):
        c+=1
    else:
        d+=1
print("even numbers are {} and odd numbers are {}".format(c,d))

print(len(l))
