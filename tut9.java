class Conditional_Operators {
  public static void main(String[] args) {
    int a = 5, b = 8, c = 2;
    // "if" Condition
    if (a < b) {
      System.out.println("(if-condtion)True a<b:" + (a < b));
    }
    // "if-else" Condition
    if (a > b) {
      System.out.println("True a>b:" + (a > b));
    } else {
      System.out.println("True else a<b:" + (a < b));
    }
    // "else-if" Condition
    if (a == b) {
      System.out.println("Hello");
    } else if (a > c) {
      System.out.println("Hi");
    } else {
      System.out.println("Bye");
    }
  }
}
