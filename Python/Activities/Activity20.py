
# Import pandas
import pandas

# Read data from Excel sheet
dataframe = pandas.read_excel('../resources/Username.xlsx')

print(dataframe)

print("Number of rows and columns:", dataframe.shape)

print("Emails:")
print(dataframe['Email'])

print("====================================")
print("Sorted data:")
print(dataframe.sort_values('FirstName'))