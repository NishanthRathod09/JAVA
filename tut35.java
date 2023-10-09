class Apple {

  public void tree() {
    System.out.println("Apple Tree");
  }

  public void type() {
    System.out.println("I am Apple Fruit");
  }
}

class Ball extends Apple {

  public void thing() {
    System.out.println("Ball With rubber");
  }
  // Overriding Method  
  @Override
  public void type() {
   // super.type();
    System.out.println("I am ball Rubber");
  }
}

class Inheritance {

  public static void main(String[] args) {
    Ball b = new Ball();
    b.tree();
    b.thing();
    b.type();
  }
}
