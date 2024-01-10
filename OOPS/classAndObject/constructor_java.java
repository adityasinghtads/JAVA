package Java.OOPS.classAndObject;

public class constructor_java {

    String name;


    // Construtor name will always be same as class name. 
    constructor_java(){
        int adi = 10;
        System.out.println("In constructor");
        System.out.println(adi);
    }

    public constructor_java(int wipro, String tcs){
        int heyWipro = wipro;
        String heyTcs = tcs;
    }

    public static void main(String[] args) {
        constructor_java hey = new constructor_java();

        System.out.println(hey);

        constructor_java hey1 = new constructor_java();
        System.out.println(hey1);

        constructor_java heyhey = new constructor_java(100,"Lici");

        
        
    }
}
