import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

class Map_Class {

  public static void main(String[] args) {
    // HASHMAP:-
    // Hashmap is used for non synchronization execution
    Map<String, Integer> m = new HashMap<>();
    m.put("AA", 12);
    m.put("BB", 23);
    m.put("CC", 34);
    m.put("DD", 45);
    System.out.println(m);
    System.out.println(m.get("AA"));
    System.out.println(m.keySet());
    for (String a : m.keySet()) {
      System.out.println(a + ":" + m.get(a));
    }
    // HASHTABLE:-
    // Hashtable is used for synchronization execution
    Map<String, Integer> m1 = new Hashtable<>();
    m1.put("X", 1);
    m1.put("Y", 12);
    m1.put("Z", 123);
    System.out.println(m1);
  }
}
