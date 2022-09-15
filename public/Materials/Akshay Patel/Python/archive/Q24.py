items = []

for i in range(1, 6):
    num = int(input("Enter Value"))
    items.append(num)
    num = None

print(items)

Negcount = 0
PosCount = 0
for i in items:
    if i < 0:
        Negcount += 1
    elif i > 0:
        PosCount += 1
        
print(Negcount)
print(PosCount)
        