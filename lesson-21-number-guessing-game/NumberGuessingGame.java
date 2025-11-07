import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {

        //number guessing game

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        final int min = 1;
        final int max = 100;
        // always 1 to 1000
        int randomNumber = random.nextInt(min, max + 1);
        // to avoid overhead, could do:
        // import java.util.concurrent.ThreadLocalRandom;
        // int randomNumber = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d!\n", min, max);

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("Too low. Try higher.");
            }
            else if(guess > randomNumber){
                System.out.println("Too high. Try lower.");
            }
            else{
                System.out.println("Correct. The number was " + randomNumber);
                System.out.println("Number of attempts: " + attempts);
            }
        }while(guess != randomNumber);

        System.out.println("You have won!");

        scanner.close();
    }
}