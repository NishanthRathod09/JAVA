class Methods{
    int p=456;
    // int 
    public int Number_int(){
        return 45;
    }
    //float
    public float Number_float(){
        return 5.6f;
    }
    //String
    public String Number_String(){
        return "Hello Sir!!";
    }
    //Array
    public double[] Array_Double(){
        double[] a= {4.56,5.8,9.6,456.32};
        return a;
    }
}

class Types_of_Method{
    public static void main(String[] args) {
        Methods m=new Methods();
        System.out.println(m.Number_int());
        System.out.println(m.Number_float());
        System.out.println(m.Number_String());
        double[] s=m.Array_Double();
        System.out.println(s[2]);
        System.out.println(m.p);
    }
}