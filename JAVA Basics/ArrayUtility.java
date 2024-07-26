import java.util.*;
public class ArrayUtility {
    public static int[] inputArray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter size of array:");
        int size=sc.nextInt();
        int nums[]=new int[size];
        int i=0;
        while(i<size){
            System.out.print("please enter element of array no "+(i+1)+":");
            nums[i]=sc.nextInt();
            i++;
        }
        return nums;

}
}

