public class SquareAbstraction extends ShapeAbstraction{

    double side;

    SquareAbstraction(double side){
        this.side = side;
    }

    @Override
    double area(){
        return side * side;
    }
}
