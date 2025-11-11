public class ObjectOrientedProgramming {
    public static void main (String[] args){

        //object = an entity that holds data (attributes)
        //         a person can have the following attributes :
        //         String name;
        //         int age;
        //         int height;

        //         and can perform actions (methods)
        //         a few actions a person may perform:
        //         eat();
        //         sleep();

        //         it is a reference data type - stored in heap

        //class = serves as a blueprint to create objects

        OOPCar car = new OOPCar();

        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);
        car.drive();
        car.brake();
    }
}
