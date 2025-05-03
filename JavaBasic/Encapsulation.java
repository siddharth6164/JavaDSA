// Encapsulation
// -> Bundling of data and method into a single unit.
// -> usually a class and restricting direct access to object.
// -> this is typically achieved using-
//      |-> 1. Private variable
//      |-> 2. Public getter and setter method

class Car{
    // Private method  
    private String color;
    private String brand;
    private String model;
    
    // Getter and Setter
    public String getColor(){
        return color;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Car car = new Car();

        car.setBrand("Ford");
        System.out.println(car.getBrand());
        
        car.setColor("White");
        System.out.println(car.getColor());
        
        car.setModel("TITANIUM");
        System.out.println(car.getModel());
    }
}
