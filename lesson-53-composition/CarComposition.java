public class CarComposition {

    String model;
    int year;
    EngineComposition engine;

    CarComposition(String model, int year, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new EngineComposition(engineType);
        // when passing arguments, the parameters names can be different from the arguments names
    }

    void start(){
        this.engine.start();
        System.out.println("The " + this.model + " is running");
    }

}
