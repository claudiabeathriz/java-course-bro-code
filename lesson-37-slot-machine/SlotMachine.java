import java.util.Scanner;
import java.util.Random;

public class SlotMachine {
    public static void main(String[] args){

        //slot machine

        //declare variables
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        //display welcome message
        System.out.println("Welcome to Java Slot Machine!");
        System.out.println("Symbols: 🍒🍉🍋🔔🌟");

        //play if balance > 0
        while(balance>0){
            System.out.println("Current balance: $ " + balance);

        //enter bet amount
            System.out.println("Place your bet amount: $ ");
            bet = scanner.nextInt();
            scanner.nextLine();

        //verify if balance > bet
            if(bet > balance){
                System.out.println("Insufficient funds.");
                continue;
            }
        //verify if bet > 0
            else if(bet <= 0){
                System.out.println("Bet must be greater than zero.");
                continue;
            }
        // subtract bet from balance
            else{
                balance -= bet;
                System.out.println(balance);
            }

        //spin row
            System.out.println("Spinning...");
            row = spinRow();

        //print row
            printRow(row);

        //get payout
            payout = getPayout(row, bet);

            if(payout>0){
                System.out.println("You won $" + payout);
                balance += payout;
            }
            else{
                System.out.println("Sorry, you lost this round.");
            }

        //ask to play again
            System.out.println("Would you like to play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

            if(!playAgain.equals("yes")){
                break;
            }
        }

        //exit message
        System.out.println("Game Over. Your final balance is: $ " + balance);
        // for later: show balance after each play

        scanner.close();
    }

    static String [] spinRow(){

        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "🌟"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        //System.out.println(row[0] + row[1] + row[2]);

        return row;
    }
    static void printRow (String[] row){
        System.out.println(" " + String.join(" | ", row));
    }
    static int getPayout (String[] row, int bet){

        if(row[0].equals(row[1]) && row[0].equals(row[2])) {

            return switch (row[0]) {
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "🌟" -> bet * 20;
                default -> 0;
            };
        }
        else if(row[0].equals(row[1]) || row[0].equals(row[2])){

            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 6;
                case "🌟" -> bet * 10;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2])){

            return switch (row[1]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 6;
                case "🌟" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }
}
