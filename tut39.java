// Polymorphism => (Poly + morphism) means (many + behaviours)
// It is Divided into two types
// 1)Compile Time Polymorphism      Ex:Overloading;
// 2)Run Time Polymorphism          Ex:Overriding;

class Apple {

  public void fruit() {
    System.out.println("I am Apple");
  }
}

class Ball extends Apple {

  public void fruit() {
    System.out.println("I am Ball");
  }

  public void thing() {
    System.out.println("I am Ball");
  }
}

class Cat extends Apple {

  public void fruit() {
    System.out.println("I am Cat");
  }

  public void animal() {
    System.out.println("I am Cat");
  }
}

class Dog {

  public void animal() {
    System.out.println("I am Dog");
  }
}

class Polymorphism {

  public static void main(String[] args) {
    Apple b = new Apple();
    b.fruit(); // here Apple
    b = new Ball();
    b.fruit(); // here ball
    b = new Cat();
    b.fruit(); // here cat
    // b=new Dog();  ->Gives Error it should be Inherted

  }
}
/*
  interface MyCamera2 {
  void takeSnap();
  void recordVideo();

  private void greet() {
    System.out.println("Good Morning");
  }

  default void record4KVideo() {
    greet();
    System.out.println("Recording in 4k...");
  }
}

interface MyWifi2 {
  String[] getNetworks();
  void connectToNetwork(String network);
}

class MyCellPhone2 {

  void callNumber(int phoneNumber) {
    System.out.println("Calling " + phoneNumber);
  }

  void pickCall() {
    System.out.println("Connecting... ");
  }
}

class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2 {

  public void takeSnap() {
    System.out.println("Taking snap");
  }

  public void recordVideo() {
    System.out.println("Taking snap");
  }

  //    public void record4KVideo(){
  //        System.out.println("Taking snap and recoding in 4k");
  //    }
  public String[] getNetworks() {
    System.out.println("Getting List of Networks");
    String[] networkList = { "Harry", "Prashanth", "Anjali5G" };
    return networkList;
  }

  public void connectToNetwork(String network) {
    System.out.println("Connecting to " + network);
  }

  public void sampleMeth() {
    System.out.println("meth");
  }
}

class Practice {

  public static void main(String[] args) {
    MyCamera2 cam1 = new MySmartPhone2(); // This is a smartphone but, use it as a camera
    // cam1.getNetworks(); --> Not allowed
    // cam1.sampleMeth(); --> Not allowed

    cam1.record4KVideo();

    MySmartPhone2 s = new MySmartPhone2();
    s.sampleMeth();
    s.recordVideo();
    s.getNetworks();
    s.callNumber(7979);
  }
}

 */
