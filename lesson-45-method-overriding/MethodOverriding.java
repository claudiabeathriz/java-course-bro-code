public class MethodOverriding {

    public static void main(String[]args){

        // method overriding = when a subclass provides its own
        //                     implementation of a method that is already defined.
        //                     Allows for code reusability and give specific implementation.

        MethodOverridingDog dog = new MethodOverridingDog();
        MethodOverridingCat cat = new MethodOverridingCat();
        MethodOverridingFish fish = new MethodOverridingFish();

        dog.move();
        cat.move();
        fish.move();
    }
}
