import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListsExercise {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList();

        System.out.print("Enter the number of foods you would like to store: ");
        int numOfFood = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= numOfFood; i++){
            System.out.print("Enter food number " + i + ": ");
            String food = sc.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        sc.close();
    }
}
