#36.Program to print N numbers of series

num = int(input("Enter Limit: "))
series = -1
for i in range(0, num):
    series = series + 2
    
    if i == num:
        print(series, end="")
        
    print(series, end=", ")