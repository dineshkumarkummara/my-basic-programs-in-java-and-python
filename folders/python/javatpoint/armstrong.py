n= int(input("enter a number: "))
sum=0
temp=n

while(temp>0):
    d=temp%10
    sum=sum+d**3
    temp=n//10
if sum==n:
    print("armsrong")
else:
    print("not armstrong")    
