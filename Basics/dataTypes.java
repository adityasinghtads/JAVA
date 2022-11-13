/*
 * Data types in Java : 
 * ** Primitive and Non Primitive(refrence). 
 * --- Primitive eg: int ( 8 types)
 * --- Refrence eg: refrenceto an address 
 * 
- 
 * 
 */

class dataTypes {
  public static void main(String[] args){
    /*
     * Primitive types are 8 types 
     */
    // Integer types 
    byte aSingleByte =100;
    short aSmallNumber = 20000; 
    int anInteger = 2113344556;
    long aLargeNumber = 9222222222222222L;

    // Decimal types 
    double aDouble = 1.797989898; 
    float aFloat = 3.0498F;

    //boolens
    boolean isWeekend = false;
    boolean isWorkday = true;
    
    //characters 
    char copyrightsymbol = '\u00A9';

    System.out.println("This is the copyright symbol " + copyrightsymbol);
  
    
/* 
* Type conversion can be implicit or explicit : 
-- Expiclit conversion can also lead to loss of data 
* 
*/

// Int ->double 
    int num1 = 5;  
    double num2=num1;
    System.out.println(num2);
    System.out.println(num1);

    // Double -> int , cant be done directly we need to add the int type before converting 

    double n1=9.8;
    System.out.println(n1);
    // Output = 9.8 
    int n2 = (int)n1 ; // This will work and will change it to int accordingly 
    // Output = 9 
    System.out.println(n2);

  }
    
}



