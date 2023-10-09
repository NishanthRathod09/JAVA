class Mutable_And_Immutable_String{
    public static void main(String[] args) {
        // Mutable String
        StringBuffer a=new StringBuffer("Nishanth");
        System.out.println(a.capacity());
        a.append(" Rathod");
        System.out.println(a.charAt(5));
        System.out.println(a.length());
        // Immutable String
        StringBuilder b=new StringBuilder("Rohith");
        b.append(" null");
        System.out.println(b);
    }
}