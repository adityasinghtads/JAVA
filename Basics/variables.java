import javax.sound.midi.SysexMessage;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
import javax.swing.plaf.synth.SynthSpinnerUI;

public class variables {

  static int age1 = 99;
  static int age2; // Java sets static value to 0 when declared and not given any value.

  public static void main(String[] args) {
    System.out.println("We are learning variables");

    // Declarig a variable local to the method
    int age = 23;

    System.out.println(age);
    System.out.println(age1);
    System.out.println(age2);

    System.err.println();
  }

}

/*
 * Naming convention in Java -
 * Dont start with Number Eg: int 0age; etc
 * Dont have space in betweeen the variable name eg: int my age;
 * We can use _ and $ to start the variable name but this is not advisable
 * Dont name as single letter/alphabets as names for variables.
 * 
 * *** Use of camelcase is good and it is a good practice***
 * Eg: int myAge;
 * 
 */
