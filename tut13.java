class Nested_Loop{
    public static void main(String[] args) {
        // Nested Loop:It is the Loop within the loop
        int a=0;
        while(a<=6){
            System.out.println("a:"+(a));
            int b=0;
            do{
                System.out.println("Hello "+(b));
                b++;
            }while(b<=3);
            a++;
        }
    }
}