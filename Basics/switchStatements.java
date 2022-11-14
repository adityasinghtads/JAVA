import java.util.Scanner;

public class switchStatements {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Num1:");
    int num1 = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Enter the Num2:");
    int num2 = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Enter the operation needed to performed :");
    String input = scanner.nextLine();

    switch (input) {
      case "Sum":
        System.out.printf("The sum of the numbers is : %d", num1 + num2);
        break;
      case "Sub":
        System.out.printf("The Sub of the number is : %d", num1 - num2);
        break;
      case "Mul":
        System.out.printf("The Multiplication of numbers :", num1 * num2);
        break;
      case "Div":
        if (num2 != 0) {
          System.out.printf("The div of numbers is : ", num1 / num2);
        } else {
          System.out.println("the answer is undefined.");
        }
        break;

      default:
        System.out.println("The input is not supported.");
    }

    scanner.close();

  }
}
