import java.util.Arrays;

public class practiceTillnow {
  public static void main(String[] args) {
    System.out.println("Hey hello lets start the practice.");
    // making funtion
    heyFunction();
    practiceTillnow wip = new practiceTillnow();
    wip.nonStatic();
  }

  static void heyFunction() {
    System.out.println("Hey its into the function ");
  }

  void nonStatic() {
    System.out.println("This is a nonstatic function ");
  }
}

class conditionalStatements {
  public static void main(String[] args) {
    HeyIfElse(2);
  }

  static void HeyIfElse(int i) {
    if (i % 2 == 0) {
      System.out.println("The number given is even");
    } else {
      System.out.println("Its odd");
    }
  }

}

class loops {
  public static void main(String[] args) {
    itsLooping();
  }

  static void itsLooping() {
    int myArr[] = { 1, 2, 3, 4, 5, 6, 7 };
    for (int i = 0; i < myArr.length; i++) {
      System.out.println(i + 1);
    }
  }

}

class arrays {
  public static void main(String[] args) {
    // heyArray();
    // char vowels[] = new char[5];
    // vowels[1] = 'a';
    // vowels[2] = 'e';
    // vowels[3] = 'i';
    // vowels[4] = 'o';
    // vowels[5] = 'u';
    // System.out.println(Arrays.toString(vowels));
    heyarr();
    sortingArr();
  }

  static void heyArray() {
    // declaring the array
    int array1[] = { 1, 2, 3, 4, 5, 6 };
    System.out.println(array1);
    System.out.println(Arrays.toString(array1));
    for (int i : array1) {
      System.out.println(i);
    }

    // another way of declaring an array

    System.out.println(array1.length);

    // to sort the array
    // to make a copy
    Arrays.copyOf(array1, 2);
    System.out.println(array1);
  }

  static void heyarr() {
    int myarr[] = { 1, 2, 3, 4, 5, 6, 7 };
    System.out.println(Arrays.toString(myarr));

    int copyarr[] = Arrays.copyOf(myarr, myarr.length);
    System.out.println(Arrays.toString(copyarr));

    System.out.println(Arrays.toString(copyarr));

    copyarr[2] = 2;
    System.out.println(Arrays.toString(myarr));
    System.out.println(Arrays.toString(copyarr));

  }

  static void sortingArr() {
    int hello[] = { 4, 3, 2, 1 };
    System.out.println(Arrays.toString(hello));
    Arrays.sort(hello);
    System.out.println(hello);
    System.out.println(Arrays.toString(hello));
  }
}


