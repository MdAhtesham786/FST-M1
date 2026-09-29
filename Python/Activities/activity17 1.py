import pandas as pd

# Create data
data = {
    "Usernames": ["admin", "Charles", "Deku"],
    "Passwords": ["password", "Charl13", "AllMight"]
}

# Create DataFrame
df = pd.DataFrame(data)

# Write to CSV
df.to_csv("users.csv", index=False)

print("CSV file created successfully!")

