l=[1,-2,3,-4,-5,9,8,-2,-6]
count=0
for x in l:
    if x>0:
        count+=1
print("the positive numbers are:",count)

n=len(l)-count
print("the negative numbers are:",n)
