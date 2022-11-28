import java.math.BigInteger;

public class practice4 {
  /*
   * Practicing Java- All basics covered till now.
   */
  public static void main(String[] args) {
    System.out.println("My First program in Java");

    dataTypes();
  }

  static void dataTypes() {
    int num = 10;
    System.out.println(num);
    float num1 = 8.7f;
    System.out.println((int) num1); // To convert to int

    // Seal - Upr - Greater number - Float n double
    // Floor - Neeche - lesser number - Float n double

    System.out.println(Math.ceil(num1));
    System.out.println(Math.floor(num1));

    int maxPossible = Integer.MAX_VALUE;
    System.out.println(maxPossible);

    System.out.println(Math.pow(2, 4));
    System.out.println(Math.pow(2, 8));
    System.out.println(256 / 2);

    // Used in case when we have massive numbers.

    BigInteger hum = new BigInteger("9999999999999999999999999999999");
    BigInteger hum1 = new BigInteger("8888888888888888888888888888888");
    BigInteger sum = hum.subtract(hum1);
    System.out.println(sum);

  }

}

class strings{
   public static void main(String[] args) {
    strs();
  }

  static void strs(){
    System.out.println("This is strings class ");
    String myString = "I am Aditya Singh";
    System.out.println(myString);

    // Other wayof declaring string 
    String str1 = new String("Adita Singh");
    System.out.println(myString.equals(str1));
  }

}
