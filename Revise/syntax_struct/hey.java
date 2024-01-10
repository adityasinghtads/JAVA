public class hey {

    static int static_var= 10;
    public static void main(String[] args) {
        int inst_var = 11; 
        System.out.println(inst_var);
        //goToLocalVarFunc();
        // Writing static in main function 
        System.out.println(static_var);

        // typesDatatypes();
       // controlStatements();
        loopsInJava();
    }

    
    static void loopsInJava(){
        // for loop. 
        for(int i = 0; i<10; i++){
            System.out.println(i);
        }
        // while Loops.
        int while_i = 9;
        while(while_i >10){
            System.out.println(while_i);
            while_i++;
        }

        // do while loop 
        int do_i =1;
        do{
            System.out.println(do_i);
            do_i ++;
        }while(do_i > 10);
    }



    static void controlStatements(){
        // defining if a number is even or odd. 
        int number = 10;
        if(number%2==0){
            System.out.println("The number is evem.");
        }else{
            System.out.println("The number is false.");
        }

        // Defining switch case. 

        switch(number){
            case 10 :
            System.out.println("Wow! its 10");
            break;

            case 11 :
            System.out.println("Wrong Number");
            break;

            default:
            System.out.println("Not in number");
        }   

    }


    // Types of datatypes 
    static void typesDatatypes(){
        boolean isTrue = true; 
        System.out.println(isTrue);

        short s = 2;
        System.out.println(s);

        int i = 10000;
        System.out.println(i);

        long l = 12121212;
        System.out.println(l);
    }   
    

    static void goToLocalVarFunc(){
        //local variable 
        int local_var = 12;
        System.out.println(local_var);

        // writing static in method 
        System.out.println(static_var);
    }
}
