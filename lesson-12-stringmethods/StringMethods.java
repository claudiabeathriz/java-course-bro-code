public class StringMethods {
    public static void main(String[] args) {

        //string methods

        String name = "Claudia";
        //int length = name.length();
        //char letter = name.charAt(0);
        //int index = name.indexOf("a");
        //int lastIndex = name.lastIndexOf("i");

        //name = name.toUpperCase();
        //name = name.toLowerCase();
        //name = name.trim();
        //name = name.replace("a", "o");

        if(name.isEmpty()){
            System.out.println("Your name is empty.");
        }
        else{
            System.out.println("Hello, " + name);
        }

        if(name.contains(" ")){
            System.out.println("Your name contains a space.");
        }
        else{
            System.out.println("Your name doesn't contain any spaces.");
        }

        if (name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be 'password'.");
        }
        else{
            System.out.println("Hello, " + name);
        }
    }
}