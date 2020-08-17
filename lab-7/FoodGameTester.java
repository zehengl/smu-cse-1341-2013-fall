import java.util.Scanner;

public class FoodGameTester {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Enter number of players: ");
    int x = s.nextInt();

    FoodGame fg = new FoodGame(x);
    fg.playGame();

  }

}
