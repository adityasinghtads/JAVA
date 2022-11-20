public class forLoopsJava {
  public static void main(String[] args) {
    /*
     * 4 Kind of Loops in Java
     * 
     * *For loop - TO repeat a set of statements over the given period of time when
     * the condition is matching.
     * Part 1: Initializing
     * Part 2: CHecking the condition
     * part 3: Loop body inside the body
     * Part 4: Updation part, updating the value of the variable.
     * 
     */
    // FOR LOOP
    for (int number = 1; number <= 10; number++) {
      System.out.println(number);
    }

    // Looping over an array.
    int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    for (int n = 0; n < num.length; n++) {
      System.out.println(num[n]);
    }

    // Sum of number using loop
    int sum = 0;
    for (int s = 0; s < num.length; s++) {
      sum += num[s];
    }
    System.out.println(sum);

    // Nested Loops
    int numbers = 5;
    for (int mul = 1; mul < 10; mul++) {
      System.out.printf("%d x %d = %d \n", numbers, mul, mul * numbers);
    }

    // Multiplication for 1 to 10
    for (int numb = 1; numb <= 10; numb++) {
      for (int mul = 1; mul <= 10; mul++) {
        System.out.printf("%d X %d = %d\n", numb, mul, numb * mul);
      }
    }

    // even numbers from 1 to 50
    for (int number = 1; number <= 50; number++) {
      if (number % 2 == 0) {
        System.out.println(number);
      }
    }

    // Using For loop in array to print or use the array functions in loop
    int yup[] = { 2, 3, 4, 5, 6, 6 };
    for (int yupe : yup) {
      System.out.println(yupe);
    }
    int su = 0;
    for (int upe : yup) {
      su += upe;
    }
    System.out.println(su);
  }
}
