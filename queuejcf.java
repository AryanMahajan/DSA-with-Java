import java.util.*;

/* 
We can use two linked list and array dequeue for the queue some people prefer arraydequeue but some prefer linkedlists. 
*/

public class queuejcf{
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();
        q.add(6);
        q.remove();
        q.add(7);

        //print
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}