class Array_s {

  public static void main(String[] args) {
    // Type 1:Array Undefined length
    System.out.println("***Array Undefined length***");
    int a[] = { 18, 25, 8, 9 };
    System.out.println(a[2]);
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }

    // Type 2:Array Defined length
    System.out.println("***Array Defined length***");

    int b[] = new int[5];
    b[0] = 5;
    b[1] = 55;
    b[2] = 555;
    b[3] = 5555;
    b[4] = 55555;
    // Enhanced For Loop
    // Here we no need to mention the array length it will automatically detect the length of array
    // *********
    for (int c : b) {
      System.out.println(c);
    }
  }
}
