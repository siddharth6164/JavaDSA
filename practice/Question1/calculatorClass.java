abstract class Calculator{
    abstract int add(int a,int b);
}

class Adder extends Calculator{
    int add(int a,int b){
        System.out.println("Adding integers :"+a+" "+b);
        return a + b;
    }
}

class Multiplier{
    int multiply(int a,int b,Calculator calculator){
        int sum = calculator.add(a,a);
        for(int i=1;i<b-1;i++){
            sum = calculator.add(sum,a);
        }
        return sum;
    }
}

public class calculatorClass {

    private static final Calculator CALCULATOR = new Adder();    

    private static void testAddition(int a,int b){
        System.out.println("Sum = " + CALCULATOR.add(a, b));
    }

    private static void testMultiplication(int a,int b){
        System.out.println("Product = " + new Multiplier().multiply(a,b,CALCULATOR));
    }

    public static void main(String[] args){
        int a = 7;
        int b = 4;
        System.out.println("Testing Addition");
        testAddition(a,b);
        System.out.println("\nTesting Multiplication");
        testMultiplication(a,b);
    }
}