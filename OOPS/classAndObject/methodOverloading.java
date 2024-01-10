package Java.OOPS.classAndObject;



public class methodOverloading {
    public static void main(String[] args) {
        demo d = new demo();
        int a = d.add(1,20);
        int b = d.add(3, 4,5);
        double c = d.add(3.41, 2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}

class demo{

    public int add(int n1, int n2){
        return n1+n2;
    }   

    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }

    public double add(double n1, int n2){
        return n1+n2;
    }
}