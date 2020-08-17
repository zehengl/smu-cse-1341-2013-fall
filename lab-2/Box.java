import java.util.Scanner;

public class Box {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int theNumber;
    while (true) {
      System.out.print("Enter an even number (2-24): ");
      theNumber = s.nextInt();
      if ((theNumber % 2 == 0) && (theNumber > 1) && (theNumber < 25)) {
        System.out.println("\nBox of size " + theNumber + ":\n");
        break;
      } else
        System.out.println("Value must be an even number from 2-24");

    }

    for (int c = 0; c < theNumber; c++)
      System.out.print("*");
    System.out.println();

    for (int r = 0; r < theNumber - 2; r++) {

      System.out.print("*");

      for (int c = 0; c < theNumber - 2; c++)
        System.out.print(" ");

      System.out.print("*\n");
    }

    for (int c = 0; c < theNumber; c++)
      System.out.print("*");
    System.out.println();

  }
}
