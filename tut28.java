class Private_Data {
  private String password = "Nishanth@123";
  private int code = 498;

//   So here we are encapsulating the private data into the methods

  //   So here the private data is not accessable we can access the private data only through methods
  public String getpassword() {
    return password;
  }

  public int getcode() {
    return code;
  }
}

class Encapsulation {

  public static void main(String[] args) {
    Private_Data P1 = new Private_Data();
    System.out.println(P1.getpassword());
    System.out.println(P1.getcode());
  }
}
