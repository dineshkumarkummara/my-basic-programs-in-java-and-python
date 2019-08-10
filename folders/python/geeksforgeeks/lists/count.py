def count(list,x):
    count=0
    for y in list:
        if(y==x):
            count+=1
    return count

list=[1,2,3,2,3,45,6,6,6]
x=6
print("the elemsnt {} occurred {} times".format(x,count(list,x)))
