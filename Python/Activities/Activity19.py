# Import pandas
import pandas
from pandas import ExcelWriter

data = {
    'FirstName':["Satvik", "Avinash", "Lahri"],
    'LastName':["Shah", "Kati", "Rath"],
    'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
    'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

# Create the DataFrame that will be written to the excel file
dataframe = pandas.DataFrame(data)


print(dataframe)

# Write the dataframe to  Excel file
writer = ExcelWriter('../resources/Username.xlsx')

dataframe.to_excel(writer, 'Sheet1', index = False)

# Commit data to the Excel file
writer._save()