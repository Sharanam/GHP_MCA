x = int(input("Enter X: "))
for i in range(1, 11):
    sum = 0 
    sum = sum + pow(-1, i) * ((pow(x, i/2)) / i) * (i + 1)
print(sum)    
    