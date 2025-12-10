import java.util.ArrayList;

public class Generics {

    public static void main(String[] args){

        // generics = a concept where you can write a class, interface, or method
        //            that is compatible with different data types
        //            <T> type parameter (placeholder that gets replaced with a real type)
        //            <String> type argument (specifies the type)

        Box<String> box = new Box<>();

        box.setItem("banana");
        System.out.println(box.getItem());

        Product<String, Double> product1 = new Product<>("apple", 0.5);
        Product<String, Integer> product2 = new Product<>("ticket", 15);

        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());
        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());

    }
}
