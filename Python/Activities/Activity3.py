
user1 = input("Enter the user name 1")
user2 = input("Enter the user name 2")

user1_select1 = input("Select rock, paper or scissors by User1")
user1_select2 = input("Select rock, paper or scissors by User2")

user1_select1_value = user1_select1.strip().lower()
user1_select2_value = user1_select2.strip().lower()

if user1_select1_value == user1_select2_value:
    print("Tie!")
elif user1_select1_value == 'rock':
    if user1_select2_value == 'scissors':
        print("Rock wins")
    else:
        print("Paper wins")
elif user1_select1_value == 'scissors':
    if user1_select2_value == 'paper':
        print("Scissors win")
    else:
        print("Rock win")
elif user1_select1_value == 'paper':
    if user1_select2_value == 'rock':
        print("Paper win")
    else:
        print("Scissors win")
else:
    print("Incorrect  input")

