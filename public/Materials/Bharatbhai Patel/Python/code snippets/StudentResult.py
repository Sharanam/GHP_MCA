#Input
sno=int(input("Enter student no. "))
snm=input("Enter student name: ")
s1i = int(input("Enter s-1 internal marks : "))
s2i = int(input("Enter s-2 internal marks : "))
s3i = int(input("Enter s-3 internal marks : "))
s4i = int(input("Enter s-4 internal marks : "))
s5i = int(input("Enter s-5 internal marks : "))
s6i = int(input("Enter s-6 internal marks : "))
s1e = int(input("Enter s-1 external marks : "))
s2e = int(input("Enter s-2 external marks : "))
s3e = int(input("Enter s-3 external marks : "))
s4e = int(input("Enter s-4 external marks : "))
s5e = int(input("Enter s-5 external marks : "))
s6e = int(input("Enter s-6 external marks : "))

#Process
s1 = (s1i+s1e)
s2 = (s2i+s2e)
s3 = (s3i+s3e)
s4 = (s4i+s4e)
s5 = (s5i+s5e)
s6 = (s6i+s6e)

intmrk  = (s1i+s2i+s3i+s4i+s5i+s6i)
extmrk =(s1e+s2e+s3e+s4e+s5e+s6e)
tmark   = intmrk+extmrk

per=0
passcnt=0

if (s1<=40):
    passcnt=passcnt+1
if (s2<=40):
    passcnt=passcnt+1
if (s3<=40):
    passcnt=passcnt+1
if (s4<=40):
    passcnt=passcnt+1
if (s5<=40):
    passcnt=passcnt+1
if (s6<=40):
    passcnt=passcnt+1

if (passcnt>2):
    grade="Fail"
else:
    if (passcnt>0):
        grade="ATKT"
    else:
        per=(tmark/6)
        grade="A to G"

#Output

print("Student Marksheet")
print("===============")
print("Seat No. : ",sno)
print("Name  : ",snm)
print("Internal Marks : ",intmrk)
print("External Marks : ",extmrk)
print("Total Marks : ",tmark)
print(" Percentage : ",per)
print(" Grade : ",grade)




        
