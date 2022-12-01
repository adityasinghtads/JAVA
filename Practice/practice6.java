class practice6 {
  int siri = 19;
  int google = 22;
  String vedu = "Vedanta";
}

class yupe {
  int rem = 0;
  int vem = 0;

  void takeResponse(int r, int n) {
    rem = r;
    vem = n;
  }

  void displayOfThings() {
    System.out.println(rem + " " + vem);
  }
}

class holo {
  public static void main(String[] args) {
    // declaring the object of above class
    practice6 p1 = new practice6();
    System.out.println(p1.siri);
    System.out.println(p1.google);
    p1.siri = 100; // This will update in the above class.
    System.out.println(p1.siri);

    yupe y1 = new yupe();
    y1.takeResponse(100, 100);
    y1.displayOfThings();

  }
}

class wipra {
  int r = 0;
  int w = 0;
}

class wti {
  int tem = 0;
  int yem = 0;

  void updating(int v, int u) {
    tem = v;
    yem = u;
  }

  void showCase() {
    System.out.println(tem + " " + yem);
  }
}

class infy {
  public static void main(String[] args) {
    wipra lock1 = new wipra();
    lock1.r = 10;
    System.out.println(lock1.r);

    wipra lock2 = new wipra();
    System.out.println(lock2.r);

    wti lock3 = new wti();
    lock3.updating(10, 10);
    lock3.showCase();

    wti lock4 = new wti();
    lock4.showCase();
  }
}

// writing an addition funtion using initializing through methods.

class add {
  int first = 0;
  int second = 0;

  void sum(int i, int n) {
    first = i + n;
    second = i - n;
  }

  void displayPrint() {
    System.out.printf("Addition: %d \n", first);
    System.out.printf("Subtraction: %d", second);
  }
}

class sum {
  public static void main(String[] args) {
    add a1 = new add();
    a1.sum(10, 5);
    a1.displayPrint();
  }
}

class mul {
  int first = 0;
  int second = 0;
}

class result {
  public static void main(String[] args) {
    mul m1 = new mul();
    m1.first = 10;
    m1.second = 1;
    int multi = 0;
    multi = m1.first * m1.second;
    System.out.println(multi);

    mul m2 = new mul();
    m2.first = 2;
    m2.second = 2;
    int pli = 0;
    pli = m2.first * m2.second;
    System.out.println(pli);
  }
}

// practicing anonymous function

class cali {
  int fact = 1;

  void newDeck(int p) {
    for (int i = 1; i <= p; i++) {
      fact = fact * i;
    }
    System.out.println(fact);
  }
}

class itsMain {
  public static void main(String[] args) {
    // normal object
    cali ii = new cali();
    ii.newDeck(3);

    // anonymous object
    new cali().newDeck(4);

  }
}

// Real time example for object methods

class account {
  int custom_id = 0;
  String name = new String();
  int amt = 0;

  void insertData(int c, String n, int a) {
    custom_id = c;
    name = n;
    amt = a;
  }

  void displayDetails() {
    System.out.println("Custom_id: " + custom_id);
    System.out.println("Name of Custom : " + name);
    System.out.println("Amt: " + amt);
  }

  void withDraw(int w) {
    if (w < amt) {
      amt = amt - w;
      System.out.println("Withdrawn");
      System.out.println("Avlbe amt :" + amt);
    } else {
      System.out.println("Insufficient balance");
    }
  }

  void checkBalance() {
    System.out.println(amt);
  }

  void depositAmt(int dep) {
    amt = amt + dep;
    System.out.println("Updated Amt : " + amt);
  }

}

class intssMains {
  public static void main(String[] args) {

    account a1 = new account();
    a1.insertData(12345, "Aditya", 10000);
    a1.displayDetails();
    a1.withDraw(12000);
    a1.withDraw(1200);
    a1.checkBalance();
    a1.depositAmt(1000);
    a1.displayDetails();

    new account().insertData(1010101, "vedanta", 9000);

  }
}