import java.util.*;

public class Loop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        do{
            System.out.println("Enter your number: ");
            int n=sc.nextInt();
            
            if (n%10==0){
                continue;
            }
            else{
                System.out.println(n);
            }
        } while(true);
    }
}
