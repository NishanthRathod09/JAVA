class Two_Dimentional_Array{
    public static void main(String[] args) {
        // Declaring Two-Dimentional Array
        // Type 1:The Two-Dimentional Array With Fixed Length all Arrays
        // int a[][]=new int[no.of array][lenth of each array]; ***
        int a[][]=new int[3][4];
        // Adding Values to the Array Using Math.random
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                a[i][j]=(int)(Math.random()*10);
            }
        }
        for(int n[]:a){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
        System.out.println("*********************");
        // Type 2:The Two-Dimentional Array With Variable Length all Arrays
        int b[][]=new int[3][];
        b[0]=new int[4];
        b[1]=new int[3];
        b[2]=new int[5];
        // Adding Values to the Array Using Math.random
        for(int i=0;i<3;i++){
            for(int j=0;j<b[i].length;j++){
                b[i][j]=(int)(Math.random()*10);
            }
        }  
        for(int c[]:b){
            for(int g:c){
                System.out.print(g+" ");
            }
            System.out.println();
        }      

    }
}