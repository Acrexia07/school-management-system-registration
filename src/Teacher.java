public class Teacher extends Person{

    // Initialization: Variable Declaration
    String subjectHandled;
    double salary;

    // Constructor
    Teacher(String name, String role, int id, int age, String subjectHandled, double salary){
        super(name, role, id, age);
        this.subjectHandled = subjectHandled;
        this.salary = salary;
    }

    // Method: Overridden from parent (Person)
    @Override
    String displayInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Role: " + this.role);
        System.out.println("ID: " + this.id);
        System.out.println("Age: " + this.age);
        System.out.println("Subject: " + this.subjectHandled);
        System.out.printf("Salary: %,.2f", this.salary);
        return "";
    }
}
