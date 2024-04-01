import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class StackImplementation {
    int top = -1;

    public void push(int[] stack, int t, int n) {
        if (top == (n - 1)) {
            System.out.println("Overflow");
        } else {
            top++;
            stack[top] = t;
        }
    }

    public int pop(int[] stack) {
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            return stack[top--] = 0;
        }
        return 0;
    }
}

public class stack_problem1 {

    public static int bottomfifth(Stack<Integer> s) {
        if (s.size() < 5) {
            return -1;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        while (!s.isEmpty()) {
            arr.add(s.pop());
        }
        return arr.get((arr.size()-1)-4);
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