import javax.sound.sampled.SourceDataLine;

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
    int fact =1;
    for(int i=1; i<=n; i++){
      fact = fact*n;
    }
    System.out.printf("Fact of %d is : %d",n, fact);
  }
}

class callingClass{
  public static void main(String[] args) {
    // Normal calling without annymous 
    HeyYouu yupee = new HeyYouu();
    yupee.fact(10);

    //Anonymous function 
    new HeyYouu().fact(12);
  }
}
// anonymous means nameless
