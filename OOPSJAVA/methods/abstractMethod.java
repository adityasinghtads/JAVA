package methods;
abstract class demo {
  abstract void display();
}

public class abstractMethod extends demo{
  void display(){
    System.out.println("Abstract method");
  }
  public static void main(String[] args) {
    demo obj = new abstractMethod();
    obj.display();
  }
}


