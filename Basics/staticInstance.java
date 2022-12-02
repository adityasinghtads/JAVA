
public class staticInstance {
  public static void main(String[] args) {
    // Calling static function.
    int ipro = mathsAdd(10, 20);
    System.out.println(ipro);
    instanceMe itsMe = new instanceMe();
    int tcs = itsMe.mathsAdd(10, 15);
    System.out.println(itsMe);
    System.out.println(tcs);

  }

  static int mathsAdd(int r, int w) {
    return r + w;
  }
}

class staticMe {

}

class instanceMe {
  int mathsAdd(int w, int z) {
    return w + z;
  }
}
