interface A {
  int a = 55; // By Default this variable is "Final and Static"
  void say_hello(); // By Default this method is "public and abstract"
  void say_Bye();
}

class B implements A {

  public void say_hello() {
    System.out.println("Saying Hello");
  }

  public void say_Bye() {
    System.out.println("Saying Bye");
  }
}

class Interface_s {

  public static void main(String[] args) {
    System.out.println(A.a);
    B b=new B();
    b.say_hello();
    b.say_Bye();

  }
}
