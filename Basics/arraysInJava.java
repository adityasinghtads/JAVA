import java.lang.reflect.Array;
import java.security.Key;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.JSpinner.NumberEditor;

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

    // to search into an array
    // this search only works on sorted arays
    char key = 'o';
    int foundItemindex = Arrays.binarySearch(vowels, key);
    System.out.println(Arrays.toString(vowels));
    System.out.println(foundItemindex);
    int position = foundItemindex + 1;
    System.out.printf("position is : ", position);

    // we can also sort in an array by giving both starting and ending point
    int starting = 1;
    int ending = 4;
    int found = Arrays.binarySearch(vowels, starting, ending, key);
    System.out.println(found);

    // if the search fails in binary search of sorted array
    // output is negative output
    int starting1 = 1;
    int ending2 = 2;
    int found1 = Arrays.binarySearch(vowels, starting1, ending2, key);
    System.out.println(found1);

    // to fill entire array using array.fill methods
    char vowels2[] = { 'a', 'b', 'c', 'd', 'e' };
    Arrays.fill(vowels2, 'x');
    System.out.println(Arrays.toString(vowels2));

    // Copy of arrays,
    int numbers[] = { 1, 2, 3, 4, 5 };
    int numbers1[] = { 1, 2, 3, 4, 5 };
    int copyOfNumbers[] = numbers;
    // int copyOfNumbers1[] = numbers1;

    Arrays.fill(numbers, 0);
    // Arrays in java are refrence types - it dont copy the array it points to same
    // address.
    System.out.println(Arrays.toString(numbers));
    System.out.println(Arrays.toString(copyOfNumbers));

    // to copy properly without making refrence.
    int copyOfNumbers1[] = Arrays.copyOf(numbers1, numbers1.length);
    Arrays.fill(numbers1, 9);
    System.out.println(Arrays.toString(numbers1));
    System.out.println(Arrays.toString(copyOfNumbers1));

    // to check/compares the arrays.

    int n[] = { '1', '2', '3', '4', '5' };
    int copyOfn[] = Arrays.copyOf(n, n.length);

    System.out.println(n == copyOfn); // this is false
    // to comapre we need to write.
    System.out.println(Arrays.equals(n, copyOfn)); // this is true

  }
}
