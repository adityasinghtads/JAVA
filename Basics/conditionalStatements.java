import java.util.Scanner;

public class conditionalStatements {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the first number :");
    double num1 = scanner.nextDouble();
    System.out.println("Enter the second number :");
    double num2 = scanner.nextDouble();
    scanner.nextLine();

    System.out.printf("What operation due to want to perform:");
    String operation = scanner.nextLine();

    if (operation.equals("sum"))  {
      System.out.printf("%d + %d = %d",  num1 , num2, num1 + num2);
    } else  {
      System.out.println("This operation is not supported");
    }
    scanner.close();
  }
}
