import java.util.*;

public class hashmapiteration {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("USA",200);
        map.put("UK",175);
        map.put("India",300);
        map.put("China",350);
        map.put("Indonesia", 2);

        Set<String> keys = map.keySet();

        //Iteration
        for (String key : keys) {
            System.out.println("Key = "+key+", Value = "+map.get(key));
        }
    }

    
}
