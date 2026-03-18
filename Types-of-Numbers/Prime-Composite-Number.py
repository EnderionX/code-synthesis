#This program checks whether a number is prime or not;

print("Prime Number Checker")
num = int(input("Enter a number to check if it's prime or not:\n"))

if num>1:
    for i in range(2, num):
        if (num%i)==0:
            print(num, "is a composite number.")
            break
    else:
        print(num, "is a prime number.")
else:
    print(num, "is neither a prime nor a composite number.")
