public class practice7 {
  public static void main(String[] args) {
    System.out.println("Hey This is practice 7 ");
    System.out.println("Practicing - Methods in java. ");
  }
}

/*
 * Using object/method and main within the class
 */

class mainClass {
  int tcs = 30;
  String tcs1 = "Aditua";

  public static void main(String[] args) {
    mainClass yeClass = new mainClass();
    System.out.println(yeClass.tcs);
    System.out.println(yeClass.tcs1);
    yeClass.tcs = 100;
    System.out.println(yeClass.tcs);
  }
}

/*
 * Usng method and main outside in other class
 */

class otherClass {
  int adi = 88;
  String heyYou = "Hey You";

  static void tj() {
    System.out.println("hey i know you");
  }

  int harsh() {
    return 10;
  }
}

class thisClass {
  // making an object of otherClass

  public static void main(String[] args) {
    otherClass we = new otherClass();
    System.out.println(we.adi);
    System.out.println(we.heyYou);

    we.harsh();
    System.out.println(we.heyYou);
  }

}

class HeyYouu {
  void fact(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact = fact * n;
    }
    System.out.printf("Fact of %d is : %d", n, fact);
  }
}

class callingClass {
  public static void main(String[] args) {
    // Normal calling without annymous
    HeyYouu yupee = new HeyYouu();
    yupee.fact(10);

    // Anonymous function
    new HeyYouu().fact(12);
  }
}
// anonymous means nameless

// Static function/Method main use case is we can call the same without making a
// object.

class staticInJava {
  int roll = 0;
  int id = 0;
  static String college = "IIT"; // Static variable

  // Constructor
  staticInJava(int r, int i) {
    roll = r;
    id = i;
  }

  void display() {
    System.out.println(roll + " " + id + " " + college);
  }

  public static void main(String[] args) {
    // staticJava heyjava = new staticJava(10, 20);
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

class staticfunc {
  static void HeyJava() {
    System.out.println("Hey Java");
  }

  public static void main(String[] args) {
    staticfunc.HeyJava();
    System.out.println("hey");
  }
}

// we can call static function/method with creating an object.

⁢/*
  * ) Why is the Java main method static?
  * Ans) It is because the object is not required to call a static method. If it
  * were a non-static method, JVM creates an object first then call main() method
  * that will lead the problem of extra memory allocation.
  * 
  */
⁡
