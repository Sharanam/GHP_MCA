num = int(input("Enter Number: "))

for i in range(0, num):
    for j in range(0, i):
        print(" ", end="")
    for k in range(i+1, num+1):
        print(k, end=" ")
    print()