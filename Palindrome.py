#!/usr/bin/env python3

def is_palindrome(number):
    return str(number) == str(number)[::-1]

# Number to check
num = 12321  # Change this to test different numbers

# Print result
if is_palindrome(num):
    print(f"{num} is a Palindrome!")
else:
    print(f"{num} is NOT a Palindrome!")
