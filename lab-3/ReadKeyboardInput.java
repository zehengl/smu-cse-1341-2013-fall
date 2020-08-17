import java.util.Scanner;

public class ReadKeyboardInput {
  public static void main(String[] args) {
    getInput();
  }

  public static void getInput() {
    Scanner read = new Scanner(System.in);
    int x;
    float y;
    String s;

    System.out.print("Enter an integer: ");
    x = read.nextInt();
    System.out.printf("You have entered: %d\n", x);

    System.out.print("Enter a float: ");
    y = read.nextFloat();
    System.out.printf("You have entered: %.2f\n", y);

    read.nextLine();
    System.out.print("Enter a String: ");
    s = read.nextLine();
    System.out.printf("You have entered: %s\n", s);

  }
}
