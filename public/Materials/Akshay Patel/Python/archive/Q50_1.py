str = input("Enter String: ")

vowels = 0

str.lower()
for i in str:
    if i == 'a' or i == 'e' or i == 'o' or i == 'i' or i == 'u':
        vowels = vowels + 1 
        
print("Total Vowels: ", vowels)