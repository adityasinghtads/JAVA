import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {
        System.out.println("Hey");
        MyJavaPractice();
        MyNewClass kk = new MyNewClass();
        // kk.inNewClass();
        // kk.ifElse();
        // kk.switchCase();
        kk.userInputs();
    }

    static void MyJavaPractice() {
        System.out.println("Hey practicing till now");
    }
}

class MyNewClass {
    void inNewClass() {
        System.out.println("Hey Aditya....");
    }

    void ifElse() {
        int hihi = 1;
        System.out.println(hihi);
        long hehello = 1;
        System.out.println(hehello);
        if (hihi == 1) {
            System.out.println("hehehheh");
        } else {
            System.out.println("Its in else state");
        }
    }

    void switchCase() {
        int hey = 2 * 4;
        System.out.println(hey);

        switch (hey) {
            case 6:
                System.out.println("Hey = 6");
                break;
            case 8:
                System.out.println("Hey = 8");
                break;
            default:
                System.out.println("Not in switch case");
                break;
        }
    }

    void userInputs() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name : ");
        String name = scan.nextLine();
        System.out.println(name);
        scan.close();

        Scanner itsint = new Scanner(System.in);
        System.out.println("Pls enter an number :");
        int number = itsint.nextInt();
        itsint.nextLine();// cleaning up extra space
        System.out.println(number);
        itsint.close();
    }
}