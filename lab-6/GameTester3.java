import java.util.Scanner;

public class GameTester3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Enter number of rounds to play: ");
    int x = s.nextInt();

    SpinGame3 sg = new SpinGame3(x);
    sg.playGame();

  }

}
