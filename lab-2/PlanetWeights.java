import java.util.Scanner;

public class PlanetWeights {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Enter weight on Earth:  ");
    double weight = s.nextDouble();

    System.out.printf("%20s %5s\n", "Planet", "Weight");
    System.out.printf("%20s %5s\n", "------", "------");
    System.out.printf("%20s %5.0f\n", "Earth", weight);
    System.out.printf("%20s %5.0f\n", "Mercury", weight * 0.38);
    System.out.printf("%20s %5.0f\n", "Venus", weight * 0.91);
    System.out.printf("%20s %5.0f\n", "Mars", weight * 0.38);
    System.out.printf("%20s %5.0f\n", "Jupiter", weight * 2.54);
    System.out.printf("%20s %5.0f\n", "Saturn", weight * 1.08);
    System.out.printf("%20s %5.0f\n", "Uranus", weight * 0.91);
    System.out.printf("%20s %5.0f\n", "Neptune", weight * 1.19);
    System.out.printf("%20s %5.0f\n", "Pluto", weight * 0.06);

  }

}
