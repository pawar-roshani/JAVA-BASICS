import java.lang.*;
public class datatypesVariables {
    public static void main(String args[]){
        int num1=345;
        System.out.println(num1);
        float num2=45.67f;
        System.out.println(num2);
        double num3=0.34255;
        System.out.println(num3);
        boolean isnew=true;
        System.out.println(isnew);
        //rightHalfParamid
        int n=5;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println("*****\n****\n***\n**\n*\n");

        for(int k=0;k<=n;k++){
            for(int l=0;l>=n;l--){
                System.out.print("*");
            }
            System.out.print(" ");
        }

    }
}
