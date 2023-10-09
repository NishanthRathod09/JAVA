class Teachers {

  public void call() {
    System.out.println("Called Teacher");
  }

  public void taught() {
    System.out.println("Thought Subjects");
  }
}

class Students extends Teachers {

  public void call() {
    System.out.println("Called Student");
  }

  public void taught() {
    super.taught();
    System.out.println("Learning Subjects");
  }
}

class Over_Riding {

  public static void main(String[] args) {
    Students s = new Students();
    s.call();
    s.taught();
    System.out.println(s.getClass());
  }
}
