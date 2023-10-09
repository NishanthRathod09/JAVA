// Go to "Practice_Package_Folder.Access modifiers"
class A {
  protected int a = 5;
}

// Sub Class of A
class B extends A {
  public int d = 5 + a;
}

class Access_modifiers {

  public static void main(String[] args) {
    B b = new B();
    System.out.println(b.a);
    System.out.println(b.d);
  }
}
