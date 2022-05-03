#38: Fibonacci Series:

a = int(input("enter the term: "))

f = 0
s = 1 

if a <= 0:
    print(f)
else:
    print(f, s, end = " ")
    for x in range(2, a):
        next = f + s
        print(next, end=" ")
        f = s 
        s = next