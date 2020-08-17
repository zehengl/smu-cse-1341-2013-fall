
public class Player {
  private String name;
  private int score;

  public Player(String s) {
    name = s;
    score = 0;
  }

  public void takeTurn(Spinner s) {

    System.out.println("Starting " + name + "'s turn with score = " + score);
    FoodItem spunFood = s.spin();
    int y = spunFood.getValue();
    score += y;
    System.out.printf("Spun %s with value %d.  Score is now %d\n\n", spunFood, spunFood.getValue(), score);

  }

  public int getScore() {
    return score;
  }

  public String getName() {
    return name;
  }

  public String toString() {
    return name;
  }

}
