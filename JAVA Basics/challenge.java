import java.util.*;
public class challenge {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Welcome "+name+" to India..!");
/* 
        // Addition of tow numbers:
        System.out.println("Enter first number:");
        int num1=sc.nextInt();
        System.out.println("Enter Second number:");
        int num2=sc.nextInt();
        int add=num1+num2;
        System.out.println("Addition of Tow numbers:"+add);

        float a=1.5f;
        float b=5.5f;
        double product=a*b;
        System.out.println("product of floating numbers:"+product);
        
        // perimenter of rectangle;
        int len1=45;
        int len2=22;
        int perimeter=2*len1+2*len2;
        System.out.println("Perimeter of Rectangel :"+perimeter);

        // Area of Triangle

        int base=4;
        int height=5;
        float Area=0.5f*(base * height);
        System.out.println("Aarea of Triangle :"+Area+"cm");

        // calculate simple interest

        float principle=20000f;
        float time=2.5f;
        float rate=8.5f;
        double simpleInterest=(principle*time*rate)/100;
        System.out.println("Simple Interes is Rs"+simpleInterest);

        // calculate compound interest

        double compoundInterest=principle * Math.pow((1+rate/100),time);
        System.out.println("Compound Interest is Rs"+compoundInterest);
        
        //program to convert fehrenheit to celcius

        System.out.println("Welcome to temprature converter..!");
        System.out.println("enter your  temprature in F:");
        float fah=sc.nextFloat();
        float cel=(fah-32)*5.0f/9.0f;
        System.out.println("Temprature in Celcius is :"+cel+" C");
    
        System.out.print("enter the number");
        int num=sc.nextInt();

        if(num>0){
            System.out.println("The number is positive");
        }
        else if(num ==0){
            System.out.println("The number is 0");
        }
        else{
            System.out.print("The number is negative");
        }

        // odd-even

        if(num%2==0){
            System.out.print("number is even");
        }
        else{
            System.out.println("tne number is Odd");
        }
*/
        // gratest of 3 numbers:
        System.out.print("Enter first number:");
        int p=sc.nextInt();
        System.out.print("Enter Second number:");
        int q=sc.nextInt();
        System.out.print("Enter Third number:");
        int r=sc.nextInt();
        if(p>=q && p>=r){
            System.out.println("First number is the greatest"+p);
        }
        else if(q>=r){
            System.out.println("Second number is the Greatest"+q);
        }
        else{
            System.out.println("Third  number is the greatest"+r);
        }

/*         // Determine year is leap or not
        System.out.println("Welcome to leap year calculator");
        System.out.print("Please enter that you want to check:");
        int year=sc.nextInt();

        if(year%400==0 || year%4==0){
            System.out.println("Year is Leap year..!"+year);
        }
        else{
            System.out.println("Year is Not Leap year..!"+year);
        }

        // calculate grades based on marks
        System.out.print("Enter your percentage:");
        float percentage=sc.nextFloat();

        if(percentage>=90){
            System.out.println("you got Grade A");
        }
        else if(percentage>=75){
            System.out.println("you got Grade B");
        }
        else if(percentage>=60){
            System.out.println("you got Grade C");
        }
        else if(percentage>=30){
            System.out.println("you got Grade D");
        }
        else{
            System.out.println("you got Grade F");
        }
// categorise persons in different age groups
        System.out.println("Enter yuour Age:");
        int age =sc.nextInt();
        if(age<=13){
            System.out.println("you are a child..!");
        }
        else if(age<=18){
            System.out.println("you Are a teenager..!");
        }
        else if(age<=60){
            System.out.println("you are a Adult..!");
        }
        else{
            System.out.println("you are a senior Citizen..!");
        }
*/
// bitwise AND(&):
        int result=p&q;
        System.out.println("Result of AND is:"+result);
    
    // bitwise OR
        int res=p|q;
        System.out.println("Result of OR is:"+res);

    // biwise XOR
    int result1=p^q;
    System.out.println("Result of XOR is:"+result1);

    // bitwise Compliment
    int res1=~q;
    System.out.println("Result of Compliment is:"+res1);

    // left shift 
    int r1=p<<1;
    System.out.println("Result of leftshift is:"+r1);
    // rightshift
    int r2=p>>4;
    System.out.println("Result of rightshift is:"+r2);

// ODD EVEN bitwise Operator

        if((p & 1)==1){
            System.out.println("Your number id ODD!");
        }
        else{
            System.out.println("Your number is EVEn!");
        }
    }
}
