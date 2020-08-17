import java.util.Scanner;

public class ParallelArrays {

  public static void main(String[] args) {
    final int LETTERS = 52;

    char asciiArray[] = new char[LETTERS];
    int decimalArray[] = new int[LETTERS];

    int initialValue = 65;
    for (int i = 0; i < LETTERS; i++) {
      decimalArray[i] = initialValue;
      asciiArray[i] = (char) initialValue++;

      if (initialValue == 91)
        initialValue = 97;
    }

    displayDecValue(asciiArray, decimalArray);
  }

  public static void displayDecValue(char[] ascii, int[] decimal) {
    Scanner read = new Scanner(System.in);
    System.out.print("Enter a letter (a-z or A-Z): ");

    String input = read.next();
    int value = -1;
    for (int i = 0; i < ascii.length; i++) {
      if (ascii[i] == input.charAt(0)) {
        value = decimal[i];
        break;
      }
    }
    System.out.println("Decimal value of '" + input.charAt(0) + "' is: " + value);
    System.out.println("Thank you!");
  }
}
