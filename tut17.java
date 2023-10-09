class Test_class{
    int x=98;
    public int add(int a,int b){
        System.out.println(x);
        return a+b;
    }
}

class Object_Memory{
    public static void main(String[] args) {
        int d=45;
        Test_class t=new Test_class();
        System.out.println(d);
        int k=t.add(2, 3);
        System.out.println(k);
    }
}