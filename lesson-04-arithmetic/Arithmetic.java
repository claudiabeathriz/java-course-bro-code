public class Arithmetic {
    public static void main(String[] args) {

        //arithmetic operators
        int x = 10;
        int y = 3;
        int z;

        System.out.println("Arithmetic Operators:");
        z = x + y;
        System.out.println("x + y = " + z);

        z = x - y;
        System.out.println("x - y = " + z);

        z = x * y;
        System.out.println("x * y = " + z);

        z = x / y;
        System.out.println("x / y = " + z); // integer division

        z = x % y;
        System.out.println("x % y = " + z); // modulus

        System.out.println();

        //augmented assignment operators
        System.out.println("Augmented Assignment Operators:");
        x = 10; // reset
        y = 3;

        x += y;
        System.out.println("x += y -> x = " + x);

        x -= y;
        System.out.println("x -= y -> x = " + x);

        x *= y;
        System.out.println("x *= y -> x = " + x);

        x /= y;
        System.out.println("x /= y -> x = " + x);

        x %= y;
        System.out.println("x %= y -> x = " + x);

        System.out.println();

        //increment and decrement operators
        System.out.println("Increment and Decrement Operators:");
        x = 5;
        System.out.println("Initial x = " + x);
        x++;
        System.out.println("x++ -> x = " + x);
        x--;
        System.out.println("x-- -> x = " + x);

        System.out.println();

        //order of operations
        System.out.println("Order of Operations (P-E-M-D-A-S):");
        int result = 2 + 3 * 4; // multiplication first
        System.out.println("2 + 3 * 4 = " + result);

        result = (2 + 3) * 4; // parentheses first
        System.out.println("(2 + 3) * 4 = " + result);

        result = 10 / 2 + 3 * 2 - 1; // follow PEMDAS
        System.out.println("10 / 2 + 3 * 2 - 1 = " + result);

    }
}