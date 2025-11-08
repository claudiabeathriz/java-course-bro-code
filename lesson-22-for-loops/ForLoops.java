import java.util.Scanner;
public class ForLoops {
    public static void main(String[] args) throws InterruptedException {

        //for loops: execute some code a CERTAIN amount of times
        //(initialization)index or counter; condition; update the counter

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many seconds to countdown from?");
        int start = scanner.nextInt();

        for (int i = start; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
            // makes the program “wait” or “sleep” for a
            // while before continuing to the next instruction (milliseconds)
        }
        System.out.println("HAPPY NEW YEAR!!!");

        scanner.close();

        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for(int i = 0; i <= max; i++ ){
            System.out.println(i);

        scanner.close();
         */
    }
}