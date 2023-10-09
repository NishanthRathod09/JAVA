// Every Class extends the "Object Class" by Default
// class Laptop extends Object {}

class Laptop {
  int a = 55;
  String s = "Naveen";
}

class Mobile {
  int a = 89;
  String b = "Rohith";
  public String toString(){
    return b;
  }
  public int hashCode(){
    return 12354;
  }
}

class Object_Class {

  public static void main(String[] args) {
    Laptop L = new Laptop();
    System.out.println(L);
    System.out.println(L.toString());
    System.out.println(L.hashCode());
    Mobile m=new Mobile();
    System.out.println(m);
    System.out.println(m.toString());
    System.out.println(m.hashCode());

  }
}
