/* 
// THIS IS CODE WITH-OUT THREADS
class Apple {

  public void hi() {
    for (int i = 0; i <= 10; i++) {
      System.out.println("Hi");
    }
  }
}

class Ball {

  public void hello() {
    for (int i = 0; i <= 10; i++) {
      System.out.println("hello");
    }
  }
}

class Maintaing_Multi_Tasks_With_Thread {

  public static void main(String[] args) {
    Apple a = new Apple();
    Ball b = new Ball();
    a.hi();
    b.hello();
  }
}  */

// WHEN WE ARE USING THREADS THEN WE HAVE TO INHERIT THE THREAD
class Apple extends Thread {

  // IN EVERY THREAD WE HAVE TO CREATE A RUN METHOD BECAUSE "start()" WILL ONLY CALL THE RUN METHOD
  public void run() {
    for (int i = 0; i <= 10; i++) {
      System.out.println("Hi");
      try {
        Thread.sleep(10); // This sleep() method will pause the execution of the method in mentioned time (AND THIS SHOULD BE ALWAYS IN "try-catch() BLOCK")
      } catch (Exception e) {
        System.out.println("The Thread Error:" + e);
      }
    }
  }
}

class Ball extends Thread {

  // IN EVERY THREAD WE HAVE TO CREATE A RUN METHOD BECAUSE "start()" WILL ONLY CALL THE RUN METHOD
  public void run() {
    for (int i = 0; i <= 10; i++) {
      System.out.println("hello");
      try {
        Thread.sleep(10); // This sleep() method will pause the execution of the method in mentioned time (AND THIS SHOULD BE ALWAYS IN "try-catch() BLOCK")
      } catch (Exception e) {
        System.out.println("The Thread Error:" + e);
      }
    }
  }
}

class Maintaing_Multi_Tasks_With_Thread {

  public static void main(String[] args) {
    Apple a = new Apple();
    Ball b = new Ball();
    /* 
    // WE CAN GET THE THREAD PRIORITY BY THE METHOD () ".getPriority()"
    System.out.println(a.getPriority());
    System.out.println(b.getPriority());
    // WE CAN SET THE THREAD PRIORITY BY THE METHOD () ".setPriority()"
    a.setPriority(1);
    b.setPriority(10);
    System.out.println(a.getPriority());
    System.out.println(b.getPriority());
*/

    // ALSO WE HAVE
    /*
     * Thread.MAX_PRIORITY
     * Thread.NORM_PRIORITY
     * Thread.MIN_PRIORITY
     */
    a.start();
    b.start();
  }
}
