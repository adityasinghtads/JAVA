import java.util.Scanner;

public class practice1 {
  public static void main(String[] args) {
    System.out.println("Day-1 Java practice");

    // Hello World
    System.out.println("The famous Hello World Program in Java");

    // variables in Java
    int age = 21;
    int number = 123;
    double Dnumber = 1.345;
    // Float Fnumber = 1.0;

    // Datatypes in Java
    byte aSinglebyte = 100;
    short aSmallNumber = 1;
    int anInterger = 98;
    long aLargeNumber = 9888908989989898l;
    double aDouble = 1.2322222223;
    float aFloat = 1.45353F;

    boolean isWeekend = false;
    boolean isWorkDay = true;
    /*
     * Converting from one datatype to another
     */
    int wipro = 10;
    double tcs = wipro;

    System.out.println(wipro);
    System.out.println(tcs);

    // operators in Java
    int num1 = 10;
    int num2 = 20;
    System.out.println(num1 + num2);
    System.out.println(num1 * num2);
    System.out.println(num1 - num2);
    System.out.println(num1 / num2);
    System.out.println(num1 % num2);

    int num3 = 55;
    int num4 = num3++;
    System.out.println(num4);

    int num5 = 90;
    int num6 = num5--;
    System.out.println(num6);

    int num7 = 87;
    int num8 = num7;
    System.out.println(num8);

    // Strings in Java
    String name = "Aditya Singh";
    System.out.println(name);
    String name2 = new String("TADS");
    System.out.println(name2);
    System.out.println(name == name2);

    System.out.println(name.toLowerCase());
    System.out.println(name.toUpperCase());
    System.out.println(name.isEmpty());
    System.out.println(name.length());
    System.out.println(name.equals(name2));
    System.out.println(name.equalsIgnoreCase(name2));

    System.out.println(name.replace("Aditya", "Singh"));
    System.out.println(name.contains("Aditya"));

    // Formatted print statements
    String hcl = new String("Hi hello welcome to HCL ");
    int basic = 90;
    float fnumber = 9.8f;
    System.out.printf("This is hcl : %s", hcl);
    System.out.printf("this is int : %d", basic);
    System.out.printf("this is float: %f", fnumber);

    // user inputs in java
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your name:");
    String n = scan.nextLine();
    System.out.println(n);
    scan.close();

    Scanner input = new Scanner(System.in);
    System.out.println("What is the number in your mind :");
    int p = input.nextInt();
    System.out.println(p);
    input.close();

    // Conditional statements
    System.out.println("Hi this is conditional statements");
    Scanner pop = new Scanner(System.in);
    int i = pop.nextInt();
    if (i > 10) {
      System.out.println("This number is greater than 10");
    } else {
      System.out.println("This number is not greater than 10");
    }
    pop.close();

    //Nested if else statements 
    System.out.println("Hi this is nested if else statements ");
    Scanner app = new Scanner(System.in);
    int ap = app.nextInt();
    if (ap%2==0){
      System.out.println("This is an even number ");
        if (ap >10){
        System.out.println("This number is greater than 0");
        }else{
          System.out.println("this number is less than 0");
        }
    }else{
      System.out.println("This number is odd/ prime number");
      if (ap ==1){
        System.out.println("This is neither prime nor composite");
      }
    }
    app.close();
    
  }
}
