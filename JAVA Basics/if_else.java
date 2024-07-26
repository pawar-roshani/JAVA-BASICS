import java.util.*;
public class if_else {
    public static void main(String args[]){
        boolean isMale=true;
        String name="bob";

        System.out.println("before if");
        if(isMale){
            System.out.println("Mr."+name);
        }
        else{
            System.out.println("Ms."+name);
        }
        // relational Operators:

        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter your Age:");
        int age=sc.nextInt();

        if(age>=18){
            System.out.println("You are eligible for Driving license");
        }
        else{
            System.out.println("Beta cycle challo..!");
        }

        // logical operatrors:

        System.out.print("Enter your age:");
        int Age=sc.nextInt();

        System.out.print("Are you Female?(true/false)");
        boolean isFemale=sc.nextBoolean();

        if(Age<5){
            System.out.println("You got 75% discount..!");
        }
        else if(isFemale){
            System.out.println("You got 50% discount..!");
        }
        else if(Age>60 && !isFemale){
            System.out.println("You got 25% discount..!");
        }
        else{
            System.out.println("Sorry You do not got any discount..!");
        }
    }
}
