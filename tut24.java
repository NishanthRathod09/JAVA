class String_Properties {

  public static void main(String[] args) {
    String a = "Ramavath Nishanth Rathod";
    System.out.println("Original:" + a);
    System.out.println(a.toCharArray());
    System.out.println(a.length());
    System.out.println(a.charAt(9));
    System.out.println(a.indexOf(a, 5));
    System.out.println(a.substring(2, 9));
    System.out.println(a.toLowerCase());
    System.out.println(a.toUpperCase());
    System.out.println(a.concat(" Rohith"));
    System.out.println(a.endsWith("d"));
    System.out.println(a.startsWith("R"));
    System.out.println(a.hashCode());
    System.out.println(a.isEmpty());
    System.out.println(a.equals("Ramavath Nishanth Rathod"));
    System.out.println(a.isBlank());
  }
}
