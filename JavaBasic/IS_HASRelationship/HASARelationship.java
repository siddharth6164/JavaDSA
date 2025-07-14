package IS_HASRelationship;

class Engine {
    void start() {
        System.out.println("Engine start");
    }
}

class Car {
    Engine engine = new Engine();

    void startcar() {
        engine.start();
        System.out.println("Car is Start");
    }
}

public class HASARelationship {
    public static void main(String[] args) {
        Car car = new Car();
        car.startcar();
    }
}
