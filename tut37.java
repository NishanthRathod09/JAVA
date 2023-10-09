import Practice_Package_Folder.*; // This imports only Apple File From the "Practice_Package_Folder" because "*" will only import files not folders
import Practice_Package_Folder.Apple; // This imports only Apple File From the "Practice_Package_Folder" as we mentioned particularly
import Practice_Package_Folder.tools.Ball; // This imports only Ball File From the "tools Folder which is in the Practice_Package_Folder" as we mentioned particularly
import Practice_Package_Folder.tools.*;   // This will Import All Files the tools Folders

class Pacakage_s {

  public static void main(String[] args) {
    Apple f = new Apple();
    f.say_apple();
    Ball b=new Ball();
    b.say_ball();
    Cat c=new Cat();
    c.say_cat();
    System.out.println(c.a);
  }
}
