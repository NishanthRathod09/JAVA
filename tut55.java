/*
 * We have two krywords
 * 1)throw  2)throws
 * throw: This is used for thow the exception explicitly by the programmer
 */

class Division {

  // This "throws" keyword used to throw the mentioned exception
  //   In this we are not handling the Exception
  //   "Throws" not used in handling the Exception
  public int div(int a, int b) throws ArithmeticException {
    int c = a / b;
    return c;
  }
}

class Area_of_Circle {

  public double area(int r) {
    double a = r * r * Math.PI;
    if (r == 0 || r < 0) {
      System.out.println("R==0 or R<0 Error:");
      //   this is used thow the "Object" of Exception
      //   In this we are handling the Exception
      //   "Throw"  used in handling the Exception
      throw new ArithmeticException("I am Negitive R");
    }
    return a;
  }
}

// This is Creating a Own Exception
class My_Own_Exception extends Exception {

  // To Show the Exception we must use the Constructor
  public My_Own_Exception(String a) {
    System.out.println("This is My_Own_Exception Nishanth Rathod");
    System.out.println("Constructor Message:" + a);
  }
}

class Square_Area {

  public int square(int s) {
    int as = s * s;
    try {
      if (s <= 0) {
        throw new My_Own_Exception("RAMAVATH NISHANTH RATHOD");
      }
      return as;
    } catch (Exception e) {
      System.out.println(e);
      return 0;
    }
  }
}

class Exception_Throw_And_Throws_Keyword {

  public static void main(String[] args) {
    Division d = new Division();
    // d.div(5, 0);
    Area_of_Circle a = new Area_of_Circle();
    // a.area(0);
    Square_Area s = new Square_Area();
    s.square(0);
  }
}
