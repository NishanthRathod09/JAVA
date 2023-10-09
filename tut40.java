// We can use the final keyword in 3 ways
// 1)Variable   -> make variable constant
// 2)method     -> stop method @override
// 3)class      -> stop inheritance

class Apple {
  //here Final is like "Constant" we cannot change the value
  final int num = 55;

  //   num=11;

  public void say_apple() {
    System.out.println("I am Apple");
  }

  //   By adding final to the method we are stopping the(" override")
  public final void say_alphabet() {
    System.out.println("I am Aplhabet A");
  }
}

// By adding Final Keyword to the class we can stop the Inheritance
final class Ball extends Apple {

  public void say_ball() {
    System.out.println("I am Ball");
  }
  //   public void say_alphabet() {
  //     System.out.println("I am Aplhabet B");
  //   }
}

class Cat {

  public void say_Cat() {
    System.out.println("I am Cat");
  }

  public void say_alphabet() {
    System.out.println("I am Aplhabet C");
  }
}

class Final_Keyword {

  public static void main(String[] args) {
    Ball b = new Ball();
    System.out.println(b.num);
  }
}
