public class CircleAbstraction extends ShapeAbstraction{

    double radius;

    CircleAbstraction(double radius){
        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI * radius * radius;
    }
}
