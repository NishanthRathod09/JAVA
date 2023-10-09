/*  enum Status {
  Running,
  Started,
  Pending,
  Success,
} */
enum Laptop {
  // Objects of Enum
  Macbook(100000),
  Dell(80000),
  Hp,
  Surface(50000);

  // Default Constructor of enum
  private Laptop() {
    this.price = 30000;
  }

  private int price;

  //    Parameterized Constructor of enum
  private Laptop(int price) {
    this.price = price;
  }

  //   Setters
  public void setPrice(int price) {
    this.price = price;
  }

  public int getPrice() {
    return price;
  }
  //   Getters

}

class Enumaration {

  public static void main(String[] args) {
    /* Status s = Status.Pending;
    System.out.println(s); */

    // Printing all objects
    /*     Status e[]=Status.values();
    for(Status a:e){
        System.out.println(a+":"+a.ordinal());
    }  */

    /*  Status s = Status.Pending;
    if (s == Status.Running) {
      System.out.println("Please Wait...");
    } else if (s == Status.Started) {
      System.out.println("Started Application");
    } else if (s == Status.Pending) {
      System.out.println("Pending Application");
    } else {
      System.out.println("Work is Done"); 
    }    */

    /* 
    // Switch Case
    Status s = Status.Started;
    switch (s) {
      case Running:
        System.out.println("Application is Running...");
        break;
      case Started:
        System.out.println("Application is Started...");
        break;
      case Pending:
        System.out.println("Application is Pending...");
        break;
      default:
        System.out.println("Application Deployeed Successfully");
        break;
    }           */

    Laptop l = Laptop.Macbook;
    /* 
    System.out.println(l);
    System.out.println(l.getPrice());
    */

    for (Laptop l1 : l.values()) {
      System.out.println(l1 + ":" + l1.getPrice());
    }
  }
}
