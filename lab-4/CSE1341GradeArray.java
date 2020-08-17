import java.util.Scanner;

public class CSE1341GradeArray {

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
    double examArray[] = new double[3];
    double quizArray[] = new double[5];
    double labArray[] = new double[9];
    int categoryArray[] = new int[3];

    categoryArray = getScores(examArray, quizArray, labArray);

    double examsScore = 0.00;
    double quizzesScore = 0.0;
    double labsScore = 0.0;

    for (int i = 0; i < categoryArray[0]; i++)
      examsScore += examArray[i];

    for (int i = 0; i < categoryArray[1]; i++)
      quizzesScore += quizArray[i];

    for (int i = 0; i < categoryArray[2]; i++)
      labsScore += labArray[i];

    if (categoryArray[0] == 0)
      categoryArray[0] = 1;
    if (categoryArray[1] == 0)
      categoryArray[1] = 1;
    if (categoryArray[2] == 0)
      categoryArray[2] = 1;

    double totalScore = examsScore / categoryArray[0] * 0.5 + labsScore / categoryArray[1] * 0.35
        + quizzesScore / categoryArray[2] * 0.10 + 5;
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

  public static int[] getScores(double[] exams, double[] quizzes, double[] labs) {
    int i = 0;

    int countArray[] = new int[3];

    Scanner read = new Scanner(System.in);

    System.out.print("How many exam grades do you have? ");
    countArray[0] = read.nextInt();

    System.out.print("How many quiz grades do you have? ");
    countArray[1] = read.nextInt();

    System.out.print("How many lab grades do you have? ");
    countArray[2] = read.nextInt();

    for (i = 0; i < countArray[0]; i++) {
      System.out.print("Enter exam " + (i + 1) + " score: ");
      exams[i] = read.nextDouble();
    }

    for (i = 0; i < countArray[1]; i++) {
      System.out.print("Enter quiz " + (i + 1) + " score: ");
      quizzes[i] = read.nextDouble();
    }

    for (i = 0; i < countArray[2]; i++) {
      System.out.print("Enter lab " + (i + 1) + " score: ");
      labs[i] = read.nextDouble();
    }

    return countArray;
  }
}
