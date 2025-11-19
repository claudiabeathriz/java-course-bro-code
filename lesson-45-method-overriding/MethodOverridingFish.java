public class MethodOverridingFish extends MethodOverridingAnimal {

    @Override
    // good practice so that you and other developers
    // can now that this is being overridden
    void move(){
        System.out.println("This animal is swimming");
    }
}
