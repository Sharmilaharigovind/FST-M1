

list1 = [22,3,44,5,10]
list2 = [14, 40, 23, 33, 13]

# Print the lists
print("List 1", list1)
print("List 2 ", list2)


List3 = []


for num1 in list1:
    if (num1 % 2 != 0):
        List3.append(num1)

for num2 in list2:
    if (num2 % 2 == 0):
        List3.append(num2)

print("List Appended Output", List3)