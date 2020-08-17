public class SpinGame2 {
  String playerName = "Fred";
  int playerScore = 0;
  private Spinner theSpinner = new Spinner();
  private int numberOfRounds;

  public SpinGame2(int x) {
    numberOfRounds = x;
  }

  public void playGame() {

    for (int x = 1; x <= numberOfRounds; x++) {
      System.out.println("-------------------------------------------");
      System.out.print("ROUND " + x + "\n");
      System.out.print(playerName + " spins: ");

      while (true) {
        int spinValue = theSpinner.spin();
        System.out.print(spinValue + " ");
        if (spinValue == 5)
          break;
        else
          playerScore += 1;

      }
      System.out.printf("\n%s's score is now %d\n", playerName, playerScore);
    }
  }

}
