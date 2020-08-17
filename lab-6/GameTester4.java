import java.util.Scanner;

public class GameTester4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Enter number of rounds to play: ");
    int x = s.nextInt();

    SpinGame4 sg = new SpinGame4(x);
    sg.playGame();

  }

}
