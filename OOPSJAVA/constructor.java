import java.nio.file.NotLinkException;

import javax.sound.midi.Soundbank;

public class constructor {

}

/*
 * Similar to method, called when instance of class is created.
 * Every time we call new(), it calls canstructor, in case we dont give any in
 * class, it will call defualt constrcutor
 * 
 * - Why called as constructor - Becoz it constructs values of while object
 * creation.
 * 
 * Rules:
 * -- Constructor name must be same as class name
 * -- No explicit return type.
 * -- cannot be abstract, static, final and synchronized.
 * 
 * 2 types -
 * -- Default (No arg)
 * -- Parameterized
 */

class defualtCons {
  defualtCons() {
    System.out.println("Hi Defualt constructor");
  }

  public static void main(String[] args) {
    defualtCons hi = new defualtCons();
  }
}

// Why defualt constructor -- To provide default alues like 0, null etc..

class student {
  int id;
  String name;

  void display() {
    System.out.println(id + name);
  }

  public static void main(String[] args) {
    student s1 = new student();

    student s2 = new student();

    s1.display();
    s1.display();

    s1.id = 10;
    s1.name = "Aviraj";

  }

}

// Here in this above program we are not creating any new constructor, so it
// takes the default and returns the same..

// Parameterized

class student2 {
  int id;
  String name;

  student2(int i, String n) {
    id = i;
    name = n;
  }

  void display() {
    System.out.println(id + name);
  }

  public static void main(String[] args) {
    student2 gg = new student2(111, "Thakur");
    gg.display();
  }
}

// In Java constructor is just like method, just without return type.

/*
 * Constructor Overloading
 * ---
 */