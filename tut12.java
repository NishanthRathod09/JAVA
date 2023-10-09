class Loops {

  public static void main(String[] args) {
    /*
         We have 3 types of loops
         1)while(){}
         2)do-while(){}
         3)for(){}
         */

    //  While Loop

    int a = 2;
    while (a <= 5) {
      System.out.println(a);
      a++;
    }
    System.out.println("******");
    int b = 1;
    //do while loop
    do {
      System.out.println(b);
      b++;
    } while (b <= 7);
    System.out.println("******");
    //for(){}
    for (int i = 1; i <= 5; i++) {
      System.out.println(i);
    }
  }
}
