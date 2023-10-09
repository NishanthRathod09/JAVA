import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class For_Each_Method {

  public static void main(String[] args) {
    List<Integer> l = Arrays.asList(9, 5, 10, 2, 15, 18);
    System.out.println(l);
    // For Each
    // l.forEach(a -> System.out.println("This is :" + a));
    
    // But Here For-Each Loop takes the Consumer

    Consumer<Integer> c = new Consumer<Integer>() {

      public void accept(Integer n) {
        System.out.println(n);
      }
    };
    l.forEach(c);
  }
}
