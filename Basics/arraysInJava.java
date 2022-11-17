import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Vector;

public class arraysInJava {
  public static void main(String[] args) {
    // declaring a array
    char vowels[] = new char[5];

    // inserting in array
    vowels[0] = 'a';
    vowels[1] = 'e';
    vowels[2] = 'i';
    vowels[3] = 'o';
    vowels[4] = 'u';

    // printing out the array
    System.out.println(vowels);

    // Printing out each element
    System.out.println(vowels[1]);

    // Printing the array using Arrays.toString()
    System.out.println(Arrays.toString(vowels));

    // Decalring and defining in one line
    char vowels1[] = { 'e', 'u', 'a', 'i', 'o' };
    System.out.println(Arrays.toString(vowels1));

    // Updating an array at a particular index
    vowels[2] = 'b';

    // Length of an array
    System.out.println(vowels.length);

    // Soritng an unsorted array
    Arrays.sort(vowels); // begins from first array and sorts.
    System.out.println(Arrays.toString(vowels));

    // Sorting in some range - defining an starting and ending index
    char newVowels[] = { 'c', 'b', 'a', 'd', 'e' };
    int startingIndex = 1;
    int endingIndex = 4; // ending index is not inclusive
    Arrays.sort(newVowels, startingIndex, endingIndex);
    System.out.println(newVowels);
    System.out.println(Arrays.toString(newVowels));

  }
}
