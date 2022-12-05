public class strings {
  public static void main(String[] arguments) {
    String name = "Aditya dhanraj Singh";
    System.out.println(name);

    // Creating string using new keyword
    String name1 = new String("TADS");
    System.out.println(name1);
  }
}

class str {
  public static void main(String[] args) {
    String str1 = "abc";
    String str2 = "abc";

    String objStr1 = new String("xyz");
    String objStr2 = new String("xyz");

    System.out.println(str1 == str2);
    System.out.println(objStr1 == objStr2);

  }
}

class string_types {
  public static void main(String[] args) {

    System.out.println("Hello World!, I am TADS. I am from India and i am 21 years old");

    String name = "Aditya";
    String formattedStgring = String.format("Hi i am %s", name);
    System.out.println(formattedStgring);

    /*
     * we use printf for formatted printing
     * %d number
     * %s string
     * %f float and double
     * %c char
     * %b boolean
     */

  }
}

class strFunc {
  public static void main(String[] args) {
    String name = "Aditya Dhanraj Singh";

    /*
     * In the below mentioned, the value of main string font chnage.
     */

    // Length of a string including space
    System.out.println(name.length());
    // to find is the string empty
    System.out.println(name.isEmpty());
    // change to lower case
    System.out.println(name.toLowerCase());
    // Change to upper case
    System.out.println(name.toUpperCase());

    String str1 = new String("abc");
    String str2 = new String("abc");

    System.out.println(str1 == str2); // false
    System.out.println(str1.equals(str2)); // true
    System.out.println(str1.equalsIgnoreCase(str2)); // true

    // replace a word in a string
    String string11 = " This is Aditya";
    System.out.println(string11.replace("Aditya", "aditya"));
    // to check something is present in the string.
    System.out.println(string11.contains("Aditya"));

  }
}
