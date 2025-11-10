import java.util.Scanner;
public class VariableScope {

    static int x = 3; //class variable

    public static void main(String[] args) {

        //variable scope = where a variable can be accessed (Local | Class)
        //variables are only accessible inside the region they are created

        int x = 1; //local variable

        System.out.println(x);

        doSomething();
    }
    /*
    variables declared directly inside a method are available anywhere
    in the method following the line of code in which they were declared:
     */
    static void doSomething(){
        int x = 2; //local variable

        System.out.println(x);
    }
}