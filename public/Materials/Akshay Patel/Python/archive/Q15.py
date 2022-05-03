'''A cashier has currency notes of denominations 10, 50, and 100.If the
amount to be withdrawn is input through the keyboard using input()
function in hundreds, find the total number of currency notes of each
denomination the cashier will have to give to the withdrawer.
E.g. 480 100 Notes: 4 50 Notes: 1 10 Notes: 3'''


amount = int(input("Enter Amount You want to withdraw: "))

print("required notes of 100 will be",int(amount / 100))
print("required notes of 50 will be",int((amount % 100) / 50))
print("required notes of 10 will be",int(((amount % 100) % 50) / 10))