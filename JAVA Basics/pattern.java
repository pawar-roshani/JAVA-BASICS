import java.util.*;
public class pattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int rows=sc.nextInt();
        printRightHalfPattren(rows);
        System.out.println("\n");
        reverseRightHalfPattren(rows);
        leftHalfPattren(rows);
    }
// left Half Pattren
public static void leftHalfPattren(int maxRows ) {
    int rows=maxRows;
    
    while (rows>0) {
       int j=0;
       while (j<rows-1) {
        System.out.print(" ");
        j++;
       }
        int i=0;
        while (i<(maxRows-rows)) {
            System.out.print("*");
            i++;
        }
        System.out.println("*");
        rows--;
    }
}
// reverse Right Half Pattren 
    public static void reverseRightHalfPattren(int maxRows ) {
        int rows=maxRows;
        
        while (rows>0) {
            int i=0;
            while (i<rows) {
                System.out.print("*");
                i++;
            }
            System.out.println(" ");
            rows--;
        }
    }
// Right Half Pattren
    public static void printRightHalfPattren(int maxRows){
        int rows=0;
        while(rows<5){
            System.out.print("*");
            int i=0;
            while(i<rows){
                System.out.print("*");
                i++;
            }
            System.out.println(" ");
            rows++;
        }
    }
}