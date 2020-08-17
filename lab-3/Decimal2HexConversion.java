import java.util.Scanner;

public class Decimal2HexConversion {
  public static void main(String[] args) {
    int number = 0;
    Scanner s = new Scanner(System.in);
    while (number != -1) {
      System.out.print("Enter a number (or -1 to exit): ");
      number = s.nextInt();
      if (number != -1)
        System.out.printf("The hexadecimal of %d is %s: \n", number, decimalToHex(number));
    }
    System.out.println("Thank you!");
  }

  public static String decimalToHex(int decimal) {
    String hex = "";
    int hexValue;
    while (decimal != 0) {
      hexValue = decimal % 16;
      hex = toHexChar(hexValue) + hex;
      decimal = decimal / 16;
    }
    return hex;
  }

  public static char toHexChar(int hexValue) {
    if (hexValue <= 9 && hexValue >= 0)
      return (char) (hexValue + '0');
    else
      return (char) (hexValue - 10 + 'A');
  }

}
