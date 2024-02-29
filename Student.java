public class Student{
   protected String name;
   private int age;
   private String adress;
    public Student(String name,int age,String adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String getname() {
        return name;
}
public String getadress() {
    return adress;
}

public int getage() {
    return age;
}
@Override
  public String toString() {
    return(" Student name is " + this.getname() + ",age is " + this.getage()  + ",and adress is " + this.getadress());
  }
  public static void main(String[] args) {
    Student now = new Student("john", 19 ,"50200");
    System.out.println(now.toString());


  } 
  }