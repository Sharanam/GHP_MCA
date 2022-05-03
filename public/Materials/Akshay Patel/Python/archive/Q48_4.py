num = int(input("Enter Number: "))

for i in range(1, num + 1):
    for x in range(num, i, -1):
        print(" ", end="")
    for y in range(1, i+1):
        print(y, end=" ")
    print()