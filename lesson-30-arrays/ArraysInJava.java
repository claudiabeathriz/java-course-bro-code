import java.util.Arrays;
public class ArraysInJava {
    public static void main(String[] args) {

        //array = a collection of values of the same data type
        //       * think of it as a variable that can store more than 1 value *

        //each value within an array is known as an element
        String[] fruits = {"apple", "orange", "banana", "coconut"};

        for (int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
            //System.out.print(fruits[i] + " ');
        }

        //enhanced for loop / for each loop
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        //to change an element
        //fruits[0] = "pineapple";

        //to access the length of an array
        //int numOfFruits = fruits.length;

        //sorting
        //Arrays.sort(fruits);

        //filling
        //Arrays.fill(fruits, "pineapple");

        //you can access an array element by referring to the index number
        //as is the case with many things in programming, to access the first
        //of something, it usually has an index of 0
        //System.out.println(fruits[0]);
        //System.out.println(numOfFruits);
    }
}