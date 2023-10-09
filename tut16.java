class Calculator{
    public int add(){
        return 0;
    }
    public int add(int a){
        return a;
    }
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
}
class Method_Overloading{
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        System.out.println(cal.add());
        System.out.println(cal.add(1));
        System.out.println(cal.add(1,2));
        System.out.println(cal.add(1,2,3));
    }
}