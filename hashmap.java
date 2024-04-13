import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        //country , Population
        HashMap<String, Integer> map = new HashMap<>(); 

        //insertion - O(1)
        map.put("India", 1);
        map.put("China", 2);
        map.put("US", 3);
        System.out.println(map);

        //update - O(1)
        map.put("US", 5);
        System.out.println(map);

        //Search - O(1)
        System.out.println(map.get("India"));               //India was the kkey so it will return the value
        System.out.println(map.get(1));                     //1 is not the key so it will return null

        //ContainsKey                   //ContainsKey is just like set but instead of returning tjhe value it will return true or false
        System.out.println(map.containsKey("India"));       //India is the key in "map" so it will return true
        System.out.println(map.containsKey("Pakistan"));    //Pakistan is not the key in "map" so it will return false

        //Delete - O(1)
        map.remove("US");
        System.out.println(map);

        //size                          //.size() will return the size of the map here its 2
        System.out.println(map.size());

        //IsEmpty                       //return a boolean value
        System.out.println(map.isEmpty());

        //clear                         //it will clear the map
        map.clear();
        System.out.println(map);

    }
}
