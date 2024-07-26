import java.util.*;
public class ArmstrongNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num=sc.nextInt();
        boolean isArmstrong=isArmstrong(num);
        if(isArmstrong){
            System.out.println("your number is Armstrong");
        }
        else{
            System.out.println("your number is not Armstrong");
        }
    } 
    public static boolean  isArmstrong(int num){
        int noOfDigits=noOfDigits(num);
        int numCopy=num;
        System.out.println("no of digits:"+noOfDigits);
        int finalNumber=0;
        while(num>0){
            int lastDigit =num%10;
            num/=10;
            finalNumber+=pow(lastDigit,noOfDigits);
        }
        System.out.println("final no. is:"+finalNumber);
        return finalNumber==numCopy;
    }
    public static int pow(int num1,int num2){
        int result =num1;
        int i=1;
        while(i<num2){
            result *=num1;
            i++;
        }
        return result;
    }
    public static int noOfDigits(int num){
        int digits=0;
        while(num >0){
            digits++;
            num/=10;

        }
        return digits;
    }  

}
