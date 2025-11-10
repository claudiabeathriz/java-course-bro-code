public class VarArgs {
    public static void main(String[] args) {

        //varargs = allow a method to accept a varying number of arguments
        //          makes methods + flexible, no need for overloaded methods
        //          (same name, dif parameters)
        //          java will pack the arguments into an array
        //          ... (ellipsis)

        System.out.println(average(1,2,3,4));
        System.out.println(add(2,7,8));

    }

    static double average(double... numbers){

        double sum = 0;

        for(double number : numbers){
            sum += number;
        }

        return sum / numbers.length;
    }

    static int add(int... numbers){

        int sum = 0;

        for(int number : numbers){
            sum += number;
        }

        return sum;
    }
        /*
    overloaded methods:

    static double add (int a, int b){
        return a + b;
    }
    static double add (int a, int b, int c){
        return a + b + c;
    }
    static double add (int a, int b, int c, int d){
        return a + b + c + d;
    }
    (...)
     */
}