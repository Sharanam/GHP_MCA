n1, n2, n3 = [int(x) for x in input ("ENter 3 numbers: ").split()]

if n1 > n2 and n1 > n3:
    print("N1 is maximu")
elif n2 > n1 and n2 > n3:
    print("N2")
else:
    print("N3")