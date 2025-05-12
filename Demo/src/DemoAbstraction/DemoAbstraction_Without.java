package DemoAbstraction;
class Audi {
    void start() {
        System.out.println("Audi started");
    }
}
class BMW {
    void start() {
        System.out.println("BMW started");
    }
}
class Showroom{
    void showCar(Audi c ){
        c.start();
    }
    void showCar(BMW c ){
        c.start();
}
}
public class DemoAbstraction_Without {
    public static void main(String[] args) {
        // Abstract class cannot be instantiated
        Showroom r = new Showroom();
        r.showCar(new Audi());
        r.showCar(new BMW());
    }
    
}
