# lab-7

The objective of lab-7 is to create a new variation of the Spinner game you created in lab-6.
For this lab, you will be able to reuse much of the code you developed in the last version of lab-6 and extend it with additional and changed features.
You may choose to start with your previous program and change it, or it may be easier for you to build from scratch and pull in reusable code as you see fit.

For this lab you will build a new Spinner game.
Players take turns spinning a Food Wheel that contains fruits, vegetables and sweets.
Players each start with a score of zero and alternate taking turns spinning the wheel.
When the player spins, points are earned or deducted based on the type of food the spinner lands on:

- Fruit: earn 5 points
- Vegetable: earn 10 points
- Sweet: deduct 20 points

Play continues to alternate between all players until one player reaches a score greater than or equal to 50.

In the previous game, you specified the number of rounds when starting.
In this game, play continues until there is a winner.
Instead, prompt for the number of players when starting.
Give each player a unique name: (“Player 1”, “Player 2”, “Player 3”, etc)

Sample Run:

```
Enter number of players: 3
Starting Player 1's turn with score = 0
Spun Broccoli with value 10.  Score is now 10

Starting Player 2's turn with score = 0
Spun Broccoli with value 10.  Score is now 10

Starting Player 3's turn with score = 0
Spun Pear with value 5.  Score is now 5

Starting Player 1's turn with score = 10
Spun Donut with value -20.  Score is now -10

Starting Player 2's turn with score = 10
Spun Strawberry with value 5.  Score is now 15

Starting Player 3's turn with score = 5
Spun Apple with value 5.  Score is now 10

Starting Player 1's turn with score = -10
Spun Strawberry with value 5.  Score is now -5

Starting Player 2's turn with score = 15
Spun Donut with value -20.  Score is now -5

Starting Player 3's turn with score = 10
Spun Strawberry with value 5.  Score is now 15

Starting Player 1's turn with score = -5
Spun Donut with value -20.  Score is now -25

Starting Player 2's turn with score = -5
Spun Donut with value -20.  Score is now -25

Starting Player 3's turn with score = 15
Spun Apple with value 5.  Score is now 20

Starting Player 1's turn with score = -25
Spun Strawberry with value 5.  Score is now -20

Starting Player 2's turn with score = -25
Spun Spinach with value 10.  Score is now -15

Starting Player 3's turn with score = 20
Spun Orange with value 5.  Score is now 25

Starting Player 1's turn with score = -20
Spun Strawberry with value 5.  Score is now -15

Starting Player 2's turn with score = -15
Spun Apple with value 5.  Score is now -10

Starting Player 3's turn with score = 25
Spun Cucumber with value 10.  Score is now 35

Starting Player 1's turn with score = -15
Spun Spinach with value 10.  Score is now -5

Starting Player 2's turn with score = -10
Spun Broccoli with value 10.  Score is now 0

Starting Player 3's turn with score = 35
Spun Cucumber with value 10.  Score is now 45

Starting Player 1's turn with score = -5
Spun Donut with value -20.  Score is now -25

Starting Player 2's turn with score = 0
Spun Donut with value -20.  Score is now -20

Starting Player 3's turn with score = 45
Spun Spinach with value 10.  Score is now 55

Player 3 won with 55 points!!!
```

---

## Compile and Run

### FoodGameTester

    javac FoodGameTester.java
    java FoodGameTester
