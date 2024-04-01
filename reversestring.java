import java.util.*;

public class reversestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String i=sc.nextLine();
        String i2="";
        for(int a=i.length()-1;a>=0;a--){
            i2=i2+i.charAt(a);
        }
        System.out.println(i2);
    }    
}
