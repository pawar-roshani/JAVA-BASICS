package Inheritance;
 /*  Inheritance: 
       child class accquires the all properties of parent class 

*/

// parent class
class shape{
  String color;
}

// child 
class Triangle extends shape{
  
}


public class One {
  public static void main(String[] args) {
    Triangle t1=new Triangle();
    t1.color="red";
  }
}
