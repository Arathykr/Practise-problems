def palindrome_number(n):
    temp = n
    rev = 0
    while n > 0:
        dig = n % 10
        rev = rev * 10 + dig
        n = n // 10
    return temp == rev

# Input from user
n = int(input("Enter number: "))

# Checking if the number is palindrome
if palindrome_number(n):
    print("Number is a palindrome!")
else:
    print("Number isn't a palindrome!")
