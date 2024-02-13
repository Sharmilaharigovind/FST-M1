
# Import pandas
import pandas

# Read the CSV file
dataframe = pandas.read_csv("../resources/test.csv")

# display the data
print(dataframe)

# Print the values only in the Usernames column
print("Username Column values")
print(dataframe["Usernames"])

# Print the username and password of the second row
print("Username vale of 2nd row ", dataframe["Usernames"][1], " , ", "Password value of 2nd row", dataframe["Passwords"][1])

# Sort the Usernames column data in ascending order and print data
print(dataframe.sort_values("Usernames"))

# Sort the Passwords column in descending order and print data
print(dataframe.sort_values("Passwords", ascending=False))