
import pandas as pd

df = pd.read_csv("users.csv")   # replace with your file name

print("Usernames column:")
print(df["Usernames"])

print("\nSecond row (Username & Password):")
print(df.loc[1, ["Usernames", "Passwords"]])

print("\nUsernames sorted (ascending):")
print(df.sort_values("Usernames"))

print("\nPasswords sorted (descending):")
print(df.sort_values("Passwords", ascending=False))
