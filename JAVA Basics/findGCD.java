import java.util.*;
public class findGCD {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number: ");
        int first=sc.nextInt();
        System.out.print("enter Second number: ");
        int second=sc.nextInt();
        int findGCD=findGCD(first,second);
        System.out.println("LCM of tow numbersis: "+findGCD);

    }  
    public static  int findGCD(int num1,int num2){
        int gcd=1;
        int i=2;
        int least=least(num1,num2);
        while(i<=least){
            if(num1 %i==0 && num2% i==0){
                gcd=i;
            }
            i++;
        }
        return gcd;
    }
    public static int least(int num1,int num2){
        if(num1<num2){
            return num1;
        }
        else{
            return num2;
        }
    }
}
