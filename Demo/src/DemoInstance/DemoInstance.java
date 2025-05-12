package DemoInstance;

public class DemoInstance {
    int x = 10;
    static int y = 20;
    public void display() {
        System.out.println("------Instance Method---");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
    public static void main(String[] args) {
        
        int z= 30;
        System.out.println("------Main Method---");
        System.out.println(("Local variable z: " + z));
        System.out.println(("Static variable y: " + y));
        DemoInstance obj = new DemoInstance();
        System.out.println("Instance variable x: " +obj.x);
        obj.display();

    }


}
