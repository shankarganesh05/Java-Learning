package DemoConstruct;

class Employee {
    int empno;
    String empname;
    Employee(){
        empno = 1;
        empname = "Shankar";
    }
    Employee(int num, String name){
        empno = num;
        empname = name;
    }

}

public class Democonstruct {
    public static void main(String[] args) {
        // Create an instance of the Employee class
        Employee emp = new Employee();
    

        System.out.println("Employee Number: " + emp.empno);
        System.out.println("Employee Name: " + emp.empname);
        // Create another instance of the Employee class using the parameterized constructor
        Employee emp2 = new Employee(2, "Ganesh");
        System.out.println("Employee Number: " + emp2.empno);
        System.out.println("Employee Name: " + emp2.empname);
        emp.empno = 3;
        emp.empname = "Shankar Ganesh";
        System.out.println("Employee Number: " + emp.empno);
        System.out.println("Employee Name: " + emp.empname);
    }


}
