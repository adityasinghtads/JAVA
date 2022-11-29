import java.net.SocketTimeoutException;
import java.text.BreakIterator;
import java.util.Scanner;

import javax.xml.transform.Source;

public class practice5 {
  public static void main(String[] args) {
    //strs();
    userInputs();
  }

  static void strs() {
    System.out.println("This is strings class ");
    String myString = "I am Aditya Singh";
    System.out.println(myString);

    // Other wayof declaring string
    String str1 = new String("Adita Singh");
    System.out.println(myString.equals(str1));
    String blame = new String("Aditya Singh");
    String formattedString = String.format("Hi i am this is %s", blame);
    System.out.println(formattedString);

    // Different function inbuilt in Java strings
    System.out.println(blame.length());
    System.out.println(blame.equals(formattedString));
    System.out.println(blame.equalsIgnoreCase(formattedString));

    String str12 = "Tads is thakur Aditya dhanraj singh";
    System.out.println(str12.repeat(4));
    System.out.println(str12.replace("Aditya", "Dhanrj"));

    System.out.println(str12.contains("thakur"));

  }

  static void userInputs(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Pls enter the number");
    int number = scanner.nextInt();
    scanner.nextLine();
    System.out.println(number);

    switch(number){
      case 1:
        System.out.println("The number is 1");
        break;
      
      case 2:
        System.out.println("The number is 2");
        break;
      
      case 3:
        System.out.println("The number is 3");
        break;
      default:
        System.out.println("The number is above 3");
    }
    scanner.close();
      

  }

}
