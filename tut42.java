class A {

  public void show1() {
    System.out.println("I am Show From A");
  }
}

class B extends A {

  public void show2() {
    System.out.println("I am Shot From B");
  }
}

class UpCasting_And_DownCasting {

  public static void main(String[] args) {
    // UpCasting this exits implicitly in java
    A obj1 = (A) new B();
    obj1.show1();
    // obj1.show2();

    // DownCasting
    B obj2 = (B) obj1;
    obj2.show1();
    obj2.show2();
  }
}
