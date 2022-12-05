
/*
 * Instance Method - Non static method. 
 * its mandatory to create an object before calling. 
 * 
 * Two ypes of instance methods 
 * == Accessor Method == getters -- returns value of private fields  
 * == Mutator Method  == Setters/modifiers. -- sets te value of private field. 
 */

public class settersGetters {
  private int roll;
  private String name;

  public int getRoll() {
    return roll;
  }

  public void setRoll(int roll) {
    this.roll = roll;
  }

  public String getString() {
    return name;
  }

  public void display() {
    System.out.println("Roll No:" + roll);
    System.out.println("Student Name: " + name);
  }

  public static void main(String[] args) {
    settersGetters s1 = new settersGetters();
    s1.setRoll(10);
    s1.getRoll();
    System.out.println(s1.getRoll());
    s1.name = "Aditya";
    s1.getString();
    s1.display();
  }
}
