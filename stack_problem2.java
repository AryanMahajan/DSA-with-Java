import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class stack_problem2 {

    public static int bottomfifth(Stack<Integer> s) {
        if (s.isEmpty() || s.size() < 5) {
            return -1;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        while (!s.isEmpty()) {
            arr.add(s.pop());
        }
        return arr.get(0+4);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  elements: ");
        // Converting string into array
        String inputLine = sc.nextLine();
        String[] inputArray = inputLine.split(" ");
        for (String element : inputArray) {
            Integer x = Integer.parseInt(element);
            s.push(x);
        }
        System.out.println(bottomfifth(s));
    }
}