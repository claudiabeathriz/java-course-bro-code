import java.util.Scanner;
public class RuntimePolymorphism {

    public static void main (String[] args){

        // runtime polymorphism = when the method that gets executed is decided
        //                        at runtime based on the actual type of the object

        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like a dog or a cat? \n" +
                            "Dog = 1 \n" +
                            "Cat = 2");

        int choice = scanner.nextInt();

        if(choice == 1){
            Animal animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            Animal animal = new Cat();
            animal.speak();
        }

        scanner.close();

    }
}
