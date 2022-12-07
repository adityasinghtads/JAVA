public class staticJava {
  int roll = 0;
  int id = 0;
  static String college = "IIT"; // Static variable

  // Constructor
  staticJava(int r, int i) {
    roll = r;
    id = i;
  }

  void display() {
    System.out.println(roll + " " + id + " " + college);
  }

  public static void main(String[] args) {
    staticJava heyjava = new staticJava(10, 20);
    heyjava.display();
  }
}

/*
 * Counter function
 */

class counter1 {
  int count = 0;

  counter1() {
    count++;
    System.out.println(count);
  }

  public static void main(String[] args) {
    counter1 hey = new counter1();
    counter1 hey1 = new counter1();
    counter1 hey2 = new counter1();
  }
}

// Smae counter funct with static will be correct.

class counter3 {
  static int count = 0;

  counter3() {
    count++;
    System.out.println(count);
  }

  public static void main(String[] args) {
    counter3 hey = new counter3();
    counter3 hey1 = new counter3();
    counter3 hey2 = new counter3();
  }
}

// we can call static function/method with creating an object.

class staticfunc {
  static void HeyJava() {
    System.out.println("Hey Java");
  }

  public static void main(String[] args) {
    staticfunc.HeyJava();
  }
}

⁡ ⁣ ⁣ ⁢/*
        * ) Why is the Java main method static?
        * Ans) It is because the object is not required to call a static method. If it
        * were a non-static method, JVM creates an object first then call main() method
        * that will lead the problem of extra memory allocation.
        * 
        */
⁡
