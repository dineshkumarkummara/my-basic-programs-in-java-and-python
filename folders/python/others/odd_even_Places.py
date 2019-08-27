n=int(input("enter any number="))
a=[int(x) for x in str(n)]
j=a[::2]
k=a[1::2]
sum=0
s=0
for _ in j:
        sum+=_
for h in k:
        s+=h
print(sum-s)
