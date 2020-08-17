# lab-3

## Read Keyboard Input

Review the java.util.Scanner api under https://docs.oracle.com

Find methods in the documentation to read an integer, a float and a line.
Write a class named `ReadKeyboardInput` containing the main method as well as an additional method getInput() to read an integer, a float and a line containing multiple strings of characters separated by spaces; the getInput method will read the input and display what it reads on the screen.

The purpose of this problem is to learn how to create additional methods within the same class; and to develop an understanding into Java Scanner API which available on docs.oracle.com.

Additional Signature:

```
public static void getInput()
```

Sample Run:

```
Enter an integer: 10
You have entered: 10
Enter a float: 11.3
You have entered: 11.30
Enter a String: Java programming
You have entered: Java programming
```

## Decimal to Hex Conversion

In this problem, we will write 2 methods, namely `decimalToHex` and `toHexChar`. The first method `decimalToHex` will receive an integer value from the main method and build the hexadecimal string. It will utilize the second method toHexChar to convert an integer to a single hex digit in a character.

Remember the Hexadecimal digits are 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E and F

where a decimal 10 -> A, 11 -> B, 12 -> C, 13 -> D, 14 -> E, 15 -> F.

A Hexadecimal value of decimal 123 is 7B.

Hint: this problem will make us of the modulus operator %. For example,

123 % 16 = 11 -> B and 123 / 16 = 7

7 % 16 = 7 -> 7 and 7 / 16 = 0 and we stop.

Hence decimal 123 -> hexadecimal 7B

Additional Signatures:

```
public static String decimalToHex(int decimal)
public static char toHexChar(int hexValue)
```

Sample Run:

```
Enter a number (or -1 to exit): 123
The hexadecimal of 123 is 7B:
Enter a number (or -1 to exit): -1
Thank you!
```

## CSE1341 Grade

Write a program to calculate the current grade based on the CSE 1341 syllabus.
The program should prompt the user for their first and last name.
It will then pass those names as Strings to the second method of the CSE1341Grade class.
The name of the second method will be calcGrade.
This method will prompt the user for the count of exam scores, count of quiz scores, and count of lab scores to entered by the user.

It will then utilize repetition structure to prompt for exam grades, quiz grades and lab grades based on the previous counts entered.
For example, if the user entered count of exam scores to be 2; then the program will loop 2 times to input the two exam grades; and similarly for the count of quiz and count lab grades.

Assume you have a 100% attendance record and you will get all 5% of the attendance grade.

Use the syllabus to determine the weights of each of the categories such as the exams, quizzes and labs. Add 5% to the total score since you had perfect attendance.

Assume: all exams, labs and quiz scores are out of 100 points.

Additional Signature

```
public static void calcGrade(String first, String last)
```

Sample Run:

```
First name: James
Last name: Bond
How many exam grades do you have? 1
How many quiz grades do you have? 2
How many lab grades do you have? 2
Enter exam 1 score: 90
Enter quiz 1 score: 80
Enter quiz 2 score: 80
Enter lab 1 score: 90
Enter lab 2 score: 90
Total Score: 89.50
James Bond your grade is a: B+
```

---

## Compile and Run

### ReadKeyboardInput

    javac ReadKeyboardInput.java
    java ReadKeyboardInput

### Decimal2HexConversion

    javac Decimal2HexConversion.java
    java Decimal2HexConversion

### CSE1341Grade

    javac CSE1341Grade.java
    java CSE1341Grade
