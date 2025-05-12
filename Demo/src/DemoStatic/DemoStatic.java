package DemoStatic;

public class DemoStatic {
    static int i = m1();

    static {
    System.out.println("Inside Static block");
}
    static int m1() {
        System.out.println("Inside Static method");
        return 10;
    }
    public static void main(String[] args) {
        System.out.println("Inside main method");
        System.out.println("Value of i: " + i);
        DemoStatic.InnerClass inner = new DemoStatic.InnerClass();
        inner.display();
        System.out.println("Value of InnerClass name: " + InnerClass.name);
    }

    static class InnerClass {
        static String name = "Redsystech";
        static {
            System.out.println("Inside InnerClass static block");
        }
        public void display() {
            System.out.println("Inside InnerClass display method:" + name);
        }
    }

}
