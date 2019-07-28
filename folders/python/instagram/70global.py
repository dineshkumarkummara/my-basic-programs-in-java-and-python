#In Python, you cannot directly access or modify a global variable that is outside of your local scope. 
#Use the "global" keyword to indicate to the compiler that you are talking about that global variable. 
# But in any case, try avoiding such practice.

n=1
def inc():
    global n
    n+=1
print(n)  #1
inc()
print(n)  #2
