package packageB;
import packageA.*;
public class B {
    A a = new A(); // Create an instance of class A
    public void show() {
        System.out.println("From B:");
        a.display(); // Call the display method from class A
    }

}
