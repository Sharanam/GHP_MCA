#40.Program to print N numbers of series 2,4,8,16,32,64,..........

n = int(input("Enter Lenght: "))

i = 1

while(i <= n):
    print((i * i) - i, end=" ")
    i += 1
    
    
