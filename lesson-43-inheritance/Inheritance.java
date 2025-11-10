// main class

public class Inheritance {
    public static void main(String[] args){

        //inheritance = one class inherits the attributes and methods
        //              from another class
        //              child <- parent <- grandparent

        InheritanceDog dog = new InheritanceDog();
        InheritanceCat cat = new InheritanceCat();
        InheritancePlant plant = new InheritancePlant();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(plant.isAlive);

        dog.eat();
        cat.eat();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.speak();
        cat.speak();

        plant.photosynthesize();
    }
}
