class Student {
  int coll_id;
  String University;
  static int University_Code;

  // Constructor
  public Student() {
    coll_id = 56;
    University = "OU";
    University_Code = 45896;
  }

  // Here The Static block Execute only once becouse there a class loader and object initialization ,the class load only once so the static block is executed only once but object is initialized multiple times
  // Static Block
  static {
    University_Code = 0100;
    System.out.println("Static Block  "+University_Code);
  }

  // Non-Static Method
  public void aa1() {
    System.out.println(
      coll_id + "," + University + "," + University_Code + " Non Static Method"
    );
  }

  // Static Method
  public static void bb1(Student s3) {
    // The Static Method will not take the non-static Variables it will take only static Varibles
    System.out.println(
      s3.coll_id +
      "," +
      s3.University +
      "," +
      University_Code +
      " Static Method"
    );
  }
}

class Static_Block {

  // If we don't keep static keyword in main then we need to use the object of Static BLock to over come this we use static keyword
  public static void main(String[] args) {
    Student s0=new Student();
    s0.aa1();
    Student s1 = new Student();
    Student s2 = new Student();
    s1.coll_id = 99;
    s1.University = "Jntu";
    Student.University_Code = 123456;
    s1.aa1();
    s2.aa1();
    Student s3 = new Student();
    // Here we are giving object itself so the we can run non-static varibles in static method
    s3.bb1(s3);
  }
}
