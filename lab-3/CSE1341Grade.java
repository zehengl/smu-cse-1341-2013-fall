import java.util.Scanner;

public class CSE1341Grade {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    String firstName, lastName;
    System.out.print("First name: ");
    firstName = read.nextLine();

    System.out.print("Last name: ");
    lastName = read.nextLine();

    calcGrade(firstName, lastName);
  }

  public static void calcGrade(String first, String last) {

    Scanner read = new Scanner(System.in);
    int examCount;
    int quizCount;
    int labCount;

    System.out.print("How many exam grades do you have? ");
    examCount = read.nextInt();

    System.out.print("How many quiz grades do you have? ");
    quizCount = read.nextInt();

    System.out.print("How many lab grades do you have? ");
    labCount = read.nextInt();

    int i = 0;
    double examsScore = 0.00;
    double quizzesScore = 0.0;
    double labsScore = 0.0;

    for (i = 0; i < examCount; i++) {
      System.out.print("Enter exam " + (i + 1) + " score: ");
      examsScore += read.nextDouble();
    }

    for (i = 0; i < quizCount; i++) {
      System.out.print("Enter quiz " + (i + 1) + " score: ");
      quizzesScore += read.nextDouble();
    }

    for (i = 0; i < labCount; i++) {
      System.out.print("Enter lab " + (i + 1) + " score: ");
      labsScore += read.nextDouble();
    }

    if (examCount == 0)
      examCount = 1;
    if (quizCount == 0)
      quizCount = 1;
    if (labCount == 0)
      labCount = 1;

    double totalScore = examsScore / examCount * 0.5 + labsScore / labCount * 0.35 + quizzesScore / quizCount * 0.10
        + 5;
    String letterGrade = "TBD";
    System.out.printf("Total Score: %.2f \n", totalScore);

    if (totalScore >= 93)
      letterGrade = "A";
    else if (totalScore >= 90)
      letterGrade = "A-";
    else if (totalScore >= 87)
      letterGrade = "B+";
    else if (totalScore >= 83)
      letterGrade = "B";
    else if (totalScore >= 80)
      letterGrade = "B-";
    else if (totalScore >= 77)
      letterGrade = "C+";
    else if (totalScore >= 73)
      letterGrade = "C";
    else if (totalScore >= 70)
      letterGrade = "C-";
    else if (totalScore >= 67)
      letterGrade = "D+";
    else if (totalScore >= 63)
      letterGrade = "D";
    else if (totalScore >= 60)
      letterGrade = "D-";
    else
      letterGrade = "F";

    System.out.println(first + " " + last + " your grade is a: " + letterGrade);

  }

}
