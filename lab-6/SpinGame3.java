public class SpinGame3 {
  private Player thePlayer;
  private Spinner theSpinner;
  private int numberOfRounds;

  public SpinGame3(int x) {
    numberOfRounds = x;
    theSpinner = new Spinner();
    thePlayer = new Player("Fred");

  }

  public void playGame() {
    for (int x = 1; x <= numberOfRounds; x++) {
      System.out.println("-------------------------------------------");
      System.out.println("ROUND " + x);
      thePlayer.takeTurn(theSpinner);
    }
  }

}
