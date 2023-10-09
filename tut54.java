// Exception handling
/*
 * Here before discussing with the exception handling we need to discuss the types of error
 * 1)Compile-time Error -> Errors that accur on Compilation  EX:Class goo{}
 * 2)Logical Error -> Errors that accur due to the logical operations
 * 3)Run-time Error  -> Errors that accur at run-time
 */

/*
 * Exception is class ,it is the main class that handles all error and ArithmeticException,ArrayIndexOutOfBoundsException are sub class of Exception class
 */

class Exceptions_Handling {

  public static void main(String[] args) {
    int a = 0;
    int d[] = new int[3];
    String s = null;
    try {
      // Logical Error
      int b = 15 / a;
      //   Runtime Error
      System.out.Println("Answer:" + b);
      //   Compile-time Error
      System.out.println(d[5]);
      System.out.println(s.length());
    } catch (ArithmeticException ear) {
      System.out.println("Arithmetic Exception:" + ear);
    } catch (ArrayIndexOutOfBoundsException err) {
      System.out.println("Array Index Out Of Bounds Exception:" + err);
    } catch (Exception e) {
      System.out.println("Java Error(*):" + e);
    }
  }
}
