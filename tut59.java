class Cat {}

class Apple extends Cat implements Runnable {

  public void run() {
    for (int i = 0; i <= 10; i++) {
      System.out.println("Hi");
      try {
        Thread.sleep(10);
      } catch (Exception e) {
        System.out.println("The Error:" + e);
      }
    }
  }
}

class Ball extends Cat implements Runnable {

  public void run() {
    for (int i = 0; i <= 10; i++) {
      System.out.println("hello");
      try {
        Thread.sleep(10);
      } catch (Exception e) {
        System.out.println("The Error:" + e);
      }
    }
  }
}

class Maintaing_Multi_Tasks_With_Runnable {

  public static void main(String[] args) {
    Runnable a = new Apple();
    Runnable b = new Ball();

    Thread t1 = new Thread(a);
    Thread t2 = new Thread(b);
    t1.start();
    t2.start();
  }
}

class Maintaing_Multi_Tasks_With_Runnable_Using_Lamda_Function {

  public static void main(String[] args) {
    Runnable a = () -> {
      for (int i = 0; i <= 10; i++) {
        System.out.println("Hi");
        try {
          Thread.sleep(10);
        } catch (Exception e) {
          System.out.println("The Error:" + e);
        }
      }
    };
    Runnable b = () -> {
      for (int i = 0; i <= 10; i++) {
        System.out.println("hello");
        try {
          Thread.sleep(10);
        } catch (Exception e) {
          System.out.println("The Error:" + e);
        }
      }
    };

    Thread t1 = new Thread(a);
    Thread t2 = new Thread(b);
    t1.start();
    t2.start();
  }
}
