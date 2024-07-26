import java.util.*;
public class Function {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("in main method");
        greeting();
        System.out.println("Method calling complete..!");
        printfirstPattren();
        int num=sumTowNum(4,5);
        System.out.println(num);

        System.out.println("Enter the number for table:");
        int number=sc.nextInt();
        multiplicationTable(number);

        int sum=oddSum(number);
        System.out.println("oddSum till "+number+" is: "+sum);

        long fact =factorialOfNum(number);
        System.out.println("Factorial is:"+fact);

        int Sum=sumOfDigits(number);
        System.out.println("Sum of digoits is:"+Sum);

    }    

    public static void greeting(){
        System.out.println("Good Morning..!");
    }
    public static void printfirstPattren(){
        // int n=5;
        // for(int i=0;i<=n;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }
        int rows=0;
        while(rows<15){
            System.out.print("*");
            int i=0;
            while(i< rows){
                System.out.print("*");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
    public static int sumTowNum(int num1,int num2){
       int sum=num1  +num2;
        return sum;
    }

    // multiplication table
    public static void multiplicationTable(int number){
        int i=1;
        while(i<=10){
            System.out.println(number+"X"+i+"="+number*i);
            i++;
        }
    }   
    // addition of odd numbers

    public static int oddSum(int number){
        int i=1;
        int sum=0;
        while(i<=number){
            sum=sum+i;
            i+=2;
        }
        return sum;
    }
    // factorial of numbers

    public static long factorialOfNum(int number){
        if(number<2){
            return 1;
        }
        long fact=1;
        int i=2;
        while(i<=number){
            fact*=i;
            i++;
        }
        return fact;
    }

    // sum of digits
    public static int sumOfDigits(int number){
        int Sum=0;
        while(number>0){
            Sum=Sum+(number%10);
            number=number/10;
        }
        return Sum;
    }

}
