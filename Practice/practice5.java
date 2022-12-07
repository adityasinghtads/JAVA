import java.util.Arrays;
import java.util.Scanner;

public class practice5 {
  public static void main(String[] args) {
    // strs();
    // userInputs();
    // arrys();
    // loopsJava();
    love();
  }

  static void love() {
    Integer arr[] = new Integer[3];
    for (Integer i : arr) {
      System.out.println(i);
    }
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

  static void userInputs() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Pls enter the number");
    int number = scanner.nextInt();
    scanner.nextLine();
    System.out.println(number);

    switch (number) {
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
    scanner.nextLine();
    scanner.close();

    // Scanner scan = new Scanner(System.in);
    // String str = " Pls enter your string";
    // System.out.println(str);
    // String wipro = scan.nextLine();
    // System.out.printf("Show wipro %s",wipro);
    // scan.close();

    Scanner newScan = new Scanner(System.in);
    String srtt = newScan.nextLine();
    System.out.println(srtt);
    newScan.close();
  }

  static void loops() {
    for (int n = 1; n <= 10; n++) {
      System.out.println(n);
    }
    for (int n = 2; n <= 10; n++) {
      System.out.println(n);
    }
  }

  static void arrys() {
    // way of declaring an array
    char vowel[] = new char[5];
    vowel[0] = 'a';
    vowel[1] = 'e';
    vowel[2] = 'i';
    vowel[3] = 'o';
    vowel[4] = 'u';
    // to print the array
    System.out.println(vowel);
    System.out.println(Arrays.toString(vowel));
    // we can update the arrays
    vowel[2] = 'b';
    System.out.println(vowel);
    System.out.println(Arrays.toString(vowel));

    // length of string
    int len = 0;
    len = vowel.length;
    System.out.println(len);

    // declaring and defining the array in one line
    char me1[] = { 'e', 'o', 'e' };
    System.out.println(me1);

    // arrys of string in java
    String[] arryOfString = { "One", "two", "three" };
    String[] up = new String[3];
    for (String str : up) {
      System.out.println(str);
    }
    for (int n = 0; n < arryOfString.length; n++) {
      System.out.println(arryOfString[n]);
    }

    // to display an error we use arrys.tostring method.
    // can we use for array string ?\

    System.out.println(Arrays.toString(arryOfString));

    // Sorting an array
    char newArr[] = { 'a', 'z', 'b' };
    Arrays.sort(newArr);
    System.out.println(Arrays.toString(newArr));
    System.out.println(newArr);

    // can also sort in given range by providing the index
    // this sorting in exclusive

    // Searching in an array on works in sorted arrays.
    char newArr1[] = { 'a', 'z', 'x', 'e', 'b' };
    Arrays.sort(newArr1);
    char key = 'z';
    int foundat = Arrays.binarySearch(newArr1, key);
    System.out.println(foundat);
    System.out.println(foundat + 1);

    // If search fails the result is a negative number which will indicate the
    // search failed.

    // fill method
    int num[] = { 1, 2, 3, 4, 5, 6, };
    Arrays.fill(num, 2);
    System.out.println(Arrays.toString(num));

    // comapring 2 arrays
    int n[] = { 1, 2, 3, 4 };
    int n1[] = Arrays.copyOf(n, n.length);
    System.out.println(Arrays.equals(n, n1));

  }

  static void loopsJava() {
    System.out.println("Loops in Java");
    for (int p = 0; p < 10; p++) {
      System.out.println(p);
    }
    // looping an array
    int nu[] = { 1, 2, 3, 4, 5, 6, 7, 8, 8 };
    for (int n = 0; n < nu.length; n++) {
      System.out.println(nu[n]);
    }

    // nested loops
    for (int n = 1; n <= 10; n++) {
      for (int p = 1; p <= 10; p++) {
        System.out.printf("%d x%d = %d \n", n, p, n * p);
      }
    }

    // using for loop to print or use array functions
    int hi[] = { 1, 2, 3, 4, 5 };
    for (int hello : hi) {
      System.out.println(hello);
    }

    // while and do while loop.
 
  }

}
