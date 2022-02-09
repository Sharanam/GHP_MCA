num = int(input("Enter Number: "))

for i in range(1, num+1):
    for j in range(1, i+1):
        print(j, j * '* ', end="")
    print()
    