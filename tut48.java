// class-class -> extends
// class-interface -> implements
// Interface-Interface -> extends
interface A {
  void hi();
}

interface B extends A {
  void hello();
}

interface C {
  void bye();
}

// Multiple Inheritance
class Alpha implements B, C {

  public void hi() {
    System.out.println("Hi");
  }

  public void hello() {
    System.out.println("Hello");
  }

  public void bye() {
    System.out.println("bye");
  }
}

class Multiple_Interface_And_Multiple_Inheritance {

  public static void main(String[] args) {
    /* Alpha app = new Alpha();
    app.hi();
    app.hello();
    app.bye(); */
    A obj;
    obj = new Alpha();
    obj.hi();
    // obj.bye();
  }
}
