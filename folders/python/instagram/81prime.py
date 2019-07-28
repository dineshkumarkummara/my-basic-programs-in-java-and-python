n=int(input("enter any positive integer:"))
if n>1:
    for i in range(2,n):
        if(n%i==0):
            print("not prime")   
            break
    else:
        print("prime")
else:
    print("not prime")    
