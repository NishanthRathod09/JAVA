@Deprecated // Annotations
class A {

  public void show() {
    System.out.println("Hi From A");
  }
}

class B extends A {

  @Override // Annotations
  public void show() {
    System.out.println("Hi From B");
  }
}

class Annotations {

  public static void main(String[] args) {
    B b = new B();
    b.show();
  }
}
