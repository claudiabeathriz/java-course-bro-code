public class GettersAndSetters {

    public static void main(String[] args){

        // they help protect data and add rules for accessing and modifying them
        // GETTERS = methods that make a field READABLE
        // SETTERS = methods that make a field WRITABLE

        CarGettersAndSetters car = new CarGettersAndSetters("Charger", "Yellow", 10000);

        car.setColor("red");
        car.setPrice(-5000);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}
