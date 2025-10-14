import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args) {

        //ternary operator ? = return 1 of 2 values if a condition is true

        //variable = (condition) ? ifTrue : ifFalse;

        int score = 55;

        String passOrFail = (score >= 60) ? "You passed! :)" : "You failed! :(";

        System.out.println(passOrFail);

        /*if(score >= 60){
            System.out.println("You passed! :)");
        }
        else{
            System.out.println("You failed! :(");
        }
         */
    }
}
