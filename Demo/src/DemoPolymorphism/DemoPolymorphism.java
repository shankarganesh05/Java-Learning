package DemoPolymorphism;
class Employee1 {

    public void display() {
        System.out.println("Employee class");
    }

    public void display(String name) {
        System.out.println("Employee class: " + name);
    }
}

public class DemoPolymorphism {
    public static void main(String[] args) {
      Employee1 emp = new Employee1();
      emp.display();
      emp.display("John Doe");
    }
}