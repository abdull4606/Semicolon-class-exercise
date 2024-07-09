import java.util.Scanner;

public class LargestAndSmallest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] numbers = new int[5];

    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Enter integer #" + (i + 1) + ": ");
      numbers[i] = input.nextInt();
    }

    int largest = numbers[0];
    int smallest = numbers[0];

    for (int number : numbers) {
      if (number > largest) {
        largest = number;
      }
      if (number < smallest) {
        smallest = number;
      }
    }

    System.out.printf("Largest integer: %d%n", largest);
    System.out.printf("Smallest integer: %d%n", smallest);
  }
}
