
/*
 * *** Using object and main within the class 
 */
class oopsJava {

  int id = 12;
  String name = "Aditya";

  public static void main(String[] args) {
    oopsJava s1 = new oopsJava();
    System.out.println(s1.id);
    System.out.println(s1.name);

  }
  
}
/*
 * Main outside the class
 */

class student {
  int roll = 10;
  String name = "dhabraj";
}

class student1 {
  public static void main(String[] args) {
    student s2 = new student();
    System.out.println(s2.roll);
    System.out.println(s2.name);
  }
}
