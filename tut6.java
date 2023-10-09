class Assignment_Operators {

  public static void main(String[] args) {
    int a = 9;
    int b = 3;
    // Assignment Operators:
    System.out.println("a+b:" + (a + b)); //Addition
    System.out.println("a-b:" + (a - b)); //Subtraction
    System.out.println("a*b:" + (a * b)); //Multiplication
    System.out.println("a/b:" + (a / b)); //Division
    System.out.println("a%b:" + (a % b)); //mod
    System.out.println("a+=2:" + (a += 2));
    System.out.println("a-=2:" + (a -= 2));
    System.out.println("a*=2:" + (a *= 2));
    System.out.println("a/=b:" + (a /= 2));
    System.out.println("a%=b:" + (a %= 2));
    System.out.println("++b:" + (++b)); //pre-increment
    System.out.println("a++:" + (a++)); //post-increment
    System.out.println("b--:" + (b--)); //post-decrement
    System.out.println("--a:" + (--a)); //pre-decrement
  }
}
