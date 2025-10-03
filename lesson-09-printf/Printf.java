import java.util.Scanner;
public class Printf {
    public static void main(String[] args) {

        //printf() = method used to format output

        //%[flags]
        // [width]
        // [.precision]
        // [specifier-character]

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("What is the first letter of your name?");
        char firstletter = scanner.next().charAt(0);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("What is your height?");
        double height = scanner.nextDouble();
        System.out.println("Are you employed? (true/false)");
        boolean isEmployed = scanner.nextBoolean();

        System.out.printf("Hello, %s! \n", name);
        System.out.printf("Your name starts with a %c. \n", firstletter);
        System.out.printf("You are %d years old.\n", age);
        System.out.printf("You are %f cm tall. \n", height);
        System.out.printf("Employed: %b. \n", isEmployed);

        //precision
        //flags
        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        double price1 = 9.99;
        double price2 = 100000.15;
        double price3 = -54.01;

        System.out.printf("%+.2f\n", price1);
        System.out.printf("%,.2f\n", price2);
        System.out.printf("%(.2f\n", price3);
        System.out.printf("% .2f\n", price3);
        System.out.printf("% .2f\n", price1);

        //width
        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%4d\n", id4);

        scanner.close();
    }
}