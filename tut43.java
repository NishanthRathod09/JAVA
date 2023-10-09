abstract class Phone {

  public void call() {
    System.out.println("Calling...");
  }

  //   The abstract keyword is used for the defining of the abstract method to inherited class(the inherited class must and should define the abstract all abstract methods)
  public abstract void playmusic();

  public abstract void playvedio();
}

abstract class Mobile extends Phone {

  // If in case the class fails to define any of one method of abstract class then the inherited class becomes the abstract class
  public void playmusic() {
    System.out.println("Playing Music...");
  }
}

class Smartphone extends Mobile {

  // As thos class is inheriting the Mobile so the should define the abstract method of the primary absttract class
  public void playvedio() {
    System.out.println("Playing Vedio...");
  }
}

class Abstract_keyword {

  public static void main(final String[] args) {
    Phone s = new Smartphone();
    s.call();
    s.playmusic();
    s.playvedio();
  }
}
