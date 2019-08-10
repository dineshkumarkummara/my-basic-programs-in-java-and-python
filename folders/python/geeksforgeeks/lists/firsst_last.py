n=[1,2,3,4]
d=len(n)
temp=n[0]
n[0]=n[d-1]
n[d-1]=temp
print(n)
print(d,end="")
