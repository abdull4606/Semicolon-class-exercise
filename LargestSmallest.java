import java.util.Scanner;

public class LargestSmallest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean first = true;
    double largest = 0;
    double smallest = 0;

    while (true) {
      System.out.println("Enter a number (or 0 to quit):");
      double number = scanner.nextDouble();

      if (number == 0) {
        break;
      }

      if (first) {
        largest = number;
        smallest = number;
        first = false;
      } else {
        if (number > largest) {
          largest = number;
        }
        if (number < smallest) {
          smallest = number;
        }
      }
    }

    System.out.println("Largest number entered: " + largest);
    System.out.println("Smallest number entered: " + smallest);
  }
}

