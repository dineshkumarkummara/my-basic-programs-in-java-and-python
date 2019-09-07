from operator import add
d1=[1,2,3,4]
d2=[5,6,7,8]

print ([d1[i]+d2[i] for i in range(len(d1))])

print(list(map(add,d1,d2)))
