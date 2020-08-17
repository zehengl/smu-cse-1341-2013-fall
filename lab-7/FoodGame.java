import java.util.ArrayList;

public class FoodGame

{
  private ArrayList<Player> thePlayers;
  private Spinner theSpinner;

  public FoodGame(int x) {

    theSpinner = new Spinner();
    thePlayers = new ArrayList<Player>();
    for (int i = 1; i <= x; i++)
      thePlayers.add(new Player("Player " + i));
  }

  public void playGame() {

    boolean haveWinner = false;
    while (haveWinner == false) {
      for (Player p : thePlayers) {
        p.takeTurn(theSpinner);
        if (p.getScore() >= 50) {
          haveWinner = true;
          System.out.printf("%s won with %d points!!!\n", p, p.getScore());
          break;
        }
      }
    }

  }

}
