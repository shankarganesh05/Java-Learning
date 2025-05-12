package DemoInheritance;
class Employee {
    int salary = 10000;
    void display() {
        System.out.println("Display Method:"+ salary);
    }
}
class Developer extends Employee {
    int bonus = 5000;
}
public class DemoInheritance {
    public static void main(String[] args) {
        System.out.println("Hello, Demo!");
        Developer dev = new Developer();
        System.out.println("Salary: " + dev.salary);
        System.out.println("Bonus: " + dev.bonus);
        dev.display();
    }
}
