/*
 * In Java we have 3 different types of collections
 * 1)collection API     -> concept
 * 2)Collection         -> Interface
 * 3)Collections        -> Class
 */
// *************
/*
 * And Here the "Collection"(i.e Interface) is Implimented by 3 different types Interfaces they are
 * 1)List        ->Ex:ArrayList,LinkedList    (most famous one is : ArrayList For List)
 * 2)Queue       ->Ex:DeQueue
 * 3)Set         ->Ex:HashSet,LinkedSet       (most famous one is : HashSet For Set)
 */

//  And We have Most Famous one is

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Types_of_Collections {

  public static void main(String[] args) {
    /* 
    // **************** COLLECTION *************************
    // Collection c=new Collection<E>() {
    /* HERE WE CANNOT USE THIS AS THE COLLECTION IS AN INTERFACE AND IT HAS SO MANY METHOD,SO TO IMPLIMENT THE COLLECTION WE NEED IMPLIMENT THE COLLECTION WITH DIFFERENT INTERFACE */
    // };
    // Collection c = new ArrayList<>();   // Case 1
    Collection<Integer> a = new ArrayList<Integer>(); // Case 2
    // Now here the "NUMBERS" are not integers they are "OBJECTS"
    a.add(5);
    a.add(5);
    a.add(5);
    a.add(9);
    a.add(6);
    a.add(2);
    a.add(7);
    //
    for (Object a1 : a) { // For Case 1
      System.out.println(a1);
      //   System.out.println(b*2);   -> Gives Error
    }

    System.out.println(a);
    // System.out.println(c*2);   ->Gives Error
    for (int a2 : a) { // For Case 2
      System.out.println(a2);
      System.out.println(a2 * 2); // Will Not Give Error
    }
    System.out.println(a.contains(7));
    System.out.println("Size:" + a.size());
    // System.out.println(a[2]);    -> Error
    //   ********************** LIST ***************************
    // NOW HERE THE COLLECTION DOES NOT SUPPORT "index" VALUES FOR THAT WE HAVE TO USE LIST
    List<Integer> b = new ArrayList<Integer>();
    b.add(0);
    b.add(0);
    b.add(5);
    b.add(99);
    b.add(99);
    b.add(44);
    System.out.println(b);
    System.out.println(b.get(0));
    System.out.println(b.get(3));
    System.out.println(b.remove(0));
    b.add(0, 336);
    System.out.println(b.lastIndexOf(0));
    System.out.println(b.equals(b));
    System.out.println(b.equals(a));
    // ************************ SET ***************************
    // THE SET WILL NOT ALLOW THE DUPLICATE VALUES
    Set<Integer> c = new HashSet<Integer>();
    // c.add(2);
    // c.add(12);
    // c.add(2);
    // c.add(8);
    // c.add(15);
    // c.add(5);
    // c.add(5);
    // c.add(3);
    c.add(62);
    c.add(54);
    c.add(82);
    c.add(21);
    System.out.println(c);
    for (int c1 : c) {
      System.out.println(c1);
    }
    System.out.println(c.size());
    System.out.println(c.contains(5));
    // SET AS DIFFERENT TYPE OF METHOD THAT SORTED THE ELEMENTS;
    Set<Integer> d = new TreeSet<Integer>();
    // d.add(2);
    // d.add(12);
    // d.add(2);
    // d.add(8);
    // d.add(15);
    // d.add(5);
    // d.add(5);
    // d.add(3);
    d.add(62);
    d.add(54);
    d.add(82);
    d.add(21);
    System.out.println(d);
    for (int d1 : d) {
      System.out.println(d1);
    }
    // ********************* Iterable ************************
    Collection<Integer> e = new ArrayList<Integer>();
    e.add(89);
    e.add(95);
    e.add(70);
    e.add(91);
    e.add(51);
    e.add(12);
    Iterator<Integer> f = e.iterator();
    while (f.hasNext()) {
      System.out.println(f.next());
    }
  }
}
