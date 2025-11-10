import java.util.Random;
import java.util.Scanner;
public class DiceRollerProgram {
    public static void main(String[] args) {

        //dice roller program

        //declare variables
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total = 0;

        //get a # o dice from the user
        System.out.print("Enter the number of dice to roll:");
        numOfDice = scanner.nextInt();

        //check if # of dice is greater than 0
        if (numOfDice > 0) {
            for (int i = 0; i < numOfDice; i++) {

        //roll all the dice
            int roll = random.nextInt(1, 7);
            printDice(roll);
            System.out.println("You rolled " + roll);
            total = total + roll;
            }

        //get the  total
            System.out.println("Total: " + total);
        } else {
            System.out.println("Dice number must be greater than zero.");
        }

        //display ascii of dice
        scanner.close();
    }
    static void printDice(int roll){

        String dice1 = """
                -------
               |       |
               |   ●   |
               |       |
                -------
                """;

        String dice2 = """
                -------
               | ●     |
               |       |
               |     ● |
                -------
                """;

        String dice3 = """
                -------
               | ●     |
               |   ●   |
               |     ● |
                -------
                """;

        String dice4 = """
                -------
               | ●   ● |
               |       |
               | ●   ● |
                -------
                """;

        String dice5 = """
                -------
               | ●   ● |
               |   ●   |
               | ●   ● |
                -------
                """;

        String dice6 = """
                -------
               | ●   ● |
               | ●   ● |
               | ●   ● |
                -------
                """;

        switch(roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll.");
        }
    }
}
