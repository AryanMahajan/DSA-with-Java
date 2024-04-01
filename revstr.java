import java.util.*;

public class revstr {

    public static void revStr(String str, int idx){

        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));
        revStr(str, idx-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the word or sentence: ");
        String str=sc.nextLine();
        revStr(str, str.length()-1);
    }
}