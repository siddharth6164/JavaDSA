// Tight Coupling --> Tight coupling means component are highly dependenet on another component

package Coupling;

class Engine {
    void start() {
        System.out.println("enginer start");
    }
}

class Car {
    private Engine engine;

    public void startCar() {
        engine.start();
        System.out.println("car start");
    }
}

public class TightCoupling {
    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();
    }
}
