public class Composition {

    public static void main(String[] args){

        // composition = represents a "part-of" relationship between objects
        //               for example, an engine is "part of" a Car
        //               allows complex objects to be constructed from smaller objects

        CarComposition car = new CarComposition("Nissan Skyline GT-R R33", 1995, "RB26DETT");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();

    }
}
