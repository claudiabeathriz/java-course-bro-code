import java.sql.SQLOutput;
import java.util.Scanner;
public class SearchAnArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        //int target = 7;
        String [] fruits = {"apple", "orange", "banana"};
        String target;

        System.out.print("Enter a fruit to search for: ");
        target = scanner.nextLine();
        boolean isFound = false;

        for (int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target)){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        /*
        for(int i = 0; i < numbers.length; i++){
            if(target == numbers[i]){
                System.out.println("Element found in index: " + i);
                isFound = true;
                break;
            }
        }
         */

        if(!isFound){
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}