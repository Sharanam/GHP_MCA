#Program to find the sum of each digit of entered positive number. 
def get_sum_of_all_digits(n):
    sum = 0
    while n != 0:
        sum = sum + int(n%10)
        n = int(n / 10)
    return sum
    
print(get_sum_of_all_digits(456))
#Explanation: 4 + 5 + 6 = 15