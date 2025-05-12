package DemoPolymorphism;
class Employee2 {
    public void display() {
        System.out.println("Employee");
    }
}
class Developer2 extends Employee2 {
    public void display() {
        System.out.println("Developer2");
    }
}

public class DemoPolyOverriding {
    public static void main(String[] args) {
        Developer2 dev = new Developer2();
        dev.display(); // Calls the overridden method in Developer2
    }
    
}
