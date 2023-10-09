class Office {
  private int bonus;
  private int salary;

  // Setters
  public void set_bonus(int a) {
    bonus = a;
  }

  public void set_salary(int b) {
    salary = b;
  }

  //   Getters
  public int get_bonus() {
    return bonus;
  }

  public int get_salary() {
    return salary;
  }
}

class Getters_And_Setters {

  public static void main(String[] args) {
    Office n = new Office();
    n.set_bonus(15000);
    n.set_salary(100000);
    System.out.println(n.get_bonus());
    System.out.println(n.get_salary());
  }
}
