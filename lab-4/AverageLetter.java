import java.util.Scanner;

public class AverageLetter {

  public static void main(String[] args) {
    final int LETTERS = 52;

    char asciiArray[] = new char[LETTERS];
    int decimalArray[] = new int[LETTERS];
    char letterArray[] = new char[5];

    int initialValue = 65;
    for (int i = 0; i < LETTERS; i++) {
      decimalArray[i] = initialValue;
      asciiArray[i] = (char) initialValue++;

      if (initialValue == 91)
        initialValue = 97;
    }

    Scanner read = new Scanner(System.in);
    System.out.println("Enter a letter (a-z or A-Z): ");

    String input;
    for (int i = 0; i < 5; i++) {
      System.out.print("Enter 5 letters from the English Alphabet: ");
      input = read.next();
      letterArray[i] = input.charAt(0);
    }

    int average = getAverage(asciiArray, decimalArray, letterArray);
    System.out.printf("Your average value is: %d\n", average);
  }

  public static int getAverage(char[] ascii, int[] decimal, char[] letters) {
    int sum = 0;
    for (int i = 0; i < letters.length; i++) {
      for (int j = 0; j < ascii.length; j++) {
        if (letters[i] == ascii[j]) {
          sum += decimal[j];
          break;
        }
      }
    }
    return sum / letters.length;
  }
}
