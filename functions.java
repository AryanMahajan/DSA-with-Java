import java.util.*;

public class functions {
    // public static int printProduct(int a, int b){
    //     int sum=a*b;
    //     System.out.println("Poduct of the to numbers is: "+sum);
    //     return sum;
    // }
    

    public static int CalculateFactorial(int a){
        int fac=1;
        for(int j=a;j>=1;j--){
            fac=fac*j;
        }
        System.out.println("Factorial of the gven number is: "+fac);
        return fac;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        CalculateFactorial(a);
    }    
}