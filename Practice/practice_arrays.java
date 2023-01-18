import java.lang.reflect.Array;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.function.DoubleToIntFunction;

public class practice_arrays {
    public static void main(String[] args) {
        System.out.println("Hey this is Arrays is Java. ");
        //arraysInJava();
        wipro();
    }

    static void arraysInJava() {
        char vowel[] = new char[5];
        vowel[0] = 'a';
        vowel[1] = 'b';
        vowel[2] = 'c';
        vowel[3] = 'd';
        vowel[4] = 'e';
        // vowel[5] = 'f';
        // if exceeding we get out of bound error.
        System.out.println(vowel);
        System.out.println(vowel[1]);
        System.out.println(Arrays.toString(vowel));
        char vowell[] = { 'a', 'b', 'c', 'd', 'e' };
        System.out.println(vowell);
        System.out.println(Arrays.toString(vowell));
        System.out.println(vowell.length);
        Arrays.sort(vowel); // Sorts the array
        // searching in arrays as it works only in sorted arrays
        char key = 'a';
        int indexfound = Arrays.binarySearch(vowel, key);
        System.out.println(Arrays.toString(vowel));
        System.out.println(indexfound + 1);
        System.out.println("Position is : " + indexfound + 1);
        // in case search fails the result of binary search is a negative number

        // making of arrays
        int numb[] = { 1, 2, 3, 4 };
        int numb1[] = { 1, 2, 3, 4 };
        int copyOfNumb[] = Arrays.copyOf(numb, numb.length);
        System.out.println(Arrays.toString(copyOfNumb));
        // this is the right way of copying array in java

        // to compare array
        System.out.println(Arrays.equals(numb, numb1));
        // result for this will be true.

        // Arrays of strings 

        //declaring arrays of strings
        String[] hey1 = new String[]{"Aditya","Dhanraj"};
        System.out.println(hey1[1]);
    }

    static void wipro() {
        //declaring arrays of strings
        String[] hey1 = new String[]{"Aditya","Dhanraj"};
        System.out.println(hey1[1]);
        System.out.println(hey1); // throws error 
        for (int n=0 ; n<2; n++){
            System.out.print(hey1[n]+ " ");
        }
    }
}
