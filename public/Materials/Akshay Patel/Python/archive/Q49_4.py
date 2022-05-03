str = input("Enter String: ")

digit = 0

str.lower()
for i in str:
    if i.isdigit():
        digit = digit + 1 
        
print("Total digit ", digit)