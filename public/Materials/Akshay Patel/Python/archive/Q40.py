#40.Program to print N numbers of series 2,4,8,16,32,64,..........

n = int(input("Enter Lenght: "))

sequence = 2

while(n):
    print(sequence, end=" ")
    sequence *= 2 
    n -= 1