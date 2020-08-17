import java.util.Random;

public class Spinner {
  private Random randomMaker = new Random();

  public int spin() {
    return randomMaker.nextInt(10) + 1;
  }

}
