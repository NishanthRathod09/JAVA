class Logical_Operators {

  public static void main(String[] args) {
    int a = 1, b = 2;
    int x = 89, y = 55;
    System.out.println("(a>b && x>y):" + (a > b && x > y));
    System.out.println("(a>b || x>y):" + (a > b || x > y));
    System.out.println("!(a>b || x>y):" + !(a > b || x > y));
  }
}
