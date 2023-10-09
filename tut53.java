/*
 There are 3 types of interfaces
 1)Normal Interface:Interface with two or more methods
 2)Functional Interface:Interface with one methods (***)
 3)Marker Interface:Interface with no methods
 */

//   1)Normal Interface:Interface with two or more methods
interface Normal {
  void first1();
  void two();
  void three();
}

//  2)Functional Interface:Interface with one methods (***)
interface Functional extends Normal {
  void first2();
}

//  3)Marker Interface:Interface with no methods
interface Marker extends Functional {}

class Interface_method_setting implements Marker {

  public void first1() {
    System.out.println("I am first1 11");
  }

  public void first2() {
    System.out.println("I am first2 12");
  }

  public void two() {
    System.out.println("I am two 2");
  }

  public void three() {
    System.out.println("I am three 3");
  }
}

class Type_of_Interfaces {

  public static void main(String[] args) {
    Interface_method_setting i = new Interface_method_setting();
    i.first1();
    i.first2();
    i.two();
    i.three();
  }
}
