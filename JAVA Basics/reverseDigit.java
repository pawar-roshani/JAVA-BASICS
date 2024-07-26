import java.util.*;
public class reverseDigit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your number : ");
        int num=sc.nextInt();
        int reverse=reverse(num);
        System.out.println("Reverse of your number is "+reverse);

    } 
    public static int reverse(int num){
        int nweNum=0;
        while(num>0){
            int digit=num%10;
            nweNum=nweNum*10+digit;
            num /=10;
        }
        return nweNum;
    } 

}
