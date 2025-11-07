import java.util.Arrays;
import java.util.Scanner;
public class ArrayUserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //String[] foods = {"pizza", "taco", "hamburger"};
        //String [] foods = new String[4];

        String [] foods;
        int size;

        System.out.print("What number of food do you want? ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for (int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for (int i = 0; i < foods.length; i++) {
            String food = foods[i];  // pega o elemento atual
            System.out.println(food);
        }
        //foods[0] = "pizza";
        //foods[1] = "taco";
        //foods[2] = "hamburger";

        //for(String food : foods){
        //    System.out.println(food);
        //}

    //for (Tipo elemento : colecaoOuArray) {
        //    // usa "elemento"
        //}

        scanner.close();
    }
}