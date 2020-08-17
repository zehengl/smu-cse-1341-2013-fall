
import java.util.Random;
import java.util.Scanner;

public class HighLow {

  public static void main(String[] args) {
    int amount = 100;

    Scanner s = new Scanner(System.in);

    System.out.println("SPINNER HIGH-LOW GAME");
    System.out.println("The spinner has 20 numbers from 1-20");
    System.out.printf("You have $ %d \n", amount);
    System.out.print("Press Enter to take the first spin...");
    s.nextLine();
    int spinValue1 = spinTheWheel();
    System.out.printf("You spun %d\n", spinValue1);

    while (true) {
      System.out.print("Spin again... will it be (H)igher or (L)ower or (Q)uit? ");
      String highLowAnswer = s.next();
      if (highLowAnswer.equalsIgnoreCase("Q"))
        break;

      int spinValue2 = spinTheWheel();
      System.out.printf("You spun %d\n", spinValue2);

      if (highLowAnswer.equalsIgnoreCase("H"))
        amount += checkHigher(spinValue1, spinValue2);
      if (highLowAnswer.equalsIgnoreCase("L"))
        amount += checkLower(spinValue1, spinValue2);
      spinValue1 = spinValue2;
      System.out.printf("You have $ %d \n", amount);
    }

    System.out.println("Ended game with $ " + amount);

  }

  public static int spinTheWheel() {
    Random r = new Random();
    return r.nextInt(20) + 1;
  }

  public static int checkHigher(int spin1, int spin2) {
    int scoreValue = 0;

    if (spin2 > spin1) {
      System.out.print("You won $10! ");
      scoreValue = 10;
    } else if (spin2 < spin1) {
      System.out.print("You lost $10! ");
      scoreValue = -10;
    } else
      System.out.print("You Tied! ");

    return scoreValue;
  }

  public static int checkLower(int spin1, int spin2) {
    int scoreValue = 0;

    if (spin2 < spin1) {
      System.out.print("You won $10! ");
      scoreValue = 10;
    } else if (spin2 > spin1) {
      System.out.print("You lost $10! ");
      scoreValue = -10;
    } else
      System.out.print("You Tied! ");

    return scoreValue;
  }

}
