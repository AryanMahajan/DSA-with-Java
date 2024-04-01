import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number whose factorial you need to find out : ");
        int a = sc.nextInt();
        int sum=1;
        for(int i=a;i<=0;i--){
            int fac=i*(a-i+1);
            sum=sum*fac;
        }
        System.out.println("Factorial of the number is: "+sum);
    }
}
