import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Need_Of_Stream_API {

  public static void main(String[] args) {
    // List<Integer> l=new ArrayList<>();
    List<Integer> l1 = Arrays.asList(5, 8, 1, 6, 2);
    List<Integer> l2 = new ArrayList<>();
    System.out.println(l1);
    // Now if we have multiply the number with 2 which are even
    for (int y : l1) {
      if (y % 2 == 0) {
        y = y * 2;
      }
      l2.add(y);
    }
    System.out.println(l2);
  }
  //   Now this is the lengthy process to make the process simple we use Stream API
}
