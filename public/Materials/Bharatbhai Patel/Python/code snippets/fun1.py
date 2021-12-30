#Function-1
def prime(n):
    """ This function is used to check
          whether a given no. is prime or not
    """
    for i in range(2,n):
        if (n%i==0):
            return False
    return True

#Main Module

cnt=0
for i in range(1,1001):
    if (prime(i)==True):
        print(i,end=" , ")
        cnt=cnt+1

print("\n\nThere are ",cnt, " primer numbers")

    















    
            
    
