import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* 
class Student {
  int age;
  String name;

  public Student(int age, String name) {
    this.age = age;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Student [age=" + age + ", name=" + name + "]";
  }
} */

class Student implements Comparable<Student> {
  int age;
  String name;

  public Student(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public String toString() {
    return "Student [age=" + age + ", name=" + name + "]";
  }

  public int compareTo(Student that) {
    if (this.age > that.age) {
      return 1;
    } else {
      return -1;
    }
  }
}

class Comparator_Vs_Comparable {

  public static void main(String[] args) {
    // Writing Our Own Sorting Algorithm
    /* Comparator c = new Comparator<Integer>() {

      public int compare(Integer i, Integer j) {
        if (i % 10 > j % 10) {
          return 1; // Sort the array
        } else {
          return -1; // Not Sort the array
        }
      }
    };

    List<Integer> l = new ArrayList<>();
    l.add(45);
    l.add(63);
    l.add(12);
    l.add(8);
    l.add(91);
    System.out.println("Noramal Array:" + l);
    Collections.sort(l); // sort the array
    System.out.println("Sorted Array:" + l);
    Collections.sort(l, c); // sort the array on the basis of last digit
    System.out.println("Sorted on last digit Array:" + l);
        */
    Comparator<Student> c1 = new Comparator<Student>() {

      public int compare(Student i, Student j) {
        if (i.age > j.age) {
          return 1;
        } else {
          return -1;
        }
      }
    };
    List<Student> stud = new ArrayList<>();
    stud.add(new Student(12, "kiran"));
    stud.add(new Student(8, "charan"));
    stud.add(new Student(28, "manish"));
    stud.add(new Student(18, "koop"));
    stud.add(new Student(30, "keerthi"));
    System.out.println(stud);
    for (Student y : stud) {
      System.out.println(y);
    }
    // Collections.sort(stud, c1);
    Collections.sort(stud);
    System.out.println(stud);
    System.out.println("----------------------");
    for (Student x : stud) {
      System.out.println(x);
    }
  }
}
