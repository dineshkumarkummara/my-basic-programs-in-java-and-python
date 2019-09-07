'''
n=int(input("enter length:"))
a=[]
while n>=1:
    j=int(input("enter ele:"))
    i=a.append(j)
    n=n-1
print(a)
j=set(a)
k=list(j)
m=k.sort()
print(k)
'''
n = int(input())

nums = map(int, input().split())    
print(sorted(list(set(nums)))[-2])