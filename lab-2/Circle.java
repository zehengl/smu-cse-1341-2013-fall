import java.util.Scanner;

public class Circle {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Enter Diameter: ");
    int diameter = s.nextInt();

    double radius = diameter / 2.0;
    double area = Math.PI * (radius * radius);
    System.out.printf("Area = %5.2f\n", area);
    double circumference = Math.PI * diameter;
    System.out.printf("Circumference = %5.2f\n", circumference);

  }

}
