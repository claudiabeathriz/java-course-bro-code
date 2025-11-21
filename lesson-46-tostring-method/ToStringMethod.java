public class ToStringMethod {

    public static void main(String[] args){

        // .toString() = method inherited from the Object class
        //               used to return a string representation of an object
        //               by default, it returns a hash code as a unique identifier
        //               it can be overridden to provide meaningful details

        ToStringCar car = new ToStringCar ("Ford", "Mustang", 2025, "Red");

        System.out.println(car);
    }
}
