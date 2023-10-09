class Human {
  private String Gender; //  Default value of the String="null"
  private String DNA; //  Default value of the String="null"

  // Setters
  public void set_gender(String Gender) {
    // Gender is initialized to the Default value of the Gender i.e "null"
    Gender = Gender;
  }

  public void set_dna(String DNA) {
    // here the Gender is initialized to the Current value of the DNA
    this.DNA = DNA;
    // this.DNA = this.DNA;  this will give default value i.e.. "null"
  }

  //   Getters
  public String get_gender() {
    return Gender;
  }

  public String get_dna() {
    return this.DNA;
  }
}

class This_Keyword {

  public static void main(String[] args) {
    Human h = new Human();
    h.set_gender("Female");
    System.out.println(h.get_gender());
    h.set_dna("4A89YU");
    System.out.println(h.get_dna());
  }
}
