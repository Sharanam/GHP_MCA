'''A library charges a fine for every book returned late. For first 5 days the
fine is 50 paisa, for 6-10 days fine is one rupee and above 10 days fine is 5
rupees. If you return the book after 30 days your membership will be
cancelled. Write a program to accept the number of days the member is late
to return the book and display the fine or the appropriate message
14. To find out simple interest using the following formula:'''

num_of_days_late = int(input("Numbers Of Days Late: "))

if num_of_days_late <= 5:
    print("Fine is 50 paisa")
elif num_of_days_late >=6 and num_of_days_late <= 10:
    print("FIne is 5 rupees")
elif num_of_days_late >= 30:
    print("MEMBERSHIP cancelled")
else:
    print("NO RECORDS!!")

