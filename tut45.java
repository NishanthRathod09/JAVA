class A {

  public void say_hello() {
    System.out.println("Hello A Class");
  }
}

class Anonymous_Class {

  public static void main(String[] args) {
    A a = new A() {

      //  Here this one will override the actual method of the class A and execute the Anonymous Class object method instead
      //   Anonymous Class object method has higher priority than Class A method
      public void say_hello() {
        System.out.println("Hello And Class");
      }
    };
    a.say_hello();
  }
}
