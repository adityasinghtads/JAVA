import javax.sound.sampled.SourceDataLine;

/*
 *Initialize through refrence
 */

class student {
  int roll ;
  String name;
}

public class objectInitialize{
  // creating an object 
public static void main(String[] args) {
  student s1 = new student();
  s1.roll = 100;
  s1.name = "Aditya";

  System.out.println(s1.roll);
  System.out.println(s1.name);
}

}


/*
 * Initialize through methods 
 */


 class wipro{
  int emp;
  String prev;

  void hello(int r, String n){
    emp = r; 
    prev = n;
  }

  void display(){
    System.out.println(emp + " "+  prev);
  }
 }

 class tcs{
  public static void main(String[] args) {
    wipro emp1 = new wipro();
    emp1.hello(129,"Aditya");
    emp1.display();
  }
 }
