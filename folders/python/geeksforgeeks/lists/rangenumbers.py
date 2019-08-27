n=int(input("enter upper range"))
m=int(input("enter lower range"))
for x in range(m,n+1):
    if x>=0:
        print("positives are:",x)
    else:
        print("negatives are:",x)