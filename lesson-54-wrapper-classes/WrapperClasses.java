public class WrapperClasses {

    public static void main(String[] args){

        // wrapper classes = allow primitive values (int, char, boolean, double)
        //                   to be used as objects; "wrap them" in an object
        //                   generally, don't wrap primitives unless you need an object
        //                   allows use of Collection Framework and static Utility Methods

        // Integer a = new Integer(123);
        // Double b = new Double(3.14);
        // Character c = new Character('$');
        // Boolean d = new Boolean(true);

        // autoboxing = directly assigning these primitives into an object using a wrapper class
        //Integer a = 123;
        //Double b = 3.14;
        //Character c = '$';
        //Boolean d = true;
        //String e = "pizza";

        // unboxing = convert a wrapper class back to its primitive
        //int x = a;
        //double y = b;
        //char w = c;
        //boolean z = d;

        String a = Integer.toString(123);
        String b = Double.toString(3.14);
        String c = Character.toString('$');
        String d = Boolean.toString(true);

        // concatenate
        String x = a + b + c + d;

        System.out.println(x);

        int A = Integer.parseInt("123");
        double B = Double.parseDouble("3.14");
        char C = "Pizza".charAt(0);
        // unrelated
        boolean D = Boolean.parseBoolean("true");

        // ERROR: String y = A + B + C + D;

        String y = String.valueOf(A)
                + String.valueOf(B)
                + String.valueOf(C)
                + String.valueOf(D);

        System.out.println(y);

        char letter = 'b';

        System.out.println(Character.isLetter(letter));
        // is this character a letter? useful for verifying user input
        System.out.println(Character.isUpperCase(letter));
        // is this character upper case?

        






    }
}
