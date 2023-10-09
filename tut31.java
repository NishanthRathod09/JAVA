class Apple {
  public int a;
  public int b;

  // Default Constructor
  public Apple() {}

  // Parameterized Constructor
  public Apple(int g) {
    this.a = g;
  }

  // Parameterized Constructor
  public Apple(int a, int b, int c) {
    this.a = a;
    this.b = b + c;
  }
}

class Constructor {

  public static void main(String[] args) {
    Apple a = new Apple();
    System.out.println(a.a); // o/p:0
    System.out.println(a.b); // o/p:0
    System.out.println("*****");
    Apple b = new Apple(5);
    System.out.println(b.a);
    System.out.println(b.b);
    System.out.println("*****");
    Apple c = new Apple(89, 99, 55);
    System.out.println(c.a);
    System.out.println(c.b);
  }
}
