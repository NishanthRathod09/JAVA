@FunctionalInterface //   @FunctionalInterface this thing can be declared only when the interface is having the 1 method
interface A {
  //   void show();
  //   void show(int x);
  //   void show(int x, int y);
  int show(int x, int y);
}

class Functinal_Interfaces_And_Lamda_Functions {

  public static void main(String[] args) {
    /*  A a = new A() {

      public void show() {
        System.out.println("Show Time...");
      }
    }; */

    // Lamda function
    /*  A a= () -> System.out.println("show Time...");
    a.show();   */

    // A a= (x)-> System.out.println("Show time is :"+x);
    /* A a= (x,y)->{System.out.println("Show Timings are:"+x+" And "+y);};
    a.show(8,12);   */

    // A a = (x, y) -> {return x + y;};
    A a = (x, y) -> x + y;
    System.out.println(a.show(6, 7));
  }
}
