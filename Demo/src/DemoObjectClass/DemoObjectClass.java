package DemoObjectClass;
class Car{
    static int wheels = 4;
    public void display() {
        System.out.println("Car has " + wheels + " wheels.");
    }
}
public class DemoObjectClass {

    public static void main(String[] args) {
        // Create an instance of the Object class
        String s1 = "Shankar";
        String s2 = "shankar";
        System.out.println("String equal:"+s1.equals(s2));
        System.out.println("String equal ignore case:"+s1.equalsIgnoreCase(s2));
        // Print the class name of the
        Car c = new Car();
        //Class cname = c.getClass();
        //System.out.println("Class name: " + cname);
        System.out.println("Class name: " + c.getClass().getName());
        // Print the hash code of the object
        System.out.println("Hash code: " + c.hashCode());
        // Print the string representation of the object
        System.out.println("String representation: " + c.toString());
        c.display();
        c= null;
        System.gc();
        System.out.println("After garbage collection");
        

}
    
}