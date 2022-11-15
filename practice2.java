import java.util.Scanner;

public class practice2 {
  public static void main(String[] args) {
    System.out.println("This is switch statements:");

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the first number:");
    int num1 = scan.nextInt();
    scan.nextLine();

    System.out.println("Enter the seconf number:");
    int num2 = scan.nextInt();
    scan.nextLine();

    System.out.println("Enter the operation needed to be performed : ");
    String input = scan.nextLine();

    switch (input) {
      case "Sum":
        System.out.printf("The sum of the following is : %d", num1 + num2);
        break;
      case "Sub":
        System.out.printf("The sub of the following is : %d", num1 - num2);
        break;
      case "Mul":
        System.out.printf("The Mul of the following is : %d", num1 * num2);
        break;
      case "Div":
        if (num2 != 0) {
          System.out.printf("The Div of the following is : %d", num1 / num2);
        } else {
          System.out.println("The second number cannot be 0");
        }
        break;
      default:
        System.out.println("The given operation is invalid pls try again");

    }

  }
}