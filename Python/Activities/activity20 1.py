
import pandas as pd

df = pd.read_excel("users.xlsx")   

print("Shape (rows, columns):")
print(df.shape)

print("\nEmail column:")
print(df["Email"])

print("\nSorted by FirstName (ascending):")
sorted_df = df.sort_values("FirstName")
print(sorted_df)
