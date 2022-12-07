public class staticJava {
  int roll = 0;
  int id = 0;
  static String college = "IIT"; // Static variable 

  // Constructor 
  staticJava(int r, int i){
    roll =r;
    id =i;
  }
  void display(){
    System.out.println(roll + " " + id + " " + college);
  }

  public static void main(String[] args) {
    staticJava heyjava = new staticJava(10, 20);
    heyjava.display();
  }
}
