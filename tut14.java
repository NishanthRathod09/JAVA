class Greet {
  // Varible of Greet
  public int a = 56;

  //   Method of Greet
  public void Hello() {
    System.out.println("Hello,Hi");
  }
}

class Calculator {

  // Method of Calculator
  public int add(int a, int b) {
    int c = a + b;
    return c;
  }
}

class Creating_Object {

  public static void main(String[] args) {
    // Creating an object of Greet
    Greet g = new Greet();
    // Accessing the varible of greet
    int b = g.a;
    System.out.println(b);
    // Accessing the Method of greet
    g.Hello();
    System.out.println("Nishanth");

    // Creating an object of Calculator
    Calculator c = new Calculator();

    // Accessing the Method of Calculator
    System.out.println(c.add(5, 9));
  }
}
