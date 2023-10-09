class A {

  public void say_hello() {
    System.out.println("Hello From A Class");
  }

  //   Inner Class
  static class B {

    public void say_hello() {
      System.out.println("Hello From B Class");
    }
  }
}

class Inner_Class {

  public static void main(String[] args) {
    A a = new A();
    a.say_hello();
    // object of non static class
    // A.B b = a.new B();
    // b.say_hello();

    // object of static class
    A.B c = new A.B();
    c.say_hello();
  }
}
