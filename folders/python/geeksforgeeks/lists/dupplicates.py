def Repeat(x): 
    size = len(x)  #13
    repeated = [] 
    for i in range(size): #0 in 13
        k = i + 1   #0+1
        for j in range(k, size):  #1 in 1,13
            if x[i] == x[j] and x[i] not in repeated:   #10 == 20 and 10 not in
                repeated.append(x[i]) 
    return repeated 

  
# Driver Code 
x = [10, 20, 30, 20, 20, 30, 40, 50, -20, 60, 60, -20, -20] 
print (Repeat(x)) 
print(len(x))
print(x[12])
