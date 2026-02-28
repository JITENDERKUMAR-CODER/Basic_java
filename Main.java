public class Main{
    public static void main(String[] args) {
        person Person = new person("John","Smith");
        student Student=new student("jeetu","roy",3.25);
        Employee employee=new Employee("jitender","kumar",5000);

        person.showName();
        Student.showName();
        employee.showSalary();
    }
}