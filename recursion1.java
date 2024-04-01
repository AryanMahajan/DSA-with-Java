import java.util.Scanner;

public class recursion1{
    public static int calcPower(int x, int n) {

        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        if(n%2==0){
            return calcPower(x, n/2)*calcPower(x, n/2);
        }
        else{
            return calcPower(x, n/2)*calcPower(x, n/2)*x;
        }
        
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number whose power is to be calculated: ");
        int x=sc.nextInt();
        System.out.print("Enter the power of the number to be calculated: ");
        int n=sc.nextInt();
        int ans=calcPower(x, n);
        System.out.println("Answer = "+ans);

    }
}