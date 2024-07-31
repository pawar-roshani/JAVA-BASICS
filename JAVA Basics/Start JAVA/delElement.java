import java.util.*;
public class delElement {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Welcome to aaaray Deletion..!");
    int []numArr=ArrayUtility.inputArray();
    System.out.println("Now enter the number you want to delete: ");
    int numToDelete=sc.nextInt();
    int [] newArr=deleteNumber(numArr,numToDelete);
    System.out.println("Here is your new Array");
    ArrayUtility.displayArray(newArr);
  }
  public static int[] deleteNumber(int[] numArr,int numToDelete )
}
