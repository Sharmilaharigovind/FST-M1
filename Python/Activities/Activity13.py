
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

def listsum(numbers):
    ret=0
    for i in numbers:
        ret+=i
    return ret


result =  listsum(lst)
print("The sum of all the elements is: " + str(result))


