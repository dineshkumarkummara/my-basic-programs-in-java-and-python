#Find the sum of all numbers below 1000, which are multiple by 3 or by 5.
#not and or are keywords
sum=0
for n in range(0,1000):
    if not(n%3) or not(n%5):
        sum=sum+n
    print(sum)
