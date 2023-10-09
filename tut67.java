import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Stream_API {

  public static void main(String[] args) {
    List<Integer> l = Arrays.asList(8, 9, 1, 5, 3, 0, 10);
    Stream<Integer> s = l.stream();
    // s.forEach(b -> System.out.println("Number:"+b));
    // We cannot reuse the once we resused the stream
    // So to overcome this we need create a new stream
    // a.forEach(b->System.out.println("lop"));
    // Stream<Integer> s1 = s.filter(n -> n % 2 == 0);
    // s1.forEach(n -> System.out.println(n));
    // Stream<Integer> s2 = s.map(n -> n * 2);
    // int a=s2.reduce(0, (c,e)->c+e);
    // System.out.println(a);

    // Applying filter,map,reduce to a single stream
    int b = l
      .stream()
      .filter(n -> n % 2 == 0)
      .map(n -> n * 2)
      .reduce(0, (c, e) -> c + e);
    System.out.println(b);
  }
}
