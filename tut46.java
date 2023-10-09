abstract class Apple {

  public abstract void say_hello();
}

class Abstract_keyword_With_Anonymous_Class {

  public static void main(String[] args) {
    Apple a = new Apple() {

      public void say_hello() {
        System.out.println("Hello From Anonymous class using abstarct keyword");
      }
    };
    a.say_hello();
  }
}
