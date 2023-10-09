class Student{
    int id;
    String name;
    // Static Variable
    static String dept;
    public void show(){
        System.out.println(id+","+name+","+dept);
    }
}

class Static_Variable{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.id=8;
        s1.name="Charan";
        // Static Varible can be Accessed with the Class name Directly
        Student.dept="ECE";
        Student s2=new Student();
        s2.id=9;
        s2.name="Kiran";
        Student.dept="ECE";

        // If Static is changed then all the static variable will be changed of differnt objects
        Student.dept="CSE";

        s1.show();
        s2.show();
    }
}