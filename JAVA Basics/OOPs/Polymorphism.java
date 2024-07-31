/*  Polymorphism :
        many forms
        types:compile time and Runtime
*/
class student{
  String name;
  int age;
  public void printInfo(String name){
    System.out.println(name);
  }
  public void printInfo(int age){
    System.out.println(age);
  }
  public void printInfo(String name,int age){
    System.out.println("Name : "+name+" "+"Age is : "+age);
  } 
}

public class Polymorphism {
  public static void main(String args[]){
    
    student s1=new student();
     s1.name="aman";
     s1.age=24;

    s1.printInfo(s1.name,s1.age);
    
  }
}
