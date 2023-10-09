class A {

  // Every Class extents Object class by default
  // Every Constructor in java as a super() method by default
  // Parameterized constructor
  public A() {
    super();
    System.out.println("Constructor A");
  }

  // Non-Parameterized constructor
  public A(int a) {
    super();
    System.out.println("Constructor A Variable:" + a);
  }
}

// Inheritance
class B extends A {

  public B() {
    super(); // This one call the non-parameterized constructor of super class(i.e Class A)
    //super(99); // This one call the parameterized constructor of super class(i.e Class A)
    System.out.println("Constructor B");
  }

  public B(int b) {
    // super();  // This one call the non-parameterized constructor of super class(i.e Class A)
    //super(b); // This one call the parameterized constructor of super class(i.e Class A)
    //this();  // this() will excecute the non-parameterized constructor of only current class
    System.out.println("Constructor B Variable:" + b);
  }
}

class Super_And_This {

  public static void main(String[] args) {
    // B b = new B(); //calling non-parameterized constructor of class B
    B b = new B(5); // calling parameterized constructor of class B
  }
}
