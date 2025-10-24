import java.util.Scanner;
public class CalculatorProgram {
    public static void main(String[] args) {

        //calculator program

        Scanner scanner = new Scanner(System.in);

        double result = 0;
        boolean validOperation = true;

        System.out.print("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^: ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter the first number:");
        double num2 = scanner.nextDouble();

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Cannot divide by zero!");
                    validOperation = false;
                }
                else{
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator.");
                validOperation = false;
            }
        }
        if(validOperation){
            System.out.println(result);
        }
        scanner.close();
    }
}