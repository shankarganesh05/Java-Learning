package DemoAbstraction;
class AAudi extends Car {
    void start() {
        System.out.println("Abstract Audi started");
    }
}
class ABMW extends Car{
    void start() {
        System.out.println("Abstract BMW started");
    }
}
abstract class Car {
    abstract void start();
}
class AShowroom{
    void showCar(Car c ){
        c.start();
    }
    
}
public class DemoAbstraction {
    public static void main(String[] args) {
        // Abstract class cannot be instantiated
        AShowroom r = new AShowroom();
        r.showCar(new AAudi());
        r.showCar(new ABMW());
    }
    
}
