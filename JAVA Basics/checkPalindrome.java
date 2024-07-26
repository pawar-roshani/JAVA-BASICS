import java.util.*;
public class checkPalindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int num =sc.nextInt();
        boolean isPalindrome=isPalindrome(num);
        if(isPalindrome){
            System.out.println("your number is Palindrome");
        }
        else{
            System.out.println("tour number is Not Palindrome");
        }
    }
    public static boolean isPalindrome(int num){
        return num==reverse(num);

    }
    public static int reverse(int num){
        int newNum=0;
        while(num>0){
            int digit=num%10;
            newNum =newNum*10+digit;
            num/=10;
        }
        return newNum;
    }
}
