# lab-2

## Area of Circle

Write a program called `Circle` that prompts for the diameter of a circle and computes and displays the circle’s area and circumference.
Use the static method in the Math class for the value of pi.

Sample Run:

```
Enter Diameter: 10
Area = 78.54
Circumference = 31.42
```

## Planet Weights

The gravitational pull is different than each of the planets in our solar system. Use the Internet or another source to determine the gravity factor of each of the other 8 planets (including Pluto) relative to Earth.
Create a Java program called `PlanetWeights` that allows the user to enter their weight on Earth and displays the equivalent weight on the other 8 planets.

Sample Run:

```
Enter weight on Earth:  190
              Planet Weight
              ------ ------
               Earth   190
             Mercury    72
               Venus   173
                Mars    72
             Jupiter   483
              Saturn   205
              Uranus   173
             Neptune   226
               Pluto    11
```

## Discount Calculator

Write a program called `Discount` that prompts for the price of a product and computes and displays the discount rate, discounted price, sales tax, and total due.
The discount rate is 10% for items over $10 and 15% for items over $100.
There is no discount for items less than \$10.
Calculate sales tax using a rate of 8.75%.
Match the output shown below.

**Hint**: Use `printf` statements with formatting symbols to align the labels and data.

Sample Run:

```
Enter Price: $ 500

                Discount:      15%
        Discounted Price: $ 425.00
               Sales Tax: $  37.19
                   Total: $ 462.19
```

```
Enter Price: $ 60

                Discount:      10%
        Discounted Price: $  54.00
               Sales Tax: $   4.73
                   Total: $  58.73
```

## Box Display

Write a program called `Box` (Box.java) that will print/displays a hollow box shape using asterisks (\*).
The program will read in an even number in the range 2 to 24 to specify the number of rows/columns in the box.
Display an error and re-prompt for the number if an incorrect value was entered.
The program will then display a hollow of the appropriate size.

**Hint**: Use loops within loops.

Sample Run:

```
Enter an even number (2-24): 1
Value must be an even number from 2-24
Enter an even number (2-24): 30
Value must be an even number from 2-24
Enter an even number (2-24): 13
Value must be an even number from 2-24
Enter an even number (2-24): 10

Box of size 10:

**********
*        *
*        *
*        *
*        *
*        *
*        *
*        *
*        *
**********
```

---

## Compile and Run

### Circle

    javac Circle.java
    java Circle

### PlanetWeights

    javac PlanetWeights.java
    java PlanetWeights

### Discount

    javac Discount.java
    java Discount

### Box

    javac Box.java
    java Box
