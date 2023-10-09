class Three_Dimentional_Array {
  public static void main(String[] args) {
    int a[][][] = new int[3][4][5];
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < a.length; j++) {
        for (int k = 0; k < a.length; k++) {
          a[i][j][k] = (int) (Math.random() * 100);
        }
      }
    }
    for (int x[][] : a) {
      for (int y[] : x) {
        for (int z : y) {
          System.out.print(z + " ");
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}
