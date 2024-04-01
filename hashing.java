import java.util.HashSet;
import java.util.Iterator;

public class hashing {
    
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //Insert  O(1)
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        System.out.println(set);

        //Size
        // if there are duplicates like 1,2,3,1 then the size will be 3 if there are no duplicates like 1,2,3,4 then size will be 4
        System.out.println("Size if the set is "+ set.size());

        //Search  O(1)
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }
        if (!set.contains(6)) {
            System.out.println( "Set does not contain 6" );
        }

        //Delete  O(1)
        set.remove(4);
        if (!set.contains(4)) {
            System.out.println("We removed 4");
        }

        //print
        System.out.println(set);

        //Iterator
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
