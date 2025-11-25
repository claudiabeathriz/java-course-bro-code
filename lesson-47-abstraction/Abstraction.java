public class Abstraction {

    public static void main(String[] args){

        // abstraction = used to define abstract classes and methods
        //               abstraction is the process of hiding implementation details
        //               and showing only the essential features;
        //               abstract classes CAN'T be instantiated directly
        //               we cannot create objects in a abstract class
        //               can contain "abstract" methods (which must be implemented)
        //               can contain "concrete" methods (which are inherited)

        CircleAbstraction circle = new CircleAbstraction(3);
        TriangleAbstraction triangle = new TriangleAbstraction(4, 5);
        SquareAbstraction square = new SquareAbstraction(7);

        circle.display();
        triangle.display();
        square.display();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(square.area());

    }
}
