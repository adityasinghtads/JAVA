import java.util.Arrays;

public class practice3 {
  public static void main(String[] args) {
    /*
     * Practicing - Java - Strings Arrays and loops
     *
     */

    String name = new String("Aditya");
    String name1 = new String("Aditya");

    System.out.println(name);
    System.out.println(name.equals(name1));
    System.out.println(name == name1);
    System.out.println();

    String company = "Utrade";
    System.out.println(company);
    System.out.println(company.length());
    System.out.println(company.isEmpty());
    System.out.println(company.toLowerCase());
    System.out.println(company.toUpperCase());
    System.out.println(company.toLowerCase());
    System.out.println(name.equalsIgnoreCase(company));

    arraysInJava();

  }

  static void arraysInJava() {
    char nam[] = new char[2];
    nam[0] = 'a';
    nam[1] = 'b';
    System.out.println(Arrays.toString(nam));

    char wipro[] = { 'w', 'i', 'p', 'r', 'o' };
    System.out.println(Arrays.toString(wipro));
    System.out.println(wipro.length);
    System.out.println(wipro);

    Arrays.sort(wipro);
    System.out.println(Arrays.toString(wipro));

    // Binary search only in sorted arrays.

    char tcs[] = { 't', 'c', 's' };
    int start = 1;
    int end = 2;
    char Key = 'c';
    int ans = Arrays.binarySearch(wipro, start, end, Key);
    System.out.println(ans);

    // Filing entire arrays in java.

    Arrays.fill(wipro, 'p');
    System.out.println(wipro);

    System.out.println(Arrays.equals(wipro, tcs));

  }
}