import java.util.*;
public class ArrSumAvg {
    public static void main(String args[]){
        System.out.println("welcome to array sum and Average ");
        int numArray[]=ArrayUtility.inputArray();
        double sum=sum(numArray);
        double avg=average(numArray);
        System.out.println("Sum of the numbers is : "+sum);
        System.out.println("Avwerage of the numbers is: "+avg);        
    }
    public static long sum(int numArray[]){
        long sum=0;
        int i=0;
        while(i<numArray.length){
            sum+=numArray[i];
            i++;
        }
        return sum;
    }
    public static double average(int numArray[]){
        double sum=sum(numArray);
        return (int) (sum /numArray.length);
    }
}

