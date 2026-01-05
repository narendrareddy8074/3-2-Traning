public class Student {

    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    public static void main(String[] args) {
        Student obj = new Student("MNREDDY", 21);
        System.out.println(obj.name + " " + obj.age);
    }
}
   