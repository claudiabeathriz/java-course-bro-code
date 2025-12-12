import java.util.HashMap;
public class HashMaps {

    public static void main(String[] args){

        // hashmap = a data structure that stores key-value pairs
        //           keys are unique, but values can be duplicated
        //           does not maintain any order, but is memory efficient
        //           HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.25);

        map.put("orange", 1000000.00);
        // it's gonna override the previous orange

        map.put("coconut", 1.00);
        //map.remove("apple");

        System.out.println(map);
        // System.out.println(map.get("apple")); // output = 0.5
        // System.out.println(map.containsKey("pineapple")); // output = false

        if(map.containsKey("apple")){
            System.out.println(map.get("apple"));
        }
        else{
            System.out.println("Key not found");
        }

        // System.out.println(map.containsValue(1.0)); // output = true
        // System.out.println(map.size()); // output = 4

        for(String key : map.keySet()){
            System.out.println(key + " : $" + map.get(key));
        }
    }
}
