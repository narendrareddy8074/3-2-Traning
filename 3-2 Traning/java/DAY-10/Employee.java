public class Employee {

    int empId;
    String name;

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.empId = 101;
        e1.name = "Ravi";

        e2.empId = 102;
        e2.name = "Anitha";

        System.out.println(e1.empId + " " + e1.name);
        System.out.println(e2.empId + " " + e2.name);
    }
}
