n=int(input("enter any number:"))          #153
a=[int(x) for x in str(n)]                 #[1,5,3]
sum=0                                     
i=list(map(lambda y:pow(y,len(a)),a))      #[1,125,27]
for j in i:                                
    sum+=j
print("armstrong number" if n==sum else "not armstrong")
