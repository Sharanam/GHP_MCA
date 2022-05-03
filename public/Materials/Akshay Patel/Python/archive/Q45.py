num = int(input("Enter Any Number: "))

temp = num 
sum = 0

while num > 0:
    digit = num % 10
    sum += digit ** 3
    num //= 10
  
if sum == temp:
    print("Armstrong")
else:
    print("Nine")
    