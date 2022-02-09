#Program to find the sum of even numbers and sum of odd numbers between
#the two entered numbers

num1 = int(input("Enter Limit 1: "))
num2 = int(input("Enter Limit 2: "))
evensum = 0
oddsum = 0
for i in range(num1, num2+1):
    if i % 2 == 0:
        evensum = evensum + i 
    else:
        oddsum = oddsum + i 

print(oddsum)
print(evensum)
        