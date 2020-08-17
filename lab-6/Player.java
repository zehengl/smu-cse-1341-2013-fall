public class Player {
  private String name;
  private int score;

  public Player(String s) {
    name = s;
    score = 0;
  }

  public void takeTurn(Spinner s) {

    System.out.println("Starting " + name + "'s turn with score = " + score);
    System.out.print("Spin values: ");

    while (true) {
      int spin = s.spin();
      System.out.print(spin + " ");
      if (spin == 5)
        break;
      else
        score += 1;
    }
    System.out.println("\n" + name + "'s score is now " + score);
  }

  public int getScore() {
    return score;
  }

  public String getName() {
    return name;
  }

}
