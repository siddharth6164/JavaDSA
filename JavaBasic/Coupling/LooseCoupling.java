// Loose Coupling --> Loose coupling means component are independent and interact through interfaces. 
//                    this makes the system more flexble and easier to maintain.
package Coupling;

interface Engine {
    void start();
}

class PetrolEngine implements Engine {
    public void start() {
        System.out.println("petrol Engine is start");
    }
}

class DesialEngine implements Engine {
    public void start() {
        System.out.println("Desial Engine is start");
    }
}

class Car {
    private Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }

    public void startcar() {
        engine.start();
    }
}

public class LooseCoupling {
    public static void main(String[] args) {
        PetrolEngine petrol = new PetrolEngine();
        Car car = new Car(petrol);
        car.startcar();
    }

}