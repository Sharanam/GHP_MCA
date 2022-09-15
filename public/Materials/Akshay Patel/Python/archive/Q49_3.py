str = input("Enter String: ")

space = 0

str.lower()
for i in str:
    if i == ' ':
        space = space + 1 
        
print("Total Space ", space)