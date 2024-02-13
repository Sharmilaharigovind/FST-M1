
# creating an empty list
lst = []

# number of elements as input
n = int(input("Enter number of elements : "))

# iterating till the range
for i in range(0, n):
    ele = int(input())
    # adding the element
    lst.append(ele)

print(lst)

sum = 0
for number in lst:
    sum += int(number)

print(sum)