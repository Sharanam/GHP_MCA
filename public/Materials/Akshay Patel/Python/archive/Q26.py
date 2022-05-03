#Program to find GCD and LCM:

def find_gcd(a, b):
    gcd = 1 
    for i in range(1, a+1):
        if a%i == 0 and b%i == 0:
            gcd = i 
    return gcd 
    
first = int(input("Enter Number 1: "))
second = int(input("Enter Number 2: "))

print("GCD is: ", find_gcd(first, second))
print("LCM is: ", first * second / find_gcd(first, second))