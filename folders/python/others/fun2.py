def fun(*args):
    for i in args:
        print(i)
args=1,2,3,4,5,6
fun(*args)

#or
print("----------")

fun(7,8,9)

#You can't provide a default for args, for example func(*args=[1,2,3]) will raise a syntax error (won't evencompile).
# You can't provide these by name when calling the function, for example func(*args=[1,2,3]) will raise aTypeError.
# But if you already have your arguments in an array (or any other Iterable), you can invoke your function like this:func(*my_stuff).
# These arguments (*args) can be accessed by index, for example args[0] will return the first argument

print(args[3])
