#This program checks whether or not a number is a magic number;

print("Magic Number")
num = int(input("Enter a number to check if its a magic number:\n"))

t = num
while num > 9:
    sum = 0
    while num > 0:
        sum += num%10
        num //= 10
    num = sum

if num==1:
    print(t, "number is a magic number.")
else:
    print(t, "number is not a magic number.")
