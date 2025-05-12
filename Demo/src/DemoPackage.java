import packageA.A;
import packageB.*; // Importing class A from packageA
public class DemoPackage {
    public static void main(String[] args) {
    
        B b = new B();
        b.show(); // Call the display method from class A
        A a = new A();
        a.display(); // Call the display method from class A
    }

}
