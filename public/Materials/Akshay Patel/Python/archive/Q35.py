#35.Program to print N numbers of series 2,4,6,8........

num = int(input("Enter Limit: "))
series = 0
for i in range(0, num):
    series = series + 2
    
    if i == num:
        print(series, end="")
        
    print(series, end=", ")