import java.util.Scanner;

public class CircleCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the radius of the circle: ");
    int radius = input.nextInt();

    System.out.printf("Diameter: %d%n", 2 * radius);
    System.out.printf("Circumference: %.2f%n", 2 * Math.PI * radius);
    System.out.printf("Area: %.2f%n", Math.PI * radius * radius);
  }
}
