import java.util.Scanner;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        //random numbers

        Random random = new Random();

        double number;

        number = random.nextDouble(1, 100000);

        System.out.println(number);
    }
}