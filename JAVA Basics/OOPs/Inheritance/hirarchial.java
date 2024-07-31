package Inheritance;

class shape{
  public void area(){
    System.out.println("dispalys area..!");
  }
}
class Triangle extends shape{
  public void area(int l,int h){
    System.out.println(1/2*l*h);
  }
}

class EquilateralTri extends shape{
  public void area(int l,int h){
    System.out.println(1/2*l*h);
  } 
}
class Circle extends shape{
  public void area(int r){
    System.out.println((3.14)*r*r);
  }
}
public class hirarchial {
  public static void main(String[] args) {
    
  }
}
