class A {
  int count;

  // The synchronized keyword is used for running threads in synchronized way
  // public synchronized void increment() {
  public void increment() {
    count++;
  }
}

class Race_Condition {

  public static void main(String[] args) throws Exception {
    A a = new A();

    Runnable b = () -> {
      for (int i = 1; i <= 5000; i++) {
        a.increment();
      }
    };
    Runnable c = () -> {
      for (int j = 1; j <= 5000; j++) {
        a.increment();
      }
    };

    Thread t1 = new Thread(b);
    Thread t2 = new Thread(c);
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    System.out.println(a.count);
  }
}
