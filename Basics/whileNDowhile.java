public class whileNDowhile {
  public static void main(String[] args) {
    int number = 5;
    int mul = 1;
    while (mul <= 10) {
      System.out.printf("%d X %d = %d\n", number, mul, number * mul);
      mul++;
    }
  }
}

/*
 * - While loop first we give the condition and then the following program
 * -- Once the same is statisfied then the program occurs
 * -- Once the same is occured the updation takes place..
 ** Same as parts of forloop but process is different
 */

// DoWhile Loop

class doWhile {
  public static void main(String[] args) {
    int num = 8;
    int multi = 1;
    do {
      System.out.printf("%d X %d = %d \n", num, multi, num * multi);
      multi++;
    } while (multi <= 10);
  }
}

// For Loop is lot more common and frequently used in programing then While and
// Do while, where as there might be situations where there is senario that we
// need to have while and do while loop, when we need the iteration to first do
// then check the condition.
