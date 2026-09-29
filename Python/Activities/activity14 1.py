def fibonacci(n):
    if n <= 0:
        return 0
    elif n == 1 or n == 2:
        return 1
    else:
        return fibonacci(n - 1) + fibonacci(n - 2)

# input from user
num = int(input("How many Fibonacci numbers to generate? "))

# Generate sequence
print("Fibonacci sequence:")
for i in range(1, num + 1):
    print(fibonacci(i), end=" ")