import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];

        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        int a=Integer.MAX_VALUE;
        int b=Integer.MIN_VALUE;
        System.out.print("Enter the number which you want to search: ");
        int x=sc.nextInt();

        for(int i=0;i<numbers.length;i++){
            // if(numbers[i]==x){
            //     System.out.println("x found at index: "+(i+1));
            // }
            if(numbers[i]<=a){
                a=numbers[i];
            }
            if(numbers[i]>=b){
                b=numbers[i];
                
            }
        }
        System.out.println("Minimum number i the array is: "+a);
        System.out.println("Maximum number in the array is: "+b);
    }
}