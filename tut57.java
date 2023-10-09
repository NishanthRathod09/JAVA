class Try_And_Finally {

  public static void main(String[] args) {
    int a = 5;
    int b = 1;
    try {
      int c = a / b;
      System.out.println("Result:" + c);
      System.out.println("I am Try Block");
    } catch (Exception e) {
      System.out.println("The Error is:" + e);
      System.out.println("I am Catch Block");
    } finally {
      System.out.println(
        "I am Final Block i will execute even 'try is sucessfull' or 'try is failed' "
      );
    }
  }
}
/* 
 
import java.util.Scanner;

class Try_And_Finally {
    
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        try (Scanner sc = new Scanner(System.in)) {
            int c = a / b;
            String x = sc.nextLine();
            System.out.println(x + "Rathod");
            System.out.println("Result:" + c);
            System.out.println("I am Try Block");
        } catch (Exception e) {
            System.out.println("The Error is:" + e);
            System.out.println("I am Catch Block");
        }
    }
}

*/
