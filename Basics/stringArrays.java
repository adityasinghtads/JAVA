public class stringArrays {
    // declaring a string
    public static void main(String[] args) {
        String Name = "Aditya Dhanraj Singh";
        System.out.println(Name);

        System.out.println(" we are going into String Arrays.");
        stringArraysJava();

        // There are many other array operations, used in other file for refresnce. 
    }

    static void stringArraysJava() {
        System.out.println("Hey this is me ");
        // array of strings in Java
        String[] my = new String[] { "Aditya", "Singh" };
        System.out.println(my);
        for (int i = 0; i < my.length; i++) {
            System.out.println(my[i]);
        }
        // Above menthod is to print and String array
        int[] intArray = new int[] { 1, 2, 3, 4, 56, 9 };
        System.out.println("The above is an Interger array ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // other ways of using arrays in java
        String[] use = { "TADS", "Utrade" };
        use[1] = "Canada ";
        for (int i = 0; i < use.length; i++) {
            System.out.println(use[i]);
        }
    }
}
