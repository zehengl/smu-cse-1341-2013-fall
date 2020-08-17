import java.util.Scanner;

public class Discount {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Enter Price: $ ");
    double price = s.nextDouble();
    double discount;
    if (price < 10)
      discount = 0;
    else if (price < 100)
      discount = 0.1;
    else
      discount = 0.15;
    System.out.println();
    System.out.printf("%25s %7.0f%%\n", "Discount:", (discount * 100));
    double grossPrice = price * (1 - discount);
    System.out.printf("%25s $ %6.2f\n", "Discounted Price:", grossPrice);
    double salesTax = grossPrice * 0.0875;
    System.out.printf("%25s $ %6.2f\n", "Sales Tax:", salesTax);
    double total = grossPrice + salesTax;
    System.out.printf("%25s $ %6.2f\n", "Total:", total);

  }

}
