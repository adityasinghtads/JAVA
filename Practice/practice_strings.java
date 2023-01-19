public class practice_strings {
    public static void main(String[] args) {
        stringsInJava();
    }

    static void stringsInJava() {
        String name = "Aditya Singh";
        System.out.println(name);
        // length of string
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.isEmpty());

        String str1 = new String("TADS");
        String str2 = new String("TADS");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        System.out.println(str1.replace("TA", "ta"));
        System.out.println();

        System.out.println(str1.contains("DS"));

        // Java returns true and false.
    }
}