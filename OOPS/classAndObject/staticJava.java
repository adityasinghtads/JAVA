package Java.OOPS.classAndObject;

public class staticJava {

    String company;
    int price;
    static String type;

    public static void main(String[] args) {

        staticJava Obj1 = new staticJava();
        staticJava Obj2 = new staticJava();

        Obj1.company = "Apple";
        Obj2.price = 500;
        staticJava.type = "Smart";

        staticJava.type = "new";
        
        System.out.println(staticJava.type);

        System.out.println(staticJava.type);

        // When it comes to static method in Java, we can call an static method in Java just using the class name 

    }

    static void test(){
        System.out.println(" In test static method");
    }

}


class Hello  {
    
    public static void main(String[] args) {
        // Accessing Static Variable using Class Name
        staticJava.test();
    }
    
}