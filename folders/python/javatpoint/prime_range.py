lower=int(input("enter any number:"))
upper=int(input("enter any number:"))
for i in range(lower,upper+1):
        if i>1:
                for x in range(2,i):
                        if(i%x==0):
                                break
                else:
                        print(i)                
