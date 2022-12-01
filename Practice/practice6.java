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


class mul{
  int first = 0;
  int second =0;
}

class result{
  public static void main(String[] args) {
    mul m1 = new mul();
    m1.first =10;
    m1.second=1;
    int multi = 0;
    multi = m1.first * m1.second;
    System.out.println(multi);


    mul m2 = new mul();
    m2.first =2;
    m2.second = 2;
    int pli = 0;
    pli =m2.first * m2.second;
    System.out.println(pli);
  }
}