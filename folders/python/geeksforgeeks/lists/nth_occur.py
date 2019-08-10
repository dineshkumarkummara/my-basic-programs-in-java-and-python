list=["hi","hi","hi","hello","hi"]
list1=[]
word="hi"
n=2
count=0
for i in list:
    if(i==word):
        count+=1
        if(count==n):
            list1.append(i)
        
    else:
        list1.append(i)
print(list1)
            