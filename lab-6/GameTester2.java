import java.util.Scanner;

public class GameTester2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Enter number of rounds to play: ");
    int x = s.nextInt();

    SpinGame2 sg = new SpinGame2(x);
    sg.playGame();
  }
}
