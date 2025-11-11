public class OverloadedConstructors {
    public static void main(String[]args){

        //overloaded constructors = allow a class to have multiple constructors
        //                          with different parameter lists
        //                          enable objects to be initialized in various ways

        OverloadedConstructorsUser User1 = new OverloadedConstructorsUser("Spongebob");
        OverloadedConstructorsUser User2 = new OverloadedConstructorsUser("Patrick", "PStar@aol.com");
        OverloadedConstructorsUser User3 = new OverloadedConstructorsUser("Sandy", "SCheeks", 25);
        OverloadedConstructorsUser User4 = new OverloadedConstructorsUser();

        System.out.println(User1.username);
        System.out.println(User1.email);
        System.out.println(User1.age);

        System.out.println(User2.username);
        System.out.println(User2.email);
        System.out.println(User2.age);

        System.out.println(User3.username);
        System.out.println(User3.email);
        System.out.println(User3.age);

        System.out.println(User4.username);
        System.out.println(User4.email);
        System.out.println(User4.age);

    }
}
