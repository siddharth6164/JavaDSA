package IS_HASRelationship;

class Animal{
    void makeSound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
public class ISARelationship {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.makeSound();

    }
}
