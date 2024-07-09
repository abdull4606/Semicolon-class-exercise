import java.util.Scanner;

public class CompareIntegers {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int number = input.nextInt();

    int square = number * number;

    System.out.printf("The number %d%n", square);
    System.out.printf("is %s than 100.%n", square > 100 ? "greater than" : number == 100 ? "equal to" : "less than");

    System.out.printf("The square of the number %d%n", number);
    System.out.printf("is %s than 100.%n", square < 100 ? "less than" : square == 100 ? "equal to" : "less than");
  }
}
