#31.Accept numbers from the user. Last number must be zero. Display the sum, average, count, maximum and minimum number.
inpt = None
val = []
while inpt != 0:
    inpt = int(input("Enter Value: "))
    if inpt == 0:
        break
    else:
        val.append(inpt)

print(max(val))
print(min(val))
print()
sum = 0
for i in val:
    sum = sum + i 
    
avg = sum / len(val)

print(sum)
print(avg)
    