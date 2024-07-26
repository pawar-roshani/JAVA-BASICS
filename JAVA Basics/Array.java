import java.util.*;
public class Array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[5];
        arr[0]=98;
        arr[1]=65;
        arr[2]=2;
        arr[3]=8;
        arr[4]=37;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        // int index=0;
        // while(index<5){
        //     System.out.print(arr[index]+", ");
        //     index++;
        // }
        // System.out.println();

        // int Arr[]={3,6,8,87,64,4,68,23,9,97,34};
        // System.out.println("Enter the number you want to search: ");
        // int num=sc.nextInt();
  
        // boolean isFound=isFound(Arr, num);
        // if(isFound){
        //     System.out.println("your number is found");
        // }
        // else{
        //     System.out.println("your number is not found..!");
        // }

        // tow_Darray

        int myArr[][]=new int [2][3];
        myArr[0][0]=9;
        int  Array[][]={{1,2,3},{4,5,6}};
        System.out.println(Array[0].length);

        int i=0;
        while(i < Array.length){
            int j=0;
            while(j<Array[i].length){
                System.out.println(Array[i].length+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static boolean isFound(int Arr[],int num){
        int index=0;
        while(index<Arr.length){
            if(Arr[index]==num){
                return true;
            }
        }
        return false;
    }

    // towD array

}
