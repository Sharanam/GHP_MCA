num = int(input("Enter Number: "))

f = 0
s = 1 

if num <=0 :
    print("f")
else:
    print(f, s, end=" ")
    for i in range(2, num):
        next = f + s 
        print(next, end=" ")
        f = s 
        s = next
        