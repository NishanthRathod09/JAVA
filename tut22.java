class For_Each {

  public static void main(String[] args) {
    int a[] = new int[3];
    a[0] = 5;
    a[1] = 6;
    a[2] = 8;
    for (int i : a) {
      System.out.println(i);
    }
  }
}
/*

class Students {
  int roll;
  String name;
  int marks;
}

class For_Each_Array_of_Objects {

  public static void main(String[] args) {
    // Object 1
    Students s1 = new Students();
    s1.roll = 1;
    s1.name = "Bharath";
    s1.marks = 75;
    // Object 2
    Students s2 = new Students();
    s2.roll = 2;
    s2.name = "Rithika";
    s2.marks = 85;
    // Object 3
    Students s3 = new Students();
    s3.roll = 3;
    s3.name = "Sravan";
    s3.marks = 100;
    // Array of Objects
    Students s[] = new Students[3];
    s[0] = s1;
    s[1] = s2;
    s[2] = s3;
    for (int i = 0; i < s.length; i++) {
      System.out.println(s[i].roll + " " + s[i].name + " " + s[i].marks);
    }
  }
}


 */
