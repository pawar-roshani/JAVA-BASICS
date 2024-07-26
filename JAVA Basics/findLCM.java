import java.util.*;
public class findLCM {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number: ");
        int first=sc.nextInt();
        System.out.print("enter Second number: ");
        int second=sc.nextInt();
        int findLCM=findLCM(first,second);
        System.out.println("LCM of tow numbersis: "+findLCM);

    }
    public static int findLCM(int first,int second){
        int i=1;
        while(true){
            int factor=first*i;
            if(factor % second==0 ){
                return factor;
            }
            i++;
        }
        // return 0;//unrrachable
     }
}
