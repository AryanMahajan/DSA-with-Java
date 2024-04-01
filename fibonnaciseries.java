import java.util.*;

public class fibonnaciseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of numbers you want to print");
        int n=sc.nextInt();
        sc.nextLine();
        int a=0;
        int b=1;
        for(int i=0;i<=n;i++){
            int sum=a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
        }
    }
}