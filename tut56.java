import java.util.Scanner;

class Input_in_java {

  public static void main(String[] args) {
    // Here We create the object of Scanner and use it for java input
    Scanner sc = new Scanner(System.in);
    // Using Scanner
    System.out.println("Enter Integer:");
    System.out.println(sc.nextInt());
    System.out.println("Enter long:");
    System.out.println(sc.nextLong());
    System.out.println("Enter Float:");
    System.out.println(sc.nextFloat());
    System.out.println("Enter Double:");
    System.out.println(sc.nextDouble());
    System.out.println("Enter Boolean:");
    System.out.println(sc.nextBoolean());
    System.out.println("Enter character:");
    System.out.println(sc.next().charAt(0));
    System.out.println("Enter String Single Word:");
    System.out.println(sc.next());
    System.out.println("Enter String multiple Words:");
    System.out.println(sc.nextLine());
    System.out.println("Enter integer:");
    System.out.println(sc.hasNextInt());
  }
}
