public class practiceTillnow {
  public static void main(String[] args) {
    System.out.println("Hey hello lets start the practice.");
    // making funtion
    heyFunction();
    practiceTillnow wip = new practiceTillnow();
    wip.nonStatic();
  }

  static void heyFunction() {
    System.out.println("Hey its into the function ");
  }

  void nonStatic() {
    System.out.println("This is a nonstatic function ");
  }
}


class conditionalStatements{
  public static void main(String[] args) {
    HeyIfElse(2);
  }

  static void HeyIfElse(int i){
    if (i%2==0){
      System.out.println("The number given is even");
    }else{
      System.out.println("Its odd");
    }
  }

}


class loops{
  public static void main(String[] args) {
    itsLooping();  
  }

  static void itsLooping(){
    int myArr[] = {1,2,3,4,5,6,7};
    for (int i = 0; i < myArr.length; i++) {
      System.out.println(i+1);
    }
  }

}

