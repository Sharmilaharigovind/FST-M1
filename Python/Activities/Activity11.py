fruits = {
    "apple": 10,
    "orange": 20,
    "strawberry": 25,
    "cherry": 30
}

check_fruit = input("Enter fruit needed? ").lower()

if(check_fruit in fruits):
    print({check_fruit} ," is available")
else:
    print({check_fruit} ," this is not available")