#27.Program to find the sum of all digits of entered integer number.

num = int(input("Enter any integer number: "))
sum = 0
while num != 0:
    sum = sum + int(num % 10)
    num = num / 10
    
print(sum)