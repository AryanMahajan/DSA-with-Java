import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int b = sc.nextInt();
        System.out.print("Enter second number: ");
        int a = sc.nextInt();
        System.out.print("Enter the operator: ");
        char operator = sc.next().charAt(0);
        switch (operator){
            case '+':System.out.println("Result of the chosen operation is "+a+b);
                break;
            case '-':System.out.println("Result of the chosen operation is "+(a-b));
                break;
            case '*':System.out.println("Result of the chosen operation is "+a*b);
                break;
            case '/':System.out.println("Result of the chosen operation is "+a/b);
                break;
            case '%':System.out.println("Result of the chosen operation is "+a%b);
                break;
            default:System.out.println("Wrong operator");
                break;
        }
    }
}