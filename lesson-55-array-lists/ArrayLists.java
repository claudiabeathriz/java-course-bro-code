import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

    public static void main(String[] args){

        // ArrayList = a resizable array that stores objects (autoboxing)
        //             arrays are fixed in size, but ArrayLists can change

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Coconut");

        //fruits.remove(0);

        fruits.set(0, "Pineapple");

        System.out.println(fruits);
        System.out.println(fruits.get(2));
        System.out.println(fruits.size());

        Collections.sort(fruits);

        System.out.println(fruits);

        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }
}
