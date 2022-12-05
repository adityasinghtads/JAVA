package objects;

class cal{
  void fact(int n){
    int fact =1;
    for(int i=1; i<=n; i++){
      fact = fact * i;
    }
    System.out.println("factorial is :"+ fact);
  }
}

public class anonymousObject {
  public static void main(String[] args) {
    // calling through refrence 
    cal c1 = new cal();
    c1.fact(10);

    // through anonymous object. 
    new cal().fact(2);
  }
}



// anonymousObject means nameless 
// - Obejct which has no refrence - used at time of object creation. 
// - We can only use this once. 


// Creating multiple objects by one type only. 

class infi{
  void itsMe(){
    System.out.println("Its me Aditya");
  }
}
class itsMaine{
  public static void main(String[] args) {
    infi i1 =new infi(), i2=new infi();
    i1.itsMe();
    i2.itsMe();
  }
}

