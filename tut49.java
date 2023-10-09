interface Computer {
  void comp();
}

class Laptop implements Computer {

  public void comp() {
    System.out.println("Compute Applications");
  }
}

class Desktop implements Computer {

  public void comp() {
    System.out.println("Compute Applications Faster");
  }
}

class Developer {

  /*  public void devApp(Laptop lap){
        lap.comp();
    } */
  /*  public void devApp(Desktop des){
        des.comp();
     }  */
  public void devApp(Computer com) {
    com.comp();
  }
}

class Need_Of_Interface {

  public static void main(String[] args) {
    // Laptop lap = new Laptop();
    // Desktop b = new Desktop();
    // Developer d=new Developer();
    // d.devApp(lap);
    // d.devApp(b);

    Computer lap = new Laptop();
    Computer b = new Desktop();
    Developer d = new Developer();
    d.devApp(b);
    d.devApp(lap);
  }
}
