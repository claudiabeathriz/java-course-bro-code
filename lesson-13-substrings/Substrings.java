import java.util.Scanner;
public class Substrings {
    public static void main(String[] args) {

        //.substring() = a method used to extract a portion of a string
        //               .string (start, end)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your e-mail:");
        String email = scanner.nextLine();

        if (email.contains("@")) {
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);
            //count starts at zero; adds 1 to the position to start right after the @
            //this way, the method does not include the "@" symbol in the result

            System.out.println(username);
            System.out.println(domain);
        }
        else {
            System.out.println("E-mail must contain @.");
        }
        scanner.close();
    }
}