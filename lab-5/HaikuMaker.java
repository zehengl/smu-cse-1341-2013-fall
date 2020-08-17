import java.util.Random;
import java.util.Scanner;

public class HaikuMaker {

  public static void main(String[] args) {
    Random r = new Random();
    String poem = "\n";
    int size = 6;
    String[] verbs1 = { "ran", "jumped", "crawled", "hiked", "cried", "laughed" };
    String[] verbs2 = { "lifted", "carried", "tasted", "whittled", "wasted", "taunted" };
    String[] nouns1 = { "man", "dog", "cat", "spam", "cup", "hat" };
    String[] nouns2 = { "lady", "pastry", "donkey", "sofa", "beanbag", "coffee" };
    String[] adjectives1 = { "hot", "red", "wet", "soft", "tough", "smart" };
    String[] adjectives2 = { "tasty", "cranky", "perky", "smelly", "flakey", "well lit" };

    Scanner s = new Scanner(System.in);

    while (true) {
      System.out.print("\nWANT A HAIKU? (Y/N) ");
      if (s.next().equals("N"))
        break;

      poem += "The ";
      poem += adjectives1[r.nextInt(size)] + " ";
      poem += adjectives2[r.nextInt(size)] + " ";
      poem += nouns1[r.nextInt(size)] + "\n";

      poem += verbs2[r.nextInt(size)];
      poem += " the " + adjectives2[r.nextInt(size)];
      poem += " " + nouns2[r.nextInt(size)] + "\n";
      poem += adjectives2[r.nextInt(size)] + " ";
      poem += adjectives2[r.nextInt(size)] + " ";
      poem += nouns1[r.nextInt(size)] + ".\n";

      System.out.print(poem);
      poem = "";
    }
    System.out.println("\nI hope you enjoyed the Haiku!!");

  }

}
