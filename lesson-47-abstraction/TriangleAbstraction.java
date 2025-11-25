public class TriangleAbstraction extends ShapeAbstraction{

    double base;
    double height;

    TriangleAbstraction(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double area(){
        return 0.5 * base * height;
    }
}
