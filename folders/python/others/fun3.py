def fun(**kwargs):
    for name,value in kwargs.items():
        print(name,value)
kwargs={"one":1,"two":2,"three":3}
fun(**kwargs)

fun({"one":1,"two":2,"three":3})