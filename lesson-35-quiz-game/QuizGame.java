import java.util.Scanner;

public class QuizGame {
    public static void main(String []args){

        //quiz game

        //array of questions
        String[] questions = {"1. What is the largest country in the world by land area?\n",
                              "2. Which country has the most population in the world?\n",
                              "3. What is the capital city of Australia?\n",
                              "4. Which continent is the Sahara Desert located in?\n",
                              "5. Which country is both in Europe and Asia?\n"};
        //2d array of options
        String [][] options = {{"a) Canada", "b) China",  "c) Russia", "d) United States\n"},
                               {"a) India", "b) China",  "c) Indonesia", "d) United States\n"},
                               {"a) Sidney", "b) Melbourne",  "c) Canberra", "d) Brisbane\n"},
                               {"a) Asia", "b) Africa",  "c) South America", "d) Oceania\n"},
                               {"a) Turkey", "b) Egypt",  "c) Greece", "d) Kazakhstan\n"},
        };
        //declare variables
        char [] answers = {'c', 'a', 'c', 'b', 'a'};
        int score = 0;
        char guess;

        //get user input
        Scanner scanner = new Scanner(System.in);

        //welcome msg
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("******************************\n");

        //list each question using a loop
        for(int i = 0; i <questions.length; i++){
            System.out.println(questions[i]);

            //list options

            for(String option : options[i]){
                System.out.println(option);
            }

            //get guess for user

            System.out.println("Enter your guess:");
            guess = (char) scanner.next().charAt(0);

            //check guess

            if(guess == answers[i]){
                System.out.println("CORRECT!");
                score++;
            }
            else{
                System.out.println("WRONG!");
            }

        }

        //display final score
        System.out.println("Your final score is: " + score + " out of " + questions.length);

        scanner.close();
    }
}
