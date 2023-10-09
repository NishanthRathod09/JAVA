// Type Convertion and Casting

class Type_Convertion_And_Casting {

  public static void main(String[] args) {
    byte a = 127;
    int b = 123;
    System.out.println("a:" + a);
    System.out.println("b:" + b);
    b = a;
    System.out.println("(b=a)Implicit Convertion:" + b);
    /*a=b;  //Gives error because range of byte is small than interger,to work on it we have convert integer value within the range of byte and perform explicit convertion  */
    a = (byte) b;
    System.out.println("(a=b)Explicit Convertion:" + a);

    int c = 156; //out of range of byte
    a = (byte) c; // overflow happends loss of data
    System.out.println("Out of byte Range:" + a);

    int d = 3;
    char e = (char) d;
    System.out.println("Convertion From Int to char:" + e);
    /* ================================================== */
    //Converting String to Integer
    String str = "123"; // A numeric string
    int intValue = Integer.parseInt(str); // Convert the string to an int
    System.out.println("String to int: " + intValue);

    //Converting Integer to String
    int i = 123; // An integer value
    String s = String.valueOf(i); // Convert the int to a String
    System.out.println("Int to String: " + s);

    //Type of datatype
    Object obj = "Hello";
    System.out.println("AA:" + obj instanceof String);
  }
}
/*
 
class Practice {

  public static void main(String[] args) {
    int a = 45;
    String b = "Hello";
    System.out.println("a:" + a);
    System.out.println("b:" + b);
    // Converting String to integer
    String c = "56";
    int d = Integer.parseInt(c);
    System.out.println(d);
    // Converting String to Float
    String c1 = "56.36";
    float d1 = Float.parseFloat(c1);
    System.out.println("float:" + d1);
    // Converting interger to String
    int e = 85;
    String f = String.valueOf(e);
    System.out.println(f);
    float x = 45.36f;
    String y = String.valueOf(x);
    System.out.println(y);
    int g = (int) x;
    System.out.println(g);
    double k = (double) x;
    System.out.println(k);
    char q = '5';
    String l = String.valueOf(q);
    int d4= (int) q;
    System.out.println("int:" + d4);
    System.out.println("String:" + l);
    float dp=Float.valueOf(d4);
    System.out.println(dp);
  }
}


 */
