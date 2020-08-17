public class SpinGame4 {
  private Player[] thePlayers;
  private Spinner theSpinner;
  private int numberOfRounds;

  public SpinGame4(int x) {
    numberOfRounds = x;
    theSpinner = new Spinner();
    thePlayers = new Player[2];
    thePlayers[0] = new Player("Fred");
    thePlayers[1] = new Player("Mary");

  }

  public void playGame() {

    for (int x = 1; x <= numberOfRounds; x++) {
      System.out.println("-------------------------------------------");
      System.out.println("ROUND " + x);
      thePlayers[0].takeTurn(theSpinner);
      thePlayers[1].takeTurn(theSpinner);
    }

    if (thePlayers[0].getScore() > thePlayers[1].getScore())
      System.out.printf("%s WON!!!\n", thePlayers[0].getName());
    else if (thePlayers[1].getScore() > thePlayers[0].getScore())
      System.out.printf("%s WON!!!\n", thePlayers[1].getName());
    else
      System.out.println("TIE!!!");

  }

}
