class DataTypes{
    public static void main(String[] args) {
        /*
         There are Two Types of data Types
         1)Primitive Data Type:
             a)Interger ->
             byte(Size:1 byte,Range:Stores whole numbers from -128 to 127),
             short(Size:2 bytes,Range:Stores whole numbers from -32,768 to 32,767),
             int(Size:4 bytes,Range:Stores whole numbers from -2,147,483,648 to 2,147,483,647),
             long(Size:8 bytes,Range:Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
             b)Float ->float(Size:4 bytes,Range:Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits),
             double(Size:8 bytes,Range:Stores fractional numbers. Sufficient for storing 15 decimal digits)
             c)character(Size:2 bytes,Range:Stores a single character/letter or ASCII values)
             d)Boolean(Size:1 bit,Range:Stores true or false values)
         2)Reference Data Type
            a)String
            b)Array
            c)Enum
            d)Class
            e)Interface
         */
        //Primitive Datatype
        byte a=4;
        short b=45;
        int c=789654;
        long d=123456789L;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println("*********************");
        float e=45.32165f;
        double f=48955642368.87245521;
        System.out.println(e);
        System.out.println(f);
        System.out.println("***********************");
        char g='A';
        char h='4';
        boolean i=true;
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println("***********************");
        // Reference Data Type 
        String j="Ram";
        System.out.println(j);
        String k[]={"apple","ball","cat"};
        System.out.println(k[0]);
        enum l {A,B,C,D,E,F};
        l eout=l.A;
        System.out.println(eout);

    }
}