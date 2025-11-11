public class ArrayOfObjects {
    public static void main(String[]args){

        //array of objects

        //ArrayOfObjectsCar car1 = new ArrayOfObjectsCar("Mustang", "red");
        //ArrayOfObjectsCar car2 = new ArrayOfObjectsCar("Corvette", "blue");
        //ArrayOfObjectsCar car3 = new ArrayOfObjectsCar("Charger", "yellow");

        //ArrayOfObjectsCar[] cars = new ArrayOfObjectsCar[3];

        //ArrayOfObjectsCar[] cars = {car1, car2, car3};

        //anonymous objects
        ArrayOfObjectsCar[] cars = {new ArrayOfObjectsCar("Mustang", "red"),
                                    new ArrayOfObjectsCar("Corvette", "blue"),
                                    new ArrayOfObjectsCar("Charger", "yellow")};
        //for loop
        for(int i = 0; i < cars.length; i++){
            cars[i].drive();
        }

        for(ArrayOfObjectsCar car : cars){
            car.color = "black";
        }
        //enhanced for loop
        for(ArrayOfObjectsCar car : cars){
            car.drive();
        }

    }
}
