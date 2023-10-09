class Students {
  int id = 89;

  public void show() {
    System.out.println("Hello From Students");
  }
}

class Anonymous_Objects {

  public static void main(String[] args) {
    // Anonymous Objects
    System.out.println(new Students().id);
    new Students().show();
  }
}
