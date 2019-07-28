#Lambdas (or inline functions) are very handy if the function body is short and simple. 
#You don't need to create a full function using the "def" keyword. 
#Use "lambda" instead, followed by the argument and the function body.

sqr=lambda x:x**2
for i in range(1,4):
    print(sqr(i))


