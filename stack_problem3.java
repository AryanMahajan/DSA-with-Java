import java.util.Scanner;
import java.util.Stack;

public class stack_problem3 {
    public static void main(String[] args) {
        Stack<Character> s=new Stack<>();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the elements: ");
            String inputLine = sc.nextLine();
            String[] inputArray = inputLine.split("");
            for (int i = 0; i<inputArray.length;i++){
                String element = inputArray[i];
                char x = element.charAt(0);
                s.push(x);
            }
            String rev ="";
            while(!s.isEmpty()){
                rev = rev + s.pop();
            }System.out.println(rev);
    }
}
