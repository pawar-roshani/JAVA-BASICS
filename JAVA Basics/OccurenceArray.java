import java.util.*;
public class OccurenceArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Array Occurreances..!");
        int numArr[]=ArrayUtility.inputArray();
        System.out.println("enter number you want to find : ");
        int num=sc.nextInt();
        int Occurreances=noOfOccurences(numArr,num);
        System.out.println("your element was found "+Occurreances+" no of times");
        
    }  

    public static int noOfOccurences(int[] numArr,int num){
        int occ=0;
        int i=0;
        while(i<numArr.length){
            if(numArr[i]==num)
            {
                occ++;
            }
            i++;
        }
        return occ;
    }
}
