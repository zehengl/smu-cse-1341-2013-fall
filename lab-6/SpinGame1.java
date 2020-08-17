import java.util.Random;

public class SpinGame1 {
  String playerName = "Fred";
  int playerScore = 0;
  Random randomMaker = new Random();

  public void playGame() {

    for (int x = 1; x <= 5; x++) {
      System.out.println("ROUND " + x);

      while (true) {
        int spinValue = spin();
        System.out.print(spinValue + " ");
        if (spinValue == 5)
          break;
        else
          playerScore += 1;
      }
      System.out.printf("\nRound %d over. %s's score is now %d\n", x, playerName, playerScore);
    }
  }

  public int spin() {
    return randomMaker.nextInt(10) + 1;
  }

}
