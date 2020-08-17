# lab-4

## Parallel Arrays

Write a program to create two arrays namely asciiArray and decimalArray of 52 elements each.
In the asciiArray, store letters of the English alphabet; both lower and upper case letters.
In the decimalArray, store the corresponding decimal values of each of the letters in the specific position in the asciiArray.
For example, If `asciiArray[0]` holds `A` then `decimalArray[0]` will hold the value `65`.
Pass these arrays to a method displayDecValue.
Inside the method, prompt the user to enter any of the letters of the English alphabet and display the corresponding decimal value.

Additional Signature:

```
public static void displayDecValue(char [ ] ascii, int [ ] dec)
```

Sample Run:

```
Enter a letter (a-z or A-Z): C
Decimal value of 'C' is: 67
Thank you!
```

## Average Letter

Write a program `AverageLetter` which will create an array of 5 characters.
Prompt the user to enter any 5 letters of the English alphabet – both lower and upper cases are allowed.
Store those values in the letterArray created previously.

Invoke a new method getAverage and pass the letterArray and the two arrays created in the previous problem.
The getAverage method will determine the decimal value of each of the letters in the 5 elements array with the help of the two parallel arrays, asciiArray and decimalArray using their corresponding positions.

Calculate the average value of the letterArray by summing the respective decimal values and diving by 5.
Return the average value back to the calling method.

Display the average value along with the highest letter based on the decimal value of
each of the letter entered by the users.

Additional Signature:

```
public static int getAverage(char [] ascii, int [] decimal, int [] letters)
```

Sample Run:

```
Enter a letter (a-z or A-Z):
Enter 5 letters from the English Alphabet: C
Enter 5 letters from the English Alphabet: A
Enter 5 letters from the English Alphabet: a
Enter 5 letters from the English Alphabet: B
Enter 5 letters from the English Alphabet: b
Your average value is: 78
```

## CSE1341 Grade

Write a program to calculate your current grade based on the CSE 1341 syllabus.
The program should prompt the user for their first and last name.
It will then pass those names as Strings to the second method `calcGrade` of the CSE1341Grade class.

The `calcGrade` will accept the two String references as input parameters and it will create arrays for each of the categories which would help determine the final grade.
All the arrays must be initialized to a value of -1.

Once all the arrays are created, the `calcGrade` method will invoke the 3rd method of this class named `getScores`.
This new method will accept all the arrays created in `calcGrade` method as input parameters.
For example, the `getScores` method may be passed an examArray, a quizArray, and a labArray to be populated with scores and this will totally depend upon your own instructor’s syllabus for the course.

The `getScores` method will prompt the user for the count of exam scores, count of quiz scores, and count of lab scores based on what has already been graded.

The `getScores` method will utilize repetition structures to prompt the user to enter specific scores based on the count of each category provided and not the length of the arrays.

Inside `getScores` method, create an arrays countArray to hold the counts of each of the categories provided by the user.
The size of this array will be equal to the number of categories per the syllabus.

The `getScores` method will return the countArray back to the calling method which will be utilized by the caller to calculate the current grade.

The `calcGrade` method will utilize the specific arrays to calculate averages for each of the categories and apply the necessary weights based on your syllabus.

Assume you have a 100% attendance record and you will get all 5% of the attendance grade if that is a category in your syllabus.

Assume: all exams, labs and quiz scores are out of 100 points.

Additional Signatures:

```
public static void calcGrade(String first, String last)
public static int [] getScores(int [] exams, int [] quizzes, int [] labs)
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

### ParallelArrays

    javac ParallelArrays.java
    java ParallelArrays

### AverageLetter

    javac AverageLetter.java
    java AverageLetter

### CSE1341GradeArray

    javac CSE1341GradeArray.java
    java CSE1341GradeArray
