package ArrList;

import java.util.ArrayList;
import java.util.Collections;


public class arrlist {
    static ArrayList<String> cars = new ArrayList<String>();    
    public static void main(String[] args) {    
        // Intro to arraylist in JAva. 
        arrListIntro();
        arrListLoop();
        //collections class in java. 
        collectArrList();
    }

    static void ArrListt(){
        ArrayList<Integer> hey = new ArrayList<Integer>();
        hey.add(19);
        System.out.println(hey);
    }

    static void collectArrList(){
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(10);
        number.add(2);
        number.add(30);
        number.add(14);
        number.add(50);
        System.out.println(number);
        Collections.sort(number);
        System.out.println(number);


    }

    static void arrListLoop(){
        cars.clear();
        cars.add("wip");
        cars.add("koll");
        cars.add("List");
        //Looping in arrlist. 
        for (int i = 0; i < cars.size(); i++) {
           // cars.get(i);
            System.out.println(cars.get(i));
        }
        //using for-each loop 
        for (String i : cars) {
            System.out.println(i);
        }
    }

    static void arrListIntro(){
                // intro to array list  
                cars.clear();
                cars.add("volvo");
                System.out.println(cars);
                String abc = cars.get(0); // Refers to an index number. 
                System.out.println(abc);
        
                // can set the index to a particular value by updating 
                cars.set(0, "wipro");
                System.out.println(cars);
                //Removing an element from array list 
                cars.remove(0);
                System.out.println(cars);
                cars.add(0, "abc");
                System.out.println(cars);
        
                cars.clear();
                System.out.println(cars);
                
                // Diff between remove and clear. 
                // remove() removes the element at the index
                // clear() removed all element. 
    }
}


/*
 * Real time application of Array list in a java program. 
 * * 
 */
